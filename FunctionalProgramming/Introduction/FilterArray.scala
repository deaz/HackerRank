def f(delim: Int, arr: List[Int]): List[Int] = {
  arr match {
    case a :: tail => if (a < delim) a :: f(delim, tail) else f(delim, tail)
    case _ => List.empty
  }
}
