import scala.collection.mutable.ArrayBuffer

object TestSuanFa {

  def main(args: Array[String]): Unit = {

    val s1= Array(1,2,3,4)
    println(s1.sum)
    val arr = ArrayBuffer("Hello","you","Lily")
    println(arr.max)
    val ab1 = ArrayBuffer(1,5,2,7,3)
    val ab2 = ab1.sorted // 不影响原来的数组
    val ab3 = ab1.sortWith(_ > _)
    println(ab1.mkString(","))
    println(ab2.mkString("<",",",">"))
    println(ab3)


  }





}
