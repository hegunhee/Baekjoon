fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    repeat(n) {
        val q = br.readLine().toInt()
        var money =0
        var name = ""
        for (i in 0 until q) {
            val (value,player) = br.readLine().split(" ")
            if(money < value.toInt()){
                money = value.toInt()
                name = player
            }
        }
        println(name)
    }
}