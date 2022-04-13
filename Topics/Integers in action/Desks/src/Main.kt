import kotlin.math.ceil

const val STUDENTS_PER_DESK = 2f

fun main() {
    // put your code here
    val numberOfStudent1 = readln().toFloat()
    val numberOfStudent2 = readln().toFloat()
    val numberOfStudent3 = readln().toFloat()
    val numberOfDesks = ceil(numberOfStudent1 / STUDENTS_PER_DESK) +
        ceil(numberOfStudent2 / STUDENTS_PER_DESK) +
        ceil(numberOfStudent3 / STUDENTS_PER_DESK)
    println(numberOfDesks.toInt())
}