import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
    val length = br.readLine().toInt()
    val list = mutableListOf<Int>()
    for (i in 0 until length) {
        val a = br.readLine()
        val arr = a.split(" ")
        if (arr.size == 2) {
            list.add(arr[1].toInt())
        } else {
            if (arr[0] == "pop") {
                if (list.isEmpty()) {
                    bw.write("" + -1 + "\n")
                } else {
                    bw.write("" + list.removeLast() + "\n")
                }
            } else if (arr[0] == "size") {
                bw.write("" + list.size + "\n")
            } else if (arr[0] == "empty") {
                if (list.isEmpty())
                    bw.write("" + 1 + "\n")
                else
                    bw.write("" + 0 + "\n")
            } else if (arr[0] == "top") {
                if (list.isEmpty())
                    bw.write("" + -1 + "\n")
                else
                    bw.write("" + list.last() + "\n")
            }
        }
        bw.flush()
    }
    bw.close()
}