import kotlin.math.max

fun main() {
    val br = System.`in`.bufferedReader()
    val a = br.readLine()
    val b = br.readLine()
    val LCS = Array<IntArray>(a.length + 1) { IntArray(b.length + 1) { 0 } }
    for (i in 1..a.length) {
        for (j in 1..b.length) {
            if (a[i - 1] == b[j - 1]) {
                LCS[i][j] = LCS[i - 1][j - 1] + 1
            }else{
                LCS[i][j] = max(LCS[i-1][j],LCS[i][j-1])
            }
        }
    }
    println(LCS[a.length][b.length])
}