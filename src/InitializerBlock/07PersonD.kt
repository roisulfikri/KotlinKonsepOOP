package InitializerBlock

class personD {
    var fisrtName: String
    var lastName: String
    var age: Int
    constructor(_firstName: String, _lastName: String, _age: Int) {
        fisrtName = _firstName
        lastName = _lastName
        age = _age
    }
}

fun main() {
    val budi = personD("Budi", "Gunawan", 21)
    println("Name : ${budi.fisrtName} ${budi.lastName}")
    println("Age : ${budi.age}")
}