package com.example.sameera.coderswag.Services

import com.example.sameera.coderswag.Model.Category
import com.example.sameera.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")

    )
    val hats = listOf(
        Product("Devslop Graphic Beanie", "$18", "hat01"),
        Product("Devslop Hat Black", "$20", "hat02"),
        Product("Devslop Hat White", "$18", "hat03"),
        Product("Devslop Snap Back", "$22", "hat04")
    )
    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28", "hoodie01"),
        Product("Devslopes Hoodie Red", "$32", "hoodie02"),
        Product("Devslopes Gray Hoodie", "$28", "hoodie03"),
        Product("Devslopes Blck Hoodie", "$32", "hoodie04")
    )
    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18", "shirt01"),
        Product("Devslopes Badge Light Gray", "$20", "shirt02"),
        Product("Devslopes Logo Shirt Red", "$22", "shirt03"),
        Product("Devslopes Hustel", "$22", "shirt04"),
        Product("Kilckflip Studios", "$18", "shirt05")
    )
}