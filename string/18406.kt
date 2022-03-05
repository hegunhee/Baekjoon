fun main() {
    val str = System.`in`.bufferedReader().readLine()
    val a = str.substring(0,str.length/2).map { it.toString().toInt() }.sum()
    val b = str.substring(str.length/2).map { it.toString().toInt() }.sum()
    if(a == b){
        println("LUCKY")
    }else{
        println("READY")
    }
}