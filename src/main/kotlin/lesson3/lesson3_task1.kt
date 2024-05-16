package lesson3

fun main() {
    val username = "Andrey"
    val greetingMorningText = "Good morning"
    val greetingEveningText = "Good evening"
    var greeting = "$greetingMorningText, $username"

    println(greeting)
    greeting = "$greetingEveningText, $username"
    println(greeting)
}