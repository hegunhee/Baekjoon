import java.util.*;
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val x = scan.nextInt()
    val y = scan.nextInt()
    val rx = scan.nextInt()
    val ry = scan.nextInt()
    var distinct = x
    if(distinct > y){
        distinct = y
    }
    if(distinct > (rx - x)){
        distinct = rx - x
    }
    if(distinct > (ry - y)){
        distinct = ry -y
    }
    println(distinct)
}