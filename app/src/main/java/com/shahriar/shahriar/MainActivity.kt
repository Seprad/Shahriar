package com.shahriar.shahriar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "به برنامه آموزشی شهریار خوش اومدی!!!", Toast.LENGTH_SHORT).show()


    }
}