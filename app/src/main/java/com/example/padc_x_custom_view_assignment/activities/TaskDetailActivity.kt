package com.example.padc_x_custom_view_assignment.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.example.padc_x_custom_view_assignment.R
import com.example.padc_x_custom_view_assignment.data.models.TasksModel
import com.example.padc_x_custom_view_assignment.data.models.impls.TasksModelImpl
import com.example.padc_x_custom_view_assignment.data.vos.TasksVO

class TaskDetailActivity : AppCompatActivity() {

    companion object {

        const val NEWS_ID_EXTRA = "News Id Extra"

        fun newIntent(context: Context, newsId : Int): Intent {
            val intent =  Intent(context,TaskDetailActivity::class.java)
            intent.putExtra(NEWS_ID_EXTRA, newsId)
            return intent
        }
    }

    private var mTaskModel : TasksModel = TasksModelImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_detail)

        val tasksId = intent.getIntExtra(NEWS_ID_EXTRA, 0)

    }


}