fun main() {
    // put your code here
    var (a, b, c, d) = arrayOf(0, 0, 0, 0)
    val n = readln().toInt()
    repeat(n) {
        when (readln().toInt()) {
            5 -> a++
            4 -> b++
            3 -> c++
            2 -> d++
        }
    }
    println("$d $c $b $a")
}