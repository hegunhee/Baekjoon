import java.util.*
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val firstLine = scan.nextLine().split(" ")
    val dict = mutableMapOf<Int,MutableList<Int>>()
    val dfs_visit = mutableListOf<Int>()
    val bfs_visit = mutableListOf<Int>()
    val need_visited = mutableListOf<Int>()
    for(i in 0 until firstLine[1].toInt()){
        val first = scan.nextInt()
        val second = scan.nextInt()
        if(dict[first] == null){
            dict[first] = mutableListOf(second)
        }else{
            dict[first]?.add(second)
        }
        if(dict[second] == null){
            dict[second] = mutableListOf(first)
        }else {
            dict[second]?.add(first)
        }
    }
    need_visited.add(firstLine[2].toInt())
    while (need_visited.isNotEmpty()){
        val firstValue = need_visited.removeLast()
        if(firstValue !in dfs_visit){
            dfs_visit.add(firstValue)
            if(dict[firstValue]?.isNotEmpty() == true){
                dict[firstValue]?.sort()
                for(i in (dict[firstValue]?.size!!-1) downTo 0)
                need_visited.add(dict[firstValue]?.get(i)!!)
            }
        }
    }
//
    need_visited.add(firstLine[2].toInt())
    while (need_visited.isNotEmpty()){
        val firstValue = need_visited.removeFirst()
        if(firstValue !in bfs_visit){
            bfs_visit.add(firstValue)
            if(dict[firstValue]?.isNotEmpty() == true){
                dict[firstValue]?.sort()
                for(i in 0 until dict[firstValue]?.size!!)
                    need_visited.add(dict[firstValue]?.get(i)!!)
            }
        }
    }
    for(i in 0 until dfs_visit.size){
        print("${dfs_visit[i]} ")
    }
    println()
    for(i in 0 until bfs_visit.size){
        print("${bfs_visit[i]} ")
    }
}