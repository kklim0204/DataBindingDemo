package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private var aPerson : Person = Person("ali","1234","ali@email.com", "123")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.personData = aPerson

        binding.buttonUpdate.setOnClickListener(){
            aPerson.email = "abc@email.com"

            binding.apply { invalidateAll() }
        }

        /*
        binding.textView1.text = aPerson.name
        binding.textView2.text = aPerson.ic
        binding.textView3.text = aPerson.email
        binding.textView4.text = aPerson.address

        // val tv: View = findViewById<TextView>(R.id.)

         */
    }
}