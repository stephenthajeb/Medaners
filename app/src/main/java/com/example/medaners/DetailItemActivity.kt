package com.example.medaners

import android.R.attr.label
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class DetailItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_detail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val name = intent.getStringExtra("foodName") ?: "Not Found"
        val detail = intent.getStringExtra("foodDetail") ?: "Not Found"
        val photoIdx = intent.getIntExtra("foodPhoto", 0)
        Log.d("DetailItemActivity", "DetailActivity started")

        setFoodItem(name, detail, photoIdx)

        //Sharebtn listener
        val shareBtn = findViewById<Button>(R.id.btn_share)
        shareBtn.setOnClickListener {
            Toast.makeText(this, "Copied to clipboard. Paste ke teman kamu", Toast.LENGTH_SHORT).show()
            val clipboard: ClipboardManager =
                getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText(
                "shareMakanan",
                "Stephen share menu makanan " + name + " ke kamu"
            )
//            Log.d("clipboard clicked",clip.description.toString());
            clipboard.setPrimaryClip(clip)
        }
    }


    private fun setFoodItem(name: String, detail: String, photoIdx: Int) {
        val tvName: TextView = findViewById(R.id.tv_item_detail_name)
        val tvDetail: TextView = findViewById(R.id.tv_item_detail_detail)
        val image: ImageView = findViewById(R.id.img_item_detail_photo)
        tvName.text = name
        tvDetail.text = detail

        Glide.with(this)
            .load(photoIdx)
            .into(image)
    }
}