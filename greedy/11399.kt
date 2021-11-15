import java.util.*
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val arr = IntArray(scan.nextInt())
    var sum = 0
    for(i in 0 until arr.size){
        arr[i] = scan.nextInt()
    }
    arr.sort()
    for(i in 0 until arr.size){
        for(j in 0..i){
            sum += arr[j]
        }
    }
    println(sum)
}