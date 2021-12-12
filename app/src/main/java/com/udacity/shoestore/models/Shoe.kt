package com.udacity.shoestore.models

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

data class Shoe(
    @Bindable var name: String = "",
    @Bindable var size: String = "",
    @Bindable var company: String = "",
    @Bindable var description: String = ""
) : BaseObservable(){
    val shoeName: String
        get() = "Name: $name"

    val shoeSize: String
        get() = "Size: $size"

    val shoeCompany: String
        get() = "Company: $company"

    val shoeDescription: String
        get() = "Description: $description"
}