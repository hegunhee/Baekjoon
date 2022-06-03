import java.util.*;
fun main(args :Array<String>){
    val scan = Scanner(System.`in`)
    val a = scan.nextInt()
    if(((a%4 == 0) &&(a%100 != 0)) || a%400 == 0){
        println("1")
    }else{
        println("0")
    }
}