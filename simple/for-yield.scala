//Snippet: For and Yield
//Created by admin on 2008-07-24. Updated: 2008-07-24, 22:32
/** Turn command line arguments to uppercase */
object Main {
  def main(args: Array[String]) {
    val res = for (a <- args) yield a.toUpperCase
    println("Arguments: " + res.toString)
  }
}