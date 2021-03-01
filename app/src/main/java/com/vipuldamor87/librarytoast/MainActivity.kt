package com.vipuldamor87.librarytoast

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vipuldamor87.toasterlib.ToasterMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToasterMessage.s(this,"hello")
    }
}