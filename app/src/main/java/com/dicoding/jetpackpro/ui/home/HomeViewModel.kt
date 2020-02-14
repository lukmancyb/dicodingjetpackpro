package com.dicoding.jetpackpro.ui.home

import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    var result = 0

    fun calculate(w : String, h : String, l : String){

        result = w.toInt() * h.toInt() * l.toInt()

    }
}