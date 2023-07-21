package com.example.practical3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()
    }

    private fun makeColored(view: View){
        when(view.id){
            R.id.box_one_text->view.setBackgroundColor(Color.GREEN)
            R.id.box_two_text->view.setBackgroundColor(Color.BLUE)
            R.id.box_three_text->view.setBackgroundColor(Color.RED)
            R.id.box_four_text->view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text->view.setBackgroundColor(Color.CYAN)
            else->view.setBackgroundColor(Color.DKGRAY)
        }
    }

    private fun setListener(){
        val boxOneText=findViewById<TextView>(R.id.box_one_text)
        val boxTwoText=findViewById<TextView>(R.id.box_two_text)
        val boxThreeText=findViewById<TextView>(R.id.box_three_text)
        val boxFourText=findViewById<TextView>(R.id.box_four_text)
        val boxFiveText=findViewById<TextView>(R.id.box_five_text)

        val rootConstraintLayout=findViewById<View>(R.id.constraint_layout)

        val clickablesViews :List<View> =listOf(boxOneText,boxTwoText,boxThreeText,boxFourText,boxFiveText,rootConstraintLayout)

        for(item in clickablesViews){
            item.setOnClickListener{makeColored(it)}
        }
    }
}