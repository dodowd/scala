object TestArr1 {

  def main(args: Array[String]): Unit = {
    val arr1 = Array(1,2,3,4,5)
    val res1 = for(i <- arr1) yield 2 * i
    for(i <- arr1) print(i)
    println()
    for(i <- res1) print(i)
    println()
    val res2 = for(i <- arr1 if i%2 == 0) yield 2*i
    for( i <- res2) print(i)
    println()
    val res3 = arr1.filter(_ %2 == 0).map(_ * 2)
    for( i <- res3) print(i)
    println( )



  }

}
