package com.google.android.gms.plus;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.e;

public class f extends FrameLayout {
    public f(Context context, int i) {
        super(context);
        Button button = new Button(context);
        button.setEnabled(false);
        button.setBackgroundDrawable(a().a(i));
        Point a = a(i);
        addView(button, new FrameLayout.LayoutParams(a.x, a.y, 17));
    }

    private Point a(int i) {
        int i2 = 24;
        int i3 = 20;
        Point point = new Point();
        switch (i) {
            case e.MapAttrs_mapType:
                i3 = 14;
                break;
            case e.MapAttrs_cameraBearing:
                i2 = 32;
                break;
            case e.MapAttrs_cameraTargetLat:
                i2 = 50;
                break;
            default:
                i2 = 38;
                i3 = 24;
                break;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float applyDimension = TypedValue.applyDimension(1, (float) i2, displayMetrics);
        float applyDimension2 = TypedValue.applyDimension(1, (float) i3, displayMetrics);
        point.x = (int) (((double) applyDimension) + 0.5d);
        point.y = (int) (((double) applyDimension2) + 0.5d);
        return point;
    }

    private k a() {
        k iVar = new i(getContext());
        if (!iVar.a()) {
            iVar = new j(getContext());
        }
        return !iVar.a() ? new h(getContext()) : iVar;
    }
}
