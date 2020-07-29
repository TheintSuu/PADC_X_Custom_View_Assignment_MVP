package com.example.padc_x_custom_view_assignment.mvp.presenter.impl

import android.view.View
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.example.padc_x_custom_view_assignment.data.models.impls.ProfilesModelImpl
import com.example.padc_x_custom_view_assignment.data.models.impls.TasksModelImpl
import com.example.padc_x_custom_view_assignment.mvp.presenter.AbstractBasePresenter
import com.example.padc_x_custom_view_assignment.mvp.presenter.MainPresenter
import com.example.padc_x_custom_view_assignment.mvp.views.MainView

class MainPresenterImpl : MainPresenter, AbstractBasePresenter<MainView>() {

    private val mTaskModel = TasksModelImpl

    private val mProfileModel = ProfilesModelImpl

    override fun onSwipeRefresh(lifecycleOwner: LifecycleOwner) {

    }

    override fun onUiReady(lifeCycleOwner: LifecycleOwner) {

        requestAllTasks(lifeCycleOwner)

        requestAllProfiles(lifeCycleOwner)
    }

    override fun onTapItem(tasksId: Int) {
        mView?.navigateToTaskDetail(tasksId)
    }




    override fun onTapProfileItem(profileId : Int) {
        mView?.navigateToProfileDetail(profileId)
    }



    fun requestAllTasks(lifeCycleOwner: LifecycleOwner){

        mTaskModel.getAllTasks(onError = {
            mView?.disableSwipeRefresh()

        }).observe(lifeCycleOwner, Observer {
            mView?.disableSwipeRefresh()

            mView?.displayTasksList(it)
        })



    }

    fun requestAllProfiles(lifeCycleOwner : LifecycleOwner){
        mProfileModel.getAllProfiles (onError = {


        }).observe(lifeCycleOwner, Observer {


            mView?.displayProfilesList(it)
        })
    }
}