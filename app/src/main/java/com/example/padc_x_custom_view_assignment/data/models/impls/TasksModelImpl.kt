package com.example.padc_x_custom_view_assignment.data.models.impls

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.example.padc_x_custom_view_assignment.data.models.BaseAppModel
import com.example.padc_x_custom_view_assignment.data.models.BaseModel
import com.example.padc_x_custom_view_assignment.data.models.TasksModel
import com.example.padc_x_custom_view_assignment.data.vos.TasksVO

object TasksModelImpl :
    TasksModel, BaseAppModel() {


    override fun getAllTasks(onError: (String) -> Unit): LiveData<List<TasksVO>> {
        return Transformations.distinctUntilChanged(
            mDatabase.tasksDao().getAlltasks()
        )
    }

    override fun getAllTasksFromApiAndSaveToDatabase(
        onSuccess: () -> Unit,
        onError: (String) -> Unit
    ) {

    }

    override fun getTasksById(TasksId: Int): LiveData<TasksVO> {
        return Transformations.distinctUntilChanged(
            mDatabase.tasksDao().gettasksById(TasksId)
        )
    }
}