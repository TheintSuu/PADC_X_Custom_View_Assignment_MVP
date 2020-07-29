package com.example.padc_x_custom_view_assignment.views.viewholders

import android.view.View
import com.bumptech.glide.Glide
import com.example.padc_x_custom_view_assignment.data.vos.TasksVO
import com.example.padc_x_custom_view_assignment.delegate.TaskItemDelegate
import kotlinx.android.synthetic.main.item_profile.view.*
import kotlinx.android.synthetic.main.task_item_view.view.*

class TaskViewHolder (itemView: View, delegate: TaskItemDelegate) : BaseTaskViewHolder(itemView) {
    init {

        itemView.setOnClickListener {
            mData?.let {
                delegate.onTapItem(it.id)
            }
        }
    }


    override fun bindData(data: TasksVO) {
        mData = data

        itemView.tvComment.text = mData!!.message.toString()
        itemView.tvShare.text = mData!!.attachedFiles.toString()
        itemView.tvNShare.text = mData!!.task_nCount.toString()
        itemView.tvProgressStatus.text = mData!!.taskStatus.toString()
        itemView.tvProgressType.text = mData!!.taskType

        Glide.with(itemView.ivTaskimage)
            .load(data.profileImage)
            .into(itemView.ivTaskimage)




    }

}