fun main() {
    // write your code here
    val range1 = readln().toInt()..readln().toInt()
    val range2 = readln().toInt()..readln().toInt()
    val value = readln().toInt()
    println(value in range1 || value in range2)
}