import java.util.*;
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val length = scan.nextInt()
    scan.nextLine()
    var sum = 0
    val a = scan.nextLine()
    for(i in 0 until a.length){
        sum += a[i].toString().toInt()
    }
    println(sum)
}