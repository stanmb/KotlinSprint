package lesson_4

fun main() {
    var isSunny = true
    var isAwningOpened = true
    var humidity = 20
    var season = "winter"

    print("Благоприятные ли условия сейчас для роста бобовых? ${isSunny && isAwningOpened && humidity == 20 && season.lowercase() != "winter" }")
}