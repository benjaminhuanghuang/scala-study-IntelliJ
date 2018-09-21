package scalastudy

object ArrayDemo {
  def main(args: Array[String]): Unit = {
    var name: Array[String] = new Array[String](3)
    name(0) = "jal"
    name(1) = "Faizy"
    name(2) = "Expert"


    println("Hello," + name(2))
  }
}