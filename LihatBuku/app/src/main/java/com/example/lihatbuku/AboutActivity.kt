package com.example.lihatbuku

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class AboutActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val actionbar = supportActionBar
        actionbar!!.title = "About"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val btnContact: Button = findViewById(R.id.btn_contact)
        btnContact.setOnClickListener(this)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    override fun onClick(v: View?) {
//        TODO("Not yet implemented")
        when (v?.id) {
            R.id.btn_contact -> {
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/adichondro/"))
                startActivity(i)
            }
        }
    }
}