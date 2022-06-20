import java.util.*
import kotlin.collections.HashMap

fun main() {
    val br = System.`in`.bufferedReader()
    val (n,m) = br.readLine().split(" ").map { it.toInt() }
    val hashmap = HashMap<String,Int>()
    val result = LinkedList<String>()
    for(i in 0 until n){
        hashmap[br.readLine().toString()] = 1
    }
    for(i in 0 until m){
        val str = br.readLine().toString()
        if(hashmap[str] == 1){
            result.add(str)
        }
    }
    result.sort()
    println(result.size)
    for(i in 0 until result.size){
        println(result[i])
    }

}