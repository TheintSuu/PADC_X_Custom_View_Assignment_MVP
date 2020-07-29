package com.example.padc_x_custom_view_assignment.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.padc_x_custom_view_assignment.R
import com.example.padc_x_custom_view_assignment.adapter.PeopleProfileAdapter
import com.example.padc_x_custom_view_assignment.adapter.TaskItemAdapter
import com.example.padc_x_custom_view_assignment.data.vos.ProfilesVO
import com.example.padc_x_custom_view_assignment.data.vos.TasksVO
import com.example.padc_x_custom_view_assignment.mvp.presenter.MainPresenter
import com.example.padc_x_custom_view_assignment.mvp.presenter.impl.MainPresenterImpl
import com.example.padc_x_custom_view_assignment.mvp.views.MainView
import com.example.padc_x_custom_view_assignment.mvp.views.OverlapDecoration
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var mAdapter: TaskItemAdapter

    private lateinit var mProfileAdapter: PeopleProfileAdapter

    private lateinit var mPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        setUpPresenter()

        setUpTaskRecyclerView()

        setUpProfileRecyclerView()

        setUpListener()

        mPresenter.onUiReady(this)



    }

    private fun setUpPresenter(){
        mPresenter = ViewModelProviders.of(this).get(MainPresenterImpl::class.java)
        mPresenter.initPresenter(this)
    }

    private fun setUpTaskRecyclerView(){
        mAdapter = TaskItemAdapter(mPresenter)
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
       rvTask.layoutManager = linearLayoutManager
        rvTask.addItemDecoration(OverlapDecoration())
       rvTask.adapter = mAdapter

    }

    private fun setUpProfileRecyclerView(){

        mProfileAdapter = PeopleProfileAdapter(mPresenter)
        val horizontalLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvProfile.layoutManager = horizontalLayoutManager
        rvProfile.adapter = mProfileAdapter
    }



    override fun displayTasksList(newsList: List<TasksVO>) {
        mAdapter.setNewData(newsList.toMutableList())


    }

    override fun displayProfilesList(newsList: List<ProfilesVO>) {
        mProfileAdapter?.setNewData(newsList.toMutableList())
    }

    override fun navigateToProfileDetail(profileId: Int) {
        if(
            mProfileAdapter.getItemViewType(profileId)
            == mProfileAdapter.VIEW_PROFILE
        ){
            startActivity(ProfileDetailActivity.newIntent(this, profileId))
        }else{
            startActivity(TaskDetailActivity.newIntent(this, profileId))
        }

    }

    override fun navigateToTaskDetail(taskId: Int) {

    }

    override fun enableSwipeRefresh() {

    }

    override fun disableSwipeRefresh() {

    }


    private fun setUpListener(){

    }

}
