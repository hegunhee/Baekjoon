import java.util.*
fun main(args : Array<String>){
    val str = Scanner(System.`in`).nextLine()
    val arr = IntArray(str.length)
    for(i in 0 until str.length){
        arr[i] = str[i].toString().toInt()
    }
    arr.sortDescending()
    for(i in 0 until arr.size){
        print(arr[i])
    }
}