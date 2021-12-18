
//Extension function adds new functions to the class

fun SomeClass.hello() = println("Hello")

class SomeClass {
    fun hi() = println("Hi")
}

fun main() {
    val someClass = SomeClass()
    someClass.hi()
    someClass.hello()
}