package com.example.rekursia

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val range = 1..50

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNumber.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                var day: Int
                day = try {
                    etNumber.text.toString().toInt()
                } catch (e: NumberFormatException) {
                    return
                }

                if (day in range) {
                    tvRes.text = factorial(s.toString().toInt()).toString()
                }
            }

        })
    }

    fun factorial(n: Int): Int {
        var result = 1.0
        for (i in 1..n) {
            result = result * i
        }
        return result.toInt()
    }
}