import java.util.*;
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val length = scan.nextInt()
    var count = 0
    scan.nextLine()
    for(i in 0 until length){
        val a = scan.nextInt()
        var flag = true
        if((a == 0) || (a == 1)){
            continue
        }
        for(i in 2 until a){
            if(a%i == 0){
                flag = false
                break
            }
        }
        if(flag == true){
            count++
        }
    }
    println(count)
}