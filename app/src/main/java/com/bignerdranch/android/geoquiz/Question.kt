package com.bignerdranch.android.geoquiz

import androidx.annotation.StringRes

data class Question(@StringRes val textRestId: Int, val answer: Boolean)