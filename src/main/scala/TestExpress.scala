object TestExpress {

  def main(args: Array[String]): Unit = {
    val res1 = if (2 > 1) 1 else -1
    println(res1)
    var s = 0
    if (2 > 1) s = 1 else s = -1
    val x = 2
    val res2 = if (x > 2) 1 else "hiyou" // 公共的超类Any
    println(res2)
    val res3 = if (x > 3) 1
    val r4 = if (x > 3) 1 else () //等同于上面，()无用值占用符号
    println(res3)
    val name = "lisi"
    var age = 5
    printf(f"Hello,$name in six months ,you'll be ${age+0.5}%.2f years old.%n")
  }

}
