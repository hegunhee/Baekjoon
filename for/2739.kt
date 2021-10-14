import java.util.*;
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val a = scan.nextInt()
    for(i in 1..9) println("$a * $i = ${a * i}")
}