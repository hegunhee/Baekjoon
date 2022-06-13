import java.util.*

var visited = intArrayOf()
var count = 0
val queue = LinkedList<Int>()

fun main() {
    val br = System.`in`.bufferedReader()
    var (n, m, r) = br.readLine().split(" ").map { it.toInt() }
    r -= 1
    val list = Array<LinkedList<Int>>(n) { LinkedList<Int>() }
    val bw = System.`out`.bufferedWriter()
    repeat(m) {
        val (start, end) = br.readLine().split(" ").map { it.toInt() - 1 }
        list[start].add(end)
        list[end].add(start)
    }
    list.forEach {
        it.sortDescending()
    }
    visited = IntArray(n) { 0 }
    bfs(list,r)
    visited.forEach {
        println(it)
    }
}

fun bfs(list : Array<LinkedList<Int>>, num : Int){
    visited[num] = ++count
    queue.add(num)
    while(queue.isNotEmpty()){
        val current_num = queue.pollFirst()
        list[current_num].forEach {
            if(visited[it] == 0){
                visited[it] = ++count
                queue.add(it)
            }
        }
    }
}