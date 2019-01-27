import scala.io.StdIn;

object TestRead {


  def main(args: Array[String]): Unit = {
    val name = StdIn.readLine("name:")
    print("age:")
    val age = StdIn.readInt()
    printf(s"hell ${name} ! next you age will be ${age+1}.")


  }



}
