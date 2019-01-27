object TestFunction1 {

  def sum(n:Int*) = {
    var res =0
    for(i <- n) res +=i
    res

  }

  def recursiveSum(args:Int*):Int = {

    if(args.length == 0) 0 else args.head + recursiveSum(args.tail : _*)
    // head 是首个元素，tail是所有其他元素的序列
  }

  def box1(str:String){
    val borader = "-" * (str.length + 2)
    print(f"$borader%n|$str|%n$borader%n")
  }
  def  box2(str:String): Unit ={
    val borader = "-" * (str.length + 2)
    print(f"$borader%n|$str|%n$borader%n")
  }

  def main(args: Array[String]): Unit = {
    val v1 = sum(1,2,3) // Seq
    println(v1)
    // val v2 = sum(1 to 5)  // 出入的单个参数，必须是单个整数，不是一个整数区间range
    val v2 = sum(1 to 5 :_*)  // 希望这个参数当作参数序列处理

    val v3 = recursiveSum(1 to 3 :_*)
    println(v3)
    box1("hello you ")
  }

}
