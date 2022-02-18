import java.lang.StringBuilder
import java.util.*

var n = 0
val result = LinkedList<String>()
fun main() {
    val br = System.`in`.bufferedReader()
    n = br.readLine().toInt()
    val sign = br.readLine().split(" ")
    dfs(LinkedList<Int>(), sign)

    println(result.maxOrNull().toString())
    println(result.minOrNull().toString())
}

fun dfs(list: LinkedList<Int>, sign: List<String>) {
    if (list.size == n + 1) {
        val sb = StringBuilder()
        list.forEach{
            sb.append(it)
        }
        result.add(sb.toString())
        return
    }

    for (value in 0..9) {
        if (value !in list) {
            if (list.size < 1) {
                list.add(value)
                dfs(list, sign)
                list.pollLast()
            } else {
                if (sign[list.size - 1] == "<") {
                    if (list.peekLast() < value) {
                        list.add(value)
                        dfs(list, sign)
                        list.pollLast()
                    }
                } else if(sign[list.size-1] == ">") {
                    if (list.peekLast() > value) {
                        list.add(value)
                        dfs(list, sign)
                        list.pollLast()
                    }
                }
            }
        }
    }
}