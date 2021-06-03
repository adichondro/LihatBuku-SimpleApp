package com.example.lihatbuku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class DetailActivity : AppCompatActivity(), View.OnClickListener{
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_YEAR = "extra_year"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_AUTHOR = "extra_author"
        const val EXTRA_PENERBIT = "extra_penerbit"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvDataReceivedName: TextView = findViewById(R.id.tv_data_received_nama)
        val tvDataReceivedYear: TextView = findViewById(R.id.tv_data_received_year)
        val tvDataReceivedDetail: TextView = findViewById(R.id.tv_data_received_keterangan)
        val tvDataReceivedImage: ImageView = findViewById(R.id.tv_data_received_img)
        val tvDataReceivedAuthor: TextView = findViewById(R.id.tv_data_received_author)
        val tvDataReceivedPenerbit: TextView = findViewById(R.id.tv_data_received_penerbit)

        val name = intent.getStringExtra(EXTRA_NAME)
        val year = intent.getStringExtra(EXTRA_YEAR)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val author = intent.getStringExtra(EXTRA_AUTHOR)
        val penerbit = intent.getStringExtra(EXTRA_PENERBIT)

        tvDataReceivedName.text = name
//        Bar Detail
        val actionbar = supportActionBar
        actionbar!!.title = "Detail Buku"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val bundle = intent.extras
        if (bundle != null) {
            val images = bundle.getInt(EXTRA_IMAGE)
            tvDataReceivedImage.setImageResource(images)
        }
        tvDataReceivedYear.text = year
        tvDataReceivedDetail.text = detail
        tvDataReceivedAuthor.text = author
        tvDataReceivedPenerbit.text = penerbit

        val btnShareDetail: Button = findViewById(R.id.btn_share_detail)
        btnShareDetail.setOnClickListener(this)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_detail, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_favorite -> {
                if (item.title.equals("OFF Favorite")) {
                    item.title = "Favorite"
                    item.setIcon(R.drawable.ic_baseline_favorite_24)
                    Toast.makeText(this, "Kamu menyukai buku ini", Toast.LENGTH_SHORT).show()
                } else{
                    item.title = "OFF Favorite"
                    item.setIcon(R.drawable.ic_baseline_favorite_border_24)
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onClick(v: View?) {
//        TODO("Not yet implemented")
        when (v?.id) {
            R.id.btn_share_detail -> {
                val pesanIntent: Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, intent.getStringExtra(EXTRA_DETAIL))
                    type = "text/plain"
                }
                val kirimIntent = Intent.createChooser(pesanIntent, intent.getStringExtra(EXTRA_NAME))
                startActivity(kirimIntent)
            }
        }
    }

}