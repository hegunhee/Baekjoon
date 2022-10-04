import java.util.*


fun main(){
    val br = System.`in`.bufferedReader()
    val arr = IntArray(8)
    for(i in 0 until 8){
        arr[i] = br.readLine().toInt()
    }
    val bigFive = arr.sortedDescending().take(5)
    val indexFive = LinkedList<Int>()
    for(i in 0 until 8){
        if(bigFive.contains(arr[i])){
            indexFive.add(i+1)
        }
    }
    println(bigFive.sum())
    for(i in 0 until 5){
        print("${indexFive[i]} ")
    }
}
