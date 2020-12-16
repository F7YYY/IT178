package com.dotgears.flappy;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import com.dotgears.flappybird.R;

public class SplashScreen extends Activity {
    private static int a = 2000;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new d(this), (long) a);
    }
}
