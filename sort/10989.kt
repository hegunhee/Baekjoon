fun main(args : Array<String>){
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()
    val length = br.readLine().toInt()
    val arr = IntArray(10001)
    val sb = StringBuffer()
    for(i in 0 until length){
        arr[br.readLine().toInt()]++
    }
    for(i in 0 until arr.size){
        bw.write("$i\n".repeat(arr[i]))
    }
    bw.flush()
}