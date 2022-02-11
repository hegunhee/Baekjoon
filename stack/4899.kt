import java.util.*
fun main() {

    val br = System.`in`.bufferedReader()
    var number = 1
    while (true) {
        val line = br.readLine().toString()
        if (line.contains("-")) {
            break
        }
        val stack = Stack<Char>()
        var count = 0
        for(index in 0 until line.length){
            if(stack.size == 0 && line[index] == '}'){
                count++
                stack.push('{')
            }else if(stack.size !=0 && line[index] == '}'){
                stack.pop()
            }else{
                stack.push(line[index])
            }
        }
        count += stack.size /2
        println("$number. $count")
        number++
    }
}