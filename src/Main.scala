import scala.io.StdIn
object starter {
  def main(args:Array[String]): Unit = {
    var n: Float = 0.0f
    var n2: Float = 0.0f
    var oper: Char =' '
    println("enter first num")
    n=StdIn.readFloat()
    println("enter second num")
    n2=StdIn.readFloat()
    println("enter operator")
    oper=StdIn.readChar()
    println(calc(n,n2,oper))
  }

  def calc(num1: Float, num2: Float, op: Char): Float = {
    if (op == '+')
      num1 + num2

    else if (op == '-')
      num1 - num2

    else if (op == '*')
      num1 * num2
    else {
      if (num2 != 0)
        num1 / num2
      else
        throw new Exception("connot divide by 0")
    }
  }
}