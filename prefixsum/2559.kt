fun main() {
    val br = System.`in`.bufferedReader()
    val nm = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val arr = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val seq = IntArray(nm[0] + 1, { 0 })

    repeat(nm[0]){ i->
        if (i < nm[1]) {
            seq[i+1] = seq[i] + arr[i]
        } else {
            seq[i+1] = (seq[i] + arr[i]) - arr[i - nm[1]]
        }
    }
    println(seq.drop(nm[1]).maxOrNull())
}
