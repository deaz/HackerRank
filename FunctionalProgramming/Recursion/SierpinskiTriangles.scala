object Solution {
  def drawTriangles(n: Int) {
    def findTriangles(n: Int,
                      h: Int,
                      x: Int,
                      y: Int): List[Tuple3[Int, Int, Int]] = {
      if (n == 0) {
        List(Tuple3(h, x, y))
      } else {
        val ts1 = findTriangles(n - 1, h / 2, x, y)
        val ts2 = findTriangles(n - 1, h / 2, x - h / 2, y + h / 2)
        val ts3 = findTriangles(n - 1, h / 2, x + h / 2, y + h / 2)
        ts1 ++ ts2 ++ ts3
      }
    }

    def pointsForTriangle(t: Tuple3[Int, Int, Int]) = {
      for (i <- 0 until t._1;
           j <- -i until i + 1) yield Tuple2(t._2 + j, t._3 + i)
    }

    val triangles = findTriangles(n, 32, 31, 0)
    val points = triangles.map(t => pointsForTriangle(t)).flatten

    for (i <- 0 until 32;
         j <- 0 until 63) {
      if (points.contains(Tuple2(j, i))) {
        print('1')
      } else {
        print('_')
      }
      if (j == 62) {
        println
      }
    }
  }

  def main(args: Array[String]) {
    drawTriangles(readInt())
  }
}
