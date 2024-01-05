object ValuesVariableTypes extends App {
  private val x:Int = 68
  println("x = "+x)

  // values are immutable. need to de defied as var if they needs to get their valus changed
  // x = 2

  // compiler can infer types ( sometimes ot probably )
  private val someString:String = "just a string"
  println(someString)

  // some other types are ->  Boolean  Char  Int  Short Long  Float  Double
  var y:Int = 9
  y = x + 2
  println("y = "+y)
}
