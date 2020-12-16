package org.andengine.b.c.a;

import android.view.View;

public abstract class a implements c {
    protected static void a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            throw new IllegalStateException("This IResolutionPolicy requires MeasureSpec.EXACTLY ! That means ");
        }
    }
}
