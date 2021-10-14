import java.util.*;
fun main(args :Array<String>){
    val scan = Scanner(System.`in`)
    val first_value = scan.nextInt()
    var count = 0
    var value : Int = -1
    while(first_value != value){
        if(count == 0){
            if(first_value < 10){
                value = (""+first_value+""+first_value).toInt()
            }else{
                value = ("" + first_value%10 +"" + ((first_value/10 + first_value%10)%10)).toInt()
            }
        }else{
            if(value<10){
                value = (""+value+""+value).toInt()
            }else{
                value = ("" + value%10 + "" + ((value/10 + value%10)%10)).toInt()
            }
        }
        count++
    }
    println(count)
}