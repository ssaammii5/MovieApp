package com.example.movieapp.models

data class Data(
    val country : String,
    val generes : List<String>,
    val id : Int,
    val images : List<String>,
    val imdb_rating : String,
    val poster : String,
    val title : String,
    val year : String
)