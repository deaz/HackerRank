object Solution {
  def permute(s: List[Char]): List[Char] = {
    s match {
      case a :: b :: Nil => b :: a :: Nil;
      case a :: b :: tail => b :: a :: permute(tail)
    }
  }

  def main(args: Array[String]) {
    val T = readInt;
    for (_ <- 0 until T) {
      val s = readLine;
      println(permute(s.toList) mkString)
    }
  }
}
