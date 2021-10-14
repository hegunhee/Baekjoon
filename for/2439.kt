import java.util.*;
fun main(args :Array<String>){
    val scan = Scanner(System.`in`)
    val length = scan.nextInt()
    for(i in 1..length){
        for(j in 0 until (length-i)){
            print(" ")
        }
        for(j in (length-i) until length){
            print("*")
        }
        println()
    }
}