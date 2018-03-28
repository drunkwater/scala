//Snippet: Primes
//Created by admin on 2008-07-24. Updated: 2008-07-24, 22:40
/** Print prime numbers less than 100, very inefficiently */
object primes extends App {
  def isPrime(n: Int) = (2 until n) forall (n % _ != 0)
  for (i <- 1 to 100 if isPrime(i)) println(i)
}