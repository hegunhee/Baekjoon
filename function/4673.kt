fun main(args : Array<String>){
    val list = mutableListOf<Int>()
    for(i in 1 until 10000){
        var a = i
        var sum = a
        while(a >0){
            sum += a%10
            a /= 10
        }
        list.add(sum)
    }
    
    for(i in 1 until 10000){
        if(!list.contains(i)){
            println(i)
        }
    }
}