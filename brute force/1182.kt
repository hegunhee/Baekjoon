import java.util.*

var count = 0
val dict = mutableListOf<Int>()
fun main() {
    val br = System.`in`.bufferedReader()
    val ns = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val n = ns[0]
    val s = ns[1]
    val dicts = br.readLine().split(" ").map { it.toInt() }.toIntArray().sorted()
    for (i in 0 until dicts.size) {
        dict.add(dicts[i])
    }
    for (i in 1..n) {
        dfs(i, LinkedList(), s, 0)
    }
    println(count)
}

fun dfs(n: Int, arr: LinkedList<Int>, s: Int, i: Int) {
    if (arr.size == n) {
        if (arr.sum() == s) {
            count++
            return
        }
    }

    for (index in i until dict.size) {
        arr.add(dict[index])
        dfs(n, arr, s, index+1)
        arr.pollLast()
    }
}