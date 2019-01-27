object TestFor {

  def main(args: Array[String]): Unit = {

    for(i <- 1 to 10)
      print(i)
    println("  ")
    val str = "nihao a 你好"
    var sum=0
    for(i <- 0 to str.length-1)
      sum +=str(i)
    println(sum)

    sum=0
    for(j <- str) sum +=j
    println(sum)



    println("----------------")
    val n=23
    for(n <- 1 to 10)
      print(n)
    println()

    println("-------------")
    for(i <- 1 to 3 ; j <- 1 to 3)
      print(f"${i*10+j}%3d")
    println()

    for(i <- 1 to 3; j <- 1 to 3 if i!=j)
      print(f"${i*10+j}%3d")
    println()

    for(i <- 1 to 4 ; from = 4-i;j <- from to 3)
      print(f"${i*10+j}%3d")
    println()

    val v1 = for(i <- 1 to 10 ) yield i%3
    println("vi="+v1)


  }


}
