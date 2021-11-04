import java.util.*
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val length = scan.nextLine().toInt()
    var count = 0
    for(i in 0 until length){
        val arr = IntArray(26)
        val str = scan.nextLine()
        var flag = true
        for(j in 0 until str.length){
            if(arr[str[j].code -97] == 0){
                arr[str[j].code -97]++
            }else{
                if(str[j-1] == str[j]){
                    continue
                }else{
                    flag = false
                    break
                }
            }
        }
        if(flag == true){
            count++
        }else{

        }
        // 전거랑 같은지 체크
        // 이미 있는값이면 전거랑 비교

    }
    println(count)
}