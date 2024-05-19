package lesson_5

const val NUM_ONE = 2
const val NUM_TWO = 18

fun main() {
    var oneMatch = false
    var twoMatches = false

    println("Введите первое число")
    val userNumOne = readln().toInt()
    println("Введите второе число")
    val userNumTwo = readln().toInt()

    if (userNumOne == NUM_ONE || userNumOne == NUM_TWO) oneMatch = true
    if (userNumTwo == NUM_ONE || userNumTwo == NUM_TWO) twoMatches = true

    val resultString = if (oneMatch && !twoMatches || !oneMatch && twoMatches) "Вы выиграли утешительный приз!"
    else if (twoMatches && oneMatch) "Поздравляем! Вы выиграли главный приз!"
    else "Неудача!"

    println(resultString)

    if (!oneMatch && !twoMatches) println("Числа которые нужно было угадать: $NUM_ONE, $NUM_TWO")
}