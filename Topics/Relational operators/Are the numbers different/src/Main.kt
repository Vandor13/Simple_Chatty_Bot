fun main() {
    // put your code here
    val number1 = readln()
    val number2 = readln()
    val number3 = readln()
    val numbersAreEqual = (number1 != number2) && (number1 != number3) && (number2 != number3)
    println(numbersAreEqual)
}