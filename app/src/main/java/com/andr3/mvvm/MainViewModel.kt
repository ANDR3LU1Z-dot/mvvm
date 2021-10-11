package com.andr3.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel(){

    private var mRepository = PersonRepository()

    private var mTextWelcome = MutableLiveData<String>()//MUTABLELIVEDATA: é um dado mutável e passivel de ser escutado, pertmite que a main activity o escute
    var textWelcome = mTextWelcome

    private var mLogin = MutableLiveData<Boolean>()
    var login = mLogin

    init {   //inicializar a variavel com "x" valor
        mTextWelcome.value = "Hello World"
    }

    fun login(login: String){
        val ret = mRepository.login(login)
        mLogin.value = ret
    }

}