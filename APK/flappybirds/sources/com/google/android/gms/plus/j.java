package com.google.android.gms.plus;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.gms.e;

class j implements k {
    private Context a;

    private j(Context context) {
        this.a = context;
    }

    public Drawable a(int i) {
        String str;
        switch (i) {
            case e.MapAttrs_mapType:
                str = "ic_plusone_small_off_client";
                break;
            case e.MapAttrs_cameraBearing:
                str = "ic_plusone_medium_off_client";
                break;
            case e.MapAttrs_cameraTargetLat:
                str = "ic_plusone_tall_off_client";
                break;
            default:
                str = "ic_plusone_standard_off_client";
                break;
        }
        return this.a.getResources().getDrawable(this.a.getResources().getIdentifier(str, "drawable", this.a.getPackageName()));
    }

    public boolean a() {
        return (this.a.getResources().getIdentifier("ic_plusone_small_off_client", "drawable", this.a.getPackageName()) == 0 || this.a.getResources().getIdentifier("ic_plusone_medium_off_client", "drawable", this.a.getPackageName()) == 0 || this.a.getResources().getIdentifier("ic_plusone_tall_off_client", "drawable", this.a.getPackageName()) == 0 || this.a.getResources().getIdentifier("ic_plusone_standard_off_client", "drawable", this.a.getPackageName()) == 0) ? false : true;
    }
}
