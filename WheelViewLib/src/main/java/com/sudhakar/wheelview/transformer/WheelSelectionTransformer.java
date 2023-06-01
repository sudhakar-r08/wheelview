package com.sudhakar.wheelview.transformer;

import android.graphics.drawable.Drawable;

import com.sudhakar.wheelview.WheelView;

public interface WheelSelectionTransformer {
    void transform(Drawable drawable, WheelView.ItemState itemState);
}
