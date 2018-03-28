// example
// scalac test.scala
// scala Main
object Main {
  def main(args: Array[String]) {
        for {i <- 1 to 10}
          println(i)

        println("#########################")
        for {
           i <- 1 to 3
             j <- 1 to 3
        }
          println(i* j)

  }
}