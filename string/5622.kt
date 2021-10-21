import java.util.*;
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val dial = arrayOf<String>("ABC","DEF","GHI","JKL","MNO",
                              "PQRS","TUV","WXYZ")
    var count = 0
    val str = scan.nextLine()
    for(i in 0 until str.length){
        var a = str[i].toString()
        for(j in 0 until dial.size){
            if(dial[j].contains(a)){
                count += j+3
                break
            }
        }
    }
    println(count)
    
}