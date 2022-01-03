fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val zero = IntArray(41)
    val one = IntArray(41)
    zero[0] = 1
    zero[1] = 0
    zero[2] = 1
    one[0] = 0
    one[1] = 1
    one[2] = 1
    for(i in 0 until n){
        val k = br.readLine().toInt()
        for(i in 0..k){
            if(i < 2){
                continue
            }
            zero[i] = zero[i-2] + zero[i-1]
            one[i] = one[i-2] + one[i-1]
        }
        println("${zero[k]} ${one[k]}")
    }
}