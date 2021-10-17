import java.util.*;
fun main(args: Array<String>){
    val scan = Scanner(System.`in`)
    val length = scan.nextInt()
    var min = scan.nextInt()
    var max = min
    for(i in 2..length){
        val a= scan.nextInt()
        if(min > a){
            min = a
        }
        if(max < a){
            max = a
        }
    }
    println("$min $max")
}