# Приложение Songs

Создайте новый проект Kotlin для JVM и присвойте ему имя «Songs». Затем 
создайте новый файл Kotlin с именем Songs.kt — выделите папку src, откройте 
меню File и выберите команду New → Kotlin File/Class. Введите имя файла 
«Songs» и выберите вариант File в группе Kind.
Затем добавьте следующий код в Songs.kt:
```java
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
```