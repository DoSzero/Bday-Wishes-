package com.daywi.bdaywishes

import android.R.attr.label
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.daywi.bdaywishes.ConstantsForInfo.INFO_ID_EXTRA
import com.daywi.bdaywishes.ConstantsForInfo.infoList
import com.daywi.bdaywishes.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val infoID = intent.getIntExtra(INFO_ID_EXTRA, -1)
        val info = infoFromID(infoID)

        if(info != null) {
            binding.cover.setImageResource(info.cover)
            binding.title.text = info.title
            binding.description.text = info.description
            binding.author.text = info.subTitle
        }

        binding.btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnCopyText.setOnClickListener {
            val clipboardManager = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
            val clipData = ClipData.newPlainText("TextView", binding.description.text.toString())
            clipboardManager.setPrimaryClip(clipData)

            Toast.makeText(this,"Вы скопировали поздравление",Toast.LENGTH_SHORT).show()
        }
    }

    private fun infoFromID(infoID: Int): Info? {
        for(info in infoList) {
            if(info.id == infoID)
                return info
        }
        return null
    }

    private fun setClipboard(context: Context, text: String) {
//        val clipboard = context.getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
//        val clip = ClipData.newPlainText("TextView", binding.description.toString())
//        clipboard.setPrimaryClip(clip)
//
//        Toast.makeText(this,"Вы скопировали поздравление",Toast.LENGTH_LONG).show()
    }

}