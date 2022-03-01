import kotlin.math.abs

fun main() {
    val br =System.`in`.bufferedReader()
    val a = br.readLine()
    val b = br.readLine()
    var count = 0
    for(i in 97..122){
        count += abs(a.count{it == i.toChar()} - b.count{it == i.toChar()})
    }
    println(count)
}