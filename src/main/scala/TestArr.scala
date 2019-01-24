import scala.collection.mutable.ArrayBuffer

object TestArr {


  def main(args: Array[String]): Unit = {
    val num = new Array[Int](10)
    for(i <- num)
      print(f"$i%3d")
    println()

    val str= new Array[String](3)
    val s1 =  Array("helo","you")
    println(s1(0))
    println(s1.toBuffer)
    for(i <- 0 until s1.length ) // until 不包含最后一个元素
      println(s"$i :${s1(i)} ")
    println("----------------------")

    val buffer = ArrayBuffer[Int]()  // new ArrayBuffer[Int]
    buffer +=1
    println(buffer)
    buffer +=(1,2,3)   // += 在尾端增加元素
    println(buffer)
    buffer ++= Array(1,2,3,5)  // 操作符追加集合
    println(buffer)
    buffer.trimEnd(5)
    println(buffer)
    buffer.insert(2,6) // 元素下标2之前插入
    println(buffer)
    buffer.insert(2,7,8,9)
    println(buffer)
    for(i <- 0 until buffer.length by 2)
      println(s"$i:${buffer(i)}")
    for(i <- buffer.length-1  until -1 by -1)
      println(s"$i:${buffer(i)}")
    println(buffer.indices)
    for(i <- buffer.indices)
      println(s"$i:${buffer(i)}")
    println(buffer.indices.reverse)
    for(i <- buffer.indices.reverse)
      println(s"$i:${buffer(i)}")
    for(i <- buffer)
      println(i)
    buffer.remove(2)
    println(buffer)
    buffer.remove(2,3)
    println(buffer.toArray.toString)


  }

}
