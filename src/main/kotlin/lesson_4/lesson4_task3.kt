package lesson_4

const val IDEAL_HUMIDITY = 20
const val WINTER = "winter"

fun main() {
    val isSunny = true
    val isAwningOpened = true
    val humidity = 20
    val season = "winter"

    print("Благоприятные ли условия сейчас для роста бобовых? ${isSunny && isAwningOpened && humidity == IDEAL_HUMIDITY && season.lowercase() != WINTER }")
}