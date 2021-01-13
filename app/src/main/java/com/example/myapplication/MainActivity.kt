package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            btnAddition.setOnClickListener {
                tvResult.text =
                    addition(edtA.text.toString().toInt(), edtB.text.toString().toInt()).toString()
            }

            btnSubtraction.setOnClickListener {
                tvResult.text = subtraction(
                    edtA.text.toString().toInt(),
                    edtB.text.toString().toInt()
                ).toString()
            }
        } catch (e: Exception) {

        }

    }

    private fun addition(a: Int, b: Int): Int {
        return a + b
    }

    private fun subtraction(a: Int, b: Int): Int {
        return a - b
    }
}