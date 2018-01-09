def fib_recur(n: Int): Int = {
  n match {
    case i if i < 2 => i
    case i => fib_recur(n-1) + fib_recur(n-2)
  }
}


val i =5
//fib1(5),0
fib_recur(i)