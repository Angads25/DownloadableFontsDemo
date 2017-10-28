package com.github.angads25.downloadablefonts

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.AppCompatButton
import android.view.View

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val xml = findViewById<AppCompatButton>(R.id.action_xml)
        xml.setOnClickListener(this)

        val java = findViewById<AppCompatButton>(R.id.action_java)
        java.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.action_xml -> {
                startActivity(Intent(this, XmlFontActivity::class.java))
            }
            R.id.action_java -> {
                startActivity(Intent(this, JavaFontActivity::class.java))
            }
        }
    }
}
