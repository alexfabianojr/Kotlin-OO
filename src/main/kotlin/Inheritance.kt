
//If you want to be able to extend or override something you need to tell kotlin that it is 'open'
open class Person {}

class Warrior: Person() {}

data class SomeDataType(val something: String) {}

abstract class Printer(val model: String) {
    open fun printModel() = println("model: $model")
    abstract fun bestSellingPrice(): Double
    open fun someThing() = println()
}

class laserPrinter(model:String): Printer(model) {
    override fun printModel() = println("Laser model: $model")
    override fun bestSellingPrice(): Double =120.0
    //With final keyword no1 who extends laserPrinter can override it
    final override fun someThing() = super.someThing()
}

//interfaces are extendable by default

interface MyInterface {
    val number: Int
        get() = 50

    fun someFun1()
}

interface MySecondInterface: MyInterface {
    fun someFun2()
}

class WillImplementInterface: MySecondInterface {
    override fun someFun2() {
        TODO("Not yet implemented")
    }

    override fun someFun1() {
        TODO("Not yet implemented")
    }

    fun showSomething() = println(number) //from MyInterface
}