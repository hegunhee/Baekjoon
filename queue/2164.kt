import java.util.*
fun main() {
    val queue = LinkedList<Int>()
    val n = System.`in`.bufferedReader().readLine().toInt()
    for(i in 1..n){
        queue.add(i)
    }
    while(queue.size != 1){
        queue.poll()
        queue.add(queue.poll())

    }
    println(queue.poll())
}