package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var arraymonan : ArrayList<MonAn> = ArrayList()
        arraymonan.add(MonAn("Món ăn 1", R.drawable.img1))
        arraymonan.add(MonAn("Món ăn 2", R.drawable.img2))
        arraymonan.add(MonAn("Món ăn 3", R.drawable.img3))
        arraymonan.add(MonAn("Món ăn 4", R.drawable.img4))
        arraymonan.add(MonAn("Món ăn 5", R.drawable.img5))
        arraymonan.add(MonAn("Món ăn 6", R.drawable.img6))

        listview.adapter = CustomAdapter(this@MainActivity, arraymonan)
    }
}