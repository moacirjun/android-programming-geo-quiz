package com.bignerdranch.android.geoquiz

import androidx.lifecycle.ViewModel

class QuizViewModel: ViewModel() {

    var currentQuestionIndex = 0
    var isCheater = false

    private val questionBank = listOf(
        Question(R.string.question_australia, true),
        Question(R.string.question_ocean, true),
        Question(R.string.question_mideast, false),
        Question(R.string.question_africa, false),
        Question(R.string.question_americas, true),
        Question(R.string.question_asia, true),
    )

    val currentQuestionAnswer: Boolean
        get() = questionBank[currentQuestionIndex].answer

    val currentQuestionText: Int
        get() = questionBank[currentQuestionIndex].textRestId

    fun moveNext() {
        currentQuestionIndex = (currentQuestionIndex + 1) % questionBank.size
    }
}