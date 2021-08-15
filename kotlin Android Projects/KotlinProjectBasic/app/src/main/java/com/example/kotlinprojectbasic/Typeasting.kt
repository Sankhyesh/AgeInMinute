package com.example.kotlinprojectbasic

fun main(){
//    val stringList: List<String> = listOf("snkhyesh","singh ","htakur")
//    val mixedTypeList: List<Any> = listOf("Snkhyesg",24,6,70.5,"weigh","kg")

//    for (value in mixedTypeList){
//        if(value is Int){
//            print("integer :'$value'")
//        }else  if(value is Double){
//            println("Double :'$value with floor value ${Math.floor(value)}")
//        }else if (value is String){
//           println("String : '$value' of length ${value.length}")
//        }else{
//            println("unknown Type")
//        }
//    }


// //    Smart Cast
//    val obj1: Any ="I have a dream"
//    if(obj1 !is String){
//        println("not a string ")
//    }else  {
////        obj is automattically cast to a string in this scope
//        println("Found a string of legth ${obj1.length}")
//    }

//    Explliicit (unsafe ) Casting using the "as" keyword - can go wrong
//    val obj1: Any ="I have a dream"
//    val str1: String = obj1 as String
//    println("length of the string ${str1.length}")
//
//    // Explicit (safe ) castin using "as?" keyword
//
//    val obj2: Any = 1337
//    val str2: String? = obj2 as? String
//    println(str2)
//
//    val obj3: Any = 1125
//    val str3: String? = obj3 as? String // works
//    println(str3) //prints null


//    val sum:(Int,Int) -> Int = {a: Int, b: Int->a+b}
//    println(sum(25,23))
//
    val sum = {a: Int, b:Int -> println(a+b)}
    sum(13,4)

}