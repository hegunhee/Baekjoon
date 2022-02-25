import java.util.*

data class GoldBach(val first: Int, val second: Int) {

}

fun main() {
    val arr = Array<Int>(10001) { it -> it }
    arr[1] = 0
    for (i in 2 until arr.size) {
        if (arr[i] != 0) {
            var count = arr[i] + arr[i]
            while (count < arr.size) {
                arr[count] = 0
                count += arr[i]
            }
        }
    }
    val prime = arr.filter { it != 0 }.toIntArray()
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    repeat(n) {
        val even = br.readLine().toInt()
        val list = LinkedList<GoldBach>()
        val primeList = prime.filter { it < even }.toIntArray()
        for(i in 0 until primeList.size){
            if((even-primeList[i]) in primeList){
                if(primeList[i] <= (even-primeList[i])){
                    list.add(GoldBach(primeList[i],even-primeList[i]))
                }
            }
        }
        val first = list.sortedBy { it.second - it.first }.first()
        println("${first.first} ${first.second}")
    }
}