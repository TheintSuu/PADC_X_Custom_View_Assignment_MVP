package com.example.padc_x_custom_view_assignment.persistence.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.padc_x_custom_view_assignment.data.vos.ProfilesVO


@Dao
interface ProfilesDao {

    @Query("SELECT * FROM profiles")
    fun getAllProfiles(): LiveData<List<ProfilesVO>>

    @Query("SELECT * FROM profiles WHERE id = :noteId")
    fun getProfilesById(noteId: Int) : LiveData<ProfilesVO>

    @Query("DELETE FROM profiles")
    fun deleteAll()

    @Delete
    fun deleteProfiles(note: ProfilesVO)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertProfiles(noteVO: ProfilesVO)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllProfiles(profiles: List<ProfilesVO>)
}