package lesson4

fun main() {
    val totalTables = 13
    var bookedTablesToday = 13
    var bookedTablesTomorrow = 9

    println("Доступность столиков на сегодня: ${totalTables > bookedTablesToday}")
    println("Доступность столиков на завтра: ${totalTables > bookedTablesTomorrow}")
}