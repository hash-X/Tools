package scala

/**
  * Created by root on 16-3-14.
  */
object FlatMap_Example extends App {
  val li = List(1, 2, 3)

  val res = li.flatMap(x => x match {
    case 3 => List(3, 1)
    case _ => List(x * 2)
  })
  print(res)
  println()

  // As a compare, we give an example of Map.
  val res2 = li.map(x => x match {
    case 3 => List(3, 1)
    case _ => x * 2
  })

  print(res2)

}
