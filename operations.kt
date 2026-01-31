package com.example.c80_workspace

import android.R

fun add(a:Int, b:Int):Int{
    return (a + b);
}
fun weekDay(day:Int):String{
    var weekD = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        else -> "Out of Bound"
    }
    return weekD;
}
fun printDays(vararg days: String){
    for( day in days ){
        println(day);
    }
}
fun printRange(start:Int, end:Int){
    for ( num in start  .. end){
        println(num)
    }
}
fun checkEven(num:Int): Boolean {
    return (num % 2 == 0)
}
inline fun printName(first:String, last:String){
    println(first + " " + last)
}
val sum:(Int, Int) -> Int = {
    a:Int, b:Int -> a + b
}
fun main(args: Array<String>){
//    val num1:Int = readln().toInt();
//    val num2:Int = readln().toInt();
//    println(add(num1, num2))
//    println("Enter Weekday: ");
//    val day:Int = readln().toInt();
//    print(weekDay(day));
     var days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
//     printDays(*days);
     var numArr = arrayOf(1, 2, 3, 4, 5)
     var readArr = listOf<Int>(1, 2, 3, 4, 5)
//    readArr[0] = 123; // provides error
//     println("Array sum ${numArr.sum()}")
    // joinToString - to convert Array to print
//     println(numArr.joinToString("@"))
     print("Enter the range: ");
     val start = readln().toInt();
     val end = readln().toInt();
     printRange(start, end);
//    print("Enter number: ")
//    var num = readln().toInt();
//    if ( checkEven(num) ){
//        println(" ${num} is even");
//    }
//    else{
//        println("${num} is odd");
//    }
//    print("Enter First Name: ")
//    var fname = readln()
//    var lname = readln()
//
//        printName(last = lname, first = fname)
////    println("Sum of 1,2 = ${sum(1, 2)}")

}