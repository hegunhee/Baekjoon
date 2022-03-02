fun main() {
    val br = System.`in`.bufferedReader()
    var flag = false
    repeat(5){
        val str = br.readLine()
        if(str.contains("FBI")){
            println(it+1)
            flag = true
        }
    }
    if(!flag){
        println("HE GOT AWAY")
    }

}