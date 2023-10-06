package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_LONG).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultImgView: ImageView = findViewById(R.id.imageView)
        when (diceRoll) {
            1 -> resultImgView.setImageResource(R.drawable.dice_1)
            2 -> resultImgView.setImageResource(R.drawable.dice_2)
            3 -> resultImgView.setImageResource(R.drawable.dice_3)
            4 -> resultImgView.setImageResource(R.drawable.dice_4)
            5 -> resultImgView.setImageResource(R.drawable.dice_5)
            6 -> resultImgView.setImageResource(R.drawable.dice_6)
        }


    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
