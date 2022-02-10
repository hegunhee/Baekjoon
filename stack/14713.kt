import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val lists = List<LinkedList<String>>(n){ LinkedList() }
    repeat(n){
        val list = br.readLine().split(" ").toList()
        for(i in 0 until list.size){
            lists[it].add(list[i])
        }
    }
    val full_string = LinkedList<String>()
    val arr = br.readLine().split(" ").toList()
    for(i in 0 until arr.size){
        full_string.add(arr[i])
    }
    while (full_string.isNotEmpty()){
        val word = full_string.peekFirst()
        var flag = true
        var isAllListEmpty = true
        for(i in 0 until lists.size){
            if(lists[i].isNotEmpty()){
                isAllListEmpty = false
            }
        }
        if(isAllListEmpty){
            if(full_string.isNotEmpty()){
                println("Impossible")
                return
            }
        }
        for(i in 0 until lists.size){
            if(lists[i].isEmpty()){

            }else if(lists[i].peekFirst() == word){
                lists[i].pollFirst()
                full_string.pollFirst()
                flag = false
                break
            }
        }
        if(flag){
            println("Impossible")
            return
        }
    }
    for(i in 0 until lists.size){
        if(lists[i].isNotEmpty()){
            println("Impossible")
            return
        }
    }
    println("Possible")
}