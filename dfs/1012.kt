import java.util.*

class Bug(val x: Int, val y: Int) {

}

fun main() {
    val br = System.`in`.bufferedReader()
    val test = br.readLine().toInt()
    val x = intArrayOf(-1, 1, 0, 0)
    val y = intArrayOf(0, 0, -1, 1)
    repeat(test) {
        val mnv = br.readLine().split(" ").map { it.toInt() }.toIntArray()
        val width = mnv[0] +1
        val length = mnv[1] +1
        val bugs = mnv[2]
        val arr = Array<IntArray>(width) { IntArray(length) { 0 } }
        var bug_count = 0
        repeat(bugs) {
            val bug = br.readLine().split(" ").map { it.toInt() }.toIntArray()
            arr[bug[0]][bug[1]] = 1
        }
        val queue = LinkedList<Bug>()
        for (i in 0 until arr.size) {
            for (j in 0 until arr[i].size) {
                if (arr[i][j] == 1) {
                    bug_count++
                    arr[i][j] = 0
                    queue.push(Bug(i, j))
                    while (queue.isNotEmpty()) {
                        val bug = queue.pop()
                        for (i in 0 until x.size) {
                            val moved_x = bug.x + x[i]
                            val moved_y = bug.y + y[i]
                            if ((moved_x >= 0) && (moved_x <= width) && (moved_y >= 0) && (moved_y <= length)) {
                                if (arr[moved_x][moved_y] == 1) {
                                    queue.push(Bug(moved_x, moved_y))
                                    arr[moved_x][moved_y] = 0
                                }
                            }
                        }
                    }
                }
            }
        }
        println(bug_count)
    }
}