fun main() {
    // put your code here
    val numberOfSquirrels = readln().toInt()
    val numberOfNuts = readln().toInt()
    val leftoverNuts = numberOfNuts % numberOfSquirrels
    println(leftoverNuts)
}