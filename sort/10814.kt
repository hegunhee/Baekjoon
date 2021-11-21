import java.util.*
fun main(args : Array<String>) {
    val scan = Scanner(System.`in`)
    val strArr = Array<String>(scan.nextLine().toInt(), { scan.nextLine() })

    strArr.sortedBy { it -> it.split(" ")[0].toInt() }.forEach { println(it) }
}