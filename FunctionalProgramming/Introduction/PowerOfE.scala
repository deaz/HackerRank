def f(x: Float): Float = {
  def fact(n: Int, acc: Int): Int = {
    if (n == 0) {
      acc
    } else {
      fact(n - 1, acc * n)
    }
  }

  (0 to 9).map(i => Math.pow(x, i).toFloat / fact(i, 1)).sum
}
