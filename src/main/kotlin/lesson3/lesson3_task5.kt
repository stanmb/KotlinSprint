package lesson3

fun main() {
    val movesString = "D2-D4;0"
    val splitMoveString = movesString.split(";", "-")
    val from = splitMoveString[0]
    val to = splitMoveString[1]
    val moveNumber = splitMoveString[2]

    println(from)
    println(to)
    println(moveNumber)
}