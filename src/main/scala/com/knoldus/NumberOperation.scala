package com.knoldus

class NumberOperation {
  def indexAddedList(list: List[Int]) = {
    for (item <- list) {
      val index: Int = list.indexOf(item)
      println(s"$index = $item")
    }
  }

  def maxElement(xl: List[Int]): Int = {
    if ((xl.head > xl.tail.head) && (xl.tail.length == 1))
      return xl.head
    else if (xl.tail.length == 1)
      xl.tail.head
    else
      maxElement(xl.tail)
  }
    def sumProductOfNumber(number: Int): List[Int] = {
      def sumOfNumber(number: Int): Int = {
        if (number == 1) {
          1
        }
        else {
          val sum = number + sumOfNumber(number - 1)
          sum
        }
      }

      def productOfNumber(number: Int): Int = {
        if (number == 1) {
          1
        }
        else {
          val product = number * productOfNumber(number - 1)
          product
        }
      }
      val product = productOfNumber(number)
      val sum = sumOfNumber(number)
      List(sum, product)
    }
}
