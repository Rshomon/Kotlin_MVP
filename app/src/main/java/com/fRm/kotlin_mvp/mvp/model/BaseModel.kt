package com.fRm.kotlin_mvp.mvp.model

/**
 * Created by Administrator on 2020-10-01.
 */
data class BaseModel<T>(val code: Int, val message: String, val data: T)