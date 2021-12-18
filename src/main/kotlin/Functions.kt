
//The default return type for a function is Unit
//Unit is equivalent to Void
fun main() {

    println(labelMultiply(3, 4, "Result: "))
    println(labelMultiply2(5, 5, "Result2: "))
    println(whatever())

    //named arguments
    println(labelMultiply(operand1 = 10, operand2 = 40, label = "Result: "))

    //accepting array in function param
    showNumbers(1, 2, 3, 4, 5, 6)
    val numbers = intArrayOf(7, 8, 9)
    showNumbers(*numbers) // * spread operator

    //default values param
    someFun("Alex")
    someFun()

    //Optional param
    anotherFun(4)
    anotherFun()
}

fun labelMultiply(operand1: Int, operand2: Int, label: String): String {
    return ("$label ${operand1 * operand2}")
}

fun labelMultiply2(operand1: Int, operand2: Int, label: String) = ("$label ${operand1 * operand2}")

fun whatever() = 3 * 5

//you can have only one vararg in a fun signature
//if vararg is the last parameter we need to use named arguments
fun showNumbers(vararg numbers: Int) {
    for (number in numbers) println(number)
}

fun someFun(name: String = "Joao") = println(name)

fun anotherFun(number: Int ?= null) = println("Oi")
