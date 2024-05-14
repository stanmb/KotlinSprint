package lesson_4

fun main() {
    val category = "Average"
    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100
    var weight = 20
    var volume = 80

    println("Груз с весом $weight кг и объемом $volume л соответствует категории '$category': ${ minWeight <= weight && weight <= maxWeight && volume < maxVolume}")

    weight = 50
    volume = 100

    println("Груз с весом $weight кг и объемом $volume л соответствует категории '$category': ${ minWeight <= weight && weight <= maxWeight && volume < maxVolume}")
}