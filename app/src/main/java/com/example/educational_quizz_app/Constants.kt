package com.example.educational_quizz_app

object Constants{
    fun getQuestions(): ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            id = 1 ,
            questions = "Ερώτηση του εκάστοτε μαθήματος",
            optionOne= "Apantisi 1",
            optionTwo= "Apantisi 2",
            optionThree= "Apantisi 3",
            optionFour ="Apantisi 4",
            correctAnswer = 2
        )
        questionsList.add(q1)
        return questionsList
    }
}



