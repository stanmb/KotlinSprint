package lesson3

fun main() {
    val movesString = "D2-D4;0"
    val from = movesString.split("-")[0]
    val to = movesString.split(";", "-")[1]
    val moveNumber = movesString.split(";")[1]

    println(from)
    println(to)
    println(moveNumber)
}