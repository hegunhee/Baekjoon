data class Student(val name: String, val day: Int, val month: Int, val year: Int)

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val studentList = Array<Student>(n) { Student("$it", it, it, it) }
    repeat(n) {
        val student = br.readLine().split(" ")
        studentList[it] = Student(
            student[0].toString(),
            student[1].toInt(),
            student[2].toInt(),
            student[3].toInt()
        )
    }
    studentList.sortBy { it.day }
    studentList.sortBy { it.month }
    studentList.sortBy { it.year }
    println(studentList.last().name)
    println(studentList[0].name)
}