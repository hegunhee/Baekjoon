import java.util.*
fun main() {
    val line = System.`in`.bufferedReader().readLine().toString()
    val list = LinkedList<Char>()
    var sum = 0
    repeat(line.length){
        if(line[it] == '('){
            list.add('(')
        }else{
            list.pollLast()
            if(list.size == 0){
                if(line[it-1] == ')'){
                    sum++
                }
            }else{
                if(line[it-1] == ')'){
                    sum++
                }else{
                    sum += list.size
                }

            }
        }
    }
    println(sum)
}