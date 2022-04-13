fun main() {
    // write your code here
    val value = readln().toInt()
    val range = readln().toInt()..readln().toInt()
    println(value in range)
}