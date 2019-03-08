object Solution {
  def area(points: List[Tuple2[Int, Int]], prevPoint: Tuple2[Int, Int], acc: Double): Double = {
    points match {
      case (a, b) :: tail => {
        val (x, y) = prevPoint
        area(tail, (a, b), acc + x * b - y * a)
      }
      case _ => 0.5 * Math.abs(acc)
    }
  }

  def main(args: Array[String]) {
    val n = readLine.toInt
    val vals = (1 to n).map { _ =>
      val Array(a, b) = readLine.split(" ").map(_.toInt)
      (a, b)
    }.toList

    println(area(vals, vals.last, 0))
  }
}