fun main() {
    // put your code here
    val range = readln().toInt()..readln().toInt()
    val n = readln().toInt()
    var divisors = 0
    for (i in range) {
        if (i % n == 0) {
            divisors++
        }
    }
    println(divisors)
}