import kotlin.math.pow

fun main() {

}

//Функция для задачи 1
fun printArrayComposition() {
    val arr = arrayOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.1, 7.2, 8.3, 9.4, 10.5)
    var composition = 0.0
    for (i in arr) {
        if (composition == 0.0) composition = arr[0] else composition *= i
    }
    println("Ответ к задаче 1: $composition")
}

//Функция для задачи 2:
fun printArrayArithmeticMean() {
    val arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    var mean = 0
    for (i in arr) {
        mean += i
    }
    mean /= arr.size
    println("Ответ к задаче 2: $mean")
}

//Функция для задачи 3:
fun printArrayEvenNumbers(array: Array<Int>) {
    var countEven = 0
    println("Ответ к задаче 3:")
    for (i in array) {
        if (i % 2 == 0) {
            println(i)
            countEven++
        }
    }
    println("Число четных чисел в массиве: $countEven")
}

//Функция для задачи 4:
fun printNArrayOfTwoDegrees(n: Int) {
    var arr = intArrayOf()
    for (i in 1..n) {
        arr += 2.0.pow(i.toDouble()).toInt()
    }
    println(arr.contentToString())
}

