import kotlin.math.abs

// write your code here

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}

fun getLastDigit(a: Int): Int {
    return abs(a % 10)
}
