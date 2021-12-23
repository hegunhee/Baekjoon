import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val intArr = IntArray(br.readLine().toInt(), { 0 })
    val sb = StringBuffer()
    var front = 0
    var back = 0
    for (i in 0 until intArr.size) {
        val a = br.readLine().split(" ")
        if (a[0] == "push") {
            intArr[back] = a[1].toInt()
            back++
        } else if (a[0] == "pop") {
            if ((back - front) == 0) {
                sb.append("-1\n")
            } else {
                sb.append("${intArr[front++]}\n")
            }
        } else if (a[0] == "size") {
            sb.append("${back - front}\n")
        } else if (a[0] == "empty") {
            if ((back - front) == 0) {
                sb.append("1\n")
            } else {
                sb.append("0\n")
            }
        } else if (a[0] == "front") {
            if (back == front ) {
                sb.append("-1\n")
            } else {
                sb.append("${intArr[front]}\n")
            }
        } else if (a[0] == "back") {
            if (back == front) {
                sb.append("-1\n")
            } else {
                sb.append("${intArr[back-1]}\n")
            }
        }
    }
    print(sb.toString())
}