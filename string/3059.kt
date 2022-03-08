fun main() {
    val br = System.`in`.bufferedReader()
    val n =br.readLine().toInt()
    repeat(n){
        val str = br.readLine().toString()
        var count = 0
        for(i in 65 until 91){
            if(str.count { it.code == i } <= 0){
                count += i
            }
        }
        println(count)
    }
}