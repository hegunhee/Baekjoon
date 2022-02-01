import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    repeat(n) {
        val line = br.readLine().split(" ").map { it.toDouble() }.toDoubleArray()
        val x1 = doubleArrayOf(line[0], line[1], line[2])
        val x2 = doubleArrayOf(line[3], line[4], line[5])
        val d = sqrt(
            ((x1[0] - x2[0]).toDouble().pow(2) + (x1[1] - x2[1]).toDouble().pow(2)).toFloat()
        ).toDouble()
        val rPlus = x1[2] + x2[2]
        val rMinus = abs(x1[2] - x2[2])

        if ((x1[0] == x2[0] && x1[1] == x2[1]) && (x1[2] == x2[2])) {
            println(-1)
        }else if(d > rPlus){
            println(0)
        }else if(d < rMinus){
            println(0)
        }else if((x1[0] == x2[0] && x1[1] == x2[1]) &&(x1[2] != x2[2])){
            println(0)
        }else if(d == rMinus){
            println(1)
        }else if(d == rPlus){
            println(1)
        }else{
            println(2)
        }
    }
}
