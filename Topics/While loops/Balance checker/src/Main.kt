fun main() {
    // write your code here
    val startBalance = readln().toInt()
    val values = readln().split(" ")
    var remaniningBalance = startBalance
    var i = 0
    while (i <= values.lastIndex && remaniningBalance >= values[i].toInt()) {
        remaniningBalance -= values[i].toInt()
        i++
    }
    if (i > values.lastIndex) {
        println("Thank you for choosing us to manage your account! Your balance is $remaniningBalance.")
    } else {
        println(
            "Error, insufficient funds for the purchase. " +
                "Your balance is $remaniningBalance, but you need ${values[i].toInt()}."
        )
    }
}