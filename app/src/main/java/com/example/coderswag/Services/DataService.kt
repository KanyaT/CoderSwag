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
        Product("Devslopes Graphic Beanie", "$18","hat1"),
        Product("Devlopoes Hat Black","$20","hat2"),
        Product("Devlopoes Hat White","$18","hat3"),
        Product("Devlopoes Hat Snapback","$22","hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28","hoodie1"),
        Product("Devlopoes Hoodie Red","$32","hoodie2"),
        Product("Devlopoes Gray Hoodie","$28","hoodie3"),
        Product("Devlopoes Black Hoodie","$32","hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18","shirt1"),
        Product("Devlopoes Badge Light Gray","$20","shirt2"),
        Product("Devlopoes Logo Shirt Red","$22","shirt3"),
        Product("Devlopoes Hustle","$22","shirt4"),
        Product("Kickflip Studios","$18","shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        return when(category){
            "SHIRTS" -> return shirts
            "HATS" -> return hats
            "HOODIES" -> return hoodies
            else -> return digitalGood
        }
    }

}