package lesson_4

const val CATEGORY = "Average"
const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {
    var weight = 20
    var volume = 80

    println("Груз с весом $weight кг и объемом $volume л соответствует категории '$CATEGORY': ${ MIN_WEIGHT <= weight && weight <= MAX_WEIGHT && volume < MAX_VOLUME}")

    weight = 50
    volume = 100

    println("Груз с весом $weight кг и объемом $volume л соответствует категории '$CATEGORY': ${ MIN_WEIGHT <= weight && weight <= MAX_WEIGHT && volume < MAX_VOLUME}")
}