package com.example.educational_quizz_app

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_lesson_selection.*
import kotlinx.android.synthetic.main.activity_questions.*

class LessonSelection : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_selection)

        tv_metaglotistes.setOnClickListener(this)


        }

    private fun selectedOptionView(textView: TextView)
    {
        textView.setTextColor(Color.parseColor("#363A43"))
        textView.setTypeface(textView.typeface, Typeface.BOLD)
        textView.background= ContextCompat.getDrawable(this,R.drawable.highlighted_background_border)

    }

    override fun onClick(v: View?) {
        selectedOptionView(tv_metaglotistes)
            tv_metaglotistes.setTextColor(Color.parseColor("#7A8089"))
        tv_metaglotistes.typeface= Typeface.DEFAULT
        tv_metaglotistes.background=ContextCompat.getDrawable(
            this,
            R.drawable.default_background_border)
        val intent = Intent(this, QuestionsActivity::class.java)
        startActivity(intent)
    }
}


