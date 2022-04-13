import java.util.Scanner

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val values: MutableList<Int> = mutableListOf()
    while (scanner.hasNextLine()) {
        values.add(scanner.nextLine().toInt())
    }
    val highestValue = values.maxOrNull()
    val index = values.indexOf(highestValue) + 1
    println("$highestValue $index")
}