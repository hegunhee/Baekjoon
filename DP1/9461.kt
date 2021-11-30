import java.util.*
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val length = scan.nextInt()
    val arr = LongArray(101)
    arr[0] = 1
    arr[1] = 1
    arr[2] = 1
    for(i in 3 until arr.size){
        arr[i] = arr[i-3] + arr[i-2]
    }
    for(i in 0 until length){
        val arrLen = scan.nextInt()
        println(arr[arrLen-1].toString())
    }
}