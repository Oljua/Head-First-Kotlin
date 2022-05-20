# СТАНЬ компилятором

Каждый блок кода Kotlin на этой странице 
представляет полный исходный файл. Попробуйте 
представить себя на месте компилятора 
и определить, будет ли компилироваться 
каждый из этих файлов. Если какие-то 
файлы не компилируются, то как бы вы 
их исправили?

Блок кода A
```java  
fun main(args: Array<String>) {
    var x = 1
    while (x < 10) {
        if (x > 3) {
            println("big x")
        }
    }
}
``` 

Блок кода B
```java  
fun main(args: Array<String>) {
    val x = 10
    while (x > 1) {
        x = x - 1
        if (x < 3) println("small x")
    }
}
``` 

Блок кода C
```java  
fun main(args: Array<String>) {
    var x = 10
    while (x > 1) {
        x = x - 1
        print(if (x < 3) "small x")
    }
}
``` 