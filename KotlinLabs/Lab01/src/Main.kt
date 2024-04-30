fun main() {
    var n:Int = 0
    var min:Int = 10
    var max:Int = 0
    println("Введите n")
    n = readln()!!.toInt()
    while (n > 0) {
        var s:Int
        s = n % 10
        if (s > max) {
            max = s
        }
        if (s < min) {
            min = s
        }
        n = n / 10
    }
    println("Максимальная цифра = $max Минимальная цифра = $min")
}