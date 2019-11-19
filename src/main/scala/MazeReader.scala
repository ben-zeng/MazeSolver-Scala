import scala.io.Source


class MazeReader extends App {
  lazy val mazeInputFilePath: String = "test_mazes/input.txt"

  def mazeFileToString(filePath: String = mazeInputFilePath): Unit = {
    val bufferedSource = Source.fromFile(filePath)
    val maze = bufferedSource.getLines.mkString("\n")
    println(maze)
    bufferedSource.close
  }

  def returnFilePath(): String = {
    val filePath = mazeInputFilePath
    println(filePath)
    filePath
//    "test_mazes/input.txt"
  }

  def cube(x: Int) = {
    x * x * x
  }

  mazeFileToString()
  returnFilePath()


}
