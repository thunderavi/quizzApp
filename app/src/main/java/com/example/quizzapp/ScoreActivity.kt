package com.example.quizzapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.quizzapp.databinding.ActivityQuizBinding
import com.example.quizzapp.databinding.ActivityScoreBinding

class ScoreActivity : AppCompatActivity() {
    private lateinit var binding: ActivityScoreBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)
      binding.score.setText("Congrats !!! your Score is ${intent.getIntExtra("SCORE",0)}")
    }
}