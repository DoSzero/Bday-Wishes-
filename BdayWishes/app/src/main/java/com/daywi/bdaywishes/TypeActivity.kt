package com.daywi.bdaywishes

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.daywi.bdaywishes.databinding.ActivityMenuBinding
import com.daywi.bdaywishes.databinding.ActivityTypeBinding

class TypeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTypeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTypeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gvmMode1 = intent.putExtra("GVM-mode", 1)
        val gvmMode2 = intent.putExtra("GVM-mode", 2)

        binding.btnFormal.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("GVM-type", 1)
            intent.putExtra("GVM-mode",gvmMode1)
            startActivity(intent)
        }

        binding.btnInformal.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("GVM-type", 2)
            intent.putExtra("GVM-mode",gvmMode2)
            startActivity(intent)
        }
    }
}