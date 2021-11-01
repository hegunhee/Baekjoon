import java.util.*
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val length = scan.nextInt()
    for(i in 0 until length){
        val height = scan.nextInt()
        val width = scan.nextInt()
        val number = scan.nextInt()
        val floor = number % height // 층수
        val cWidth = number / height // 몇 호
        if(floor == 0){ // 나머지가 0인경우 == 최상층
            if(cWidth >= 10){ // 0을 붙여주냐 안붙여주냐
                println("$height"+"${cWidth}")
            }else{
                println("$height"+"0${cWidth}")
            }
        }else{
            if(cWidth >= 9){ // 0을 붙여주냐 안붙여주냐
                println("$floor"+"${cWidth+1}")
            }else{
                println("$floor"+"0${cWidth+1}")
            }
        }
    }
}