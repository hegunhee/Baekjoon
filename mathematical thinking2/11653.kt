import java.util.*;
fun main(args :Array<String>){
    val scan = Scanner(System.`in`)
    var num = scan.nextInt()
    if(num == 1){
        
    }else{
        while(num > 1){
            for(i in 2..num){
                if(num%i == 0){
                    println(i)
                    num = num/i
                    break
                }
            }
        }
    }
}