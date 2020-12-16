package android.support.v4.widget;

import android.support.v4.widget.DrawerLayout;
import android.view.View;

class f extends af {
    final /* synthetic */ DrawerLayout a;
    private final int b;
    private ac c;
    private final Runnable d = new g(this);

    public f(DrawerLayout drawerLayout, int i) {
        this.a = drawerLayout;
        this.b = i;
    }

    private void b() {
        int i = 3;
        if (this.b == 3) {
            i = 5;
        }
        View a2 = this.a.a(i);
        if (a2 != null) {
            this.a.i(a2);
        }
    }

    /* access modifiers changed from: private */
    public void c() {
        View view;
        int i;
        int i2 = 0;
        int b2 = this.c.b();
        boolean z = this.b == 3;
        if (z) {
            View a2 = this.a.a(3);
            if (a2 != null) {
                i2 = -a2.getWidth();
            }
            int i3 = i2 + b2;
            view = a2;
            i = i3;
        } else {
            View a3 = this.a.a(5);
            int width = this.a.getWidth() - b2;
            view = a3;
            i = width;
        }
        if (view == null) {
            return;
        }
        if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && this.a.a(view) == 0) {
            this.c.a(view, i, view.getTop());
            ((DrawerLayout.LayoutParams) view.getLayoutParams()).c = true;
            this.a.invalidate();
            b();
            this.a.c();
        }
    }

    public int a(View view) {
        return view.getWidth();
    }

    public int a(View view, int i, int i2) {
        if (this.a.a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = this.a.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    public void a() {
        this.a.removeCallbacks(this.d);
    }

    public void a(int i) {
        this.a.a(this.b, i, this.c.c());
    }

    public void a(int i, int i2) {
        this.a.postDelayed(this.d, 160);
    }

    public void a(ac acVar) {
        this.c = acVar;
    }

    public void a(View view, float f, float f2) {
        int width;
        float d2 = this.a.d(view);
        int width2 = view.getWidth();
        if (this.a.a(view, 3)) {
            width = (f > 0.0f || (f == 0.0f && d2 > 0.5f)) ? 0 : -width2;
        } else {
            width = this.a.getWidth();
            if (f < 0.0f || (f == 0.0f && d2 > 0.5f)) {
                width -= width2;
            }
        }
        this.c.a(width, view.getTop());
        this.a.invalidate();
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        int width = view.getWidth();
        float width2 = this.a.a(view, 3) ? ((float) (width + i)) / ((float) width) : ((float) (this.a.getWidth() - i)) / ((float) width);
        this.a.b(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        this.a.invalidate();
    }

    public boolean a(View view, int i) {
        return this.a.g(view) && this.a.a(view, this.b) && this.a.a(view) == 0;
    }

    public int b(View view, int i, int i2) {
        return view.getTop();
    }

    public void b(int i, int i2) {
        View a2 = (i & 1) == 1 ? this.a.a(3) : this.a.a(5);
        if (a2 != null && this.a.a(a2) == 0) {
            this.c.a(a2, i2);
        }
    }

    public void b(View view, int i) {
        ((DrawerLayout.LayoutParams) view.getLayoutParams()).c = false;
        b();
    }

    public boolean b(int i) {
        return false;
    }
}
