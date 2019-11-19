import scala.io.Source


object MazeReader extends App {
  val mazeInputFilePath: String = "test_mazes/input.txt"

  def mazeFileToString(filePath: String = mazeInputFilePath): Unit = {
    val bufferedSource = Source.fromFile(filePath)
    val maze = bufferedSource.getLines.mkString("\n")
    println(maze)
    bufferedSource.close
  }

  mazeFileToString()


}
