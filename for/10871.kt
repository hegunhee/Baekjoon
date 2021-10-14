import java.util.*;
fun main(args :Array<String>){
    val scan = Scanner(System.`in`)
    val length = scan.nextInt()
    val flagValue = scan.nextInt()
    for(i in 0 until length){
        val a = scan.nextInt()
        if(flagValue>a){
            print("$a ")
        }
    }
}