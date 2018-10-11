import sys.process._
import java.io._
object BuildUtils {
  def pull(repo: String, branch: String) = {
    val bash="/bin/bash"
    val op="-c"
    val checkout=s"git checkout $branch"
    val gitPull="git pull"
    Process(Seq(bash,op,checkout,gitPull),new File(repo)).!
  }

}