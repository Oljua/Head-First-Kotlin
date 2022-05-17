fun main() {
    doSomething(msg = "hello".toString(), i = 1)
    val resulTimesThree = timesThree(3)
    println(resulTimesThree)
    val resultMaxValue = maxValue(arrayOf(1, 4, 5, 45, 4, 19))
    println(resultMaxValue)
}

fun doSomething(msg: String, i: Int): Unit {
    if (i > 0) {
        var x = 0
        while (x < i) {
            println(msg)
            x += 1
        }
    }
}

fun timesThree(x: Int): Int {
    return x * 3
}

fun maxValue(args: Array<Int>): Int {
    var max = args[0]
    var x = 1
    while (x < args.size) {
        var item = args[x]
        max = if (max >= item) max else item
        x += 1
    }
    return max
}