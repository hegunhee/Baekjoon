fun main() {
    val arr = System.`in`.bufferedReader().readLine().split("-")
    val sums = IntArray(arr.size)
    for(i in 0 until arr.size){
        sums[i] = arr[i].split("+").map { it.toInt() }.sum()
    }
    var count = sums[0]
    for(i in 1 until sums.size){
        count -= sums[i]
    }
    println(count)
}