import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
fun main(){
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
    val br = BufferedReader(InputStreamReader(System.`in`))
    val stack = mutableListOf<Int>()
    val temp = mutableListOf<String>()
    val length = br.readLine().toInt()
    var increase_num = 0
    var current_pop = 0
    for(i in 0 until length){
        val a = br.readLine().toInt()
        while(increase_num < a){
            increase_num++
            stack.add(increase_num)
            temp.add("+")
        }
        if((stack.last() == a) ){
            temp.add("-")
            stack.removeLast()
        }else{
            bw.write("NO")
            bw.flush()
            return
        }
    }

    for(i in 0 until temp.size){
        bw.write("${temp[i]}\n")
    }
    bw.flush()

}