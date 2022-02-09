import java.lang.StringBuilder
import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val left = LinkedList<Char>()
    val right = LinkedList<Char>()
    val arr = br.readLine()
    val sb = StringBuilder()
    for (i in 0 until arr.length) {
        left.add(arr[i])
    }
    val n = br.readLine().toInt()
    for (i in 0 until n) {
        val command = br.readLine().split(" ")
        if (command[0] == "L") {
            if (left.isEmpty()) {
                continue
            } else {
                right.add(left.pollLast())
            }
        } else if (command[0] == "D") {
            if(right.isEmpty()){
                continue
            }else{
                left.add(right.pollLast())
            }
        } else if (command[0] == "B") {
            if(left.isEmpty()){
                continue
            }else{
                left.pollLast()
            }
        } else if (command[0] == "P") {
            left.add(command[1][0])
        }
    }
    left.forEach{
        sb.append(it)
    }
    right.reverse()
    right.forEach{
        sb.append(it)
    }
    println(sb.toString())
}