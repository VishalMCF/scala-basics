object Functions extends App {

  private def myFunction(a:String, b:String): String = {
    a + " " + b
  }

  println(myFunction("hello"," world"))

  // parameterless functions can not be called just by there names. () must be added after their names
  private def parameterLessFunction(): Int = 90
  println(parameterLessFunction())

  // this would not work
  // println(parameterLessFunction)

  // when you need loops please use recursio as SCala is a functional language
  def aRepeatedFunction(aString:String, n:Int): String = {
    if (n==1) aString
    else aString + "\n" + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello Billa",6))

  // when we are not returning an expression and doing some operation which does not results into any value we have to add Unit as return type to the
  // these operations can be considered as side effect
  def functionWithSideEffect(): Unit = println(100)

  // when we print unit it gives -> () on the console
  println(functionWithSideEffect())

  def aBigFunction(n:Int):Unit = {
    def aSmallerFunction(a:Int, b:Int):Unit = {
      println(a+b)
    }
    aSmallerFunction(n,n-1)
  }

  aBigFunction(10)

}
