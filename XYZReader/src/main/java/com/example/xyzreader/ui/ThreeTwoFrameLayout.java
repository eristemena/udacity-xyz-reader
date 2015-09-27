package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by Eamon on 17/09/2015.
 */
public class ThreeTwoFrameLayout extends FrameLayout {
    public ThreeTwoFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ThreeTwoFrameLayout(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightSpec) {
        int threeTwoWidth = MeasureSpec.getSize(heightSpec) * 3/2;
        int threeTwoWidthSpec =
                MeasureSpec.makeMeasureSpec(threeTwoWidth, MeasureSpec.EXACTLY);
        super.onMeasure(threeTwoWidthSpec,heightSpec);
    }
}
