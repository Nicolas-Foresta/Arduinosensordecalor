package com.example.arduinosensordecalor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.arduinosensordecalor.fragments.CollectionAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val collectionAdapter = CollectionAdapter(this)
        val viewPager: ViewPager2 = findViewById(R.id.viewPager2)
        viewPager.adapter = collectionAdapter

    }
}