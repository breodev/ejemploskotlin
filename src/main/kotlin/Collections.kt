package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //MUTABLE
    val numbers = mutableListOf("one", "two", "three", "four")

    numbers.add("five")   // this is OK
    println(numbers)


    val stringList = listOf("one", "two", "one")
    printAll(stringList)

    val stringSet = setOf("one", "two", "three")
    printAll(stringSet)

    //LIST
    val numbers2 = listOf("one", "two", "three", "four")
    println("Number of elements: ${numbers2.size}")
    println("Third element: ${numbers2.get(2)}")
    println("Fourth element: ${numbers2[3]}")
    println("Index of element \"two\" ${numbers2.indexOf("two")}")

    val numbers3 = mutableListOf(1, 2, 3, 4)
    numbers3.add(5)
    numbers3.removeAt(1)
    numbers3[0] = 0
    numbers3.shuffle()
    println(numbers3)

    //SET
    val numbers4 = setOf(1, 2, 3, 4)
    println("Number of elements: ${numbers4.size}")
    if (numbers4.contains(1)) println("1 is in the set")

    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers4 == numbersBackwards}")

    val numbers5 = setOf(1, 2, 3, 4)  // LinkedHashSet is the default implementation
    val numbersBackwards5 = setOf(4, 3, 2, 1)

    println(numbers5.first() == numbersBackwards5.first())
    println(numbers5.first() == numbersBackwards5.last())

    //MAP
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

    println("All keys: ${numbersMap.keys}")
    println("All values: ${numbersMap.values}")
    if ("key2" in numbersMap) println("Value by key \"key2\": ${numbersMap["key2"]}")
    if (1 in numbersMap.values) println("The value 1 is in the map")
    if (numbersMap.containsValue(1)) println("The value 1 is in the map") // same as previous

    val numbersMap2 = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    val anotherMap2 = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)

    println("The maps are equal: ${numbersMap2 == anotherMap2}")

}


fun printAll(strings: Collection<String>) {
    for(s in strings) print("$s ")
    println()
}