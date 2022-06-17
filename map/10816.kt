import kotlin.collections.HashMap

fun main() {
    val br = System.`in`.bufferedReader()
    br.readLine().toInt()
    val a = br.readLine().split(" ").map { it.toInt() }
    br.readLine().toInt()
    val b = br.readLine().split(" ").map { it.toInt() }
    val map = HashMap<Int, Int>()
    val bw = System.`out`.bufferedWriter()
    
    a.forEach {
        if(map.containsKey(it)){
            val value = map[it] ?: 0
            map[it] = value + 1
        }else{
            map[it] = 1
        }
    }
    b.forEach {
        bw.write("${map[it] ?: 0} ")
    }
    bw.flush()
    bw.close()
}