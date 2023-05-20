package com.ssafy.foodfind.ui.map

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ssafy.foodfind.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
    }
}