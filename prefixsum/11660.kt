fun main() {
    val br = System.`in`.bufferedReader()
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val arr = Array<IntArray>(n) { IntArray(n) { 0 } }
    val dp = Array<IntArray>(n + 1) { IntArray(n + 1) { 0 } }
    val bw = System.`out`.bufferedWriter()
    repeat(n) { i ->
        arr[i] = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    }
    for (i in 0 until n) {
        for (j in 0 until n) {
            dp[i + 1][j + 1] = arr[i][j] + dp[i][j + 1] + dp[i + 1][j] - dp[i][j]
        }
    }
    repeat(m){
        val (x1,y1,x2,y2) = br.readLine().split(" ").map{it.toInt()}
        bw.write("${dp[x2][y2] - dp[x1-1][y2] - dp[x2][y1-1] + dp[x1-1][y1-1]}\n")
    }
    bw.flush()
    bw.close()
}
