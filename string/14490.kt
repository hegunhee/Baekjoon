fun main() {
    val br = System.`in`.bufferedReader()
    val nm = br.readLine().split(":").map { it.toInt() }.toIntArray()
    var a = nm.minOrNull() ?: 0
    var b = nm.maxOrNull() ?: 0
    while (a != 0){
        val temp = a
        a = b%a
        b = temp
    }
    println("${nm[0]/b}:${nm[1]/b}")
}