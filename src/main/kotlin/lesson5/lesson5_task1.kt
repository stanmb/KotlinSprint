package lesson5

fun main() {
    var isChallengePassed = false
    var numOne: Int
    var numTwo: Int
    var userResponse: String?

    while (!isChallengePassed) {
        numOne = (0..10).random()
        numTwo = (0..10).random()

        println("Докажите что вы не робот. Введите результат выражения $numOne + $numTwo")
        userResponse = readln()
        if (userResponse.toInt() == numOne + numTwo) {
            isChallengePassed = true
            println("Вы успешно справились с заданием!")
        }
        else println("Ответ неверный.")
    }
}