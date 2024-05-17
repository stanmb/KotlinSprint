package lesson_4

fun main() {
    val dayOfTraining = 5
    val isEven = dayOfTraining % 2 == 0
    println(
        """
        Упражнения для рук:     ${if (!isEven) "true" else "false"}
        Упражнения для ног:     ${if (isEven) "true" else "false"}
        Упражнения для спины:   ${if (isEven) "true" else "false"}
        Упражнения для пресса:  ${if (!isEven) "true" else "false"}

    """.trimIndent())
}