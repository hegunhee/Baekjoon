import java.util.*

fun main() {
    val nk = System.`in`.bufferedReader().readLine().split(" ")
    val queue = LinkedList<Int>()
    val ysefus = mutableListOf<Int>()
    for(i in 1..nk[0].toInt()){
        queue.add(i)
    }
    var count = 0
    while(queue.isNotEmpty()){
        count++
        val poll = queue.poll()
        if(count == nk[1].toInt()){
            ysefus.add(poll)
            count = 0
        }else{
            queue.add(poll)
        }

    }
    print("<")
    while(ysefus.size != 0){
        if(ysefus.size !=1){
            print("${ysefus.removeFirst()}, ")
        }else{
            print("${ysefus.removeFirst()}>")
        }
    }
}