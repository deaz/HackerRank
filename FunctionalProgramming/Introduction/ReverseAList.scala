def f(arr: List[Int]): List[Int] = {
  def aux(xs: List[Int], res: List[Int]): List[Int] = {
    xs match {
      case x :: tail => aux(tail, x :: res)
      case _ => res
    }
  }

  aux(arr, List.empty)
}
