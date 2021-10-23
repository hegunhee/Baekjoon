import java.util.*;
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val a = scan.nextInt()
    val b = scan.nextInt()
    val c = scan.nextInt()
    if((c-b)%(a-b) ==0){
        println((c-b)/(a-b))
    }else{
        println(((c-b)/(a-b))+1)
    }
    
    
}