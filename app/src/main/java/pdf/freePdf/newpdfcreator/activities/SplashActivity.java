package pdf.freePdf.newpdfcreator.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pdf.freePdf.newpdfcreator.R;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 2500;

    ImageView imageView;
    TextView textView1,textView2;
    Animation top, bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams
        .FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        imageView = findViewById(R.id.image_view1);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);

        top = AnimationUtils.loadAnimation(this,R.anim.top);
        bottom = AnimationUtils.loadAnimation(this,R.anim.bottom);
        imageView.setAnimation(top);
        textView1.setAnimation(bottom);
        textView2.setAnimation(bottom);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);



//        AdsUtility.loadInterstitialAd(this);


//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                if (AdsUtility.mInterstitialAd.isLoaded()){
//                    AdsUtility.mInterstitialAd.show();
//                    AdsUtility.mInterstitialAd.setAdListener(new AdListener(){
//                        @Override
//                        public void onAdClosed() {
//                            super.onAdClosed();
//                            startActivity(new Intent(SplashActivity.this, HomeActivity.class));
//                            finish();
//                        }
//                    });
//                } else {
//                    startActivity(new Intent(SplashActivity.this, HomeActivity.class));
//                    finish();
//
//                }
//            }
//        }, 3000);

    }
}