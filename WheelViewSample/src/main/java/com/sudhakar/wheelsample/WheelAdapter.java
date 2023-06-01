package com.sudhakar.wheelsample;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

import androidx.core.content.ContextCompat;

import com.sudhakar.wheelview.adapter.WheelArrayAdapter;

import java.util.List;

public class WheelAdapter extends WheelArrayAdapter<Integer> {

    private Context context;

    public WheelAdapter(List<Integer> items, Context context) {
        super(items);
        this.context = context;
    }

    @Override
    public Drawable getDrawable(int position) {
        Drawable[] drawables = {
                createOvalDrawable(Color.RED),
                null
        };
        return new LayerDrawable(drawables);
    }

    private Drawable createOvalDrawable(int color) {
        return ContextCompat.getDrawable(context, R.drawable.ic_ellipse_empty);
    }
}