import java.util.*;
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    var a = 0
    for(i in 1 .. scan.nextInt()){
        a += i
    }
    println(a)
}