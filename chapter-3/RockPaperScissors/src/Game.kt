fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionsParam: Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()]

// функция получению варианта, выбранного пользователем
fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""

    while (!isValidChoice) {
        // запросить у пользователя его выбор
        println("Please enter one of the following: Rock Paper Scissors.")
        for (item in optionsParam) print(" $item")
        println(".")

        //Прочитать пользовательский ввод
        val userInput = readLine()

        // Прочитать пользовательский ввод
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }

        // Если выбран недопустимый вариант, сообщить об этом пользователю
        if (!isValidChoice) println("You must enter a valid choice.")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String) {
    val result: String
    // Определить результат
    if (userChoice == gameChoice) result = "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
            (userChoice == "Paper" && gameChoice == "Rock") ||
            (userChoice == "Scissors" && gameChoice == "Paper")) result = "You win!"
    else result = "You lose!"
    // Вывести результат
    println("You chose $userChoice. I chose $gameChoice. $result")
}