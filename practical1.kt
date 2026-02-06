package com.example.c80_workspace

import kotlin.reflect.typeOf


//fun calculateInterst(amt:Int, time:Int, ri:Double):Double{
//    return ( amt * time * ri ) / 100;
//}

fun findSqr(num:Int):Int{
    return (num * num);
}
fun findFullName(fname: String, lname: String):String{
    return (fname + " " + lname);
}
fun removeSpaces(str:String):String{
    var ind = 0;
    var updatedStr = "";
    do {
        if ( str[ind] !== ' ' ){
            updatedStr += str[ind]
        }
        ind += 1;
    }while ( ind < str.length )
    return updatedStr;
}
fun calculateSplit(total: Double, count:Int): Double{
    return (total / count)
}
fun timeTaken(dist: Int, spd: Int):Int{
    return ( dist / spd ) * 60 ;
}
fun main(){
//    var amount:Int = 10000
//    var time:Int = 2
//    var intr:Double = 2.4
//
//    print("Calculated Interest: ${calculateInterst(amount, time, intr)}")

//    print("Enter number: ");
//    var num:Int = readln().toInt();
//    print("Square of number: ${findSqr(num)}");
//    var fname = readln();
//    var lname = readln();
//    print("Full Name: ${findFullName(fname, lname)}")
//    print("Enter two integers: ")
//    var num1:Int = readln().toInt();
//    var num2:Int = readln().toInt();
//
//    print("Quotient: ${num1 / num2}");
//    print("\nRemainder: ${num1 % num2}")
//    print("Enter two numbers: ")
//    var num1 = readln().toInt();
//    var num2 = readln().toInt();
//    print("Original Values: \n num1 = ${num1} num2 = ${num2}")
//    var temp = num1;
//    num1 = num2;
//    num2 = temp;
//    print("\nSwapped Values: \n num1 = ${num1} num2 = ${num2}")
//    var str = "Ayu sh Saw ant  "
//    print("WhiteSpace removed: ${removeSpaces(st)}")
//    var num1 = "42"
//    println(num1 is String )
//    println( num1 is Int )
//    num1.toIntOrNull()
//    println( num1 is String)
//    println( num1 is Int )
//    print("Enter total bill and no. of people: ")
//    var totalBill: Double = readln().toDouble()
//    var count:Int = readln().toInt()
//    print("Total Split: ${calculateSplit(totalBill, count)}")
    print("Enter distance: ")
    var dist:Int = readln().toInt()
    print("Enter speed: ")
    var spd:Int = readln().toInt()

    print("Total time: ${timeTaken(dist, spd)} minutes")
}