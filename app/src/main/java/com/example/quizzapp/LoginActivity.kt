package com.example.quizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizzapp.databinding.ActivityLoginBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.button.setOnClickListener{
            Firebase.auth.createUserWithEmailAndPassword(binding.email.editText?.text.toString(),
            binding.password.editText?.text.toString()).addOnCompleteListener{
                if(it.isSuccessful){
                    Toast.makeText(this, "User Created !!!", Toast.LENGTH_LONG).show()
                    val intent= Intent(this,QuizActivity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this, "User Not Created !!!", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}