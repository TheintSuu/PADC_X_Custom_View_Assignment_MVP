package com.example.padc_x_custom_view_assignment.mvp.presenter

import androidx.lifecycle.LifecycleOwner
import com.example.padc_x_custom_view_assignment.delegate.ProfileItemDelegate
import com.example.padc_x_custom_view_assignment.delegate.TaskItemDelegate
import com.example.padc_x_custom_view_assignment.mvp.views.MainView

interface ProfilePresenter : TaskItemDelegate, ProfileItemDelegate, BasePresenter<MainView> {
    fun onSwipeRefresh(lifecycleOwner: LifecycleOwner)

    fun onUiReady(lifeCycleOwner: LifecycleOwner)

}