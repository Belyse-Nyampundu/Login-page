package com.nbelyse.assessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nbelyse.assessment.databinding.ActivitySignUpBinding
import android.widget.Toast
import android.content.Intent
import android.text.TextWatcher
import android.text.Editable

class SignUp : AppCompatActivity() {
    lateinit var binding:ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding. btnSignUp2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        clearErrorOnType()
    }


        override fun onResume() {
            super.onResume()

            binding.  btnSignUp2.setOnClickListener {
               validateSignUp() }



        }

        fun clearErrorOnType(){
            binding.etUsername2.addTextChangedListener ( object :TextWatcher{
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    binding.tilPhonenumber2.error = null
                }

                override fun afterTextChanged(s: Editable?) {

                }
            } )
            binding.etPhonenumber2.addTextChangedListener ( object :TextWatcher{
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    binding.tilPhonenumber2.error = null
                }

                override fun afterTextChanged(s: Editable?) {

                }
            } )
            binding.etEmail2.addTextChangedListener ( object :TextWatcher{
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    binding.tilEmail2.error = null
                }

                override fun afterTextChanged(s: Editable?) {

                }
            } )
            binding.etPassword.addTextChangedListener ( object :TextWatcher{
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    binding.tilPassword2.error = null
                }

                override fun afterTextChanged(s: Editable?) {

                }
            } )

        }


        fun validateSignUp(){
            val name =binding. etUsername2.text.toString()
            val phoneNumber = binding.etPhonenumber2.text.toString()
            val email =binding. etEmail2.text.toString()
            val password =binding. etPassword.text.toString()
            var error = false
            if (name.isBlank()){
                binding. tilUsername2.error = "First name is required"
                error = true
            }

            if (phoneNumber.isBlank()){
                binding.    tilPhonenumber2.error = "Last name is required"
                error = true
            }

            if (email.isBlank()){
                binding.     tilEmail2.error = "Email is required"
                error = true
            }

            if (password.isBlank()){
                binding.    tilPassword2.error = "Password is required"
                error = true
            }

            if (!error){
                Toast.makeText(this,"$name $phoneNumber $email $password",Toast.LENGTH_LONG).show()
            }

        }

    }
