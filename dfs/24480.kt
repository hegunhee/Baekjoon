import java.util.*
var visited = intArrayOf()
var count = 0
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
    visited = IntArray(n){0}
    dfs(list,r)
    visited.forEach {
        bw.write("$it\n")
    }
    bw.flush()
    bw.close()

}

tailrec fun dfs(list : Array<LinkedList<Int>>,num : Int){
    visited[num] = ++count
    list[num].forEach {
        if(visited[it] == 0) dfs(list,it)
    }
}
