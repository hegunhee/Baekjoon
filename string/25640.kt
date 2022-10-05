fun main(){
    val br = System.`in`.bufferedReader()
    val jinho = br.readLine().toString()
    var count = 0
    val n = br.readLine().toInt()
    repeat(n){
        if(jinho == br.readLine().toString()) count++
    }
    println(count)
}
