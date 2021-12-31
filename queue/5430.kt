import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()
    val n = br.readLine().toInt()
    repeat(n) {
        val queue = LinkedList<Int>()
        val order = br.readLine().toCharArray()
        val size = br.readLine().toInt()
        var isStraight = true
        val st = StringTokenizer(br.readLine(), "[],")
        repeat(size) {
            queue.add(st.nextToken().toInt())
        }
        run repeatBreak@{
            repeat(order.size) {
                if (order[it] == 'R') {
                    isStraight = !isStraight
                } else {
                    if (queue.isEmpty()) {
                        println("error")
                        return@repeatBreak
                    } else {
                        if (isStraight) {
                            queue.remove()
                        } else {
                            queue.removeLast()
                        }
                    }
                }
            }
            print("[")
            if (isStraight) {
                while (queue.isNotEmpty()) {
                    if (queue.size != 1) {
                        print("${queue.pollFirst()},")
                    } else {
                        print(queue.pollFirst())
                    }

                }
            } else {
                while (queue.isNotEmpty()) {
                    if (queue.size != 1) {
                        print("${queue.pollLast()},")
                    } else {
                        print(queue.pollLast())
                    }
                }
            }
            print("]")
            println()
        }
    }
}