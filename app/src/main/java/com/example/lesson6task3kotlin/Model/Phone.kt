package com.example.lesson6task3kotlin.Model

class Phone(var lastName: String = "", s: Int) {

    override fun toString():String{return lastName}
    fun getLastname(): String {
        return lastName
    }
}