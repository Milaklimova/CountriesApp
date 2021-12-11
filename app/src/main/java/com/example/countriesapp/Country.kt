package com.example.countriesapp

import android.text.Editable

data class Country (
    val name: String,
    val capital: String,
    val population: Long,
    val area: Long,
    val languages: List<Languages>,
    val flag: String
     )
data class Languages(
    val name: String
)