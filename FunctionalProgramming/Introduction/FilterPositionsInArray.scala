def f(arr: List[Int]): List[Int] = {
  arr.zipWithIndex.filter { case (a, i) => i % 2 == 1 }.unzip._1

}
