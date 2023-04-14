package com.geektech.lovecalculators.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.geektech.lovecalculators.remote.LoveModel
import com.geektech.lovecalculators.repository.Repository


class LoveViewModel : ViewModel() {

    private val repository = Repository()

    fun getLiveLoveModel(firstName: String, secondName: String): LiveData<LoveModel>{
        return repository.getPercentage(firstName, secondName)
    }
}
