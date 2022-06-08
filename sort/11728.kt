fun main() {
    val br = System.`in`.bufferedReader()
    br.readLine()
    val list = mutableListOf<Int>()
    val bw = System.`out`.bufferedWriter()
    repeat(2){
        list.addAll(br.readLine().split(" ").map { it.toInt() })
    }
    list.sort()
    list.forEach{
        bw.write("$it\n")
    }
    bw.flush()
    bw.close()

}
