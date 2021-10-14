import java.util.*;
fun main(args :Array<String>){
    val scan = Scanner(System.`in`)
    for(i in 1..scan.nextInt()){
        val a = scan.nextInt()
        val b= scan.nextInt()
        println("Case #$i: $a + $b = ${a+b}")
    }
}