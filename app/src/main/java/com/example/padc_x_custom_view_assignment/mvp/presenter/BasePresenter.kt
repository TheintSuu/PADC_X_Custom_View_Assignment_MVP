package com.example.padc_x_custom_view_assignment.mvp.presenter

import com.example.padc_x_custom_view_assignment.mvp.views.BaseView

interface BasePresenter< T : BaseView> {

    fun initPresenter(view: T)

}