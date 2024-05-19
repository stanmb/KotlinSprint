package lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main() {
    val yearOfUsersBirth = readln().toInt()
    val currentYear = LocalDate.now().year
    val userAge = currentYear - yearOfUsersBirth

    val resultText = if (userAge >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else if (userAge == 16 || userAge == 17) "Показать экран с ограниченным контентом"
    else "Вернуться на гланвый экран"

    println(resultText)
}