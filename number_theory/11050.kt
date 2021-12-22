import java.util.*
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    val r = scan.nextInt()
    println(fac(n)/(fac(r)*fac(n-r)))
    
}
fun fac(a : Int) : Int{
    var number = a
    var n = 1
    while(number >1){
        n *= number
        number--
    }
    return n
}