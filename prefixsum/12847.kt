fun main() {
    val br = System.`in`.bufferedReader()
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val arr = br.readLine().split(" ").map { it.toLong() }.toLongArray()
    val prefixSum = LongArray(n + 1, { 0 })
    for (i in 0 until n) {
        if (i < k) {
            prefixSum[i + 1] = prefixSum[i] + arr[i]
        } else {
            prefixSum[i + 1] = (prefixSum[i] + arr[i]) - arr[i - k]
        }
    }

    println(prefixSum.drop(k).maxOrNull())
}
