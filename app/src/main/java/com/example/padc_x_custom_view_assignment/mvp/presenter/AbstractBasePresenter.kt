package com.example.padc_x_custom_view_assignment.mvp.presenter

import androidx.lifecycle.ViewModel
import com.example.padc_x_custom_view_assignment.mvp.views.BaseView

abstract class AbstractBasePresenter<T : BaseView> : BasePresenter<T>, ViewModel() {
    var mView: T? = null

    override fun initPresenter(view: T) {
        mView = view
    }
}