fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    repeat(n){
        val str = br.readLine()
        print(str[0].toUpperCase())
        print(str.substring(1))
        println()
    }
}