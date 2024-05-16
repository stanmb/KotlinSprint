package lesson4

const val TOTAL_TABLES = 13
fun main() {
    val bookedTablesToday = 13
    val bookedTablesTomorrow = 9

    println("Доступность столиков на сегодня: ${TOTAL_TABLES > bookedTablesToday}")
    println("Доступность столиков на завтра: ${TOTAL_TABLES > bookedTablesTomorrow}")
}