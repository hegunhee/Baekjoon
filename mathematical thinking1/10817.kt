fun main(){
    System.`in`.bufferedReader().readLine().split(" ").map{it.toInt()}.let{
        println(it.sorted()[1])
    }
}