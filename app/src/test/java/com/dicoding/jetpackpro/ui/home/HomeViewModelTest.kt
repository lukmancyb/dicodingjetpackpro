package com.dicoding.jetpackpro.ui.home

import com.dicoding.jetpackpro.ui.main.MainViewModel
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class HomeViewModelTest {

    private lateinit var viewModel : HomeViewModel

    @Before
    fun before(){
        viewModel = HomeViewModel()
    }

    @Test
    fun calculate() {

        val w = "1"
        val h = "2"
        val l = "3"

        viewModel.calculate(w, h, l)
        assertEquals(6,viewModel.result)
    }
}