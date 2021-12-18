import java.util.*
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val a = scan.nextInt()
    val b = scan.nextInt()
    var gcd = a
    var r = b
    while(r > 0){
        val temp = r
        r = gcd % r
        gcd = temp
    }
    println(gcd)
    println(a*b/gcd)
}