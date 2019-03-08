object Solution {
  def drawTrie(n: Int) {
    def findTrees(n: Int,
                  h: Int,
                  x: Int,
                  y: Int): List[Tuple3[Int, Int, Int]] = {
      if (n == 0) {
        List()
      } else {
        List(Tuple3(h, x, y)) :: findTrees(n - 1, h / 2, x - h / 2, y - h)
      }
    }

    def pointsForTree(t: Tuple3[Int, Int, Int]) = {
      for (i <- 0 until t._1)
        yield
          if (i < t._1 / 2) Tuple2(t._2, t._3 - t._1)
          else
            List(Tuple2(t._2 + t._1 - i, t._3 - t._1),
                 Tuple2(t._2 - t._1 + i, t._3 - t._1))
    }

    val trees = findTrees(n, 32, 50, 63)
    val points = trees.map(t => pointsForTree(t)).flatten

    for (i <- 0 until 63;
         j <- 0 until 100) {
      if (points.contains(Tuple2(j, i))) {
        print('1')
      } else {
        print('_')
      }
      if (j == 99) {
        println
      }
    }
  }

  def main(args: Array[String]) {
    drawTree(readInt())
  }
}
