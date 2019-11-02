package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()
    }

    private fun setListener() {
        val clickableView: List<View> = listOf(id_textbox_one, id_textbox_two, id_textbox_three,
                                                id_textbox_four, id_textbox_five, id_constrain_layout)

        for (item in clickableView) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view : View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.id_textbox_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.id_textbox_two -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.id_textbox_three -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.id_textbox_four -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.id_textbox_five -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
