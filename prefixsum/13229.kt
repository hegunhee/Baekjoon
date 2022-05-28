fun main() {
    val br = System.`in`.bufferedReader()
    br.readLine()
    val sb = StringBuilder()
    val arr = br.readLine().split(" ").map { it.toInt() }
    val fs = IntArray(arr.size + 1) { 0 }
    for (i in 0 until arr.size) {
        fs[i + 1] = fs[i] + arr[i]
    }
    val n = br.readLine().toInt()
    repeat(n){
        val (start,end) = br.readLine().split(" ").map { it.toInt() }
        sb.append("${fs[end+1] - fs[start]}\n")
    }
    println(sb.toString())
}
