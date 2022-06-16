import kotlin.collections.HashMap

fun main() {
    val br = System.`in`.bufferedReader()
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val stringMap = HashMap<Int, String>()
    val intMap = HashMap<String,Int>()
    val bw = System.`out`.bufferedWriter()
    repeat(n) {
        br.readLine().toString().let { pokemon ->
            stringMap[it+1] = pokemon
            intMap[pokemon] = it+1
        }
    }
    repeat(k) {
        val command = br.readLine()
        if (command[0].code in 48..57) {
            bw.write("${stringMap[command.toInt()]}\n")
        } else {
            bw.write("${intMap[command]}\n")
        }
    }
    bw.flush()
    bw.close()
}