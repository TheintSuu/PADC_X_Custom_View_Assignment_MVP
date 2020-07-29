package com.example.padc_x_custom_view_assignment.data.vos

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity(tableName = "tasks")
class TasksVO {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0
    @ColumnInfo(name = "message")
    var message: Int = 1
    @ColumnInfo(name = "attached_files")
    var attachedFiles: Int = 1
    @ColumnInfo(name = "task_status")
    var taskStatus: String = ""
    @ColumnInfo(name = "task_type")
    var taskType: String = ""
    @ColumnInfo(name = "task_nCount")
    var task_nCount: Int = 0
    @ColumnInfo(name = "profile_image")
    var profileImage: String = ""


}