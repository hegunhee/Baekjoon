import java.util.*
fun main(args : Array<String>){
    val totalValue = Scanner(System.`in`).nextInt()
    if((totalValue %5) == 0){
        print(totalValue/5)
    }else{
        var remain5 = totalValue/5
        while(remain5 >= 0){
            // 나머지 값을 계산
            // 3나눈값도 계산해서 0이면 print하고 break
            var value = totalValue - (remain5 * 5)
            if(value %3 == 0){
                print("${(value/3) + remain5}")
                break
            }
            remain5--
        }
        if(remain5 == -1){
            print("-1")
        }
    }
}