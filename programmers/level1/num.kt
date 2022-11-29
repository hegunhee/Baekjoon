class Solution {
    fun solution(num: Int, total: Int): IntArray {
        var answer: IntArray = IntArray(num){it+1}
        while(true){
            val sum = answer.sum()
            if(sum == total){
                break
            }else if(sum > total){
                for(i in 0 until answer.size){
                    answer[i]--
                }
            }else{
                for(i in 0 until answer.size){
                    answer[i]++
                }
            }
        }
        return answer
    }
}