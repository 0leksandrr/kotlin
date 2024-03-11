package com.example.robota

sealed class CalculatorAction {
    data class Number(val value: Int) : CalculatorAction()
    data class Operation(val operation: CalculatorOperation) : CalculatorAction()
    object Decimal : CalculatorAction()
    object Calculate : CalculatorAction()
    object Clear : CalculatorAction()
    object Delete : CalculatorAction()
}
