package com.example.pincode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        textView.text = getString(R.string.text)
        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener { _ ->
            textView.text = textView.text as String + getString(R.string.text1)
        }
        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener { _ ->
            textView.text = textView.text as String + getString(R.string.text1)
        }
        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener { _ ->
            textView.text = textView.text as String + getString(R.string.text1)
        }
        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener { _ ->
            textView.text = textView.text as String + getString(R.string.text1)
        }
        val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener { _ ->
            textView.text = textView.text as String + getString(R.string.text1)
        }
        val button6: Button = findViewById(R.id.button6)
        button6.setOnClickListener { _ ->
            textView.text = textView.text as String + getString(R.string.text1)
        }
        val button7: Button = findViewById(R.id.button7)
        button7.setOnClickListener { _ ->
            textView.text = textView.text as String + getString(R.string.text1)
        }
        val button8: Button = findViewById(R.id.button8)
        button8.setOnClickListener { _ ->
            textView.text = textView.text as String + getString(R.string.text1)
        }
        val button9: Button = findViewById(R.id.button9)
        button9.setOnClickListener { _ ->
            textView.text = textView.text as String + getString(R.string.text1)
        }
        val button10: Button = findViewById(R.id.button10)
        button10.setOnClickListener { _ ->
            textView.text = textView.text as String + getString(R.string.text1)
        }
        val button11: Button = findViewById(R.id.button11)
        button11.setOnClickListener { _ ->
            //
        }
        val button12: Button = findViewById(R.id.button12)
        button12.setOnClickListener { _ ->
            if(textView.text == "1567")
                Toast.makeText(this, "PassCode Is Right", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "PassCode Is Wrong", Toast.LENGTH_SHORT).show()
        }

    }
}