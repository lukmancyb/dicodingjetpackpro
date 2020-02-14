package com.dicoding.jetpackpro.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.dicoding.jetpackpro.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private lateinit var viewModel : HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        viewModel = ViewModelProvider(this)[HomeViewModel::class.java]

        displayResult()

        btn_calculate.setOnClickListener {
            val width = edt_width.text.toString()
            val height = edt_height.text.toString()
            val length = edt_length.text.toString()
            when {
                width.isEmpty() -> {
                    edt_width.error = "Masih kosong"
                }
                height.isEmpty() -> {
                    edt_height.error = "Masih kosong"
                }
                length.isEmpty() -> {
                    edt_length.error = "Masih kosong"
                }
                else -> {
                    viewModel.calculate(width, height, length)
                    displayResult()
                }
            }
        }
    }

    private fun displayResult() {
        tv_result.text = viewModel.result.toString()
    }
}
