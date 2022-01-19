import java.util.*
fun main(args : Array<String>){
    val str = Scanner(System.`in`).nextLine().uppercase(Locale.getDefault())
    val arr = IntArray(26)
    str.forEach {
        arr[it.code-65]++
    }
    val max = arr.maxOrNull()
    var count = 0
    var number = 0
    for(i in 0 until arr.size){
        if(max == arr[i]){
            number = i
            count++
        }
    }
    if(count >1){
        println("?")
    }else{
        println((number+65).toChar())
    }


}