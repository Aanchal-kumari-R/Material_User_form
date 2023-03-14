package com.example.material_user_form

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.material_user_form.databinding.ActivityDatapageBinding
import com.example.material_user_form.databinding.ActivityMainBinding

class datapage : AppCompatActivity() {
    private lateinit var binding: ActivityDatapageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDatapageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val Fname=intent.getStringExtra("Fname")
        val lastname=intent.getStringExtra("lasname")
        val monu=intent.getStringExtra("monumber")
        val alter=intent.getStringExtra("Alternenu")
        val email=intent.getStringExtra("Email")
        val Gender=intent.getStringExtra("gender")
        val Hobbies=intent.getStringExtra("hobbiese")
        binding.edittext01.text="Name :-$Fname $lastname \nMo.number :-$monu \nAlternet.Number $alter \nEmail :- $email  \n Gender -> $Gender \nHobbies :-$Hobbies"

    }
}

