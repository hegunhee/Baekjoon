import java.util.*;
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val a = scan.nextInt()
    println(factorial(a))
}
fun factorial(a : Int) : Int{
    if(a == 1){
        return 1
    }else if(a == 0){
        return 1
    }else{
        return a * factorial(a-1)
    }
}