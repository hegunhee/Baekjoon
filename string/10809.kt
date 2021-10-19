import java.util.*;
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val text = scan.nextLine()
    val array = IntArray(26,{-1})
    for(i in 0 until text.length){
        // 값을 검색받음 해서 해당 인덱스에 넣는데 값이 -1이면 넣고 아님말고
        if(array[text[i].toInt() - 'a'.toInt()] == -1){
            array[text[i].toInt()- 'a'.toInt()] = i
        }
    }
    for(i in 0 until array.size){
        print("${array[i]} ")
    }
}