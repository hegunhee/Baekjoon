import java.util.*;
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val a = scan.nextInt()
    val b = scan.nextInt()
    val c = scan.nextInt()
    if((c - b) <= 0){
        println("-1")
    }else{
        val q = a/(c-b)
        println(q+1)
    }
}