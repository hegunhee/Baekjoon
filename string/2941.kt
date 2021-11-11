import java.util.*
fun main(args : Array<String>){
    val alpha = arrayOf("c=","c-","dz=","d-","lj","nj","s=","z=")
    var str = Scanner(System.`in`).nextLine()
    alpha.forEach {
        str = str.replace(it,"a")
    }
    println(str.length)

}