package com.fRm.kotlin_mvp.ui.main.act

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.fRm.kotlin_mvp.R
import com.fRm.kotlin_mvp.base.BaseActivity
import com.fRm.kotlin_mvp.ui.main.presenter.MainPresenter
import com.fRm.kotlin_mvp.ui.main.view.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<MainView, MainPresenter>(), MainView {

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun init() {
        tv01.setOnClickListener {
            getPresenter()!!.getTest("test")
        }
    }

    override fun initData() {
    }

    override fun createPresenter() = MainPresenter()

    override fun <T> setData(data: T) {
        Log.d("test", "=================>$data")
    }

    override fun setError(err: String) {
    }
}