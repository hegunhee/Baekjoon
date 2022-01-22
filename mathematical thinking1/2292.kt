fun main(){
    val destination = System.`in`.bufferedReader().readLine().toInt()
    var roomNumbers = 1
    var number_count = 1
    if(destination == 1){
        println(1)
    }else{
        while(roomNumbers < destination){
            roomNumbers += (6*number_count)
            number_count++
        }
        println(number_count)
    }
}