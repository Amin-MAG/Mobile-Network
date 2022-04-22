package ir.iust.apps.mobilenetwork

import androidx.lifecycle.MutableLiveData

class MainRepository {

    var pageState: MutableLiveData<Pages> = MutableLiveData(Pages.LOGIN)

    companion object {
        val instance = MainRepository()
    }
}