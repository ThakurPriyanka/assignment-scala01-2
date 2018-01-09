val num = List(1,2,3,0,6,9,4,11,9)

def indexAddedList(list: List[Int]) = {
  for (item <- list) {
    val index: Int = list.indexOf(item)
    println(s"$index = $item")
  }
}

def sumOfNumber(number: Int): Int = {
  if(number == 1 ) {
    1
  }
  else {
    val sum = number+sumOfNumber(number-1)
    val product = number*sumOfNumber(number-1)
    sum
  }
}
num.tail.length
val i =5
//fib1(5),0
sumOfNumber(i)