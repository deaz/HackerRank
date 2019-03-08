object Solution {
  def check(pairs: List[Tuple2[Int, Int]], checked: Map[Int, Int]): Boolean = {
    pairs match {
      case (a, b) :: tail => {
        if ((checked contains a) && (checked.get(a) != b)) {
          false
        } else {
          check(tail, checked + (a -> b))
        }
      }
      case _ => true
    }
  }

  def main(args: Array[String]) {
    val t = readLine.toInt
    val vals = (1 to t).map { _ =>
      val n = readLine.toInt
      (1 to n).map { _ =>
        val Array(a, b) = readLine.split(" ").map(_.toInt)
        (a, b)
      }
    }

    vals.foreach { pairs =>
      println(if (check(pairs.toList, Map())) "YES" else "NO")
    }
  }
}
