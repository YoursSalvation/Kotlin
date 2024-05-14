import kotlin.random.Random

fun main() {
    var n:Int = 0
    n = readln()!!.toInt()
    var arr = IntArray(n)
    var x:Int = 0
    for (i in arr.indices) {
        arr[i] = Random.nextInt(15)
        print("${arr[i]} ")
    }

    println("Введите число x ")
    x = readln()!!.toInt()

    println("Числа являющиеся квадратом числа x")
    for (i in arr.indices) {
        if (x*x == arr[i]) {
            print("${arr[i]} ")
        }
    }
}