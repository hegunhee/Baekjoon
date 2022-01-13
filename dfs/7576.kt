import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
data class Tomato(val x: Int, val y: Int)
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    
    var nm: List<Int> = listOf()
    var map: Array<IntArray> = arrayOf()
    var queue: LinkedList<Tomato> = LinkedList()
    nm = readLine()
        .split(" ")
        .map { it.toInt() }

    map = Array(nm[1]) { IntArray(nm[0]) }

    for (i in 0 until nm[1]) {
        val tmp = readLine().split(" ")
            .map { it.toInt() }
            .toIntArray()
        for (j in 0 until nm[0]) {
            map[i][j] = tmp[j]
            if (tmp[j] == 1)
                queue.add(Tomato(i, j))
        }
    }

    while (queue.isNotEmpty()) {
        val current = queue.poll()
        val dx = intArrayOf(1, -1, 0, 0)
        val dy = intArrayOf(0, 0, 1, -1)
        for (i in 0 until 4) {
            val nx = current.x + dx[i]
            val ny = current.y + dy[i]

            if (nx !in 0 until nm[1] || ny !in 0 until nm[0]) continue
            if (map[nx][ny] != 0) continue

            map[nx][ny] = map[current.x][current.y] + 1
            queue.add(Tomato(nx, ny))
        }
    }

    if (map.any { it.contains(0) })
        println(-1)
    else {
        println(map.mapNotNull { it.maxOrNull() }.maxOrNull()!! - 1)
    }

}
