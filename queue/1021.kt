import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()
    val nk = br.readLine().split(" ")
    var queue = LinkedList<Int>()
    for (i in 1..nk[0].toInt()) {
        queue.add(i)
    }
    val find_numbers = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    var count = 0
    for (number in 0 until find_numbers.size) {

        var first_count = 0
        var second_count = 0
        val first_queue = queue.clone() as LinkedList<Int>
        val second_queue = queue.clone() as LinkedList<Int>
        while (first_queue.first != find_numbers[number]) {
            first_count++
            first_queue.add(first_queue.pollFirst())
        }
        first_queue.poll()
        while (second_queue.first != find_numbers[number]) {
            second_count++
            second_queue.addFirst(second_queue.pollLast())
        }
        second_queue.poll()

        if (first_count > second_count) {
            queue = second_queue
            count += second_count
        } else {
            queue = first_queue
            count += first_count
        }
    }
    println(count)
}