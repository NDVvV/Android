package com.example.learnmath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonAdd.setOnClickListener {
            addNumber()
        }
        buttonSub.setOnClickListener {
            subNumber()
        }
        buttonMul.setOnClickListener {
            mulNumber()
        }
        buttonDiv.setOnClickListener {
            divNumber()
        }
    }

    fun addNumber() {
        var number1 :Int = 0
        var number2 :Int = 0
        val stringNumber1 = editNumber1.text.toString()
        val stringNumber2 = editNumber2.text.toString()

        if (!stringNumber1.equals("")) {
            number1 = stringNumber1.toInt()
        }
        if (!stringNumber2.equals("")) {
            number2 = stringNumber2.toInt()
        }

        result.text = (number1 + number2).toString()
    }

    fun subNumber() {
        var number1 :Int = 0
        var number2 :Int = 0
        val stringNumber1 = editNumber1.text.toString()
        val stringNumber2 = editNumber2.text.toString()

        if (!stringNumber1.equals("")) {
            number1 = stringNumber1.toInt()
        }
        if (!stringNumber2.equals("")) {
            number2 = stringNumber2.toInt()
        }

        var resultSubNumber : String

        when(number1 >= number2) {
            true -> resultSubNumber = (number1 - number2).toString()
            else -> resultSubNumber = "-" + (number2 - number1).toString()
        }
        result.text = resultSubNumber
    }

    fun mulNumber() {
        var number1 :Int = 0
        var number2 :Int = 0
        val stringNumber1 = editNumber1.text.toString()
        val stringNumber2 = editNumber2.text.toString()

        if (!stringNumber1.equals("")) {
            number1 = stringNumber1.toInt()
        }
        if (!stringNumber2.equals("")) {
            number2 = stringNumber2.toInt()
        }

        result.text = (number1 * number2).toString()
    }

    fun divNumber() {
        var number1 :Int = 0
        var number2 :Int = 0
        val stringNumber1 = editNumber1.text.toString()
        val stringNumber2 = editNumber2.text.toString()

        if (!stringNumber1.equals("")) {
            number1 = stringNumber1.toInt()
        }
        if (!stringNumber2.equals("")) {
            number2 = stringNumber2.toInt()
        }
        var resultDivNumber : String = "ERROR"

        if (!(number2 == 0)) {
            resultDivNumber = (number1 / number2).toString()
        }
        result.text = resultDivNumber
    }
}