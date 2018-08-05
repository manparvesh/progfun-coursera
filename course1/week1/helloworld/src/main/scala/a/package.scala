package a

object ExampleA {
  def fibonacci(n: Int): Int = {
    if (n <= 0) {
      return 0
    }
    if (n == 1) {
      return 1
    }
    fibonacci(n - 1) + fibonacci(n - 2)
  }

  def fibo(n: Int): Int = {
    def fibIter(i: Int, a: Int, b: Int): Int = {
      if (i == n) a else fibIter(i + 1, b, a + b)
    }

    fibIter(0, 0, 1)
  }

  def main(args: Array[String]): Unit = {
    var a = 0
    for (a <- 1 to 10) {
      assert(fibonacci(a) == fibo(a))
    }
  }
}
