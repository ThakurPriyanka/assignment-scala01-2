package com.knoldus

class NumberOperation {
  def indexAddedList(list: List[Int]): Unit = {
    for (item <- list) {
      val index: Int = list.indexOf(item)
      print(s"$index = $item \n")
    }
  }

  def maxElement(xl: List[Int]): Int = {
    if ((xl.head > xl.tail.head) && (xl.tail.length == 1)) {
      xl.head
    }
    else if (xl.tail.length == 1) {
      xl.tail.head
    }
    else {
      maxElement(xl.tail)
    }
  }
    def sumProductOfNumber(number: Int): Int = {
      def sumOfNumber(number: Int): Int = {
        if (number == 0) {
          0
        }
        else {
          val sum = number % 10 + sumOfNumber(number / 10)
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

      val sum = sumOfNumber(product)
      sum
    }
}
