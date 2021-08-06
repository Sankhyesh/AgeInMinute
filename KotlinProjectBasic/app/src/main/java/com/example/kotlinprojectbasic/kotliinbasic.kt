package com.example.kotlinprojectbasic
import java.sql.Driver

interface  Drivable{
    val maxspeed:Double

//    function without body
    fun drive():String

    fun brake(){
        println("the druvable is breaking ")
    }
}

open class Car(override val maxspeed: Double, val name :String, val brand:String)
    : Drivable{


    open var range :Double= 0.0
    open fun extendRange(amount :Double){
        if (range > 0) range += amount
    }

//    override fun drive(): String = "hey the this is the drive function of the "
    override fun drive(): String {
        return "hey there this is the drive function of the interface"
    }

    open fun drive(distance :Double) {
        println("drove for $distance km")
    }
    override fun brake() {
        super.brake()
        println("Brake inside the car ")
    }
}

// Sub or derived  Class of the Car
class  ElectricCar(maxspeed: Double,name: String,brand: String, battery_Life  : Double)
    : Car(maxspeed ,name ,brand){
    var charger = "Type1"
    override var range = battery_Life * 6
    override fun drive(distance: Double){
        println("Drove for $distance KM on Electricity ")
    }

//    this is not overridden function local function of electricCar
    override fun drive():String{
       return "Drove for $range Km on electricity "
    }

    override fun brake() {
        super.brake()
        println("Brake inside the elecric car ")
    }
}
    fun main(){
        var myCar = Car(200.0,"A3" , "audi")
        var myEcar= ElectricCar(243.0,"s_model","tesla",87.0)
        myEcar.charger = "Type2"



        myEcar.drive()
        myCar.brake()
        myEcar.brake()
//        polymorphism
//         or a part of the polymorphism is the ability to treat objects with similar traits
//        in a common way
        myCar.drive(200.0)
        myEcar.drive(500.0)
    }
