import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.`out`))
fun main() {
    val temp = Scanner(System.`in`).nextLine().split(" ")
    val arr = MutableList<Int>(temp[0].toInt(), { i -> i + 1 })
    dfs(temp[1].toInt(), arr, mutableListOf<Int>())
    bw.flush()

}

fun dfs(n: Int, dict: MutableList<Int>, arr: MutableList<Int>) {
    if (arr.size == n) {
        for (i in 0 until arr.size) {
            bw.write("${arr[i]} ")
        }
        bw.write("\n")
        return
    }
    for (i in 0 until dict.size) {
        if (is_available(dict[i], arr)) {
            arr.add(dict[i])
            dfs(n, dict, arr)
            arr.removeAt(arr.size - 1)
        }
    }
}

fun is_available(current_value: Int, arr: MutableList<Int>): Boolean {
    var flag = true
    for(i in 0 until arr.size){
        if(arr[i] >= current_value){
            flag = false
        }
    }
    return flag
}