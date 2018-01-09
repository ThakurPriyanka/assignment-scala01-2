package com.knoldus

object Application {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,4,6,8)
    val operationObject = new NumberOperation
    operationObject.indexAddedList(list)
    val max = operationObject.maxElement(list)
    println(s"Maximum element: $max")
    val number = 5
    val sumProduct = operationObject.sumProductOfNumber(number)
    println(s"Sum: ${sumProduct(0)} Product: ${sumProduct(1)}")
  }
}
