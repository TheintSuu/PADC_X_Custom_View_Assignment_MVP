package com.example.padc_x_custom_view_assignment.data.vos

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "profiles")
class ProfilesVO {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0
    @ColumnInfo(name = "open_tasks")
    var openTask: Int = 1
    @ColumnInfo(name = "closed_tasks")
    var closedTask: Int = 1
    @ColumnInfo(name = "profile_image")
    var profileImage: String = ""
    @ColumnInfo(name = "development_position")
    var jobPosition: String = ""
    @ColumnInfo(name = "name")
    var name: String = ""


}