package lesson_2

fun main() {
    val departureTimeHours = 9
    val departureTimeMinutes = 39
    val travelTimeInMinutes = 457

    val totalDepartureTimeInMinutes = departureTimeMinutes + (departureTimeHours * 60)
    val arrivalTimeInMinutes = travelTimeInMinutes + totalDepartureTimeInMinutes
    val arrivalHours = arrivalTimeInMinutes / 60
    val arrivalMinutes = arrivalTimeInMinutes % 60

    println("$arrivalHours:$arrivalMinutes")
}