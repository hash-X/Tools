package scala.spark

/**
  * Created by root on 16-3-22.
  */
object ForeachExample extends App with MySparkContext {
  val list = sc.parallelize(List(2,3,4,4))
  list.foreach(println)
}
