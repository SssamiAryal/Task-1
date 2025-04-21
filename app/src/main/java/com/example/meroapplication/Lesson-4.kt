package com.example.meroapplication

import kotlin.random.Random

fun main() {

    // Arithmetic Operators
    var num1: Double = 10.6
    var num2: Double = 5.0
    var result: Double

    result = num1 + num2
    println("num1 + num2 = $result")

    result = num1 - num2
    println("num1 - num2 = $result")

    result = num1 * num2
    println("num1 * num2 = $result")

    result = num1 / num2
    println("num1 / num2 = $result")

    result = num1 % num2
    println("num1 % num2 = $result")


    // Assignment Operators
    var x: Int = 20
    var y: Int = 10
    var z: Int = 0

    z = x + y
    println("z = x + y = $z")

    z += x
    println("z += x = $z")

    z -= x
    println("z -= x = $z")

    z *= x
    println("z *= x = $z")

    z /= x
    println("z /= x = $z")

    z %= x
    println("z %= x = $z")


    // Unary Operators
    var number: Double = 7.6
    var isCheck: Boolean = true

    println("+number = ${+number}")
    println("-number = ${-number}")
    println("isCheck = $isCheck")
    println("!isCheck = ${!isCheck}")

    println(".........................")

    var result2: Double = 4.7
    println("result2++ : ${result2++}") // Post-increment
    println("After increment, result2 = $result2")


    // Equality and Relational Operators
    var a: Int = 5
    var b: Int = 5

    println("a == b: ${a == b}")
    println("a != b: ${a != b}")
    println("a < b: ${a < b}")
    println("a > b: ${a > b}")
    println("a <= b: ${a <= b}")
    println("a >= b: ${a >= b}")


    // Conditional Operators
    var number1: Int = 5
    var number2: Int = 8
    var number3: Int = 12

    var conditionResult: Boolean

    // && (AND)
    conditionResult = (number1 > number2) && (number3 > number2)
    println("Condition (AND): $conditionResult")

    // || (OR)
    conditionResult = (number1 > number2) || (number3 > number2)
    println("Condition (OR): $conditionResult")


    // Operator Precedence
    val precedenceResult: Int = 5 + 2 * 4 // 2*4=8 -> 5+8=13
    println("5 + 2 * 4 = $precedenceResult")

    var m: Int = 8
    var n: Int = 4
    var o: Int = 2
    var sum: Int = 0

    sum = m + --n + --o  // Pre-decrement
    println("x + --y + --z = $sum")


    // rangeTo() function and 'in' operator
    val myCharRange = 'a'..'j'
    val testChar = 'Z'
    val check = testChar in myCharRange

    println("myCharRange has $testChar: $check")
    println("Character Range: $myCharRange")


    // Console Input
    print("Enter your name: ")
    val name: String? = readln()

    print("Enter your age: ")
    val age: Int = readln().toInt()

    println("Hello $name, your age is $age.")
}
