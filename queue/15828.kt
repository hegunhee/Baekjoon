import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val n= br.readLine().toInt()
    val router = LinkedList<Int>()
    while(true){
        val packet = br.readLine().toInt()
        if(packet == -1){
            break
        }
        if(packet == 0){
            router.pollFirst()
        }else{
            if(router.size == n){

            }else{
                router.add(packet)
            }
        }
    }
    if(router.isEmpty()){
        print("empty")
        return
    }
    router.forEach{
        print("$it ")
    }
}