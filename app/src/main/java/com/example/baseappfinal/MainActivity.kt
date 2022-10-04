package com.example.baseappfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.baseappfinal.databinding.ActivityMainBinding
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()
		
		val configbt = findViewById<Image>(R.id.config)
		
		config.setOnClickListener{
			irParaConfig()
		}
		
		val addButton = finViewById<Button>(R.id.addButton)
		
		addButton.setOnClickListener{
			irParaAddItem()
		}

        initRecyclerView()
    }
	
	private fun irParaConfig(){
		
		val config = Intent(this,config::class.java)
		startAcyivity(config)
	}
	
	private fun irParaAddItem(){
		
		val additem = Intent(this,additem::class.java)
		startActivity(additem)
	}
	
    private fun initRecyclerView() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = Adapter(getList())
    }
    private fun getList() = listOf(
        "Email: random@gmail.com*****senha:random007",
        "Email: sla@gmail.com*****senha:sla007",
        "Email: luizdesouza@gmail.com*****senha:123456",
        "Email: gilberto0702@gmail.com*****senha:40028922",
        "Email: senhor.omar@gmail.com*****senha:ndbdjmjs",
		"Email: aytonsena92@gmail.com*****senha:grandprix92")