import java.util.*
const val N : Int = 6
fun main() {
    val br = System.`in`.bufferedReader()
    while(true){
        val ndict = br.readLine().split(" ").map{it.toInt()}.toIntArray()
        if(ndict[0] == 0){
            break
        }
        val arr = LinkedList<Int>()
        for(i in 1 until ndict.size){
            arr.add(ndict[i])
        }
        dfs(LinkedList<Int>(),arr,0)
        println()
    }
}

fun dfs(list : LinkedList<Int>,dict : LinkedList<Int>,cursor : Int){
    if(list.size == N){
        for(i in 0 until list.size){
            print("${list[i]} ")
        }
        println()
        return
    }
    for(i in cursor until dict.size){
        if((dict[i] !in list) &&( list.peekLast() ?: 0 < dict[i])){
            list.add(dict[i])
            dfs(list,dict,cursor+1)
            list.pollLast()
        }

    }
}