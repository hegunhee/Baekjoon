import java.util.*;
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val list = mutableListOf<Int>()
    var count = 0
    for(i in 0..9){
        val a = scan.nextInt()
        if(!list.contains(a%42)){
            list.add(a%42)
            count++
        }
    }
    println(count)
}