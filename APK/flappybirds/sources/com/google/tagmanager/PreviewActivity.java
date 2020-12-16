package com.google.tagmanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class PreviewActivity extends Activity {
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            i.c("Preview activity");
            Uri data = getIntent().getData();
            if (!r.a((Context) this).a(data)) {
                i.b("Cannot preview the app with the uri: " + data);
                return;
            }
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            if (launchIntentForPackage != null) {
                i.c("Invoke the launch activity for package name: " + getPackageName());
                startActivity(launchIntentForPackage);
                return;
            }
            i.c("No launch activity found for package name: " + getPackageName());
        } catch (Exception e) {
            i.a("Calling preview threw an exception: " + e.getMessage());
        }
    }
}
