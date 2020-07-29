package com.example.padc_x_custom_view_assignment.views.viewholders

import android.view.View
import com.bumptech.glide.Glide
import com.example.padc_x_custom_view_assignment.data.vos.ProfilesVO
import com.example.padc_x_custom_view_assignment.data.vos.TasksVO
import com.example.padc_x_custom_view_assignment.delegate.ProfileItemDelegate
import kotlinx.android.synthetic.main.activity_profile_detail.view.*
import kotlinx.android.synthetic.main.item_profile.view.*
import kotlinx.android.synthetic.main.profile_card.view.*


class ProfileViewHolder (itemView: View, delegate: ProfileItemDelegate) : BaseProfileViewHolder(itemView) {

        init {

            itemView.setOnClickListener {
                mData?.let {
                    delegate.onTapProfileItem(it.id)
                }
            }
        }

        override fun bindData(data: ProfilesVO) {
            mData = data


              Glide.with(itemView.context)
                  .load(data.profileImage)
                  .into(itemView.roundedCornerImageView)

//             itemView.tvOpenTaskCount.text = mData!!.openTask.toString()
//              itemView.tvClosedTaskCount.text = mData!!.closedTask.toString()
//              itemView.tvProfileName.text = mData!!.name
//              itemView.tvProfilePosition.text = mData!!.jobPosition




        }

}