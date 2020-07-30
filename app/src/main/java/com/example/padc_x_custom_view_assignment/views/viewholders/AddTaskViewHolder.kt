package com.example.padc_x_custom_view_assignment.views.viewholders

import android.view.View
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import com.bumptech.glide.Glide
import com.example.padc_x_custom_view_assignment.R
import com.example.padc_x_custom_view_assignment.data.vos.ProfilesVO
import com.example.padc_x_custom_view_assignment.delegate.ProfileItemDelegate
import kotlinx.android.synthetic.main.item_profile.view.*

class AddTaskViewHolder (itemView: View, delegate: ProfileItemDelegate) : BaseProfileViewHolder(itemView) {

    init {

        itemView.setOnClickListener {
            mData?.let {
                delegate.onTapProfileItem(it.id)
            }
        }
    }


    override fun bindData(data: ProfilesVO) {
        mData = data

        itemView.roundedCornerImageView.setImageResource(R.drawable.ic_baseline_black_add_24)



    }

}