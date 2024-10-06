fun main() {
    print("Enter the number of terms: ")
    val n = readLine()?.toIntOrNull()

    if (n != null && n > 0) {
        println("Fibonacci sequence up to $n terms:")
        for (i in 0 until n) {
            print("${fibonacci(i)} ")
        }
    } else {
        println("Please enter a valid positive number.")
    }
}

fun fibonacci(n: Int): Int {
    return if (n == 0 || n == 1) {
        n
    } else {
        fibonacci(n - 1) + fibonacci(n - 2)
    }
}
