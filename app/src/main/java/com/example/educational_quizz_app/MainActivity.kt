package com.example.educational_quizz_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN

        btn_start.setOnClickListener{
            if    (EditText_name.text.toString().isEmpty()){
                Toast.makeText(this, "Παρακαλώ εισάγεται όνομα",Toast.LENGTH_SHORT).show()
            }
            else {
               // val intent = Intent(this, QuestionsActivity::class.java)
                val intent = Intent(this, LessonSelection::class.java)
                intent.putExtra(Constants.USER_NAME,EditText_name.text.toString())
                startActivity(intent)
                finish()
            }
        }



    }
}