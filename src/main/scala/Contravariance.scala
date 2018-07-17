package com.abhi

object Contravariance extends App {
    val ds1: Keeper[Dog] = new DogKeeper
    ds1.tend(Dog("scooby"))

    val ds2: Keeper[Dog] = new ZooKeeper // Zookeeper is Keeper[Animal]
    ds2.tend(Dog("scooby"))

    val ds3 : Keeper[Dog] = new PetKeeper // PetKeeper is Keeper[Pet]
    ds3.tend(Dog("scooby"))
}