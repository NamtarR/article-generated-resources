package com.namtarr.generatedresources

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.net.toUri
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<MaterialButton>(R.id.action_button).setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
                .setData(getString(R.string.resource_generator_url).toUri())
            startActivity(intent)
        }
    }
}