package lesson_2

import kotlin.math.pow

fun main() {
    val moneyAmount = 70000
    val percentagePerYear = 16.7
    val periodOfDeposit = 20

    val finalMoneyAmount = moneyAmount * (1 + percentagePerYear / 100).pow(periodOfDeposit)
    println(String.format("%.3f", finalMoneyAmount))
}