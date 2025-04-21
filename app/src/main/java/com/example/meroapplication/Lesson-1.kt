package com.example.meroapplication

// First Kotlin program
fun main() {
    println("Hello World")

    // Variables in Kotlin
    // Mutable
    var age = 20
    age = 25 // OK: mutable variable can be reassigned

    // Immutable
    // Use 'val' instead of 'var' for constants
    val roll = 15
    // roll = 10 // ❌ Error: Val cannot be reassigned

    // Primitive data types
    val isActive: Boolean = true
    val grade: Char = 'R'
    val smallNumber: Byte = 12
    val shortNumber: Short = -356
    val id: Int = 43543
    val bigNumber: Long = -51321354L
    val floatValue: Float = 5.6451344F
    val doubleValue: Double = 7.32644564

    println(isActive)
    println(grade)
    println(smallNumber)
    println(shortNumber)
    println(id)
    println(bigNumber)
    println(floatValue)
    println(doubleValue)

    // Type Conversion in Kotlin
    val doubleNum: Double = 13.32
    val intNum: Int = doubleNum.toInt()
    val byteNum: Byte = intNum.toByte()

    println("Double to Int: $intNum")
    println("Int to Byte: $byteNum")

    // String Data Types
    val message: String = "Hello World"
    val length: Int = message.length
    val isEqual: Boolean = message.equals("Hello World")
    val username: String = "  Softwarica  "

    println("Trimmed username: '${username.trim()}'")
    println("Message: $message")
    println("Length of message: $length")
    println("Is message empty? ${message.isEmpty()}")
    println("Lowercase: ${message.lowercase()}")
    println("Uppercase: ${message.uppercase()}")
    println("Does message equal 'Hello World'? $isEqual")
    println(message.plus(" How are you?"))
}
