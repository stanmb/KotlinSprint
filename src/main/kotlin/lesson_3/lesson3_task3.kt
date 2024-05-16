package lesson_3

fun main() {
    val multiplier = 6
    val resultedTable =
    """
    $multiplier * 1 = ${multiplier * 1}
    $multiplier * 2 = ${multiplier * 2}
    $multiplier * 3 = ${multiplier * 3}
    $multiplier * 4 = ${multiplier * 4}
    $multiplier * 5 = ${multiplier * 5}
    $multiplier * 6 = ${multiplier * 6}
    $multiplier * 7 = ${multiplier * 7}
    $multiplier * 8 = ${multiplier * 8}
    $multiplier * 9 = ${multiplier * 9}
    $multiplier * 10 = ${multiplier * 10}
    """.trimIndent()

    println(resultedTable)
}

