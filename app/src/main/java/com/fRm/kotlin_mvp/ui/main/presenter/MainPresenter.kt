package com.fRm.kotlin_mvp.ui.main.presenter

import com.fRm.kotlin_mvp.mvp.presenter.BasePresenter
import com.fRm.kotlin_mvp.mvp.view.BaseView
import com.fRm.kotlin_mvp.ui.main.view.MainView

/**
 * Created by Administrator on 2020-10-01.
 */
class MainPresenter : BasePresenter<MainView>() {
    fun getTest(str: String) {
        getBaseView()!!.setData(str)

    }
}