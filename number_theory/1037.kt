import java.util.*
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val length = scan.nextLine().toInt()
    val intArr = IntArray(length)
    for(i in 0 until intArr.size){
        intArr[i] = scan.nextInt()
    }
    intArr.sort()
    println(intArr[0] * intArr[intArr.size-1])
}