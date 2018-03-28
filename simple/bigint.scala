//Snippet: BigInt
//Created by admin on 2008-07-24. Updated: 2008-07-24, 22:28
/** Bigint's can be used seamlessly */
object bigint extends App {
  def factorial(n: BigInt): BigInt =
    if (n == 0) 1 else n * factorial(n-1)

  val f50 = factorial(50); val f49 = factorial(49)
  println("50! = " + f50)
  println("49! = " + f49)
  println("50!/49! = " + (f50 / f49))
}