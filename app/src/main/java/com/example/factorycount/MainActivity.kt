package com.example.factorycount

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewOutput: TextView = findViewById(R.id.viewOutput)
        val button: Button = findViewById(R.id.button)
        val calculateN: EditText = findViewById(R.id.calculateN)

        button.setOnClickListener {
            val intInput = calculateN.text.toString().toIntOrNull()

            if (intInput == null || intInput < 1)   {
            viewOutput.text = "ОШИБКА!!Введите натуральное число"
            return@setOnClickListener
            }
        }

        private fun calculateFactorial(intInput : Int): BigInteger {
            var result = BigInteger.ONE
            for (i in 2..intInput) {
                result = result.multiply(BigInteger.valueOf(i.toLong()))
            }
            return result
        }
        }

    }
}