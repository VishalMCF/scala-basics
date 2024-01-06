import scala.language.postfixOps

object FunctionExercise extends App {

  /**
   *  1. A greeting function (name, age) => Hello my name is ${name} and I am ${age} years old
   *  2. Factorial function 1*2*3*..*n
   *  3. Fibonacci numbers
   *  4. Test if a number is prime
   */

  // Greeting function
  private def greetingFunction(name:String, age:Int): Unit = {
    println(s"Hello my name is ${name} and I am ${age} years old")
  }
  greetingFunction("Billa",2)

  // Factorial function
  private def factorial(n:Int): Int = {
    if(n==1 || n==0) 1
    else{
      n*factorial(n-1)
    }
  }
  println(factorial(7));

  // Fibonacci Numbers
  private def fibonacci(n:Int):Int = {
    if (n<=1)return 1
    else fibonacci(n-1)+fibonacci(n-2)
  }
  println(fibonacci(6))

  // Prime numbers
  private def isPrime(n:Int):Boolean = {
    if(n<=1) {false}
    if(n==2) {true}
    else {
      val num:Double = n;
      val squareRoot:Double = math.sqrt(n);
      for(i <-2 to squareRoot.toInt){
        if(n%i == 0){
          return false
        }
      }
      true
    }
  }
  println(isPrime(43))
}
