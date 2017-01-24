package sandbox

class A()
object A {
  def x = "testdata"
}

class B() {
  def x = "testdata"
}

object Main {

  def main(args: Array[String]): Unit = {
    val  n = 10000000
//    val as = (1 to n).map(_ => new A); println("a");
    val as = (1 to n).map(_ => new B); println("b");
    System.gc()
    val total = Runtime.getRuntime().totalMemory();
    val free = Runtime.getRuntime().freeMemory();
    val used = total - free;
    val max = Runtime.getRuntime().maxMemory();
    System.out.println("total => " + total / 1024 + "KB");
    System.out.println("free  => " + free / 1024 + "KB");
    System.out.println("used  => " + (total - free) / 1024 + "KB");
    System.out.println("max   => " + max / 1024 + "KB");
    as.length
  }
}
