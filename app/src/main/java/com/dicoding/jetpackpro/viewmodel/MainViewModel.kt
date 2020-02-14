package com.dicoding.jetpackpro.viewmodel

import com.dicoding.jetpackpro.model.CuboiModel

class MainViewModel(private val cuboiModel: CuboiModel) {

    fun getCircumefrenece() = cuboiModel.getCircumference()

    fun getSurfaceArea() = cuboiModel.getSurfaceArea()

    fun getVolume() = cuboiModel.getVolume()

    fun save(l : Double, w : Double, h : Double){
        cuboiModel.save(length = l, width = w, height = h)
    }
}