package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()

        val dice1 = R.drawable.dice_1
        val dice2 = R.drawable.dice_2
        val dice3 = R.drawable.dice_3
        val dice4 = R.drawable.dice_4
        val dice5 = R.drawable.dice_5
        val dice6 = R.drawable.dice_6


        val resultTextView2: TextView = findViewById(R.id.textView2)
        resultTextView2.text = ""

        val luckyNumber = 4

        when (diceRoll) {
            luckyNumber -> resultTextView2.text = "You won!"
            1 -> resultTextView2.text = "So sorry! You rolled a 1. Try again!"
            2 -> resultTextView2.text = "Sadly, you rolled a 2. Try again!"
            3 -> resultTextView2.text = "Unfortunately, you rolled a 3. Try again!"
            5 -> resultTextView2.text = "Don't cry! You rolled a 5. Try again!"
            6 -> resultTextView2.text = "Apologies! You rolled a 6. Try again!"
        }
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()

        val diceImage: ImageView = findViewById(R.id.imageView)
        val diceImgOneRoll = when (diceRoll) {
            1 -> dice1
            2 -> dice2
            3 -> dice3
            4 -> dice4
            5 -> dice5
            else -> dice6
        }
        diceImage.setImageResource(diceImgOneRoll)
    }
}

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}