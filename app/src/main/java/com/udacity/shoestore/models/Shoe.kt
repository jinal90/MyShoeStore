package com.udacity.shoestore.models

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

data class Shoe(
    @Bindable var name: String = "",
    @Bindable var size: String = "",
    @Bindable var company: String = "",
    @Bindable var description: String = ""
) :
    BaseObservable()