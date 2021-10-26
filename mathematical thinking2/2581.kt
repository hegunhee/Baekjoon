import java.util.*;
fun main(args :Array<String>){
    val scan = Scanner(System.`in`)
    val start = scan.nextInt()
    scan.nextLine()
    val end = scan.nextInt()
    var count = 0
    var min = 10001
    for(i in start.. end){
        var flag = true
        if((i == 0) || (i == 1)){
            continue
        }
        if(i == 2){
            min = i
            count+= i
            continue
        }
        for(j in 2 until i){
            if(i%j == 0){
                flag = false
                break
            }
        }
        if(flag == true){
            if(min > i){
                min = i
            }
            count+= i
        }
    }
    if(count == 0){
        println(-1)
    }else{
        println(count)
        println(min)
    }
}