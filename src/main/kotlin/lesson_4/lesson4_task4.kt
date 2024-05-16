package lesson_4

fun main() {
    var dayOfTraining = 5
    println(
        """
        Упражнения для рук:     ${if (dayOfTraining % 2 != 0) "true" else "false"}
        Упражнения для ног:     ${if (dayOfTraining % 2 == 0) "true" else "false"}
        Упражнения для спины:   ${if (dayOfTraining % 2 == 0) "true" else "false"}
        Упражнения для пресса:  ${if (dayOfTraining % 2 != 0) "true" else "false"}

    """.trimIndent())
}