package com.example.meroapplication

import kotlin.random.Random

fun main() {
    checkEvenOdd()
    checkAgeCategory()
    findLargestNumber()
    printDayOfWeek()
    loopExamples()
}

// 1. Even or Odd Checker
fun checkEvenOdd() {
    print("\nPlease enter a number: ")
    val number = readln().toInt()
    if (number % 2 == 0) {
        println("$number is even")
    } else {
        println("$number is odd")
    }
}

// 2. If-Else-If Ladder: Age Category
fun checkAgeCategory() {
    print("\nPlease enter your age: ")
    val yourAge = readln().toInt()
    if (yourAge < 13) {
        println("You are a child")
    } else if (yourAge < 19) {
        println("You are a teenager")
    } else {
        if (yourAge < 50) {
            println("You are an adult")
        } else {
            println("You are a senior")
        }
    }
}

// 3. Nested If: Find Largest Number
fun findLargestNumber() {
    println("\nPlease enter 3 numbers:")
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val number3 = readln().toInt()
    val largestNumber = if (number1 >= number2) {
        if (number1 >= number3) number1 else number3
    } else {
        if (number2 >= number3) number2 else number3
    }
    println("The largest number is $largestNumber")
}

// 4. When Statement: Day of the Week
fun printDayOfWeek() {
    print("\nPlease enter a day number of the week (1-7): ")
    val dayNumber = readln().toInt()
    val day = when (dayNumber) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Invalid day choice"
    }
    println("Day: $day")
}

// 5. Loops: For, While, Do-While, Infinite
fun loopExamples() {
    println("\n--- For loop from 1 to 8 ---")
    for (i in 1..8) {
        println(i)
    }

    println("\n--- Sum from 0 to 4 ---")
    var sum = 0
    for (x in 0..4) {
        println(x)
        sum += x
    }

    println("\n--- Even numbers from 0 to 9 and their sum ---")
    sum = 0
    for (x in 0..9) {
        if (x % 2 == 0) {
            println(x)
            sum += x
        }
    }
    println("The sum of even numbers is $sum")

    println("\n--- For loop with array indices ---")
    val vehicle = arrayListOf("Tata", "Kia", "Hyundai", "MG")
    for (y in vehicle.indices) {
        println("The value at index $y is: ${vehicle[y]}")
    }

    println("\n--- ForEach loop ---")
    vehicle.forEach {
        println(it)
    }

    println("\n--- While loop from 0 to 4 ---")
    var i = 0
    while (i < 5) {
        println(i)
        i++
    }

    println("\n--- Factorial of 5 using while loop ---")
    var k = 1
    var fact = 1
    while (k <= 5) {
        fact *= k
        k++
    }
    println("Factorial of 5 is $fact")

    println("\n--- Infinite loop: Guess the number game ---")
    val number = Random.nextInt(0, 10000)
    println("Guess the number between 0 and 10000:")
    while (true) {
        print("Enter your guess: ")
        val userGuess = readln().toInt()
        if (userGuess == number) {
            println("Congratulations!!! You won")
            break
        } else if (userGuess < number) {
            println("Increase your guess")
        } else {
            println("Decrease your guess")
        }
    }

    println("\n--- Do-While loop from 1 to 15 ---")
    var numberDo = 1
    do {
        println(numberDo)
        numberDo++
    } while (numberDo <= 15)
}
