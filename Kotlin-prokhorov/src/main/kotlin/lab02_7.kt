import kotlin.random.Random

fun main() {
    var n:Int = 0
    n = readln()!!.toInt()
    var arr = IntArray(n)
    for (i in arr.indices) {
        arr[i] = Random.nextInt(15)
        print("${arr[i]} ")
    }

    println("Индексы элементов, которые кратны 3 или 5")
    for (i in arr.indices) {
        if ((arr[i] % 3 == 0) || (arr[i] % 5 == 0)) {
            print("$i ")
        }
    }
}