import kotlin.random.Random

fun main() {
    var rounds = 0
    var userScore = 0
    var computerScore = 0

    println("Welcome to Rock-Paper-Scissors!")
    println("Let's start the game.")

    while (rounds < 3) {
        println("\nRound ${rounds + 1}")

        val userChoice = getUserChoice()
        val computerChoice = generateComputerChoice()

        println("You chose $userChoice")
        println("Computer chose $computerChoice")

        val result = determineWinner(userChoice, computerChoice)

        when (result) {
            "Draw" -> println("It's a draw!")
            "User" -> {
                println("You win this round!")
                userScore++
            }
            "Computer" -> {
                println("Computer wins this round.")
                computerScore++
            }
        }

        rounds++
    }

    println("\nGame Over!")
    println("User Score: $userScore")
    println("Computer Score: $computerScore")

    if (userScore > computerScore) {
        println("Congratulations! You are the winner.")
    } else if (userScore < computerScore) {
        println("Computer wins the game. Better luck next time!")
    } else {
        println("It's a tie. Well played!")
    }
}

fun getUserChoice(): String {
    var userChoice: String
    do {
        println("\nEnter your choice (Rock, Paper, or Scissors): ")
        userChoice = readLine()?.uppercase()?: ""
    } while (userChoice !in setOf("ROCK", "PAPER", "SCISSORS"))
    return userChoice
}

fun generateComputerChoice(): String {
    val choices = arrayOf("ROCK", "PAPER", "SCISSORS")
    return choices[Random.nextInt(3)]
}

fun determineWinner(userChoice: String, computerChoice: String): String {
    if (userChoice == computerChoice) {
        return "Draw"
    }

    return when (userChoice) {
        "ROCK" -> if (computerChoice == "SCISSORS") "User" else "Computer"
        "PAPER" -> if (computerChoice == "ROCK") "User" else "Computer"
        "SCISSORS" -> if (computerChoice == "PAPER") "User" else "Computer"
        else -> "Invalid Choice"
    }
}

