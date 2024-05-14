package lesson_2

fun main() {
    val departureTimeHours = 9
    val departureTimeMinutes = 39
    val travelTimeInMinutes = 457
    val timeDivider = 60

    val totalDepartureTimeInMinutes = departureTimeMinutes + (departureTimeHours * timeDivider)
    val arrivalTimeInMinutes = travelTimeInMinutes + totalDepartureTimeInMinutes
    val arrivalHours = arrivalTimeInMinutes / timeDivider
    val arrivalMinutes = arrivalTimeInMinutes % timeDivider

    print(String.format("%02d", arrivalHours) + ":")
    print(String.format("%02d", arrivalMinutes))
}