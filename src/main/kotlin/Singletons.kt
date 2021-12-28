import java.time.Year

//objects type only have one instance in kotlin
object MySingleton1 {
    val someThing: String = Year.now().toString()
}