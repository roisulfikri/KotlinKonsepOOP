package InitializerBlock

class personB (_firstName: String, _lastName: String, _age: Int) {
    var firstName: String = _firstName
    var lastName: String = _lastName
    var age: Int = _age
}

fun main() {
    val budi = personB("Budi", "Gunawan", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}