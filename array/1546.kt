import java.util.*;
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val length = scan.nextInt()
    val list = mutableListOf<Double>()
    var max : Double = 0.0
    var sum :Double = 0.0
    for(i in 0 until length){
        val a = scan.nextInt().toDouble()
        if(max < a){
            max = a
        }
        list.add(a)
    }
    
    for(i in 0 until list.size){
        sum += (list[i]/max).toDouble()*100
    }
    println((sum/length).toDouble())
}