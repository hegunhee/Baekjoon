fun main() {
    val br = System.`in`.bufferedReader()
    while (true) {
        val str = br.readLine().toString()
        if (str == "*") {
            return
        }
        var flag = true
        for (i in 97 until 123) {
            if (str.count { it.code == i } <= 0) {
                flag = false
                break
            }
        }
        if (flag) {
            println("Y")
        } else {
            println("N")
        }

    }
}