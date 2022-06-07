data class Student(val name : String,val korea : Int,val english : Int,val math : Int)

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val arr = Array<Student>(n){ Student("",1,1,1) }
    repeat(n){
        val line = br.readLine().split(" ")
        arr[it] = Student(line[0],line[1].toInt(),line[2].toInt(),line[3].toInt())
    }
    arr.sortBy { it.name }
    arr.sortByDescending { it.math }
    arr.sortBy { it.english}
    arr.sortByDescending { it.korea }
    val bw = System.`out`.bufferedWriter()
    repeat(n){
        bw.write("${arr[it].name}\n")
    }
    bw.flush()
    bw.close()
}
