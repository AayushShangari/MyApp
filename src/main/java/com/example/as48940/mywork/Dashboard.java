package com.example.as48940.mywork;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.as48940.mywork.Usables.CustomImageView;

/**
 * Created by as48940 on 5/9/2017.
 */
public class Dashboard extends AppCompatActivity {

    private CustomImageView customImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        initialize();
        customImageView.setImageResource(R.drawable.profile);
        customImageView.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public void initialize(){
        customImageView = (CustomImageView) findViewById(R.id.profile_picture);
    }

}
