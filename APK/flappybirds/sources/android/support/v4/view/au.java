package android.support.v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;

class au implements bc {
    au() {
    }

    public int a(View view) {
        return 2;
    }

    /* access modifiers changed from: package-private */
    public long a() {
        return 10;
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        view.postInvalidateDelayed(a(), i, i2, i3, i4);
    }

    public void a(View view, int i, Paint paint) {
    }

    public void a(View view, Paint paint) {
    }

    public void a(View view, a aVar) {
    }

    public void a(View view, Runnable runnable) {
        view.postDelayed(runnable, a());
    }

    public boolean a(View view, int i) {
        return false;
    }

    public void b(View view) {
        view.postInvalidateDelayed(a());
    }

    public void b(View view, int i) {
    }

    public int c(View view) {
        return 0;
    }

    public int d(View view) {
        return 0;
    }

    public int e(View view) {
        return 0;
    }

    public ViewParent f(View view) {
        return view.getParent();
    }

    public boolean g(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }
}
