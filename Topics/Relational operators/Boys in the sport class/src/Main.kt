fun main() {
    // put your code here
    val boy1 = readln().toInt()
    val boy2 = readln().toInt()
    val boy3 = readln().toInt()
    val ordered = (boy2 in boy1..boy3) ||
            (boy2 in boy3..boy1)
    println(ordered)
}