var visited = intArrayOf()
var order = 0

fun main() {
    val inputs = readln().split(" ").map{ it.toInt() }
    val pointCount = inputs[0]
    val lineCount = inputs[1]
    val startPoint = inputs[2] - 1
    val lines = Array<MutableList<Int>>(pointCount) { mutableListOf() }
    repeat(lineCount) {
        readln().split(" ").map { it.toInt() - 1 }.let {
            lines[it.first()].add(it.last())
            lines[it.last()].add(it.first())
        }
    }
    lines.forEach { it.sort() }

    visited = IntArray(pointCount) { order }

    dfs(lines, startPoint)

    visited.forEach { println(it) }
}

fun dfs(lines: Array<MutableList<Int>>, startPoint: Int) {
    visited[startPoint] = ++order
    lines[startPoint].forEach {
        if(visited[it] == 0) dfs(lines, it)
    }
}