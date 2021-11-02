import java.util.*
import kotlin.math.*
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val a = scan.nextInt()
    val b = scan.nextInt()
    val array = BooleanArray(b+1)
    for(i in 2..b){
        array[i] = true
    }
        val sqrtValue = sqrt(b.toDouble()).toInt()
    for(i in 2..sqrtValue){
        var count = 2
        while(i * count <= b){
            array[i*count] = false
            count++
        }

    }
    for(i in a..b){
        if(array[i]){
            println(i)
        }
    }
}