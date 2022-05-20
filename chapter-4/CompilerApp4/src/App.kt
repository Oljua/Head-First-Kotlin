// Блок кода А
class TapeDeck {
    var hasRecorder = false

    fun playTape() {
        println("Tape playing")
    }

    fun recordTape() {
        if (hasRecorder) {
            println("Tape recording")
        }
    }
}

fun main() {
    val t = TapeDeck()
    t.hasRecorder = true
    t.playTape()
    t.recordTape()
}

// Блок кода B
class DVDPlayer(var hasRecorder: Boolean) {
    fun playDVD() {
        println("DVD playing")
    }

    fun recordDVD() {
        if (hasRecorder) println("DVD recording")
    }
}

fun main() {
    val d = DVDPlayer(true)
    d.playDVD()
    d.recordDVD()
}