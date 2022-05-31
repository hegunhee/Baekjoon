fun main() {
    val n = System.`in`.bufferedReader().readLine().toInt()
    for(i in n downTo 1){
        println("*".repeat(i))
    }
}