import java.util.*
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val length = scan.nextLine().toInt()
    val height = IntArray(length)
    val weight = IntArray(length)
    val rank = IntArray(length) { 1 }
    for(i in 0 until length){
        val arr = scan.nextLine().split(" ")
        height[i] = arr[0].toInt()
        weight[i] = arr[1].toInt()
    }
    for(i in 0 until (length-1)){
        for(j in (i+1) until length){
            if(height[i] > height[j] && weight[i] > weight[j]){
                rank[j]++
            }else if (height[i] < height[j] && weight[i] < weight[j]){
                rank[i]++
            }else{

            }
        }
    }
    for(i in 0 until length){
        print("${rank[i]} ")
    }
}