package lesson_4

const val IDEAL_HUMIDITY = 20
const val WINTER = "winter"
const val IDEAL_SUNNY_CONDITION = true
const val IDEAL_AWNING_OPENED_CONDITION = true

fun main() {
    val isSunny = true
    val isAwningOpened = true
    val humidity = 20
    val season = "winter"

    print("Благоприятные ли условия сейчас для роста бобовых? ${isSunny == IDEAL_SUNNY_CONDITION && isAwningOpened == IDEAL_AWNING_OPENED_CONDITION && humidity == IDEAL_HUMIDITY && season.lowercase() != WINTER}")
}