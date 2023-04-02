package com.geektech.lovecalculatormvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.geektech.lovecalculatormvvm.remote.LoveModel
import com.geektech.lovecalculatormvvm.repository.Repository


class LoveViewModel : ViewModel() {

    private val repository = Repository()

    fun getLiveLoveModel(firstName: String, secondName: String): LiveData<LoveModel>{
        return repository.getPercentage(firstName, secondName)
    }
}
