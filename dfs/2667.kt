import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().toInt()
    val visited_need = mutableListOf<String>()
    val counts = mutableListOf<Int>()
    var count = 0

    
    val arr = Array<IntArray>(n) { IntArray(n) }
    for (i in 0 until n) {
        val temp = scan.nextLine()
        for (j in 0 until n) {
            arr[i][j] = temp[j].toString().toInt()
        }
    }
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (arr[i][j] == 1) {
                arr[i][j] = 0
                visited_need.add("$i,$j")
                count++
                while (visited_need.isNotEmpty()) {
                    val temp = visited_need.removeFirst().split(",")
                    val iInfo = temp[0].toInt()
                    val jInfo = temp[1].toInt()
                    if (iInfo == 0) {

                    } else {
                        if (arr[iInfo - 1][jInfo] == 1) {
                            visited_need.add("${iInfo - 1},$jInfo")
                            arr[iInfo-1][jInfo] = 0
                            count++
                        }
                    }
                    if (iInfo == (n - 1)) {

                    } else {
                        if (arr[iInfo + 1][jInfo] == 1) {
                            visited_need.add("${iInfo + 1},$jInfo")
                            arr[iInfo+1][jInfo] = 0
                            count++
                        }
                    }
                    if (jInfo == 0) {

                    } else {
                        if (arr[iInfo][jInfo - 1] == 1) {
                            visited_need.add("${iInfo},${jInfo - 1}")
                            arr[iInfo][jInfo-1] = 0
                            count++
                        }
                    }
                    if (jInfo == (n - 1)) {

                    } else {
                        if (arr[iInfo][jInfo + 1] == 1) {
                            visited_need.add("$iInfo,${jInfo + 1}")
                            arr[iInfo][jInfo+1] = 0
                            count++
                        }
                    }
                }
                counts.add(count)
                count = 0
            }

        }
        // ????????? ????????? ????????? ?????? 0?????? ?????????
        // ?????? ???????????? ?????? ??????
        // ????????? ???
        // ?????? ??????
        // n+1?????? n??? ????????? ?????? ???????????? ?????? ????????? ???
        // n-1?????? 0??? ????????? ?????? ???????????? ?????? ????????? ???
        //
    }
    counts.sort()
    println(counts.size)
    while(counts.isNotEmpty()){
        println(counts.removeFirstOrNull())
    }
}
