package lesson_4


fun main() {
    print("Наличие повреждений корпуса: ")
    val isShipDamaged: Boolean = readlnOrNull().toBoolean()
    print("Число членов экипажа: ")
    val numberOfCrew: Int = readlnOrNull()?.toInt() ?: 0
    print("Запас провизии: ")
    val numberOfProvisionBoxes: Int = readlnOrNull()?.toInt() ?: 0
    print("Благоприятность метеоусловий: ")
    val isWeatherConditionsGood: Boolean = readlnOrNull().toBoolean()

    println("Корабль может приступить к долгосрочному плаванию: ${
        (!isShipDamaged && numberOfCrew in 55..70 && numberOfProvisionBoxes > 50) ||
                (numberOfCrew == 70 && isWeatherConditionsGood && numberOfProvisionBoxes >= 50)}"
    )
}