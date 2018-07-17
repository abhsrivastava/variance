package com.abhi

abstract class Animal {
    def name: String
}

abstract class Pet extends Animal
case class Cat(name: String) extends Pet
case class Dog(name: String) extends Pet

abstract class Keeper[-A] {
    def tend(input: A) : Unit
}

class DogKeeper extends Keeper[Dog] {
    def tend(input: Dog) : Unit = {
        println(s"${input.name} is happy")
    }
}

class CatKeeper extends Keeper[Cat] {
    def tend(input: Cat) : Unit = {
        println(s"${input.name} is happy")
    }
}

class ZooKeeper extends Keeper[Animal] {
    def tend(input: Animal) : Unit = {
        println(s"${input.name} is happy")
    }
}

class PetKeeper extends Keeper[Pet] {
    def tend(input: Pet) : Unit = {
        println(s"${input.name} is happy")
    }
}