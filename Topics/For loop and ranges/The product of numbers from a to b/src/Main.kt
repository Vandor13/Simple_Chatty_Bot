fun main() {
    // put your code here
    val range = readln().toInt() until readln().toInt()
    var product = 1L
    for (i in range) product *= i
    println(product)
}