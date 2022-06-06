fun main() {
    val br = System.`in`.bufferedReader()
    val num = br.readLine().toInt()
    val arr = br.readLine().split(" ").map{it.toInt()}.count{it%10 == num}
    println(arr)
}