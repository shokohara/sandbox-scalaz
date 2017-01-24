package sandbox

trait Problem[A] {
  def resolve(f: A): Int
}

object Problem {
  def apply[A: Problem] = implicitly[Problem[A]]
}

class Problem01()

object Problem01 {
  implicit val problem01Problem = new Problem[Problem01] {
    def resolve(b: Problem01) = "take many cpu time to find a answer".length
  }
}

class Problem02()

object Problem02 {
  implicit val problem02Problem = new Problem[Problem02] {
    def resolve(b: Problem02) = "really take too many cpu time to find a answer".length
  }
}

object Main {

  def main(args: Array[String]): Unit = {
    Problem[Problem01].resolve(new Problem01)
    // success
    //    val solutions = ((1, Problem[Problem01]) :: Nil).toMap
    //    solutions.get(1).get.resolve(new Problem01)
    // failed
    //    val solutions = ((1, Problem01) :: (2, Problem02) :: Nil).toMap
    //    solutions.get(1).get.resolve(new Problem01)
  }
}
