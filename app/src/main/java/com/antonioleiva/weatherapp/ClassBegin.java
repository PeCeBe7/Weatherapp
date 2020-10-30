package com.antonioleiva.weatherapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

class ClassBeginJava extends LinearLayout {

    private TextView mTvButton;
    private String mText;

    public ClassBeginJava(Context context) {
        super(context);
        inits();
    }

    private void inits() {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        inflater.inflate(R.layout.activity_main_begin, this, true);
        //Intent intento = new Intent(MainActivityBegin, MainActivity);
        //Intent intent = new Intent(R.layout.activity_main_begin, );

        bindViews();
        setTextButton(String.valueOf(R.string.info_week));
        //iniListener(R.layout.activity_main_begin,intent);
        //iniListener(MainActivityBegin, intent);
    }

    private void iniListener(final Activity currentActivity, final Intent resultIntent) {
        mTvButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                currentActivity.setResult(Activity.RESULT_OK, resultIntent);
                currentActivity.finish();
            }
        });
    }


    private void bindViews() {
        mTvButton = findViewById(R.id.bt_change_screan);
    }

    public void setTextButton(String text) {

        mTvButton.setText(text);
        mText = text;
    }
}
