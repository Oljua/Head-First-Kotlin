# У бассейна

Выловите из бассейна фрагменты кода 
и разместите их в пустых строках 
функции printResult. Каждый 
фрагмент может использоваться 
только один раз; использовать 
все фрагменты не обязательно. 
Ваша задача: вывести варианты, 
выбранные пользователем и игрой, 
и сообщить, кто же выиграл.

```java  
fun printResult(userChoice: String, gameChoice: String) {
 val result: String
 //Определить результат
 if (userChoice ... gameChoice) result = "Tie!"
 else if ((userChoice ... "Rock" ... gameChoice ... "Scissors")
 (userChoice ... "Paper" ... gameChoice ... "Rock")
 (userChoice ... "Scissors" ... gameChoice ... "Paper")) result = "You win!"
 else result = "You lose!"
 //Вывести результат
 println("You chose $userChoice. I chose $gameChoice. $result")
}
``` 
![](./screenshots/TaskNearPool.png)