import java.util.*
import kotlin.math.*
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    var n = 0
    var count = 0

    while({n=scan.nextInt();n}() != 0){
        count = 0
        var flag = true
        for(i in (n+1)..(n*2)){
            flag = true
            for(j in 2.. sqrt(i.toDouble()).toInt()){
                if(i%j == 0){
                    flag = false
                    break
                }
            }
            if(flag == true){
                count++
            }

        }
        println(count)

    }
}