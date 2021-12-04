import java.util.*
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val length = scan.nextLine().toInt()
    val list = mutableListOf<String>()
    for(i in 0 until length){
        list.clear()
        var flag = true
        val str = scan.nextLine()
        for(j in 0 until str.length){
            if(str[j].toString() == "("){
                list.add("(")
            }else{
                if(list.isEmpty()){
                    flag = false
                    break
                }else{
                    list.removeLast()
                }
            }
        }
        if(list.isEmpty() && flag){
            println("YES")
        }else{
            println("NO")
        }
    }

}