package com.fRm.kotlin_mvp.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fRm.kotlin_mvp.mvp.presenter.BasePresenter
import com.fRm.kotlin_mvp.mvp.view.BaseView

abstract class BaseActivity<V, P : BasePresenter<V>> : AppCompatActivity(), BaseView {

    private var mPresenter: P? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        if (mPresenter == null) {
            mPresenter = createPresenter() as P
        }
        // 绑定
        mPresenter!!.bindView(this as V)
        init()
        initData()
    }

    protected abstract fun getLayoutId(): Int
    protected abstract fun init()
    protected abstract fun initData()
    protected abstract fun createPresenter(): P

    fun getPresenter() = mPresenter

    // 解绑
    override fun onDestroy() {
        super.onDestroy()
        mPresenter!!.unBindView()
    }
}