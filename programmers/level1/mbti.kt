class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
            val dict = HashMap<Char,Int>()
            val types = charArrayOf('R','T','C','F','J','M','A','N')
            types.forEach {
                dict[it] = 0
            }
            for(i in 0 until survey.size){
                val a = survey[i].first()
                val b = survey[i].last()
                when(choices[i]){
                    1 ->{
                        dict[a] = dict[a]?.plus(3) ?: 0
                    }
                    2 -> {
                        dict[a] = dict[a]?.plus(2) ?: 0
                    }
                    3 -> {
                        dict[a] = dict[a]?.plus(1) ?: 0
                    }
                    4 -> {}
                    5-> {
                        dict[b] = dict[b]?.plus(1) ?: 0
                    }
                    6 -> {
                        dict[b] = dict[b]?.plus(2) ?: 0
                    }
                    7 -> {
                        dict[b] = dict[b]?.plus(3) ?: 0
                    }
                }
            }
            val tr = arrayOf<Char>('R','T')
            val cf = arrayOf('C','F')
            val jm = arrayOf('J','M')
            val an = arrayOf('A','N')
            val mbtiArray = arrayOf<Array<Char>>(tr,cf,jm,an)
            var answer = ""
            for(i in 0 until mbtiArray.size){
                val a = mbtiArray[i].first()
                val b = mbtiArray[i].last()
                if(dict[a]!! > dict[b]!!){
                    answer += a
                }else if(dict[a]!! == dict[b]!!){
                    answer += mbtiArray[i].sorted().first()
                }else{
                    answer += b
                }
            }
        return answer
    }
}