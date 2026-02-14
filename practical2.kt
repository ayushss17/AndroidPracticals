package com.example.c80_workspace

//class MethLab{
//    var owner:String = "Gustavo Fring"
//
//    fun printOwner(){
//       println("Owner is ${owner}")
//    }
//}

// class with Primary Constructor
//class MethLab(var name: String, var sideThing: String, var Age: Int){
//
//    fun printInfo(){
//        println("Name : ${this.name}")
//        println("Side work : ${this.sideThing}")
//        println("Age : ${this.Age}")
//    }
//}

class MethLab(var name: String, var age: Int?){

    fun primaryContent(){
        println("Name: ${name}, ConvertedAge: ${age} ")
    }
    constructor( name: String, age: String ) : this(name, age.toIntOrNull() ) {
//        println("Name: ${name}, ConvertedAge: ${age} ")
    }
}

fun main(){
//    var mLab1 = MethLab("Gustavo Fring", "Fast Food", 48);
//    mLab1.printInfo();
//    var mLab2 = MethLab("Heisengberg", "Teacher", 42);
//    mLab2.printInfo();
    var Mlab1 = MethLab("Heisenberg", 42)
    Mlab1.primaryContent();
    var Mlab2 = MethLab("Jesse", "22") // will call secondary constructor only
    Mlab2.primaryContent()
}