def f(arr: List[Int]): Int = {
  arr match {
    case _ :: tail => 1 + f(tail)
    case _ => 0
  }
}