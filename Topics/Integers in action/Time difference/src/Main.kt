const val SECONDS_IN_HOUR = 60 * 60
const val SECONDS_IN_MINUTE = 60

fun main() {
    // put your code here
    val hours1 = readln().toInt()
    val minutes1 = readln().toInt()
    val seconds1 = readln().toInt()
    val moment1InSeconds = hours1 * SECONDS_IN_HOUR + minutes1 * SECONDS_IN_MINUTE + seconds1
    val hours2 = readln().toLong()
    val minutes2 = readln().toInt()
    val seconds2 = readln().toInt()
    val moment2InSeconds = hours2 * SECONDS_IN_HOUR + minutes2 * SECONDS_IN_MINUTE + seconds2
    val timeBetweenMoments = moment2InSeconds - moment1InSeconds
    println(timeBetweenMoments)
}