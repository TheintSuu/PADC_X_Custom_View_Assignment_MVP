package com.example.padc_x_custom_view_assignment.data.models.impls

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.padc_x_custom_view_assignment.data.models.BaseAppModel
import com.example.padc_x_custom_view_assignment.data.models.BaseModel
import com.example.padc_x_custom_view_assignment.data.models.ProfilesModel
import com.example.padc_x_custom_view_assignment.data.vos.ProfilesVO


object ProfilesModelImpl :
    ProfilesModel, BaseAppModel() {


    override fun getAllProfiles(onError: (String) -> Unit): LiveData<List<ProfilesVO>> {
        return Transformations.distinctUntilChanged(
            mDatabase.ProfilesDao().getAllProfiles()
        )
    }

    override fun getAllProfilesFromApiAndSaveToDatabase(
        onSuccess: () -> Unit,
        onError: (String) -> Unit
    ) {

    }

    override fun getProfilesById(ProfilesId: Int): LiveData<ProfilesVO> {
        return Transformations.distinctUntilChanged(
            mDatabase.ProfilesDao().getProfilesById(ProfilesId)
        )
    }
}