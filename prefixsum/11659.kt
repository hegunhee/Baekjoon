fun main() {
    val br = System.`in`.bufferedReader()
    val nm = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val arr = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val sb = StringBuilder()
    val preSum = IntArray(nm[0] + 1) { 0 }
    arr.forEachIndexed { index, i ->
        preSum[index+1] = i + preSum[index]
    }
    repeat(nm[1]) {
        val (i, j) = br.readLine().split(" ").map { it.toInt() }
        sb.append("${preSum[j] - preSum[i-1]}\n")
    }
    println(sb.toString())
}
