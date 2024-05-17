package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HATS", "hatimage"),
        Category("HOODIE","hoodieimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18","hat01"),
        Product("Devlopoes Hat Black","$20","hat02"),
        Product("Devlopoes Hat White","$18","hat03"),
        Product("Devlopoes Hat Snapback","$22","hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28","hoodie01"),
        Product("Devlopoes Hoodie Red","$32","hoodie02"),
        Product("Devlopoes Gray Hoodie","$28","hoodie03"),
        Product("Devlopoes Black Hoodie","$32","hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18","shirt01"),
        Product("Devlopoes Badge Light Gray","$20","shirt02"),
        Product("Devlopoes Logo Shirt Red","$22","shirt03"),
        Product("Devlopoes Hustle","$22","shirt04"),
        Product("Kickflip Studios","$18","shirt05")
    )

}