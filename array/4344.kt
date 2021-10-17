import java.util.*;
import kotlin.math.* 
fun main(args :Array<String>){
    val scan = Scanner(System.`in`)
    var avg = 0
    var sum = 0
    val allLength = scan.nextInt()
    var peopleCount = 0
    for(i in 0 until allLength){
        val length = scan.nextInt()
        val intArray = IntArray(length)
        peopleCount = 0
        avg = 0
        sum = 0
        for(j in 0 until length){
            intArray[j] = scan.nextInt()
            sum += intArray[j]
        }
        avg = sum / length
        for(j in 0 until length){
            if(intArray[j] > avg){
                peopleCount++
            }
        }
        println(""+String.format("%.3f",peopleCount.toDouble()/length*100)+"%")
    }
}