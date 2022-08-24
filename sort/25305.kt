fun main(){
    val br = System.`in`.bufferedReader()
    val n = br.readLine().split(" ").last().toInt() -1
    br.readLine().split(" ").map { it.toInt() }.sortedDescending()[n].let {
        println(it)
    }
}