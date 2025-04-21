package com.example.meroapplication

fun main(args: Array<String>) {
    // Fixed: print actual array contents
    val age = arrayOf(1, 2, 3)
    println("Age array: ${age.joinToString()}")  // printing array properly
    println("The first element of age is ${age[0]}")
    println("The second element of age is ${age[1]}")
    println("The third element of age is ${age[2]}")

    println("******************")

    val nameArray = arrayOf("ram", "shyam", "Hari")
    println("The first element of nameArray is ${nameArray[0]}")
    println("The second element of nameArray is ${nameArray[1]}")
    println("The third element of nameArray is ${nameArray[2]}")
    println("Size of nameArray: ${nameArray.size}")

    // ArrayList initialization
    val ageList = ArrayList<Int>()
    ageList.add(1)
    ageList.add(1, 20) // inserting at index 1
    ageList.add(5)
    println("ageList: $ageList")

    // Direct initialization
    val ageList2 = arrayListOf(1, 20, 5)
    println("ageList2: $ageList2")

    // Working with string ArrayList
    val names = arrayListOf("Sandis", "ram", "shyam")
    names.add("hari")
    names.add(4, "sita") // inserting at index 4

    names.remove("shyam")
    names.removeAt(0) // removes "Sandis"
    println("Updated names list: $names")

    // Mixed type ArrayList
    val mixArrayList = arrayListOf<Any>("hello", 5, 2.0)
    println("Mixed ArrayList Elements:")
    println(mixArrayList[0])
    println(mixArrayList[1])
    println(mixArrayList[2])
}
