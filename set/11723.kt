fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val set = mutableSetOf<Int>()
    val bw = System.`out`.bufferedWriter()
    repeat(n){
        val line = br.readLine().split(" ")
        when(line[0]){
            "add" -> set.add(line[1].toInt())
            "check" -> if(set.contains(line[1].toInt())) bw.append("1\n") else bw.append("0\n")
            "remove" -> if(set.contains(line[1].toInt())) set.remove(line[1].toInt())
            "toggle" -> if(set.contains(line[1].toInt())) set.remove(line[1].toInt()) else set.add(line[1].toInt())
            "all" -> repeat(20){set.add(it+1)}
            "empty" -> set.clear()
        }
    }
    bw.flush()
    bw.close()
}