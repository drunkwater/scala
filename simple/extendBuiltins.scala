//Snippet: Extend Builtins
//Created by admin on 2008-07-24. Updated: 2008-07-24, 22:34
/* Adding ! as a method on int's */
object extendBuiltins extends App {
  def fact(n: Int): BigInt =
    if (n == 0) 1 else fact(n-1) * n
  class Factorizer(n: Int) {
    def ! = fact(n)
  }
  implicit def int2fact(n: Int) = new Factorizer(n)
  /*10!=3628800*/
  println("10! = " + (10!))
}