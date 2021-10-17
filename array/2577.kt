import java.util.*;
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val array = intArrayOf(0,0,0,0,0,0,0,0,0,0)
    var value = scan.nextInt() * scan.nextInt() * scan.nextInt()
    while(value >0){
        val a = value%10
        value = value/10
        array[a]++
    }
    for(i in 0..9){
        println(array[i])
    }
}