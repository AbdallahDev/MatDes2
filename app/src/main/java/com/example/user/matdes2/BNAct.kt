package com.example.user.matdes2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bn.*

class BNAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bn)

        nv.setOnNavigationItemSelectedListener { item ->

            if(item.itemId==R.id.item1)
                textView.text="Home"

            if(item.itemId==R.id.item2)
                textView.text="Settings"

            if(item.itemId==R.id.item3)
                textView.text="Search"

            item.setChecked(true)

            false

        }
    }
}
