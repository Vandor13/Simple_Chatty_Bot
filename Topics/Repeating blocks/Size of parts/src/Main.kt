fun main() {
    // put your code here
    val n = readln().toInt()
    var (perfect, larger, rejects) = arrayOf(0, 0, 0)

    repeat(n) {
        val component = readln().toInt()
        if (component < 0) {
            rejects++
        } else if (component == 0) {
            perfect++
        } else larger++
    }

    println("$perfect $larger $rejects")
}