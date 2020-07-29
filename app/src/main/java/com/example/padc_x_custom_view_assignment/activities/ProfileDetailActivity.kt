package com.example.padc_x_custom_view_assignment.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.example.padc_x_custom_view_assignment.R
import com.example.padc_x_custom_view_assignment.adapter.TaskFragmentAdapter
import com.example.padc_x_custom_view_assignment.data.models.ProfilesModel
import com.example.padc_x_custom_view_assignment.data.models.impls.ProfilesModelImpl
import com.example.padc_x_custom_view_assignment.data.vos.ProfilesVO
import kotlinx.android.synthetic.main.activity_profile_detail.*
import kotlinx.android.synthetic.main.profile_card.*

class ProfileDetailActivity : AppCompatActivity() {
    private lateinit var mViewPagerAdapter: TaskFragmentAdapter

    private var mNewsModel : ProfilesModel = ProfilesModelImpl
    companion object {
        const val PROFILE_ID_EXTRA = "Profile Id Extra"
        fun newIntent(context: Context, profilesId : Int): Intent {
            val intent =  Intent(context, ProfileDetailActivity::class.java)
            intent.putExtra(PROFILE_ID_EXTRA, profilesId)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_detail)
        setUpViewPager()


        val newsId = intent.getIntExtra(PROFILE_ID_EXTRA, 0)

        mNewsModel.getProfilesById(newsId)
            .observe(this, Observer {
                bindData(it)
            })
    }

    fun setUpViewPager(){
        mViewPagerAdapter = TaskFragmentAdapter(this,supportFragmentManager)
        viewPager.adapter = mViewPagerAdapter
        tabLayout.setupWithViewPager(viewPager)

    }

    private fun bindData(data : ProfilesVO){

        Glide.with(this.profileimage)
            .load(data.profileImage)
            .into(profileimage)

            tvOpenTaskCount.text = data!!.openTask.toString()
             tvClosedTaskCount.text = data!!.closedTask.toString()
             tvProfileName.text = data!!.name
             tvProfilePosition.text = data!!.jobPosition

    }

}