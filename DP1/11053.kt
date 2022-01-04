import kotlin.math.max

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val sequence = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val arr = IntArray(n, { 1 })

    for (i in 1 until n) {
        for (j in 0 until i) {
            if (sequence[j] < sequence[i]) {
                arr[i] = max(arr[i],arr[j]+1)
            }
        }
    }
    print(arr.maxOrNull())
}
