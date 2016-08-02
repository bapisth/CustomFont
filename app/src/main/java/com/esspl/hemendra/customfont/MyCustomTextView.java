package com.esspl.hemendra.customfont;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by hemendra on 23-03-2016.
 */
public class MyCustomTextView extends TextView {

    private static final String FONT_LOCATION = "RobotoThin.ttf";
    private static Typeface mtypeface;

    public MyCustomTextView(Context context) {
        super(context);
        setTypeface(getTypeface(context));
    }

    public MyCustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(getTypeface(context));
    }

    public MyCustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(getTypeface(context));
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MyCustomTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setTypeface(getTypeface(context));
    }

    private Typeface getTypeface(Context context) {
        if (mtypeface==null)
            mtypeface = Typeface.createFromAsset(context.getAssets(), FONT_LOCATION);
        return mtypeface;
    }
}
