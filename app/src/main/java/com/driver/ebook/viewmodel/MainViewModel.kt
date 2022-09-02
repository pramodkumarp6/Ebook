package com.driver.ebook.viewmodel

import androidx.lifecycle.ViewModel
import com.driver.ebook.repository.MainRepository
import javax.inject.Inject

class MainViewModel@Inject constructor(private val mainRepository: MainRepository): ViewModel() {
}