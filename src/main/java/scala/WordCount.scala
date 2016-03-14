package scala

import java.io.File
import org.apache.spark.{SparkConf, SparkContext}
import scala.util.FileUtil

/**
  * Created by root on 16-3-14.
  * With the doc refer to "http://spark.apache.org/docs/latest/submitting-applications.html#master-urls"
  */

object WordCount extends App {
  val fold = "/root/Tools/src/main/java/scala/output"
  val conf = new SparkConf().setAppName("WordCount").setMaster("local[8]")
  val sc = new SparkContext(conf)

  // lines :=
  // zhang li
  // wang wang
  // uu ii uu
  val lines = sc.textFile("/root/Tools/src/main/java/scala/input_output/hello")
  // string[] := [zhang,li,wang,wang,uu,ii,uu]
  val words = lines.flatMap(_.split(" "))
  // during := string[] = [(zhang,1),(wang,1),(wang,1),(uu,1),(ii,1),(uu,1)]
  val during = words.map(w => (w, 1))
  // wc = [(zhang,1),(wang,2),(uu,2),(ii,1)]
  val wc = during.reduceByKey(_ + _)

  FileUtil.deleteDir(new File(fold))
  wc.saveAsTextFile("/root/Tools/src/main/java/scala/output")
}



