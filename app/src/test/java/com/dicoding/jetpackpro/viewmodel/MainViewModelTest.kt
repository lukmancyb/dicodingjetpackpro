package com.dicoding.jetpackpro.viewmodel

import com.dicoding.jetpackpro.model.CuboiModel
import com.dicoding.jetpackpro.ui.main.MainViewModel
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.mockito.Mockito.*

class MainViewModelTest {

    private lateinit var viewModel: MainViewModel
    private lateinit var cuboiModel: CuboiModel

    private val dummyLength = 12.0
    private val dummyWidth = 7.0
    private val dummyHeight = 6.0

    private val dummyVolume = 504.0
    private val dummyCircumference = 100.0
    private val dummySurfaceArea = 396.0

    @Before
    fun before(){
        cuboiModel = mock(CuboiModel::class.java)
        viewModel = MainViewModel(cuboiModel)
    }

    @Test
    fun testVolume(){
        cuboiModel = CuboiModel()
        viewModel = MainViewModel(cuboiModel)
        viewModel.save(dummyWidth, dummyLength, dummyHeight)
        val volume = viewModel.getVolume()

        assertEquals(dummyVolume, volume!!, 0.0001)
    }

    @Test
    fun testCircumference() {
        cuboiModel = CuboiModel()
        viewModel = MainViewModel(cuboiModel)
        viewModel.save(dummyWidth, dummyLength, dummyHeight)
        val volume = viewModel.getCircumefrenece()
        assertEquals(dummyCircumference, volume, 0.0001)
    }
    @Test
    fun tesSurfaceArea() {
        cuboiModel = CuboiModel()
        viewModel = MainViewModel(cuboiModel)
        viewModel.save(dummyWidth, dummyLength, dummyHeight)
        val volume = viewModel.getSurfaceArea()
        assertEquals(dummySurfaceArea, volume!!, 0.0001)
    }

    @Test
    fun testMockVolume(){
        `when`(viewModel.getVolume()).thenReturn(dummyVolume)
        val volume = viewModel.getVolume()
        verify(cuboiModel).getVolume()
        assertEquals(dummyVolume, volume!!, 0.0001)
    }

    @Test
    fun testMockCircumference() {
        `when`(viewModel.getCircumefrenece()).thenReturn(dummyCircumference)
        val circumference = viewModel.getCircumefrenece()
        verify(cuboiModel).getCircumference()
        assertEquals(dummyCircumference, circumference, 0.0001)
    }
    @Test
    fun testMockSurfaceArea() {
        `when`(viewModel.getSurfaceArea()).thenReturn(dummySurfaceArea)
        val surfaceArea = viewModel.getSurfaceArea()!!
        verify(cuboiModel).getSurfaceArea()
        assertEquals(dummySurfaceArea, surfaceArea, 0.0001)
    }


    @Test
    fun getCircumefrenece() {
    }

    @Test
    fun getSurfaceArea() {
    }

    @Test
    fun getVolume() {
    }

    @Test
    fun save() {
    }
}