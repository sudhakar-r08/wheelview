package com.sudhakar.wheelsample

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.graphics.drawable.LayerDrawable
import androidx.core.content.ContextCompat
import com.sudhakar.wheelview.adapter.WheelArrayAdapter

        class wheelAdapter(
            items: List<Int>?,
            val context: Context
        ):WheelArrayAdapter<Int>(items) {
            override fun getDrawable(position: Int): Drawable {
                val drawable = arrayOf(
                    createOvalDrawable(Color.RED),
                    null
                )
                return LayerDrawable(drawable)
            }
            private fun createOvalDrawable(color: Int): Drawable? {

                return ContextCompat.getDrawable(context,R.drawable.ic_ellipse_empty)
            }
        }