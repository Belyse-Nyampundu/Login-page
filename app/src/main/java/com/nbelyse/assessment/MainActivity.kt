package com.nbelyse.assessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import com.nbelyse.assessment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding. btnSignup.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
            clearErrorOnType()
        }

    }
        override fun onResume() {
            super.onResume()

            binding.  btnSignup.setOnClickListener {
            validateSignUp()
        }
        }

        fun clearErrorOnType(){
            binding.etName.addTextChangedListener ( object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    binding.tilName.error = null
                }

                override fun afterTextChanged(s: Editable?) {

                }
            } )
            binding.etPassword.addTextChangedListener ( object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    binding.tilPassword.error = null
                }

                override fun afterTextChanged(s: Editable?) {

                }
            } )

        }


        fun validateSignUp(){
            val name =binding. etName.text.toString()
            val password = binding.etPassword.text.toString()
            var error = false
            if (name.isBlank()){
                binding. tilName.error = "First name is required"
                error = true
            }

            if (password.isBlank()){
                binding.    tilPassword.error = "Last name is required"
                error = true
            }

            if (!error){
                Toast.makeText(this,"$name,$password", Toast.LENGTH_LONG).show()
            }

        }

    }


