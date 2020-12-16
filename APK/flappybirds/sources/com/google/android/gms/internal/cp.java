package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;

public class cp implements DialogInterface.OnClickListener {
    private final Activity a;
    private final Intent b;
    private final int c;

    public cp(Activity activity, Intent intent, int i) {
        this.a = activity;
        this.b = intent;
        this.c = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            if (this.b != null) {
                this.a.startActivityForResult(this.b, this.c);
            }
            dialogInterface.dismiss();
        } catch (ActivityNotFoundException e) {
            Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
        }
    }
}
