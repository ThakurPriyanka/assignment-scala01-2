import com.knoldus.NumberOperation

object MainClass {
  def main(args: Array[String]): Unit = {
    val num1 = 1
    val num2 = 2
    val num3 = 4
    val num4 = 6
    val num5 = 8
   val list = List(num1,num2,num3,num4,num5)
//    val list = List(1,2,4,6,8)
    val operationObject = new NumberOperation
   operationObject.indexAddedList(list)
   val max = operationObject.maxElement(list)
   print(s"Maximum element: $max \n")
   val number = 5
   val sumProduct = operationObject.sumProductOfNumber(number)
   print(s"Sum: $sumProduct(0) Product: $sumProduct(2)\n")

  }
}
