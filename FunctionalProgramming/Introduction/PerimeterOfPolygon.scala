object Solution {
  def perimeter(points: List[Tuple2[Int, Int]], prevPoint: Tuple2[Int, Int], acc: Double): Double = {
    points match {
      case (a, b) :: tail => {
        val (x, y) = prevPoint
        perimeter(tail, (a, b), acc + Math.sqrt(Math.pow(a - x, 2) + Math.pow(b - y, 2)))
      }
      case _ => acc
    }
  }

  def main(args: Array[String]) {
    val n = readLine.toInt
    val vals = (1 to n).map { _ =>
      val Array(a, b) = readLine.split(" ").map(_.toInt)
      (a, b)
    }.toList

    println(perimeter(vals, vals.last, 0))
  }
}