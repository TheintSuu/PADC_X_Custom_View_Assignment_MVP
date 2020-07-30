package com.example.padc_x_custom_view_assignment.mvp.views

import com.example.padc_x_custom_view_assignment.data.vos.ProfilesVO
import com.example.padc_x_custom_view_assignment.data.vos.TasksVO

interface MainView : BaseView {

    fun displayTasksList(newsList: List<TasksVO>)

    fun displayProfilesList(newsList: List<ProfilesVO>)

    fun navigateToProfileDetail(profileId: Int)

    fun navigateToTaskDetail(taskId: Int)

    fun enableSwipeRefresh()

    fun disableSwipeRefresh()

}