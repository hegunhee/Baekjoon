fun main(){
    val n = System.`in`.bufferedReader().readLine().toInt()
    for(value in n downTo 4 step 1){
        var values = value.toString()
        if(values.count { it == '4' } + values.count{it == '7'} == values.length){
            println(values)
            return
        }

    }
}
