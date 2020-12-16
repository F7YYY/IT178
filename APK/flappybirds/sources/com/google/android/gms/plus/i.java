package com.google.android.gms.plus;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.gms.e;

class i implements k {
    private Context a;

    private i(Context context) {
        this.a = context;
    }

    public Drawable a(int i) {
        String str;
        try {
            Resources resources = this.a.createPackageContext("com.google.android.gms", 4).getResources();
            switch (i) {
                case e.MapAttrs_mapType:
                    str = "ic_plusone_small";
                    break;
                case e.MapAttrs_cameraBearing:
                    str = "ic_plusone_medium";
                    break;
                case e.MapAttrs_cameraTargetLat:
                    str = "ic_plusone_tall";
                    break;
                default:
                    str = "ic_plusone_standard";
                    break;
            }
            return resources.getDrawable(resources.getIdentifier(str, "drawable", "com.google.android.gms"));
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    public boolean a() {
        try {
            this.a.createPackageContext("com.google.android.gms", 4).getResources();
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
