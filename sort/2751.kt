import java.util.*
import java.io.*
fun main(args : Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val pw = PrintWriter(OutputStreamWriter(System.`out`))
    val length = br.readLine().toInt()
    val list = mutableListOf<Int>()
    for(i in 0 until length){
        list.add(br.readLine().toInt())
    }
    list.sort()
    for(i in 0 until length){
        pw.println(list[i])
    }
    pw.flush()
    pw.close()
}