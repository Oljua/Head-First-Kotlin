class Songs(val title: String, val artist: String) {
    fun play() {
        println("Playing the song $title by $artist")
    }

    fun stop() {
        println("Stopped playing $title")
    }
}

fun main() {
    val songOne = Songs("The Mesopotamians", "They Might Be Giants")
    val songTwo = Songs("Going Underground", "The Jam")
    val songThree = Songs("Make Me Smile", "Steve Harley")
    songTwo.play()
    songTwo.stop()
    songThree.play()
}