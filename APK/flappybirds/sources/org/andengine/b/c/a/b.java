package org.andengine.b.c.a;

import android.view.View;
import org.andengine.opengl.view.RenderSurfaceView;

public class b extends a {
    private final float a;
    private final float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;

    public b(float f2, float f3) {
        this.a = f2;
        this.b = f3;
    }

    public void a(RenderSurfaceView renderSurfaceView, int i, int i2) {
        float f2;
        float f3;
        float f4;
        a.a(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f5 = this.a / this.b;
        if (((float) size) / ((float) size2) < f5) {
            f3 = ((float) size2) * f5;
            f2 = (float) size2;
            f4 = this.b / f2;
        } else {
            f2 = ((float) size) / f5;
            f3 = (float) size;
            f4 = this.a / f3;
        }
        this.c = ((float) size) * f4;
        this.d = f4 * ((float) size2);
        this.e = (this.a - this.c) / 2.0f;
        this.f = this.c + this.e;
        this.h = (this.b - this.d) / 2.0f;
        this.g = this.d + this.h;
        renderSurfaceView.a((int) f3, (int) f2);
    }
}
