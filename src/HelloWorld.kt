fun main() {
    val userName = "Umut"   // val can not be change. (java -> final)
    var age = 25

    println("Hello, World! My name is $userName. I'm $age years old. In 2 years I'll be ${age + 2}")
    sayHelloKotlin()
}

fun sayHelloKotlin() {
    println("Hello, Kotlin!")
}