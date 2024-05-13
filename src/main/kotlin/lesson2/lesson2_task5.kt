package lesson2

import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {
    val moneyAmount = 70000
    val percentagePerYear = 16.7
    val periodOfDeposit = 20

    val finalMoneyAmount = moneyAmount * (1 + percentagePerYear / 100).pow(periodOfDeposit)
    val finalMoneyAmountWithLimitedDigits = (finalMoneyAmount * 1000).roundToInt() / 1000.0
    println(finalMoneyAmountWithLimitedDigits)
}