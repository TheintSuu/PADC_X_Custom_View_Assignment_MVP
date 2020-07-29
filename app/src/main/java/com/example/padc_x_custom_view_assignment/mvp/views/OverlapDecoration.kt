package com.example.padc_x_custom_view_assignment.mvp.views

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView


 class OverlapDecoration : RecyclerView.ItemDecoration() {

    companion object {
        private const val vertOverlap = -40
    }

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        outRect.set(0, vertOverlap, 0, 0)
        super.getItemOffsets(outRect, view, parent, state)
    }
}