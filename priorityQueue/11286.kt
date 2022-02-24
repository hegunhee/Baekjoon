import java.util.*
import kotlin.math.abs


fun main() {

    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    var pq = PriorityQueue<Int>(n) { o1: Int, o2: Int ->
        val n = abs(o1)
        val m = abs(o2)
        if (n < m) {
            return@PriorityQueue -1
        } else if (n > m) {
            return@PriorityQueue 1
        } else {
            if (o1 < o2) {
                return@PriorityQueue -1
            } else if (o1 > o2) {
                return@PriorityQueue 1
            } else {
                return@PriorityQueue 0
            }
        }
    }
    repeat(n) {
        val value = br.readLine().toInt()
        if (value == 0) {
            if (pq.isEmpty()) {
                println(0)
            } else {
                println(pq.poll())
            }
        } else {
            pq.offer(value)
        }
    }

}