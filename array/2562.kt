import java.util.*;
fun main(args : Array<String>){
    val scan =Scanner(System.`in`)
    var location = 0
    var max = 0
    for(i in 1.. 9){
        val a = scan.nextInt()
        if(max < a){
            location = i
            max = a
        }
    }
    println(max)
    println(location)
}