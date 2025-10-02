package InitializerBlock

class personC (var firstName: String, var lastName: String, var age: Int) {}

fun main() {
    val budi = personC("Budi", "Gunawam", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}