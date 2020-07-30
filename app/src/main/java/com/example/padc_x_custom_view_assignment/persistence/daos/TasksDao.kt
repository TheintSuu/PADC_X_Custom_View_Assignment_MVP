package com.example.padc_x_custom_view_assignment.persistence.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.padc_x_custom_view_assignment.data.vos.TasksVO

@Dao
interface TasksDao {

    @Query("SELECT * FROM tasks")
    fun getAlltasks(): LiveData<List<TasksVO>>

    @Query("SELECT * FROM tasks WHERE id = :noteId")
    fun gettasksById(noteId: Int) : LiveData<TasksVO>

    @Query("DELETE FROM tasks")
    fun deleteAll()

    @Delete
    fun deleteTasks(note: TasksVO)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTasks(noteVO: TasksVO)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllTasks(tasks: List<TasksVO>)
}