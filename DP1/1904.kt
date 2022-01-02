fun main() {
    val n = System.`in`.bufferedReader().readLine().toInt()
    var v1 = 1
    var v2 = 2
    if (n == 1) {
        println(1)
        return
    } else if (n == 2) {
        println(2)
        return
    }
    for (i in 3..n) {
        val temp = v2
        v2 = (v1 + v2) % 15746
        v1 = temp
    }
    print(v2)
}
