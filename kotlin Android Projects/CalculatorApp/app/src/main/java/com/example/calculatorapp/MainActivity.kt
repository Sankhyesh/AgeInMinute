package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.ArithmeticException

class MainActivity : AppCompatActivity() {
    var lastNumeric: Boolean = false
    var lastDot: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun emptytheText(view: View){
        tvinput.text =""
        lastDot = false
        lastNumeric = false
    }
    fun onDigit(view: View){
        tvinput.append((view as Button).text)
        lastNumeric = true
    }

    fun onDecimalPoint(view: View){
        if (lastNumeric && !lastDot){
            tvinput.append(".")
            lastNumeric = false
            lastDot = true
        }
    }

    fun onEqual(view: View){
        if (lastNumeric){
            var tvvalue = tvinput.text.toString()
            var prefix = ""
            try {
                if(tvvalue.startsWith("-")){
                    prefix = "-"
                    tvvalue = tvvalue.substring(1)
//
                }
                if (tvvalue.contains("-")){
//                    splitingthe var
                    var splitvalue = tvvalue.split("-")

                    var one = splitvalue[0]
                    var two = splitvalue[1]

                    if (!prefix.isEmpty()){
                        one = prefix + one
                    }
//                    here we are calculating the value to adding to the text
                    tvinput.text = removeZeroAfterDot((one.toDouble() - two.toDouble()).toString())


                }
                else if (tvvalue.contains("*")){
//                    splitingthe var
                    var splitvalue = tvvalue.split("*")

                    var one = splitvalue[0]
                    var two = splitvalue[1]

                    if (!prefix.isEmpty()){
                        one = prefix + one
                    }
//                    here we are calculating the value to adding to the text
                    tvinput.text = removeZeroAfterDot((one.toDouble() * two.toDouble()).toString())


                }
                else if (tvvalue.contains("/")){
//                    splitingthe var
                    var splitvalue = tvvalue.split("/")

                    var one = splitvalue[0]
                    var two = splitvalue[1]

                    if (!prefix.isEmpty()){
                        one = prefix + one
                    }
//                    here we are calculating the value to adding to the text
                    tvinput.text = removeZeroAfterDot((one.toDouble() / two.toDouble()).toString())


                }
                else if (tvvalue.contains("+")){
//                    splitingthe var
                    var splitvalue = tvvalue.split("+")

                    var one = splitvalue[0]
                    var two = splitvalue[1]

                    if (!prefix.isEmpty()){
                        one = prefix + one
                    }
//                    here we are calculating the value to adding to the text
                    tvinput.text = removeZeroAfterDot((one.toDouble() + two.toDouble()).toString())


                }


            }catch (e: ArithmeticException){
                e.printStackTrace()
            }
        }
    }

    private fun removeZeroAfterDot(result: String) : String{
        var value = result
        if (result.contains(".0")){
            value = result.substring(0,result.length - 2)

        }
        return value
    }

    fun onOpertor(view: View){
        if(lastNumeric && !isOperatorAdded(tvinput.text.toString())){
            tvinput.append((view as Button).text)
            lastNumeric = false
            lastDot = false

        }
    }



    private fun isOperatorAdded(value: String) : Boolean{
        return  if (value.startsWith("-")){
            false
        }else{
            value.contains("/") || value.contains("*") ||
                    value.contains("-") || value.contains("+")
        }
    }


}