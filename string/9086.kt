
fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    repeat(n){
        val str = br.readLine()
        println("${str.first()}${str.last()}")
    }
}