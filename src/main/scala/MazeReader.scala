import scala.io.Source

object MazeReader extends App {
  val mazeFile = Source.fromFile("test_mazes/medium_input.txt")
  for (line <- mazeFile.getLines) {
    println(line)
  }
  mazeFile.close
}
