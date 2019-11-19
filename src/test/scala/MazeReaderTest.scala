import org.scalatest.FunSpec
//import org.scalatest.BeforeAndAfter

class MazeReaderTest extends FunSpec  {
//  var mazeReader: MazeReader = _
//
//  before {
//    mazeReader = new MazeReader
//  }
  describe("#mazeFileToString") {
    it("should return the maze as a string") {
      assert(MazeReader.mazeFileToString() === "5 5\n1 1\n3 3\n1 1 1 1 1\n1 0 1 0 1\n1 0 1 0 1\n1 0 0 0 1\n1 1 1 1 1")
    }
  }

  describe("#returnFilePath") {
    it("should return the filepath of a maze") {
      assert(MazeReader.returnFilePath() === "test_mazes/input.txt")
    }
  }
}
