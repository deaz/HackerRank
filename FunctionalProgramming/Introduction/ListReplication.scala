def f(num: Int, arr: List[Int]): List[Int] = (for (a <- arr; _ <- 1 to num) yield a).toList
