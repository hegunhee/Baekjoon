import java.util.*
fun main(args : Array<String>){
    val split = Scanner(System.`in`).nextLine().split(" ")
    println(split[0].toBigDecimal() + split[1].toBigDecimal())
}