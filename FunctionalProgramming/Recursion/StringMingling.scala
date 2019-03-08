object Solution {
  def main(args: Array[String]) {
    val p = readLine()
    val q = readLine()

    p zip q foreach { case (a, b) => print(a.toString + b) }
    println
  }
}
