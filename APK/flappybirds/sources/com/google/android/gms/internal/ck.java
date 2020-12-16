package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;

final class ck extends Drawable.ConstantState {
    private ck() {
    }

    public int getChangingConfigurations() {
        return 0;
    }

    public Drawable newDrawable() {
        return cj.a;
    }
}
