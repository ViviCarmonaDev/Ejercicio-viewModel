package com.vivicarmonadev.primerviewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CounterViewModel : ViewModel() {

    // Estado interno mutable (privado)
    private val _counter = MutableStateFlow(0)

    // Estado expuesto de solo lectura para la UI
    val counter: StateFlow<Int> = _counter.asStateFlow()

    // Acción que la UI puede invocar
    fun increment() {
        _counter.value++
    }
}