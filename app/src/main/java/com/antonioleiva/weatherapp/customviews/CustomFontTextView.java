package com.antonioleiva.weatherapp.customviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.antonioleiva.weatherapp.R;
import com.antonioleiva.weatherapp.customviews.interfaces.ButtonClickInterface;

import org.jetbrains.annotations.NotNull;


public class CustomFontTextView extends RelativeLayout {



    private TextView title;
    private TextView text;

    public CustomFontTextView(Context context) {
        super(context);
        init(null, context);
    }

    public CustomFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, context);
    }

    public CustomFontTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs, context);
    }

    public void init(AttributeSet attrs, Context context) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        RelativeLayout rootView = (RelativeLayout) inflater.inflate(R.layout.custom_view_button_week, this);

        title = rootView.findViewById(R.id.title_button);

        text = rootView.findViewById(R.id.text_button);


    }


    public void setTitle(String titleStr) {
        title.setText(titleStr);
    }

    public void setText(String textStr) {
        text.setText(textStr);
    }

    public void setListener(@NotNull ButtonClickInterface buttonClickInterface) {
        setOnClickListener(view -> buttonClickInterface.clickButton());
    }
}
