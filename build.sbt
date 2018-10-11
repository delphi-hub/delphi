name := "delphi"
version := "1.0.0-SNAPSHOT"
scalaVersion := "2.12.4"

import sys.process._
import java.io.File


lazy val repos = List("delphi-webapi", "delphi-crawler", "delphi-cli", "delphi-management")
lazy val delphiRepos = "repos"

def cloneAll = Command.command("clone-all") {
  state =>
    Process(s"mkdir -p $delphiRepos").!
    val currDir = System.getProperty("user.dir")
    for (repo <- repos) {
      val bash = "/bin/bash"
      val op = "-c"
      val clone = s"git clone https://github.com/delphi-hub/$repo"
      Process(Seq(bash, op, clone), new File(currDir + "/" + delphiRepos)).!
    }
    state
}





def delete = Command.command("delete") {
  state =>
    val currDir = System.getProperty("user.dir")
    val cmd = "rm -rf " + currDir + "/" + delphiRepos
    Process(cmd).!
    state
}


lazy val currentBranch = taskKey[String]("Get current git branch")

currentBranch := {
  Process("git rev-parse --abbrev-ref HEAD").!!
}


lazy val pull = taskKey[Unit]("Pull Changes")

pull := {
  val branch = currentBranch.value
  for (repo <- repos) {
    BuildUtils.pull(repo, branch)
  }

}

Compile / compile := ((Compile / compile) dependsOn pull).value

commands += cloneAll
commands += delete
lazy val root = (project in file("."))
  .aggregate(crawler,webapi,cli,management,webapp)


lazy val webapi = Project(
id = "webapi",
base = file("repos/delphi-webapi"))

lazy val cli = Project(
  id = "cli",
  base = file("repos/delphi-cli"))

lazy val crawler = Project(
  id = "crawler",
  base = file("repos/delphi-crawler"))

lazy val management = Project(
  id = "management",
  base = file("repos/delphi-management"))

lazy val webapp = Project(
  id = "webapp",
  base = file("repos/delphi-webapp"))

addCommandAlias("run", "; all webapi/run crawler/run webapp/run management/run")
