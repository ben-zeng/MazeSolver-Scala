import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter

class MazeReaderTest extends FunSuite with BeforeAndAfter {
  var mazeReader: MazeReader = _

  before {
    mazeReader = new MazeReader
  }

//  describe("MazeReader") {




  test("#maze") {
    println(mazeReader.returnFilePath())
    assert(mazeReader.returnFilePath() === "test_mazes/input.txt")
  }

  test("#cube") {
    assert(mazeReader.cube(3) === 27)
    assert(mazeReader.cube(0) === 0)
  }



}
