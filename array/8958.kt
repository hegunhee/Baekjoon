import java.util.*;
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val length = scan.nextInt()
    scan.nextLine()
    var sum = 0
    var plus = 1
    for(i in 0 until length){
        val a = scan.nextLine()
        sum = 0
        plus = 1
        for(j in 0 until a.length){
            if(a[j] == 'O'){
                sum += plus
                plus++
            }else{
                plus = 1
            }
        }
        println(sum)
    }
}