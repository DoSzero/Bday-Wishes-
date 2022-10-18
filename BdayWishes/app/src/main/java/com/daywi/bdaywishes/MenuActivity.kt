package com.daywi.bdaywishes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.daywi.bdaywishes.ConstantsForInfo.MEN_ID
import com.daywi.bdaywishes.ConstantsForInfo.WOMEN_ID
import com.daywi.bdaywishes.databinding.ActivityMenuBinding
import kotlin.random.Random

class MenuActivity: AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding
    private val btnMen by lazy { binding.btnMen }
    private val btnWoman by lazy { binding.btnWoman }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (supportActionBar != null) {
            this.supportActionBar?.hide()
        }

        btnMen.setOnClickListener {
            val intent = Intent(this, TypeActivity::class.java)
            intent.putExtra("GVM-mode", 1)
            startActivity(intent)
        }

        btnWoman.setOnClickListener {
            val intent = Intent(this, TypeActivity::class.java)
            intent.putExtra("GVM-mode", 2)
            startActivity(intent)
        }

    }
}