import kotlin.math.min


fun main() {
    val startWithW = Array<String>(8) {""}
    for(i in 0 until 8){
        if(i%2 == 0) startWithW[i] = "WBWBWBWB"
        if(i%2 == 1) startWithW[i] = "BWBWBWBW"
    }
    val startWithB = Array<String>(8) { "" }
    for(i in 0 until 8){
        if(i%2 == 1) startWithB[i] = "WBWBWBWB"
        if(i%2 == 0) startWithB[i] = "BWBWBWBW"
    }

    val br = System.`in`.bufferedReader()
    val nm = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val chess = Array<String>(nm[0]) { "" }
    repeat(nm[0]) {
        chess[it] = br.readLine().toString()
    }
    var min = 70
    for (i in 0..(nm[0] - 8)) {
        for (j in 0..(nm[1] - 8)) {
            var wDiff = 0
            var bDiff = 0
            for (n in 0 until 8) {
                for (m in 0 until 8) {
                    if (chess[n + i][m + j].code != startWithW[n][m].code) {
                        wDiff++
                    }
                    if (chess[n + i][m + j].code != startWithB[n][m].code) {
                        bDiff++
                    }
                }
            }
            val current_min = min(wDiff, bDiff)
            if (current_min < min) {
                min = current_min
            }
        }
    }
    println(min)
}
