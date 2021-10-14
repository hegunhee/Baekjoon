import java.util.*;
fun main(args :Array<String>){
    val scan = Scanner(System.`in`)
    for(i in 1.. scan.nextInt()){
        println("Case #$i: ${scan.nextInt() + scan.nextInt()}")
    }
}