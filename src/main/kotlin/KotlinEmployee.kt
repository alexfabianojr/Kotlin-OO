import java.util.*

class KotlinEmployee(val firstName: String, var id: UUID ?= null, private val creditCard: String ?= null) {

    // ?= optional parameter

    var otherNewVariable: Double = 0.0 //must be initialized to be use in secondary constructor

    init {
        this.id = UUID.randomUUID()
    }

    //others constructors

    //most of the time we won't use secondary parameters since we can use optional parameters ? in primary constructors
    constructor(firstName: String, id: UUID, otherNewVariable: Double): this(firstName, id) {
        //the primary constructor will handle the variables that are declared there
        // in secondary constructors we don't declare val or var
        //we have to declare the variable in the class to access it
    }


}