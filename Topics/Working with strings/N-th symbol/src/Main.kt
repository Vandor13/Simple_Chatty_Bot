fun main() {
    // write your code here
    val string = readln()
    val number = readln().toInt()
    println("Symbol # $number of the string \"$string\" is '${string[number - 1]}'")
}