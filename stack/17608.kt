fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val arr = IntArray(n)
    repeat(n){
        arr[it] = br.readLine().toInt()
    }
    arr.reverse()
    var max = -1
    var count = 0
    for(i in 0 until arr.size){
        if(arr[i] > max){
            count++
            max = arr[i]
        }
    }
    println(count)
}