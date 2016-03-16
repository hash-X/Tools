package scala.spark

import org.apache.spark.{SparkConf, SparkContext}

/**
  * find the line with the most words.
  */
object SparkExample extends App {
  val conf = new SparkConf().setMaster("local[8]").setAppName("1")
  val sc = new SparkContext(conf)
  val lines_1 = sc.textFile("/root/Tools/src/main/java/scala/original_data/hello")
    .map(lines => lines.split(" ").size).reduce((a, b) => Math.max(a, b))
  println("************" + lines_1)
}