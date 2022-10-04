package com.example.baseappfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class additem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_additem)
		
		val back = findViewById<Button>(R.id.back)
		
		back.setOnClickListener{
			irParaMain()
		}
	
    }
	private fun irParaMain(){
		
		val mainactivity = Intent(this,Mainactivity.class::java)
		startActivity(mainactivity)
	}
}