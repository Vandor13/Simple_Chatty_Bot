fun main() {
    // put your code here
    val n = readln().toInt()
    var biggestNumber = 0
    repeat(n) {
        val number = readln().toInt()
        if (number > biggestNumber && number % 4 == 0) biggestNumber = number
    }
    println(biggestNumber)
}