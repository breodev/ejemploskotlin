package org.example

import kotlin.reflect.typeOf

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //String template
    val name = "Kotlin"
    println("Hello, " + name + "!") //Concat works but it is better to use the template
    println("Hello $name") //String template

    //Data types

    //Numbers

    //Integers
    val one = 1 // Int
    val threeBillion = 3000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1

    //Float
    val pi = 3.14 // Double
    // val one: Double = 1 // Error: type mismatch
    val oneDouble = 1.0 // Double

    val e = 2.7182818284 // Double
    val eFloat = 2.7182818284f // Float, actual value is 2.7182817

    //Operations (+, -, *, /, %)
    println(1 + 2)
    println(2_500_000_000L - 1L)
    println(3.14 * 2.71)
    println(10.0 / 3)

    //Booleans
    //            || – disjunction (logical OR)
    //            && – conjunction (logical AND)
    //             ! – negation (logical NOT)

    var myTrue: Boolean = true
    var myFalse: Boolean = false
    var boolNull: Boolean? = true

    //    myTrue = null // Uncomment this line and shows error, it is not optional
    boolNull = null

    println(myTrue || myFalse)
    // true
    println(myTrue && myFalse)
    // false
    println(!myTrue)
    // false
    println(boolNull)
    // null


    //String

    val str = "abcd"
    // Creates and prints a new String object
    println(str.uppercase())
    // ABCD
    // The original string remains the same
    println(str)
    // abcd


    val s = "abc" + 1
    println(s + "def")
    // abc1def

    //multiline
    val text = """
    for (c in "foo")
        print(c)
    """
    println(text)

    //Templates
    val i = 10
    println("i = $i")
    // i = 10

    val letters = listOf("a","b","c","d","e")
    println(letters)
    println("Letters: $letters")
    // Letters: [a, b, c, d, e]

    val s1 = "abc"
    println("$s1.length is ${s1.length}")
    // abc.length is 3

    //Format
    val integerNumber = String.format("%07d", 31416)
    println(integerNumber)
    // 0031416

    // Formats a floating-point number to display with a + sign and four decimal places
    val floatNumber = String.format("%+.4f", 3.141592)
    println(floatNumber)
    // +3.1416

    // Formats two strings to uppercase, each taking one placeholder
    val helloString = String.format("%S %S", "hello", "world")
    println(helloString)
    // HELLO WORLD

    // Formats a negative number to be enclosed in parentheses, then repeats the same number in a different format (without parentheses) using `argument_index$`.
    val negativeNumberInParentheses = String.format("%(d means %1\$d", -31416)
    println(negativeNumberInParentheses)
    //(31416) means -31416


    //ARRAYS

    var riversArray = arrayOf("Nile", "Amazon", "Yangtze")

    // Using the += assignment operation creates a new riversArray,
    // copies over the original elements and adds "Mississippi"
    riversArray += "Mississippi"
    println(riversArray.joinToString())
    // Nile, Amazon, Yangtze, Mississippi

    for (string in riversArray) {
        print("$string, ")
    }
    println()

    //Acceso y modificacion
    val simpleArray1 = arrayOf(1, 2, 3)
    val twoDArray = Array(2) { Array<Int>(2) { 0 } }

    // Accesses the element and modifies it
    simpleArray1[0] = 10
    twoDArray[0][0] = 2

    // Prints the modified element
    println(simpleArray1[0].toString()) // 10
    println(twoDArray[0][0].toString()) // 2


    //Compare arrays
    val simpleArray = arrayOf(1, 2, 3)
    val anotherArray = arrayOf(1, 2, 3)

    // Compares contents of arrays
    println(simpleArray.contentEquals(anotherArray))
    // true

    // Using infix notation, compares contents of arrays after an element
    // is changed
    simpleArray[0] = 10
    //    simpleArray[3] = 10 //Indexoutofbounds
    println(simpleArray contentEquals anotherArray)
    // false

    //Sum (only numeric)
    val sumArray = arrayOf(1, 2, 3)

    // Sums array elements
    println(sumArray.sum())


    //Shuffle Arrays
    val simpleArrayShuffle = arrayOf(1, 2, 3)

    // Shuffles elements [3, 2, 1]
    simpleArrayShuffle.shuffle()
    println(simpleArrayShuffle.joinToString())

    // Shuffles elements again [2, 3, 1]
    simpleArrayShuffle.shuffle()
    println(simpleArrayShuffle.joinToString())

    //Convert to collections
    val simpleArrayConvert = arrayOf("a", "b", "c", "c")

    println(simpleArrayConvert)
    println(simpleArrayConvert.joinToString(
        separator = "**"
    ))

    // Converts to a Set
    println(simpleArrayConvert.toSet())
    // [a, b, c]

    // Converts to a List
    println(simpleArrayConvert.toList())
    // [a, b, c, c]


    val pairArray = arrayOf("apple" to 120, "banana" to 150, "cherry" to 90, "apple" to 140)

    // Converts to a Map
    // The keys are fruits and the values are their number of calories
    // Note how keys must be unique, so the latest value of "apple"
    // overwrites the first
    println(pairArray.toMap())
    // {apple=140, banana=150, cherry=90}

    //TYPES

    val obj = "Holacaracola"
    println(obj::class.simpleName) // prints String

    if (obj is String) {
        print(obj.length)
    }

    if (obj !is String) { // Same as !(obj is String)
        print("Not a String")
    } else {
        print(obj.length)
    }

    //CASTING
    //    val x: String = y as String
    //    val x: String? = y as? String
}
