package com.example.padc_x_custom_view_assignment.data.models

import android.content.Context
import com.example.padc_x_custom_view_assignment.persistence.db.TasksDB

abstract class BaseAppModel : BaseModel() {

    protected lateinit var mDatabase: TasksDB

    override fun init(context: Context) {
        initDatabase(context)
    }

    private fun initDatabase(context: Context) {
        mDatabase = TasksDB.getDBInstance(context)
    }
}