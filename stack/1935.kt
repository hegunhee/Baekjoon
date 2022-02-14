import java.util.Stack

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val equation = readLine()
    val stack = Stack<Double>()
    val value = DoubleArray(n) { readLine().toDouble() }

    for (ch in equation) {
        if (ch in 'A'..'Z') {
            stack.push(value[ch - 'A'])
        } else {
            stack.push(operate(stack.pop(), ch, stack.pop()))
        }
    }

    println("%.2f".format(stack.pop()))
}

fun operate(operand1: Double, ch: Char, operand2: Double): Double {
    return when(ch) {
        '*' -> operand2 * operand1
        '+' -> operand2 + operand1
        '-' -> operand2 - operand1
        else -> operand2 / operand1
    }
}