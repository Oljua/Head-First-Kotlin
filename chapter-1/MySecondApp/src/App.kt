// Блок кода A
fun main () {
    var x = 1
    while (x < 10) {
        if (x > 3) {
            println("big x")
        }
        x += 1
    }
}

// Блок кода B
fun main() {
    var x = 10
    while (x > 1) {
        x = x - 1
        if (x < 3) println("small x")
    }
}

// Блок кода C
fun main() {
    var x = 10
    while (x > 1) {
        x = x - 1
        print(if (x < 3) "small x" else "big x")
    }
}