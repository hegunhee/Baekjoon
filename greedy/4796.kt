import kotlin.math.min


fun main() {
    val br = System.`in`.bufferedReader()
    var count =1
    while (true) {
        val arr = br.readLine().split(" ").map { it.toInt() }.toIntArray()
        if (arr[0] == 0 && arr[1] == 0 && arr[1] == 0)
            break
        println("Case $count: ${(arr[2] / arr[1]) * arr[0] + min(arr[2] % arr[1], arr[0])}")
        count++
    }
}
