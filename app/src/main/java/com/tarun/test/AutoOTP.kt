package com.tarun.test

import androidx.annotation.Keep

@Keep
object AutoOTP {
    fun startAutoOTP(age: Int): String {
        return "You are old man, your age is $age"
    }
}