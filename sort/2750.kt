import java.util.*
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val length = scan.nextInt()
    val arr = IntArray(length)
    for(i in 0 until length){
        arr[i] = scan.nextInt()
    }
    for(i in 0 until (length-1)){
        for(j in 0 until (length-1-i)){
            if(arr[j] < arr[j+1]){
                val temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
            }
        }
    }
    for(i in (length-1) downTo 0){
        println(arr[i])
    }
}