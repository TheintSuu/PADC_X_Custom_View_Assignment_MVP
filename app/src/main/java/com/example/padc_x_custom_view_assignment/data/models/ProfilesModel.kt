package com.example.padc_x_custom_view_assignment.data.models

import androidx.lifecycle.LiveData
import com.example.padc_x_custom_view_assignment.data.vos.ProfilesVO

interface ProfilesModel {

    fun getAllProfiles(onError: (String) -> Unit) : LiveData<List<ProfilesVO>>

    fun getAllProfilesFromApiAndSaveToDatabase(onSuccess: () -> Unit, onError: (String) -> Unit)

    fun getProfilesById(ProfilesId: Int) : LiveData<ProfilesVO>
}