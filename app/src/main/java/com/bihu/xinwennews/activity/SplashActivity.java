package com.bihu.xinwennews.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

import com.bihu.xinwennews.R;

/**
 * Created by Luo on 2016/9/1.
 */
public class SplashActivity extends Activity {
    private static final String TAG=SplashActivity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = View.inflate(this, R.layout.activity_splash, null);
        setContentView(view);


        AlphaAnimation alphaAnimation=new AlphaAnimation(0.0f,1.0f);
        alphaAnimation.setDuration(3000);

        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                Log.d(TAG,"onAnimationStart-------------"+1);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Log.d(TAG,"onAnimationEnd-----------"+2);
                Intent intent=new Intent();
                intent.setClass(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                Log.d(TAG,"onAnimationRepeat-------------"+3);
            }
        });

        //开始动画
        view.setAnimation(alphaAnimation);
    }
}
