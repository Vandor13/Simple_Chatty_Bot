import kotlin.math.abs

fun main() {
    // write your code here
    val (x1, y1) = readln().split(" ")
    val (x2, y2) = readln().split(" ")

    if (
        x1.toInt() == x2.toInt() ||
        y1.toInt() == y2.toInt() ||
        abs(x1.toInt() - x2.toInt()) == abs(y1.toInt() - y2.toInt())
    ) {
        println("YES")
    } else println("NO")
}