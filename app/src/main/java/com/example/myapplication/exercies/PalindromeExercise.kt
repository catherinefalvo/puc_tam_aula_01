package com.example.myapplication.exercies

class PalindromeExercise {
    fun isPalindrome (word: String): Boolean {
        val reversed = word.reversed()
        return word.equals(reversed, ignoreCase = true)
    }
}