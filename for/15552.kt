import java.io.*;
fun main(args :Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out)) 
    val arr = ArrayList<IntArray>()
    for(i in 0 until this.readLine().toInt()){
        bw.write(""+this.readLine().split(" ").map{it.toInt()}.reduce{sum , i -> sum + i}.toInt() + "\n")
    }
    bw.flush()
}