name := "delphi"
version := "1.0.0-SNAPSHOT"
scalaVersion := "2.12.4"



lazy val root = (project in file("."))
                .aggregate(cli, crawler, management, webapi, webapp)


lazy val cli = Project(
    id = "cli",
    base = file("delphi-cli"))

lazy val crawler = Project(
        id = "crawler",
        base = file("delphi-crawler"))

lazy val management = Project(
        id = "management",
        base = file("delphi-management"))

lazy val webapp = Project(
        id = "webapp",
        base = file("delphi-webapp"))

lazy val webapi = Project(
        id = "webapi",
        base = file("delphi-webapi"))
