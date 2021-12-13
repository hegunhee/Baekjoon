import java.util.*
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    var a = 1
    var b = 1
    while({a = scan.nextInt();a}() != 0){
        b = scan.nextInt()
        if(a > b){
            if(a %b == 0){
                println("multiple")
            }else{
                println("neither")
            }
        }else{
            if(b%a == 0){
                println("factor")
            }else{
                println("neither")
            }
        }
        
    }
}