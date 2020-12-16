package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;

class ax extends aw {
    ax() {
    }

    /* access modifiers changed from: package-private */
    public long a() {
        return bf.a();
    }

    public void a(View view, int i, Paint paint) {
        bf.a(view, i, paint);
    }

    public void a(View view, Paint paint) {
        a(view, d(view), paint);
        view.invalidate();
    }

    public int d(View view) {
        return bf.a(view);
    }
}
