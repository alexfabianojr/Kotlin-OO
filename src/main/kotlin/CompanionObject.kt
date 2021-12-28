/**
 * In short, companion objects are singleton objects whose properties and functions are tied to a class
 * but not to the instance of that class — basically like the “static” keyword in Java but with a twist.
 * */
class SomeClassWithCompanion {
    //why use companion objects? Because they provide a convenient shorthand for accessing “static” properties/functions.
    //That's it. If, for some reason, you absolutely must have lazy initialization, then just use a regular object instead
    companion object { // only one companion object is allowed per class
        private val someNumber: Int
            get() = 79

        fun accessCompanionValValue() = someNumber
    }
}

//1. Unlike companion objects that get assigned a default name of Companion, regular object declarations must be named.
//2. Referencing the fields inside a regular object requires the containing class to explicitly use the object name.
//With companion objects, I could simply write Cafe.LATTE, but with regular objects, I have to write Cafe.Beverage.LATTE.
//3. Companion objects are initialized the first time the containing class is loaded

fun loadCompanion1() = println(SomeClassWithCompanion.Companion.accessCompanionValValue())

fun loadCompanion2() = println(SomeClassWithCompanion.accessCompanionValValue())

//Companion object can implement an interface

fun main() {
    loadCompanion1()
    loadCompanion2()
}

