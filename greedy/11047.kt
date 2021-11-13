import java.util.*
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val moneyArray = IntArray(scan.nextInt())
    var money = scan.nextInt()
    var count = 0
    for(i in moneyArray.indices){
        moneyArray[moneyArray.size-i-1] = scan.nextInt()
    }
    for(i in moneyArray.indices){
        if(money >= moneyArray[i]){
            count += money / moneyArray[i]
            money %= moneyArray[i]
        }else if(money < moneyArray[i]){
            continue
        }
        if(money == 0){
            break
        }
    }

    println(count)
}