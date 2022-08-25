fun main(){
    val br = System.`in`.bufferedReader()
    var total = br.readLine().toInt()
    val n = br.readLine().toInt()
    repeat(n){
        val record = br.readLine().split(" ").map{it.toInt()}
        total -= record[0] * record[1]
    }
    if(total == 0){
        println("Yes")
    }else{
        println("No")
    }
}