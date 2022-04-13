fun main() {
    // put your code here
    val n = readln().toInt()
    var i = 0
    var length = 0
    while (length < n) {
        i++
        var j = 0
        while (length < n && j < i) {
            print("$i ")
            j++
            length++
        }
    }

}