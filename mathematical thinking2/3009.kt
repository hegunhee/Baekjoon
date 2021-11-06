import java.util.*;
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val x1 = scan.nextInt()
    val y1 = scan.nextInt()
    scan.nextLine()
    val x2 = scan.nextInt()
    val y2 = scan.nextInt()
    scan.nextLine()
    val x3 = scan.nextInt()
    val y3 = scan.nextInt()
    var x4 = 0
    var y4 = 0
    if(x1 == x2){
        x4 = x3
    }else if(x1 == x3){
        x4 = x2
    }else if(x2 == x3){
        x4 = x1
    }
    if(y1 == y2){
        y4 = y3
    }else if(y1 == y3){
        y4 = y2
    }else if(y2 == y3){
        y4 = y1
    }
    
    println("$x4 $y4")
}