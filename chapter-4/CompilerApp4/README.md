# СТАНЬ компилятором

Каждый блок кода Kotlin на этой странице представляет полный исходный файл. Попробуйте представить 
себя на месте компилятора и определить, будет ли 
компилироваться каждый из этих файлов. Если 
какие-то файлы не компилируются, то как бы 
вы их исправили?

Блок кода A
```java  
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
    t.hasRecorder = true
    t.playTape()
    t.recordTape()
}
``` 

Блок кода B
```java  
class DVDPlayer(var hasRecorder: Boolean) {
    fun recordDVD() {
        if (hasRecorder) println("DVD recording")
    }
}

fun main() {
    val d = DVDPlayer(true)
    d.playDVD()
    d.recordDVD()
}
```