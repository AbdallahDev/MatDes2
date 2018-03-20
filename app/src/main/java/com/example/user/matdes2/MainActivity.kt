package com.example.user.matdes2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        user_et.setOnFocusChangeListener { view, b ->
            if (user_et.text.toString().isEmpty()) {
                user_layout.isErrorEnabled = true
                user_layout.error = "Please Enter Value"
            } else
                user_layout.isErrorEnabled = false
        }

        user_et.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (user_et.text.toString().isEmpty()) {
                    user_layout.isErrorEnabled = true
                    user_layout.error = "Please Enter Value"
                } else
                    user_layout.isErrorEnabled = false
            }
        })

        pass_layout.isCounterEnabled = true
        pass_layout.counterMaxLength = 8

        floatingActionButton.setOnClickListener {
            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()
        }


    }
}
