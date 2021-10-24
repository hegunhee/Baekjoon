import java.util.*;
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    println(fibo(scan.nextInt()))
}
fun fibo(a : Int) : Int{
    if(a == 0){
        return 0
    }else if( a ==1 || a == 2 ){
        return 1
    }else{
        return fibo(a-1) + fibo(a-2)
    }
}