package lesson_3

fun main() {
    var where = "E2"
    var to = "E4"
    var moveNumber = 1
    var stringToSend = "$where-$to;$moveNumber"

    println(stringToSend)

    where = "D2"
    to = "D3"
    moveNumber += 1
    stringToSend = "$where-$to;$moveNumber"

    println(stringToSend)
}