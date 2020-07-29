package com.example.padc_x_custom_view_assignment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.padc_x_custom_view_assignment.R
import com.example.padc_x_custom_view_assignment.data.vos.ProfilesVO
import com.example.padc_x_custom_view_assignment.delegate.ProfileItemDelegate
import com.example.padc_x_custom_view_assignment.views.viewholders.AddTaskViewHolder
import com.example.padc_x_custom_view_assignment.views.viewholders.BaseProfileViewHolder
import com.example.padc_x_custom_view_assignment.views.viewholders.ProfileViewHolder


class PeopleProfileAdapter(delegate: ProfileItemDelegate) : BaseRecyclerAdapter<BaseProfileViewHolder, ProfilesVO>(){

    val mDelegate: ProfileItemDelegate = delegate
    val VIEW_PROFILE = 2244
    val VIEW_ADD = 1122

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseProfileViewHolder {

        when (viewType) {
            VIEW_PROFILE -> {
                val view= LayoutInflater.from(parent.context).inflate(R.layout.item_profile, parent,false)
                return ProfileViewHolder(view, mDelegate)
            }
            VIEW_ADD -> {
                val view= LayoutInflater.from(parent.context).inflate(R.layout.item_profile, parent,false)
                return AddTaskViewHolder(view, mDelegate)
            }else -> {
            val view= LayoutInflater.from(parent.context).inflate(R.layout.item_profile, parent,false)
            return ProfileViewHolder(view, mDelegate)
            }
        }

    }

    override fun getItemViewType(position: Int): Int {
        when {
            position == 0 -> {
                return VIEW_PROFILE
            }
            position == 1 -> {
                return VIEW_PROFILE
            }
            position == 2 -> {
                return VIEW_PROFILE
            }
            position == 4 -> {
                return VIEW_ADD
            }
            else -> {
                return VIEW_PROFILE
            }
        }
    }


}