package com.udacity.shoestore.shoe

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe
import java.util.ArrayList

/**
 * @author Jinal Tandel
 * @since 04/12/2021
 */
class ShoeViewModel():ViewModel() {

    private val _shoeList = MutableLiveData<ArrayList<Shoe>>()
    val shoeList: LiveData<ArrayList<Shoe>>
        get() = _shoeList

    init {
        _shoeList.value = ArrayList<Shoe>()
    }

    /**
     * method to add new shoe to the list
     */
    fun addShoe(name: String, size: Double, company: String, description: String){
        _shoeList.value?.add(Shoe(name, size, company, description))
    }
}