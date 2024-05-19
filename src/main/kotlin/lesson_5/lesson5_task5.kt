package lesson_5


fun main() {
    val numbersRange = 0..42
    val numbersToGuessList = listOf(numbersRange.random(), numbersRange.random(), numbersRange.random())
    val numbersFromUserList = mutableListOf<Int>()

    println("Введите первое число")
    numbersFromUserList.add(readln().toInt())
    println("Введите второе число")
    numbersFromUserList.add(readln().toInt())
    println("Введите второе число")
    numbersFromUserList.add(readln().toInt())

    val resultString = when (numbersToGuessList.intersect(numbersFromUserList).size) {
        3 -> "Ура! Вы Выиграли джекпот!"
        2 -> "Вы угадали два числа и получаете крупный приз!"
        1 -> "Вы угадали одно число и получаете утешительный приз"
        else -> "Вы не угадали ни одного числа"
    }
    println(resultString)
    println("Загаданные числа: ${numbersToGuessList.joinToString(" ")}")
}