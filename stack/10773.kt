import java.util.*
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val length = scan.nextInt()
    val list = mutableListOf<Int>()
    for(i in 0 until length){
        val a = scan.nextInt()
        if(a == 0){
            list.removeLast()
        }else{
            list.add(a)
        }
    }
    println(list.sum())
}