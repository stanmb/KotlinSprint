package lesson_2

fun main() {
    val permanentWorkers = 50
    val interns = 30
    val salaryOfPermanentWorker = 30000
    val salaryOfIntern = 20000

    val salaryOfAllPermanentWorkers = permanentWorkers * salaryOfPermanentWorker
    val salaryOfAllInterns = interns * salaryOfIntern

    val commonSalaryCosts = salaryOfAllPermanentWorkers + salaryOfAllInterns
    val averageSalary = commonSalaryCosts / (permanentWorkers + interns)

    println(salaryOfAllPermanentWorkers)
    println(commonSalaryCosts)
    println(averageSalary)
}