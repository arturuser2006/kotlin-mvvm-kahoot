package com.example.kotlinmvvm

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    val liveData = MutableLiveData<String>()

    init {
        startTimer()
    }

    private fun startTimer() {
        object: CountDownTimer(20000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                liveData.value = (millisUntilFinished / 1000).toString()
            }

            override fun onFinish() {

            }
        }.start()
    }
}