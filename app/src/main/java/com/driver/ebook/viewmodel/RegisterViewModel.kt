package com.driver.ebook.viewmodel

import androidx.lifecycle.ViewModel
import com.driver.ebook.repository.MainRepository
import com.driver.ebook.repository.RegisterRepository
import javax.inject.Inject

class RegisterViewModel@Inject constructor(private val registerRepository: RegisterRepository) :ViewModel() {
}