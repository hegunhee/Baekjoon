import java.util.*
import kotlin.math.abs

var count = 0
fun main() {
    val n = Scanner(System.`in`).nextInt()
    n_queens(n)
    println(count)
}

fun n_queens(n: Int) {
    dfs(n, 0, mutableListOf())
}

fun dfs(n: Int, current_row: Int, current_list : MutableList<Int>){
    if (current_list.size == n) {
        count++
        return
    }
    for (current_col in 0 until n) {
        if (is_available(current_col, current_list)) {
            current_list.add(current_col)
            dfs(n, current_row + 1, current_list)
            current_list.removeAt(current_list.size-1)
        }
    }
}

fun is_available(current_col : Int, current_list :MutableList<Int>): Boolean {
    val current_row = current_list.size
    for (queen_row in 0 until current_list.size) {
        if ((current_list[queen_row] == current_col) || abs(current_list[queen_row] - current_col) == current_row - queen_row) {
            return false
        }
    }
    return true
}