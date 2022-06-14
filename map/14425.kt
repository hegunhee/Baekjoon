fun main() {
    val br = System.`in`.bufferedReader()
    val (m, s) = br.readLine().split(" ").map { it.toInt() }
    val list = Array<String>(m) { "" }
    var count = 0
    repeat(m) {
        list[it] = br.readLine().toString()
    }
    repeat(s) {
        if (list.contains(br.readLine())) {
            count++
        }
    }
    println(count)
}