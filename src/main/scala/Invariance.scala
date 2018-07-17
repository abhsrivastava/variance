package com.abhi

class InvariantWrapper[A](wrapped: A) {
    def unwrapped: A = wrapped
}

object InvarianceEx extends App {
    val w1 : InvariantWrapper[Cat] = new InvariantWrapper[Cat](Cat("morris"))
    val w2 : InvariantWrapper[Animal] = new InvariantWrapper(Cat("morris"))
    // this will not compile
    // this is because InvariantWrapper[A] is covariant
    //val w3 : InvariantWrapper[Animal] = new InvariantWrapper[Cat](Cat("morris"))
    

    // this will also not compile
    // this is because InvariantWrapper[A] is not contravariant
    //val w4 : InvariantWrapper[Cat] = new InvariantWrapper[Animal](Cat("morris"))
}