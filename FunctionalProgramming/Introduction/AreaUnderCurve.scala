// This function will be used while invoking "Summation" to compute
// The area under the curve.
def f(coefficients: List[Int], powers: List[Int], x: Double): Double = {
  (coefficients zip powers).map { case (a, b) => a * Math.pow(x, b) }.sum
}

// This function will be used while invoking "Summation" to compute
// The Volume of revolution of the curve around the X-Axis
// The 'Area' referred to here is the area of the circle obtained
// By rotating the point on the curve (x,f(x)) around the X-Axis
def area(coefficients: List[Int], powers: List[Int], x: Double): Double = {
  val pi = 3.141592653589793238462643383279502884
  Math.pow(f(coefficients, powers, x), 2) * pi
}

// This is the part where the series is summed up
// This function is invoked once with func = f to compute the area
// under the curve
// Then it is invoked again with func = area to compute the volume
// of revolution of the curve
def summation(func: (List[Int], List[Int], Double) => Double, upperLimit: Int, lowerLimit: Int, coefficients: List[Int], powers: List[Int]): Double = {
  def aux(upperLimit: Double, lowerLimit: Double): Double = {
    if (lowerLimit >= upperLimit) {
      0
    } else {
      func(coefficients, powers, lowerLimit + 0.001) / 1000 + aux(upperLimit, lowerLimit + 0.001)
    }
  }

  aux(upperLimit, lowerLimit)
}
