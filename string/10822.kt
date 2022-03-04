fun main(){
    println(System.`in`.bufferedReader().readLine().split(",").map{it.toInt()}.sum())
}