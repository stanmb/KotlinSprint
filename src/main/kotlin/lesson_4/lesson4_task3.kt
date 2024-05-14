package lesson_4

fun main() {
    val category = "Average"
    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100
    val weight = 20
    val volume = 80

    println("Груз с весом $weight кг и объемом $volume л соответствует категории '$category': ${ minWeight <= weight && weight <= maxWeight && volume < maxVolume}")
}