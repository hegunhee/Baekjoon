import java.util.*
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val length = scan.nextInt()
    var arr = Array<IntArray>(15,{IntArray(15)})
    for(i in 1 until arr[0].size){
        arr[0][i] = i
    }

    for(i in 1 until arr.size){
        for(j in 1 until arr[i].size){
            if(j == 1){
                arr[i][j] += arr[i-1][j]
            }else{
                arr[i][j] += arr[i-1][j]
                arr[i][j] += arr[i][j-1]
            }
        }
    }
    for(i in 0 until length){
        val a = scan.nextInt()
        val b = scan.nextInt()
        println(arr[a][b])
    }
}