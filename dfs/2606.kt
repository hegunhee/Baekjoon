import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val k = br.readLine().toInt()
    val arr = Array<MutableList<Int>>(n + 1) { mutableListOf() }
    val visit = LinkedList<Int>()
    val queue = LinkedList<Int>()
    repeat(k) {
        val ab = br.readLine().split(" ")
        arr[ab[0].toInt()].add(ab[1].toInt())
        arr[ab[1].toInt()].add(ab[0].toInt())
    }
    queue.push(1)
    while (queue.isNotEmpty()) {
        val current_value = queue.pop()
        for (value in arr[current_value].iterator()) {
            if (value !in visit) {
                visit.push(value)
                queue.push(value)
            }
        }
    }
    println(visit.size - 1)
}