# СТАНЬ компилятором

Ниже приведены три полные функции Kotlin. 
Попробуйте представить себя 
на месте компилятора и определить, будет 
ли компилироваться каждый из этих файлов. Если какие-то файлы не компилируются, 
то как бы вы их исправили?

Блок кода A
```java  
fun doSomething(msg: String, i: Int): Unit {
    if (i > 0) {
        var x = 0
        while (x < i) {
            println(msg)
            x += 1
        }
    }
}
``` 

Блок кода B
```java  
fun timesThree(x: Int): Int {
 x = x * 3
 return x
}
``` 

Блок кода C
```java  
fun maxValue(args: Array<Int>) {
    var max = args[0]
    var x = 1
    while (x < args.size) {
        var item = args[x]
        max = if (max >= item) max else item
        x = x + 1
    }
    return max
}
``` 