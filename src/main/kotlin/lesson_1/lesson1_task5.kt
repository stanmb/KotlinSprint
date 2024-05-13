package lesson_1

fun main() {
    val secondsInSpace = 6480
    val timeDivider = 60
    val minutesInSpace = secondsInSpace / timeDivider
    val hoursInSpace = minutesInSpace / timeDivider
    val remainderOfSeconds = secondsInSpace % timeDivider
    val remainderOfMinutes = minutesInSpace % timeDivider

    print(String.format("0%d", hoursInSpace) + ":")
    print("$remainderOfMinutes:")
    print(String.format("0%d", remainderOfSeconds))
}