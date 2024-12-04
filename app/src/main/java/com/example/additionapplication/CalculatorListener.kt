package com.example.additionapplication

import CalculatorController

object CalculatorListener {
    fun addition(a: Int, b: Int): Int {
      return  CalculatorController.add(a, b)
    }
}