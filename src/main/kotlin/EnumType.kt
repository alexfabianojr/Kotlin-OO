
enum class Department {
    HR, IT, ACC
}

enum class Characters(private val fullName: String) {
    WARRIOR("Human warrior"), MAGE("Elf Mage"); //when you add a fun in a enum you need to add an ; at the enums

    fun getDeptInfo(): String = fullName
}