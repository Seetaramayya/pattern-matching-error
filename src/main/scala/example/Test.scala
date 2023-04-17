package example

object Test {

  def hasMoreThanTwo(input: Seq[Int]): Boolean = input match {
    case Seq()           => false
    case _ +: Seq()      => false
    case _ +: _ +: Seq() => false
    case _ +: tail =>
      println(s"size of the given input is ${tail.size + 1} ")
      true

//    case _ =>
//      println("is default case should be true or false? I am not expecting this case")
//      false
  }
}
