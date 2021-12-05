import java.util.*
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val brackets = mutableListOf<String>()
    while(true){
        var flag = true
        brackets.clear()
        val str = scan.nextLine()
        if(str == "."){
            break
        }
        for(element in str){
            if(element == '.'){
                break
            } else if(element == '('){
                brackets.add("(")
            }else if(element == '['){
                brackets.add("[")
            }else if(element == ')'){
                if(brackets.isEmpty()){
                    flag = false
                    break
                }else if(brackets.last() == "("){
                    brackets.removeLast()
                }else if(brackets.last() =="["){
                    flag = false
                    break
                }
            }else if(element == ']') {
                if (brackets.isEmpty()) {
                    flag = false
                    break
                } else if(brackets.last() =="[") {
                    brackets.removeLast()
                }else if(brackets.last() =="("){
                    flag = false
                    break
                }
            }
        }
        if(flag && brackets.isEmpty()){
            println("yes")
        }else{
            println("no")
        }
    }
}