package com.example.meroapplication

// Function to display a list
fun displayList() {
    val numbers = listOf("one", "two", "three", "four")
    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers[2]}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\": ${numbers.indexOf("two")}")
}

// Main function demonstrating immutable and mutable lists
fun main() {
    // Immutable List
    val lst = listOf("one", "two", "three")
    println("Immutable List:")
    for (i in lst.indices) {
        println(lst[i])
    }

    println()

    // Mutable List
    val mutableLst = mutableListOf("one", "two", "three")
    mutableLst.add("four")
    println("Mutable List:")
    for (i in mutableLst.indices) {
        println(mutableLst[i])
    }

    println()
    // Call other functions for demonstration
    displayList()
    showSet()
    showMap()
}

// Function to demonstrate Set
fun showSet() {
    val numbers = setOf(1, 2, 3, 4)
    println("Set Elements:")
    for (element in numbers) {
        println(element)
    }

    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}")
}

// Function to demonstrate Map
fun showMap() {
    // Immutable Map
    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "China" to "Beijing",
        "India" to "New Delhi"
    )

    println("All keys: ${countriesCapitals.keys}")
    println("All values: ${countriesCapitals.values}")
    println("Capital of Nepal is: ${countriesCapitals["Nepal"]}")

    // Example of Immutable Map
    val studentMarks = mapOf(
        "ram" to 45,
        "shyam" to 50,
        "hari" to 40,
        "gita" to 55
    )
    println("Enter student name (Immutable Map):")
    val input1: String = readln().lowercase()
    println("Marks: ${studentMarks[input1]}")

    // Example of Mutable Map
    val studentMutableMarks = mutableMapOf(
        "ram" to 45,
        "shyam" to 50,
        "hari" to 40,
        "gita" to 55
    )
    studentMutableMarks["ram"] = 60
    studentMutableMarks.put("sabin", 80)

    println("Enter student name (Mutable Map):")
    val input2: String = readln().lowercase()
    println("Marks: ${studentMutableMarks[input2]}")
}
