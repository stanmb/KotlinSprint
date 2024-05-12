package lesson_1

fun main() {
    val secondsInSpace = 6480
    val minutesInSpace = secondsInSpace / 60
    val hoursInSpace = minutesInSpace / 60
    val remainderOfSeconds = secondsInSpace % 60
    val remainderOfMinutes = minutesInSpace % 60

    print("0$hoursInSpace:$remainderOfMinutes:0$remainderOfSeconds")
}