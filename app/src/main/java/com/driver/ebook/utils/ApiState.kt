package com.driver.ebook.utils

import com.driver.ebook.model.User

sealed class ApiState{
    class Success(val data:User):ApiState()
    class Failure(val msg:Throwable):ApiState()
    object Loading :ApiState()
    object Empty: ApiState()
}
