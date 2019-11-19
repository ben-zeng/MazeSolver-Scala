import scala.io.Source


object MazeReader extends App {
  lazy val mazeInputFilePath: String = "test_mazes/input.txt"


  def mazeFileToString(filePath: String = mazeInputFilePath): String = {
    val bufferedSource = Source.fromFile(filePath)
    val maze = bufferedSource.getLines.mkString("\n")
    bufferedSource.close
    maze
  }

  def returnFilePath(): String = {
    mazeInputFilePath
  }


  mazeFileToString()
  returnFilePath()


}
