package com.example.kathmandu.model

sealed class CityPlaces(
    open val name : String,
    open val description : String,
){
    data class Category(
        override val name: String,
        override val description: String,
    ) : CityPlaces(name, description)
    data class Building(
        override val name:String,
        override val description: String
    ) : CityPlaces(name, description)
}