lateinit var cards: IntArray
fun main() {
    val br = System.`in`.bufferedReader()
    br.readLine()
    cards = br.readLine().split(" ").map { it.toInt() }.sorted().toIntArray()
    br.readLine()
    val secondCards = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val bw = System.`out`.bufferedWriter()
    secondCards.forEach{
        if (cards.has(it)) {
            bw.write("1 ")
        } else {
            bw.write("0 ")
        }
    }
    bw.flush()
    bw.close()
}

fun IntArray.has(n: Int): Boolean = this.binarySearch(n) >= 0