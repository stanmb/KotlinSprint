package lesson_4

const val MIN_CREW_NUMBER = 55
const val MAX_CREW_NUMBER = 70
const val MIN_PRODUCT_BOXES = 50
const val CREW_NUM_IF_SHIP_DAMAGED = 70

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
        (!isShipDamaged && numberOfCrew in MIN_CREW_NUMBER..MAX_CREW_NUMBER && numberOfProvisionBoxes > MIN_PRODUCT_BOXES) ||
                (numberOfCrew == CREW_NUM_IF_SHIP_DAMAGED && isWeatherConditionsGood && numberOfProvisionBoxes >= MIN_PRODUCT_BOXES)}"
    )
}