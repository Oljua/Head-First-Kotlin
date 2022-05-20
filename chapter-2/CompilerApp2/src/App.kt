// Бок кода A
fun main() {
    val hobbits = arrayOf("Frodo", "Sam", "Merry", "Pippin")
    var x = 0

    while (x < 4) {
        println("${hobbits[x]} is a good Hobbit name")
        x += 1
    }
}

// Бок кода B
fun main() {
    val firemen = arrayOf("Pugh", "Pugh", "Barney McGrew", "Cuthbert", "Dibble", "Grub")
    var firemanNo = 0

    while (firemanNo < 6) {
        println("Fireman number $firemanNo is ${firemen[firemanNo]}")
        firemanNo += 1
    }
}
