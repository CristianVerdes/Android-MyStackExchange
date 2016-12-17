package com.example.cristianverdes.mystackexchange;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Cristian Verdes on 11/29/2016.
 */

public class SplashScreen extends Activity {
    public void onAttachedToWindow(){
        super.onAttachedToWindow();
        Window window = getWindow();
        window.setFormat(PixelFormat.RGBA_8888);
    }

    Thread splashTread;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        startAnimation();
    }

    private void startAnimation(){
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
        animation.reset();
        LinearLayout l = (LinearLayout) findViewById(R.id.lin_lay);
        l.clearAnimation();
        l.startAnimation(animation);

        animation = AnimationUtils.loadAnimation(this, R.anim.translate);
        animation.reset();
        ImageView iv = (ImageView) findViewById(R.id.splash);
        iv.clearAnimation();
        iv.startAnimation(animation);



        splashTread = new Thread() {
            @Override
            public void run(){
                try{

                    int waited = 0;

                    while (waited < 3500){
                        sleep(100);
                        waited += 100;
                    }

                    Intent intent = new Intent(SplashScreen.this, SearchActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    SplashScreen.this.finish();

                } catch (InterruptedException e) {
                    //do nothing
                } finally {
                    SplashScreen.this.finish();
                }
            }
        };

        splashTread.start();
    }
}
