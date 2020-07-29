package com.example.padc_x_custom_view_assignment

import android.app.Application
import com.example.padc_x_custom_view_assignment.data.dummy_data.getDummyProfiles
import com.example.padc_x_custom_view_assignment.data.dummy_data.getDummyTasks
import com.example.padc_x_custom_view_assignment.data.models.impls.ProfilesModelImpl
import com.example.padc_x_custom_view_assignment.data.models.impls.TasksModelImpl
import com.example.padc_x_custom_view_assignment.persistence.db.TasksDB

class TasksAppByTSH : Application() {

    override fun onCreate() {
        super.onCreate()
        TasksModelImpl.init(applicationContext)
        ProfilesModelImpl.init(applicationContext)
        deleteAllData()
        prepopulateTasks()

        prepopulateProfiles()

    }

    private fun deleteAllData(){
        TasksDB.getDBInstance(applicationContext)
            .tasksDao().deleteAll()

        TasksDB.getDBInstance(applicationContext)
            .ProfilesDao().deleteAll()
    }

    private fun prepopulateTasks(){
        TasksDB.getDBInstance(applicationContext)
            .tasksDao().insertAllTasks(getDummyTasks())
    }

    private fun prepopulateProfiles(){
        TasksDB.getDBInstance(applicationContext)
            .ProfilesDao().insertAllProfiles(getDummyProfiles())
    }
}