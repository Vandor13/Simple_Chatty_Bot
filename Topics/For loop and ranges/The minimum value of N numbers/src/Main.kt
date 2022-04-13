fun main() {
    // write your code here
    val n = readln().toInt()
    val values = Array(n) { readln().toInt() }
    values.sort()
    println(values[0])
}