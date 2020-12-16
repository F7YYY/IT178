package org.andengine.opengl.view;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import org.andengine.b.a;

public class RenderSurfaceView extends GLSurfaceView {
    private g a;
    private a b;

    public RenderSurfaceView(Context context) {
        super(context);
        setEGLContextClientVersion(2);
    }

    public RenderSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setEGLContextClientVersion(2);
    }

    public void a(int i, int i2) {
        setMeasuredDimension(i, i2);
    }

    public void a(a aVar, h hVar) {
        if (this.b == null) {
            this.b = new a(aVar.d().e().a());
        }
        setEGLConfigChooser(this.b);
        setOnTouchListener(aVar);
        this.a = new g(aVar, this.b, hVar);
        setRenderer(this.a);
    }

    public a getConfigChooser() {
        if (this.b != null) {
            return this.b;
        }
        throw new IllegalStateException(String.valueOf(a.class.getSimpleName()) + " not yet set.");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (isInEditMode()) {
            super.onMeasure(i, i2);
        } else {
            this.a.a.d().h().a(this, i, i2);
        }
    }
}
