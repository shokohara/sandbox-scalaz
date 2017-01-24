package sandbox

class B {
  def v: Int = {
    println("evaluated")
    1
  }
}

object Main {

  def main(args: Array[String]): Unit = {
    val f = x.apply()
    println(f.v) // ここでB#vを評価したい
  }

  def x[A >: {def v : Int}]: () => A = new B().v _
}
