package com.fRm.kotlin_mvp.mvp.presenter

/**
 * Created by Administrator on 2020-10-01.
 */
open class BasePresenter<V> {
    private var mBaseView: V? = null
    fun bindView(mBaseView: V) {
        this.mBaseView = mBaseView
    }

    fun unBindView() {
        this.mBaseView = null
    }

    fun getBaseView() = mBaseView
}