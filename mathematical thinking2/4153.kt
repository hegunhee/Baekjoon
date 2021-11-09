import java.util.*;
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    while(true){
        val a = scan.nextInt()
        val b= scan.nextInt()
        val c = scan.nextInt()
        if(a == 0){
            break
        }
        if(((a*a) + (b*b)) == (c*c)){
            println("right")
        }else if(((b*b) + (c*c)) == (a*a)){
            println("right")
        }else if(((a*a) + (c*c)) == (b*b)){
            println("right")
        }else{
            println("wrong")
        }
        scan.nextLine()
    }
}