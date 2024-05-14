package lesson_2

fun main() {
    val listOfAverageMarks = listOf(3, 4, 3, 5)
    val numberOfStudents = 4
    val average = listOfAverageMarks.sum().toFloat() / numberOfStudents

    println(average)
}