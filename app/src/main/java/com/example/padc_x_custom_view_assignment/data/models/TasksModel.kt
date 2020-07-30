package com.example.padc_x_custom_view_assignment.data.models

import androidx.lifecycle.LiveData
import com.example.padc_x_custom_view_assignment.data.vos.TasksVO

interface TasksModel {

    fun getAllTasks(onError: (String) -> Unit) : LiveData<List<TasksVO>>

    fun getAllTasksFromApiAndSaveToDatabase(onSuccess: () -> Unit, onError: (String) -> Unit)

    fun getTasksById(TasksId: Int) : LiveData<TasksVO>
}