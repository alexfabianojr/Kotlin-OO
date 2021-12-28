
fun main() {
    wantsSomeInterface(object: SomeInterface {
        override fun mustImpl(num: Int): String =
            "This is my impl $num"
    })
}

interface SomeInterface {
    fun mustImpl(num: Int): String
}

fun wantsSomeInterface(si: SomeInterface) {
    println("${si.mustImpl(22)}")
}