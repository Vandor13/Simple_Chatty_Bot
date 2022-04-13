fun main() {
    // write your code here
    val char1 = readln().first()
    println(char1.isDigit() && char1 != '0' || char1.isLetter() && char1.isUpperCase())
}