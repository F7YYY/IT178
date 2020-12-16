package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.b;
import com.google.android.gms.c;
import com.google.android.gms.d;
import com.google.android.gms.e;

public final class u extends Button {
    public u(Context context) {
        this(context, (AttributeSet) null);
    }

    public u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842824);
    }

    private int a(int i, int i2, int i3) {
        switch (i) {
            case e.MapAttrs_mapType:
                return i2;
            case e.MapAttrs_cameraBearing:
                return i3;
            default:
                throw new IllegalStateException("Unknown color scheme: " + i);
        }
    }

    private void a(Resources resources) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        float f = resources.getDisplayMetrics().density;
        setMinHeight((int) ((f * 48.0f) + 0.5f));
        setMinWidth((int) ((f * 48.0f) + 0.5f));
    }

    private void b(Resources resources, int i, int i2) {
        int a;
        switch (i) {
            case e.MapAttrs_mapType:
            case e.MapAttrs_cameraBearing:
                a = a(i2, c.common_signin_btn_text_dark, c.common_signin_btn_text_light);
                break;
            case e.MapAttrs_cameraTargetLat:
                a = a(i2, c.common_signin_btn_icon_dark, c.common_signin_btn_icon_light);
                break;
            default:
                throw new IllegalStateException("Unknown button size: " + i);
        }
        if (a == -1) {
            throw new IllegalStateException("Could not find background resource!");
        }
        setBackgroundDrawable(resources.getDrawable(a));
    }

    private void c(Resources resources, int i, int i2) {
        setTextColor(resources.getColorStateList(a(i2, b.common_signin_btn_text_dark, b.common_signin_btn_text_light)));
        switch (i) {
            case e.MapAttrs_mapType:
                setText(resources.getString(d.common_signin_button_text));
                return;
            case e.MapAttrs_cameraBearing:
                setText(resources.getString(d.common_signin_button_text_long));
                return;
            case e.MapAttrs_cameraTargetLat:
                setText((CharSequence) null);
                return;
            default:
                throw new IllegalStateException("Unknown button size: " + i);
        }
    }

    public void a(Resources resources, int i, int i2) {
        boolean z = true;
        Cdo.a(i >= 0 && i < 3, (Object) "Unknown button size " + i);
        if (i2 < 0 || i2 >= 2) {
            z = false;
        }
        Cdo.a(z, (Object) "Unknown color scheme " + i2);
        a(resources);
        b(resources, i, i2);
        c(resources, i, i2);
    }
}
