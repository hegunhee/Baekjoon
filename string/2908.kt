import java.util.*;
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val a = scan.nextInt().toString()
    val b = scan.nextInt().toString()
    if(a[2] > b[2]){
        println(a.reversed())
    }else if(a[2] < b[2]){
        println(b.reversed())
    }else{
        if(a[1] > b[1]){
            println(a.reversed())
        }else if(a[1] < b[1]){
            println(b.reversed())
        }else{
            if(a[0] > b[0]){
                println(a.reversed())
            }else{
                println(b.reversed())
            }
        }
    }
}