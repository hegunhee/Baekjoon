import java.util.*
fun main(){
    val scan = Scanner(System.`in`)
    val size = scan.nextInt()
    for(i in 0 until size){
        val queue_size = scan.nextInt()
        // max값인지 비교해야됨
        // 반복을 계속 순회해야됨
        val queue = mutableListOf<Int>()
        var count = 1
        var sequence = scan.nextInt()
        for(j in 0 until queue_size){
            queue.add(scan.nextInt())
        }

        // 현재 수가 제일 큰지
        // 인덱스랑 squenece변수의 값이 같은지
        while(true){
            val value = queue.first()
            if(value == queue.maxOrNull()){
                if(sequence == 0){
                    println(count)
                    break
                }
                else{
                    queue.removeFirst()
                    count++
                    if(sequence == 0){
                        sequence = queue.size -1
                    }else{
                        sequence--
                    }
                }
            }else{
                queue.add(queue.removeFirst())
                if(sequence == 0){
                    sequence = queue.size -1
                }else{
                    sequence--
                }
            }
        }
    }

}