package com.example.bodyboost

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bodyboost.databinding.ActivityDetailedBinding

class DetailedActivity : AppCompatActivity() {
    var binding: ActivityDetailedBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailedBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        val intent = this.intent
        if (intent != null) {
            val name = intent.getStringExtra("name")
            val calories = intent.getStringExtra("calories")
            val image = intent.getIntExtra("image", R.drawable.tea_cup)
            binding!!.detailName.text = name
            binding!!.detailTime.text = calories
            binding!!.detailImage.setImageResource(image)
        }
    }
}