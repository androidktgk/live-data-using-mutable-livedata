package com.govind8061.simplesimple

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private var factLiveDataObject=MutableLiveData<String>("This is a fact")
    val factLiveData:LiveData<String>
    get()=factLiveDataObject
    fun updateFact(){
        factLiveDataObject.value="Another Fact"
    }
}