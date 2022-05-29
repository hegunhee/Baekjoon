import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val nk = br.readLine().split(" ")
    val n = nk[0].toInt()
    val k = nk[1].toInt()
    val priority = IntArray(n + 1)
    val list = mutableMapOf<Int, MutableList<Int>>()
    for (i in 1..n) {
        list[i] = mutableListOf()
    }
    repeat(k) {
        val v1_v2 = br.readLine().split(" ")
        val v1 = v1_v2[0].toInt()
        val v2 = v1_v2[1].toInt()
        list[v1]?.add(v2)
        priority[v2]++
    }
    val queue = PriorityQueue<Int>()
    for (i in 1..n) {
        if (priority[i] == 0) {
            queue.offer(i)
        }
    }
    while (queue.isNotEmpty()) {
        val node = queue.poll()
        for (value in 0 until if(list[node]?.isNullOrEmpty() == true) 0 else list[node]?.size!!) {
            priority[list[node]?.get(value)!!]--
            if (priority[list[node]?.get(value)!!] == 0) {
                queue.offer(list[node]?.get(value)!!)
            }
        }
        print("$node ")
    }
}