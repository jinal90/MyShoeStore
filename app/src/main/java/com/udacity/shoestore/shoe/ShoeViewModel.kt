package com.udacity.shoestore.shoe

import android.widget.Button
import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe
import java.util.ArrayList

/**
 * @author Jinal Tandel
 * @since 04/12/2021
 */
class ShoeViewModel :ViewModel() {

    private val _shoeList = MutableLiveData<ArrayList<Shoe?>>()
    val shoeList: LiveData<ArrayList<Shoe?>>
        get() = _shoeList
    val newShoe = MutableLiveData<Shoe>()

    init {
        _shoeList.value = ArrayList<Shoe?>()
        newShoe.value = Shoe()
    }

    /**
     * method to add new shoe to the list
     */
    fun addShoe(){
        _shoeList.value?.add(newShoe.value)
        newShoe.value = Shoe()
    }
}