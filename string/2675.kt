import java.util.*;
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val length = scan.nextInt()
    scan.nextLine()
    for(i in 0 until length){
        val iterate = scan.nextInt()
        val str = scan.next()
        for(j in 0 until str.length){
            for(p in 0 until iterate){
                if(str[j].toString() == "//"){
                    print("//")
                }else{
                    print(str[j])
                }
                
            }
        }
        println()
    }
}