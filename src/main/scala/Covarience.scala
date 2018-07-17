package com.abhi

class CovariantWrapper[+A](wrapped: A) {
    def unwrapped: A = wrapped
}

object Covariance extends App {
    val w1 : CovariantWrapper[Cat] = new CovariantWrapper[Cat](Cat("morris"))
    val w2 : CovariantWrapper[Animal] = new CovariantWrapper(Cat("morris"))
    // this compiles because CovariantWrapper is covariant of A
    val w3: CovariantWrapper[Animal] = new CovariantWrapper[Cat](Cat("morris"))
    // this won't compile because CovariantWrapper is not contravarient of A
    //val w4 : CovariantWrapper[Cat] = new CovariantWrapper[Animal](Cat("morris"))
}