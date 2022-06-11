import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val map = Array<LinkedList<Int>>(21) { LinkedList() }
    var friendCount = 0L
    repeat(n){
        val count = it+1
        val num = br.readLine().length
        while(map[num].isNotEmpty()){
            if(count - map[num].first() > k){
                map[num].pollFirst()
            }else{
                break
            }
        }
        friendCount += map[num].size
        map[num].add(count)
    }
    println(friendCount)
}