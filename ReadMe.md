# Pattern Matching Error

I was expecting the following scala code should work without any warnings or errors. But it is not without default case.
I all the cases are covered without default case, so I did not understand why should I add it.

```scala
def hasMoreThanTwo(input: Seq[Int]): Boolean = input match {
  case Seq() => false
  case _ +: Seq() => false
  case _ +: _ +: Seq() => false
  case _ +: tail =>
    println(s"size of the given input is ${tail.size + 1} ")
    true

  //    case _ =>
  //      println("is default case should be true or false? I am not expecting this case")
  //      false
}
```

### test

```
sbt test
```