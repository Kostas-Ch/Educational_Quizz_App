package com.example.educational_quizz_app

object Constants{
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String= "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

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
        val q2 = Questions(
            id = 2 ,
            questions = "Ερώτηση του εκάστοτε μαθήματος",
            optionOne= "Apantisi 1",
            optionTwo= "Apantisi 2",
            optionThree= "Apantisi 3",
            optionFour ="Apantisi 4",
            correctAnswer = 3
        )
        val q3 = Questions(
            id = 3 ,
            questions = "Ερώτηση του εκάστοτε μαθήματος",
            optionOne= "Apantisi 1",
            optionTwo= "Apantisi 2",
            optionThree= "Apantisi 3",
            optionFour ="Apantisi 4",
            correctAnswer = 3
        )
        val q4 = Questions(
            id = 4 ,
            questions = "Ερώτηση του εκάστοτε μαθήματος",
            optionOne= "Apantisi 1",
            optionTwo= "Apantisi 2",
            optionThree= "Apantisi 3",
            optionFour ="Apantisi 4",
            correctAnswer = 1
        )
        val q5 = Questions(
            id = 5 ,
            questions = "Ερώτηση του εκάστοτε μαθήματος",
            optionOne= "Apantisi 1",
            optionTwo= "Apantisi 2",
            optionThree= "Apantisi 3",
            optionFour ="Apantisi 4",
            correctAnswer = 2
        )
        val q6 = Questions(
            id = 6 ,
            questions = "Ερώτηση του εκάστοτε μαθήματος",
            optionOne= "Apantisi 1",
            optionTwo= "Apantisi 2",
            optionThree= "Apantisi 3",
            optionFour ="Apantisi 4",
            correctAnswer = 4
        )
        val q7 = Questions(
            id = 7 ,
            questions = "Ερώτηση του εκάστοτε μαθήματος",
            optionOne= "Apantisi 1",
            optionTwo= "Apantisi 2",
            optionThree= "Apantisi 3",
            optionFour ="Apantisi 4",
            correctAnswer = 3
        )
        val q8 = Questions(
            id = 8 ,
            questions = "Ερώτηση του εκάστοτε μαθήματος",
            optionOne= "Apantisi 1",
            optionTwo= "Apantisi 2",
            optionThree= "Apantisi 3",
            optionFour ="Apantisi 4",
            correctAnswer = 4
        )
        val q9 = Questions(
            id = 9 ,
            questions = "Ερώτηση του εκάστοτε μαθήματος",
            optionOne= "Apantisi 1",
            optionTwo= "Apantisi 2",
            optionThree= "Apantisi 3",
            optionFour ="Apantisi 4",
            correctAnswer = 1
        )
        val q10 = Questions(
            id = 10 ,
            questions = "Ερώτηση του εκάστοτε μαθήματος",
            optionOne= "Apantisi 1",
            optionTwo= "Apantisi 2",
            optionThree= "Apantisi 3",
            optionFour ="Apantisi 4",
            correctAnswer = 4
        )
        questionsList.add(q1)
        questionsList.add(q2)
        questionsList.add(q3)
        questionsList.add(q4)
        questionsList.add(q5)
        questionsList.add(q6)
        questionsList.add(q7)
        questionsList.add(q8)
        questionsList.add(q9)
        questionsList.add(q10)

        return questionsList
    }
}



