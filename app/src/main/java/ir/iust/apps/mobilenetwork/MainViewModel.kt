package ir.iust.apps.mobilenetwork

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val mainRepository: MainRepository = MainRepository.instance

    var pageState: MutableLiveData<Pages> = mainRepository.pageState

}