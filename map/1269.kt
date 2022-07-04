import kotlin.collections.HashMap
import kotlin.math.abs

fun main() {
    val br = System.`in`.bufferedReader()
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val first = br.readLine().split(" ").map { it.toInt() }
    val second = br.readLine().split(" ").map { it.toInt() }
    val secondMap = HashMap<Int, Int>()
    val firstMap = HashMap<Int, Int>()
    second.forEach {
        secondMap[it] = 1
        firstMap[it] = 2
    }
    first.forEach {
        if (secondMap[it] == 1) {
            secondMap[it] = 0
        }
        if(firstMap[it] == 2){
            firstMap[it] = 0
        }else{
            firstMap[it] = 1
        }
    }
    
    println(abs(secondMap.values.sum() + firstMap.values.filter { it == 1 }.sum()))
}