import java.util.*;
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val value = scan.nextInt()
    var count = 0
    if(value < 100){
        println(value)
    }else{
        count = 99
        for(i in 100.. value){
            var temp = i
            val third = temp%10
            temp = temp/10
            val second = temp%10
            val first = temp/10
            if(((first-second)*2) == (first-third)){
                count++
            }
        }
        println(count)
    }
}