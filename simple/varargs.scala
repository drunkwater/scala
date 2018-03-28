//Snippet: Varargs
//Created by admin on 2008-07-24. Updated: 2008-07-24, 22:43
package examples

/** Using Java varargs */
object varargs extends App {
  val msg = java.text.MessageFormat.format(
    "At {1,time} on {1,date}, there was {2} on planet {0}.",
    "Hoth", new java.util.Date(), "a disturbance in the Force")
  println("Message="+msg)
}