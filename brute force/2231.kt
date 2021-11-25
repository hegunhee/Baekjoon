import java.util.*;
fun main(args : Array<String>){
    val a = Scanner(System.`in`).nextInt()
    var flag = false
    for(i in 1 until a){
        var value = i
        var sum = value
        while(value > 0){
            sum += value % 10
            value /= 10
        }
        if(a == sum){
            println(i)
            flag = true
            break
        }
    }
    if(flag == false){
        println("0")
    }
}