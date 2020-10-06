package com.fRm.kotlin_mvp.mvp.view

/**
 * Created by Administrator on 2020-10-01.
 */
interface BaseView {
    fun <T> setData(data: T)
    fun setError(err: String)
}