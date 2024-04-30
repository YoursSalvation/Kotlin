fun main() {
    var start:Int = 0;
    var end:Int = 0;
    println("Введите начало и конец интервала")
    start = readln()!!.toInt()
    end = readln()!!.toInt()
    for (i in start..end) {
        var a1:Int = i / 1000
        var a2:Int = (i / 100) % 10
        var a3:Int = (i / 10) % 10
        var a4:Int = i % 10
        var sum:Int = a1 + a2
        var proizv:Int = a3 * a4
        if (sum == proizv) {
            print("$i ")
        }
    }
}