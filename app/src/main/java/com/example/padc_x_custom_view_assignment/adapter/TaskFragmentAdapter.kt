package com.example.padc_x_custom_view_assignment.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.padc_x_custom_view_assignment.fragments.TaskFragment

class TaskFragmentAdapter(val context: Context,val fm:FragmentManager) : FragmentPagerAdapter(fm) {

    var title = arrayListOf("Project","Profile","Contact")
    private val NUM_ITEM = 3

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> {
                return TaskFragment.newInstance("","")
            }
            1 -> {
                return TaskFragment.newInstance("","")
            }
            2 -> {
                return TaskFragment.newInstance("A","B")
            }
            else -> {
                return TaskFragment.newInstance("","")
            }
        }
    }

    override fun getCount(): Int {
        return NUM_ITEM
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return title[position]
    }



}