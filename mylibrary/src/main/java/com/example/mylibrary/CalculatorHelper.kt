package com.example.mylibrary

object CalculatorHelper {
  interface CalculatorI {
    fun getCalculatorInstance(calculatorListener: CalculatorListener)
  }
    fun initCalculatorListener(param: CalculatorI) {
        param.getCalculatorInstance(CalculatorListener)
    }
  /* this class is exposed to other application, then calculatorInterface is passed as an object */

}