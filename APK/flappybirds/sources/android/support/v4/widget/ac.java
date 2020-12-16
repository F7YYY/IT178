package android.support.v4.widget;

import android.content.Context;
import android.support.v4.view.ao;
import android.support.v4.view.z;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.google.android.gms.e;
import java.util.Arrays;

public class ac {
    private static final Interpolator v = new ad();
    private int a;
    private int b;
    private int c = -1;
    private float[] d;
    private float[] e;
    private float[] f;
    private float[] g;
    private int[] h;
    private int[] i;
    private int[] j;
    private int k;
    private VelocityTracker l;
    private float m;
    private float n;
    private int o;
    private int p;
    private m q;
    private final af r;
    private View s;
    private boolean t;
    private final ViewGroup u;
    private final Runnable w = new ae(this);

    private ac(Context context, ViewGroup viewGroup, af afVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (afVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.u = viewGroup;
            this.r = afVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.b = viewConfiguration.getScaledTouchSlop();
            this.m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.q = m.a(context, v);
        }
    }

    private float a(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        return abs > f4 ? f2 <= 0.0f ? -f4 : f4 : f2;
    }

    private int a(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        int width = this.u.getWidth();
        int i5 = width / 2;
        float b2 = (b(Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width))) * ((float) i5)) + ((float) i5);
        int abs = Math.abs(i3);
        return Math.min(abs > 0 ? Math.round(Math.abs(b2 / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f), 600);
    }

    private int a(View view, int i2, int i3, int i4, int i5) {
        int b2 = b(i4, (int) this.n, (int) this.m);
        int b3 = b(i5, (int) this.n, (int) this.m);
        int abs = Math.abs(i2);
        int abs2 = Math.abs(i3);
        int abs3 = Math.abs(b2);
        int abs4 = Math.abs(b3);
        int i6 = abs3 + abs4;
        int i7 = abs + abs2;
        return (int) (((b3 != 0 ? ((float) abs4) / ((float) i6) : ((float) abs2) / ((float) i7)) * ((float) a(i3, b3, this.r.b(view)))) + ((b2 != 0 ? ((float) abs3) / ((float) i6) : ((float) abs) / ((float) i7)) * ((float) a(i2, b2, this.r.a(view)))));
    }

    public static ac a(ViewGroup viewGroup, float f2, af afVar) {
        ac a2 = a(viewGroup, afVar);
        a2.b = (int) (((float) a2.b) * (1.0f / f2));
        return a2;
    }

    public static ac a(ViewGroup viewGroup, af afVar) {
        return new ac(viewGroup.getContext(), viewGroup, afVar);
    }

    private void a(float f2, float f3) {
        this.t = true;
        this.r.a(this.s, f2, f3);
        this.t = false;
        if (this.a == 1) {
            c(0);
        }
    }

    private void a(float f2, float f3, int i2) {
        f(i2);
        float[] fArr = this.d;
        this.f[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.e;
        this.g[i2] = f3;
        fArr2[i2] = f3;
        this.h[i2] = e((int) f2, (int) f3);
        this.k |= 1 << i2;
    }

    private boolean a(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.h[i2] & i3) != i3 || (this.p & i3) == 0 || (this.j[i2] & i3) == i3 || (this.i[i2] & i3) == i3) {
            return false;
        }
        if (abs <= ((float) this.b) && abs2 <= ((float) this.b)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.r.b(i3)) {
            return (this.i[i2] & i3) == 0 && abs > ((float) this.b);
        }
        int[] iArr = this.j;
        iArr[i2] = iArr[i2] | i3;
        return false;
    }

    private boolean a(int i2, int i3, int i4, int i5) {
        int left = this.s.getLeft();
        int top = this.s.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.q.g();
            c(0);
            return false;
        }
        this.q.a(left, top, i6, i7, a(this.s, i6, i7, i4, i5));
        c(2);
        return true;
    }

    private boolean a(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.r.a(view) > 0;
        boolean z2 = this.r.b(view) > 0;
        if (z && z2) {
            return (f2 * f2) + (f3 * f3) > ((float) (this.b * this.b));
        }
        if (z) {
            return Math.abs(f2) > ((float) this.b);
        }
        if (z2) {
            return Math.abs(f3) > ((float) this.b);
        }
        return false;
    }

    private float b(float f2) {
        return (float) Math.sin((double) ((float) (((double) (f2 - 0.5f)) * 0.4712389167638204d)));
    }

    private int b(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        return abs > i4 ? i2 <= 0 ? -i4 : i4 : i2;
    }

    private void b(float f2, float f3, int i2) {
        int i3 = 1;
        if (!a(f2, f3, i2, 1)) {
            i3 = 0;
        }
        if (a(f3, f2, i2, 4)) {
            i3 |= 4;
        }
        if (a(f2, f3, i2, 2)) {
            i3 |= 2;
        }
        if (a(f3, f2, i2, 8)) {
            i3 |= 8;
        }
        if (i3 != 0) {
            int[] iArr = this.i;
            iArr[i2] = iArr[i2] | i3;
            this.r.b(i3, i2);
        }
    }

    private void b(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int left = this.s.getLeft();
        int top = this.s.getTop();
        if (i4 != 0) {
            i6 = this.r.a(this.s, i2, i4);
            this.s.offsetLeftAndRight(i6 - left);
        } else {
            i6 = i2;
        }
        if (i5 != 0) {
            i7 = this.r.b(this.s, i3, i5);
            this.s.offsetTopAndBottom(i7 - top);
        } else {
            i7 = i3;
        }
        if (i4 != 0 || i5 != 0) {
            this.r.a(this.s, i6, i7, i6 - left, i7 - top);
        }
    }

    private void c(MotionEvent motionEvent) {
        int c2 = z.c(motionEvent);
        for (int i2 = 0; i2 < c2; i2++) {
            int b2 = z.b(motionEvent, i2);
            float c3 = z.c(motionEvent, i2);
            float d2 = z.d(motionEvent, i2);
            this.f[b2] = c3;
            this.g[b2] = d2;
        }
    }

    private int e(int i2, int i3) {
        int i4 = 0;
        if (i2 < this.u.getLeft() + this.o) {
            i4 = 1;
        }
        if (i3 < this.u.getTop() + this.o) {
            i4 |= 4;
        }
        if (i2 > this.u.getRight() - this.o) {
            i4 |= 2;
        }
        return i3 > this.u.getBottom() - this.o ? i4 | 8 : i4;
    }

    private void e(int i2) {
        if (this.d != null) {
            this.d[i2] = 0.0f;
            this.e[i2] = 0.0f;
            this.f[i2] = 0.0f;
            this.g[i2] = 0.0f;
            this.h[i2] = 0;
            this.i[i2] = 0;
            this.j[i2] = 0;
            this.k &= (1 << i2) ^ -1;
        }
    }

    private void f(int i2) {
        if (this.d == null || this.d.length <= i2) {
            float[] fArr = new float[(i2 + 1)];
            float[] fArr2 = new float[(i2 + 1)];
            float[] fArr3 = new float[(i2 + 1)];
            float[] fArr4 = new float[(i2 + 1)];
            int[] iArr = new int[(i2 + 1)];
            int[] iArr2 = new int[(i2 + 1)];
            int[] iArr3 = new int[(i2 + 1)];
            if (this.d != null) {
                System.arraycopy(this.d, 0, fArr, 0, this.d.length);
                System.arraycopy(this.e, 0, fArr2, 0, this.e.length);
                System.arraycopy(this.f, 0, fArr3, 0, this.f.length);
                System.arraycopy(this.g, 0, fArr4, 0, this.g.length);
                System.arraycopy(this.h, 0, iArr, 0, this.h.length);
                System.arraycopy(this.i, 0, iArr2, 0, this.i.length);
                System.arraycopy(this.j, 0, iArr3, 0, this.j.length);
            }
            this.d = fArr;
            this.e = fArr2;
            this.f = fArr3;
            this.g = fArr4;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
    }

    private void g() {
        if (this.d != null) {
            Arrays.fill(this.d, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
    }

    private void h() {
        this.l.computeCurrentVelocity(1000, this.m);
        a(a(ao.a(this.l, this.c), this.n, this.m), a(ao.b(this.l, this.c), this.n, this.m));
    }

    public int a() {
        return this.a;
    }

    public void a(float f2) {
        this.n = f2;
    }

    public void a(int i2) {
        this.p = i2;
    }

    public void a(View view, int i2) {
        if (view.getParent() != this.u) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.u + ")");
        }
        this.s = view;
        this.c = i2;
        this.r.b(view, i2);
        c(1);
    }

    public boolean a(int i2, int i3) {
        if (this.t) {
            return a(i2, i3, (int) ao.a(this.l, this.c), (int) ao.b(this.l, this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public boolean a(MotionEvent motionEvent) {
        View d2;
        View d3;
        int a2 = z.a(motionEvent);
        int b2 = z.b(motionEvent);
        if (a2 == 0) {
            e();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        switch (a2) {
            case e.MapAttrs_mapType /*0*/:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int b3 = z.b(motionEvent, 0);
                a(x, y, b3);
                View d4 = d((int) x, (int) y);
                if (d4 == this.s && this.a == 2) {
                    b(d4, b3);
                }
                int i2 = this.h[b3];
                if ((this.p & i2) != 0) {
                    this.r.a(i2 & this.p, b3);
                    break;
                }
                break;
            case e.MapAttrs_cameraBearing /*1*/:
            case e.MapAttrs_cameraTargetLng /*3*/:
                e();
                break;
            case e.MapAttrs_cameraTargetLat /*2*/:
                int c2 = z.c(motionEvent);
                int i3 = 0;
                while (i3 < c2) {
                    int b4 = z.b(motionEvent, i3);
                    float c3 = z.c(motionEvent, i3);
                    float d5 = z.d(motionEvent, i3);
                    float f2 = c3 - this.d[b4];
                    float f3 = d5 - this.e[b4];
                    b(f2, f3, b4);
                    if (this.a != 1 && ((d2 = d((int) c3, (int) d5)) == null || !a(d2, f2, f3) || !b(d2, b4))) {
                        i3++;
                    }
                    c(motionEvent);
                    break;
                }
                c(motionEvent);
            case e.MapAttrs_cameraZoom /*5*/:
                int b5 = z.b(motionEvent, b2);
                float c4 = z.c(motionEvent, b2);
                float d6 = z.d(motionEvent, b2);
                a(c4, d6, b5);
                if (this.a != 0) {
                    if (this.a == 2 && (d3 = d((int) c4, (int) d6)) == this.s) {
                        b(d3, b5);
                        break;
                    }
                } else {
                    int i4 = this.h[b5];
                    if ((this.p & i4) != 0) {
                        this.r.a(i4 & this.p, b5);
                        break;
                    }
                }
                break;
            case e.MapAttrs_uiCompass /*6*/:
                e(z.b(motionEvent, b2));
                break;
        }
        return this.a == 1;
    }

    public boolean a(View view, int i2, int i3) {
        this.s = view;
        this.c = -1;
        return a(i2, i3, 0, 0);
    }

    public boolean a(boolean z) {
        boolean z2;
        if (this.a == 2) {
            boolean f2 = this.q.f();
            int b2 = this.q.b();
            int c2 = this.q.c();
            int left = b2 - this.s.getLeft();
            int top = c2 - this.s.getTop();
            if (left != 0) {
                this.s.offsetLeftAndRight(left);
            }
            if (top != 0) {
                this.s.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.r.a(this.s, b2, c2, left, top);
            }
            if (f2 && b2 == this.q.d() && c2 == this.q.e()) {
                this.q.g();
                z2 = this.q.a();
            } else {
                z2 = f2;
            }
            if (!z2) {
                if (z) {
                    this.u.post(this.w);
                } else {
                    c(0);
                }
            }
        }
        return this.a == 2;
    }

    public int b() {
        return this.o;
    }

    public void b(MotionEvent motionEvent) {
        int i2;
        int i3 = 0;
        int a2 = z.a(motionEvent);
        int b2 = z.b(motionEvent);
        if (a2 == 0) {
            e();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        switch (a2) {
            case e.MapAttrs_mapType /*0*/:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int b3 = z.b(motionEvent, 0);
                View d2 = d((int) x, (int) y);
                a(x, y, b3);
                b(d2, b3);
                int i4 = this.h[b3];
                if ((this.p & i4) != 0) {
                    this.r.a(i4 & this.p, b3);
                    return;
                }
                return;
            case e.MapAttrs_cameraBearing /*1*/:
                if (this.a == 1) {
                    h();
                }
                e();
                return;
            case e.MapAttrs_cameraTargetLat /*2*/:
                if (this.a == 1) {
                    int a3 = z.a(motionEvent, this.c);
                    float c2 = z.c(motionEvent, a3);
                    float d3 = z.d(motionEvent, a3);
                    int i5 = (int) (c2 - this.f[this.c]);
                    int i6 = (int) (d3 - this.g[this.c]);
                    b(this.s.getLeft() + i5, this.s.getTop() + i6, i5, i6);
                    c(motionEvent);
                    return;
                }
                int c3 = z.c(motionEvent);
                while (i3 < c3) {
                    int b4 = z.b(motionEvent, i3);
                    float c4 = z.c(motionEvent, i3);
                    float d4 = z.d(motionEvent, i3);
                    float f2 = c4 - this.d[b4];
                    float f3 = d4 - this.e[b4];
                    b(f2, f3, b4);
                    if (this.a != 1) {
                        View d5 = d((int) c4, (int) d4);
                        if (!a(d5, f2, f3) || !b(d5, b4)) {
                            i3++;
                        }
                    }
                    c(motionEvent);
                    return;
                }
                c(motionEvent);
                return;
            case e.MapAttrs_cameraTargetLng /*3*/:
                if (this.a == 1) {
                    a(0.0f, 0.0f);
                }
                e();
                return;
            case e.MapAttrs_cameraZoom /*5*/:
                int b5 = z.b(motionEvent, b2);
                float c5 = z.c(motionEvent, b2);
                float d6 = z.d(motionEvent, b2);
                a(c5, d6, b5);
                if (this.a == 0) {
                    b(d((int) c5, (int) d6), b5);
                    int i7 = this.h[b5];
                    if ((this.p & i7) != 0) {
                        this.r.a(i7 & this.p, b5);
                        return;
                    }
                    return;
                } else if (c((int) c5, (int) d6)) {
                    b(this.s, b5);
                    return;
                } else {
                    return;
                }
            case e.MapAttrs_uiCompass /*6*/:
                int b6 = z.b(motionEvent, b2);
                if (this.a == 1 && b6 == this.c) {
                    int c6 = z.c(motionEvent);
                    while (true) {
                        if (i3 >= c6) {
                            i2 = -1;
                        } else {
                            int b7 = z.b(motionEvent, i3);
                            if (b7 != this.c) {
                                if (d((int) z.c(motionEvent, i3), (int) z.d(motionEvent, i3)) == this.s && b(this.s, b7)) {
                                    i2 = this.c;
                                }
                            }
                            i3++;
                        }
                    }
                    if (i2 == -1) {
                        h();
                    }
                }
                e(b6);
                return;
            default:
                return;
        }
    }

    public boolean b(int i2) {
        return (this.k & (1 << i2)) != 0;
    }

    public boolean b(int i2, int i3) {
        if (!b(i3)) {
            return false;
        }
        boolean z = (i2 & 1) == 1;
        boolean z2 = (i2 & 2) == 2;
        float f2 = this.f[i3] - this.d[i3];
        float f3 = this.g[i3] - this.e[i3];
        if (z && z2) {
            return (f2 * f2) + (f3 * f3) > ((float) (this.b * this.b));
        }
        if (z) {
            return Math.abs(f2) > ((float) this.b);
        }
        if (z2) {
            return Math.abs(f3) > ((float) this.b);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean b(View view, int i2) {
        if (view == this.s && this.c == i2) {
            return true;
        }
        if (view == null || !this.r.a(view, i2)) {
            return false;
        }
        this.c = i2;
        a(view, i2);
        return true;
    }

    public boolean b(View view, int i2, int i3) {
        return view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom();
    }

    public View c() {
        return this.s;
    }

    /* access modifiers changed from: package-private */
    public void c(int i2) {
        if (this.a != i2) {
            this.a = i2;
            this.r.a(i2);
            if (i2 == 0) {
                this.s = null;
            }
        }
    }

    public boolean c(int i2, int i3) {
        return b(this.s, i2, i3);
    }

    public int d() {
        return this.b;
    }

    public View d(int i2, int i3) {
        for (int childCount = this.u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.u.getChildAt(this.r.c(childCount));
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public boolean d(int i2) {
        int length = this.d.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (b(i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public void e() {
        this.c = -1;
        g();
        if (this.l != null) {
            this.l.recycle();
            this.l = null;
        }
    }

    public void f() {
        e();
        if (this.a == 2) {
            int b2 = this.q.b();
            int c2 = this.q.c();
            this.q.g();
            int b3 = this.q.b();
            int c3 = this.q.c();
            this.r.a(this.s, b3, c3, b3 - b2, c3 - c2);
        }
        c(0);
    }
}
