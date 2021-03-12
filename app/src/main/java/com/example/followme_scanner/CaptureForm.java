package com.example.followme_scanner;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import com.journeyapps.barcodescanner.CaptureActivity;

public class CaptureForm extends CaptureActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        /* TextVeiw를 설정하고 마지막엔 this.addContentView ! */
        TextView textView = new TextView(this);
        textView.setLayoutParams(new LinearLayout.LayoutParams(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT));
        textView.setTextColor(Color.parseColor("#FFFFFF"));
        textView.setText(MainActivity.selectedClinic);
        textView.setTextSize(40);
        textView.setPadding(440, 1700, 0, 0);


        /* imagaeVeiw를 설정하고 마지막엔 this.addContentView ! */
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new ConstraintLayout.LayoutParams(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT));
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.logo4));
        imageView.setPadding(160, 300, 0, 0);


        /* this.addContentView ! */
        this.addContentView(textView, params);
        this.addContentView(imageView, params);


    }

}
