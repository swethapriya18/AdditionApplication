package com.example.mylibrary

object CalculatorListener {
    fun addition(a: Int, b: Int): Int {
      return  CalculatorController.add(a, b)
    }
}