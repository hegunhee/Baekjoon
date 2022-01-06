import kotlin.math.max

fun main() {
    val br = System.`in`.bufferedReader()
    val nw = br.readLine().split(" ")
    val backpack = Array<IntArray>(nw[0].toInt() + 1, { IntArray(nw[1].toInt() + 1) })
    for (i in 1..nw[0].toInt()) {
        val weight_value = br.readLine().split(" ")
        for (j in 1..nw[1].toInt()) {
            if (j < weight_value[0].toInt()) {
                backpack[i][j] = backpack[i - 1][j]
            } else {
                backpack[i][j] =
                    max(backpack[i - 1][j], backpack[i - 1][j - weight_value[0].toInt()] +weight_value[1].toInt())
            }
        }
    }
    print(backpack[nw[0].toInt()][nw[1].toInt()])
}
