package com.example.educational_quizz_app

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_questions.*

class QuestionsActivity : AppCompatActivity(), View.OnClickListener
{

    private var mCurrentPosition: Int=1
    private var mQuestionList: ArrayList<Questions>? =null
    private var mSelectedOptionPosition: Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        mQuestionList=Constants.getQuestions()

        setQuestion()

        text_optOne.setOnClickListener(this)
        text_optTwo.setOnClickListener(this)
        text_optThree.setOnClickListener(this)
        text_optFour.setOnClickListener(this)
        submit_btn.setOnClickListener(this)
    }
    private fun setQuestion()
    {

        val question = mQuestionList!![mCurrentPosition-1]
        defaultOptionsView()

        if(mCurrentPosition == mQuestionList!!.size)
        {
            submit_btn.text = "ΤΕΛΟΣ"
        }
        else
        {
            submit_btn.text = "ΥΠΟΒΟΛΗ"
        }

        progress_bar.progress = mCurrentPosition
        textview_progress.text= "$mCurrentPosition" + "/" + progress_bar.max

        textview_question.text=question!!.questions
        text_optOne.text=question.optionOne
        text_optTwo.text=question.optionTwo
        text_optThree.text=question.optionThree
        text_optFour.text=question.optionFour

    }
    private fun defaultOptionsView()
    {
        val options= ArrayList<TextView>()
        options.add(index = 0, text_optOne)
        options.add(index = 1,text_optTwo)
        options.add(index = 2,text_optThree)
        options.add(index = 3,text_optFour)

        for (option in options)
        {
         option.setTextColor(Color.parseColor("#7A8089"))
         option.typeface= Typeface.DEFAULT
         option.background=ContextCompat.getDrawable(this,R.drawable.default_background_border)
        }
    }

    override fun onClick(v: View?)
    {
        when(v?.id)
        {
        R.id.text_optOne ->{selectedOptionView(text_optOne,1)}
        R.id.text_optTwo ->{selectedOptionView(text_optTwo,1)}
        R.id.text_optThree ->{selectedOptionView(text_optThree,1)}
        R.id.text_optFour ->{selectedOptionView(text_optFour,1)}
        R.id.submit_btn ->
        {
            if(mSelectedOptionPosition == 0)
            {
                mCurrentPosition++


                    when
                    {
                        mCurrentPosition <= mQuestionList!!.size ->
                        {
                            setQuestion()
                        }
                        else ->
                        {
                            Toast.makeText(this,"Τέλος Quiz",Toast.LENGTH_SHORT).show()
                        }
                    }

            }
             else
             {
                 val questions = mQuestionList?.get(mCurrentPosition -1)
                 if(questions!!.correctAnswer != mSelectedOptionPosition)
                 {
                     answerView(mSelectedOptionPosition, R.drawable.wrong_background_border)
                 }
                 answerView(questions.correctAnswer, R.drawable.correct_background_border)

                 if(mCurrentPosition== mQuestionList!!.size)
                 {
                     submit_btn.text= "ΤΕΛΟΣ"
                 }
                 else
                 {
                     submit_btn.text= "ΕΠΟΜΕΝΗ ΕΡΩΤΗΣΗ"
                 }
                 mSelectedOptionPosition = 0
                 }
             }

        }
    }

    private fun answerView (answer: Int, drawableView: Int)
    {
        when(answer)
        {
            1 ->
            {
                text_optOne.background = ContextCompat.getDrawable(this,drawableView)
            }
            2 ->
            {
                text_optTwo.background = ContextCompat.getDrawable(this,drawableView)
            }
            3 ->
            {
                text_optThree.background = ContextCompat.getDrawable(this,drawableView)
            }
            4 ->
            {
                text_optFour.background = ContextCompat.getDrawable(this,drawableView)
            }
        }
    }



    private fun selectedOptionView(textView: TextView, selectedOptionNum: Int)
    {
        defaultOptionsView()
        mSelectedOptionPosition=selectedOptionNum

        textView.setTextColor(Color.parseColor("#363A43"))
        textView.typeface= Typeface.DEFAULT
        textView.background=ContextCompat.getDrawable(this,R.drawable.highlighted_background_border)

    }
}