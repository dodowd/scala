object TestLoop {

  def main(args: Array[String]): Unit = {

    for (i <- 1 to 5)
      print(f"$i%3d")
    println()
    for (i <- (1 to 5).reverse)
      print(f"$i%3d")
  }


}
