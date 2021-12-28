import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()
    val n = br.readLine().toInt()
    val queue = LinkedList<Int>()
    repeat(n) {
        val order = br.readLine().split(" ")
        if(order.size == 2){
            if(order[0] == "push_back"){
                queue.addLast(order[1].toInt())
            }else{
                queue.addFirst(order[1].toInt())
            }
        }
        if(order[0] == "pop_front"){
            if(queue.isEmpty()){
                bw.write("-1\n")
            }else{
                bw.write("${queue.poll()}\n")
            }
        }else if(order[0] == "pop_back"){
            if(queue.isEmpty()){
                bw.write("-1\n")
            }else{
                bw.write("${queue.pollLast()}\n")
            }
        }else if(order[0] == "size"){
            bw.write("${queue.size}\n")
        }else if(order[0] == "empty"){
            if(queue.isEmpty()){
                bw.write("1\n")
            }else{
                bw.write("0\n")
            }
        }else if(order[0] == "front"){
            if(queue.isEmpty()){
                bw.write("-1\n")
            }else{
                bw.write("${queue.first}\n")
            }
        }else if(order[0] == "back"){
            if(queue.isEmpty()){
                bw.write("-1\n")
            }else{
                bw.write("${queue.last}\n")
            }
        }
        bw.flush()
    }
}