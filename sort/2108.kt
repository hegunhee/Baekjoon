import java.util.*
import kotlin.math.*
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val list = MutableList<Int>(scan.nextInt(),{scan.nextInt()})
    list.sort()
    println(round((list.sum().toDouble())/list.size).toInt())
    println(list[(list.size-1)/2])
    println(getFreq(list))

    println(list[list.size-1]-list[0])

}
fun getFreq(list : MutableList<Int>) : Int{
    val freqMap = list.groupingBy { it }.eachCount()
    val maxValue = freqMap.maxOf { it.value }
    val maxFreqMap = freqMap.filter { it.value== maxValue }
    val mapKeys = maxFreqMap.keys.sorted()
    return if(mapKeys.size == 1){
        mapKeys.first()
    }else{
        mapKeys[1]
    }
}