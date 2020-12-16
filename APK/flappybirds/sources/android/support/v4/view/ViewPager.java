package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.a.a;
import android.support.v4.widget.h;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.google.android.gms.e;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ViewPager extends ViewGroup {
    /* access modifiers changed from: private */
    public static final int[] a = {16842931};
    private static final cg af = new cg();
    private static final Comparator c = new bv();
    private static final Interpolator d = new bw();
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private float F;
    private float G;
    private float H;
    private float I;
    private int J = -1;
    private VelocityTracker K;
    private int L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private h Q;
    private h R;
    private boolean S = true;
    private boolean T = false;
    private boolean U;
    private int V;
    private cc W;
    private cc Z;
    private cb aa;
    private cd ab;
    private Method ac;
    private int ad;
    private ArrayList ae;
    private final Runnable ag = new bx(this);
    private int ah = 0;
    private int b;
    private final ArrayList e = new ArrayList();
    private final bz f = new bz();
    private final Rect g = new Rect();
    /* access modifiers changed from: private */
    public ae h;
    /* access modifiers changed from: private */
    public int i;
    private int j = -1;
    private Parcelable k = null;
    private ClassLoader l = null;
    private Scroller m;
    private ce n;
    private int o;
    private Drawable p;
    private int q;
    private int r;
    private float s = -3.4028235E38f;
    private float t = Float.MAX_VALUE;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z = 1;

    public class LayoutParams extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        float c = 0.0f;
        boolean d;
        int e;
        int f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.a);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = a.a(new cf());
        int a;
        Parcelable b;
        ClassLoader c;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.a = parcel.readInt();
            this.b = parcel.readParcelable(classLoader);
            this.c = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeParcelable(this.b, i);
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    private int a(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.N || Math.abs(i3) <= this.L) {
            i2 = (int) ((i2 >= this.i ? 0.4f : 0.6f) + ((float) i2) + f2);
        } else if (i3 <= 0) {
            i2++;
        }
        return this.e.size() > 0 ? Math.max(((bz) this.e.get(0)).b, Math.min(i2, ((bz) this.e.get(this.e.size() - 1)).b)) : i2;
    }

    private Rect a(Rect rect, View view) {
        Rect rect2 = rect == null ? new Rect() : rect;
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    private void a(int i2, int i3, int i4, int i5) {
        if (i3 <= 0 || this.e.isEmpty()) {
            bz b2 = b(this.i);
            int min = (int) ((b2 != null ? Math.min(b2.e, this.t) : 0.0f) * ((float) ((i2 - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                a(false);
                scrollTo(min, getScrollY());
                return;
            }
            return;
        }
        int paddingLeft = (int) (((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((float) getScrollX()) / ((float) (((i3 - getPaddingLeft()) - getPaddingRight()) + i5))));
        scrollTo(paddingLeft, getScrollY());
        if (!this.m.isFinished()) {
            this.m.startScroll(paddingLeft, 0, (int) (b(this.i).e * ((float) i2)), 0, this.m.getDuration() - this.m.timePassed());
        }
    }

    private void a(int i2, boolean z2, int i3, boolean z3) {
        int i4;
        bz b2 = b(i2);
        if (b2 != null) {
            i4 = (int) (Math.max(this.s, Math.min(b2.e, this.t)) * ((float) getClientWidth()));
        } else {
            i4 = 0;
        }
        if (z2) {
            a(i4, 0, i3);
            if (z3 && this.W != null) {
                this.W.a(i2);
            }
            if (z3 && this.Z != null) {
                this.Z.a(i2);
                return;
            }
            return;
        }
        if (z3 && this.W != null) {
            this.W.a(i2);
        }
        if (z3 && this.Z != null) {
            this.Z.a(i2);
        }
        a(false);
        scrollTo(i4, 0);
        d(i4);
    }

    private void a(bz bzVar, int i2, bz bzVar2) {
        bz bzVar3;
        bz bzVar4;
        int a2 = this.h.a();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? ((float) this.o) / ((float) clientWidth) : 0.0f;
        if (bzVar2 != null) {
            int i3 = bzVar2.b;
            if (i3 < bzVar.b) {
                float f3 = bzVar2.e + bzVar2.d + f2;
                int i4 = i3 + 1;
                int i5 = 0;
                while (i4 <= bzVar.b && i5 < this.e.size()) {
                    Object obj = this.e.get(i5);
                    while (true) {
                        bzVar4 = (bz) obj;
                        if (i4 > bzVar4.b && i5 < this.e.size() - 1) {
                            i5++;
                            obj = this.e.get(i5);
                        }
                    }
                    while (i4 < bzVar4.b) {
                        f3 += this.h.b(i4) + f2;
                        i4++;
                    }
                    bzVar4.e = f3;
                    f3 += bzVar4.d + f2;
                    i4++;
                }
            } else if (i3 > bzVar.b) {
                int size = this.e.size() - 1;
                float f4 = bzVar2.e;
                int i6 = i3 - 1;
                while (i6 >= bzVar.b && size >= 0) {
                    Object obj2 = this.e.get(size);
                    while (true) {
                        bzVar3 = (bz) obj2;
                        if (i6 < bzVar3.b && size > 0) {
                            size--;
                            obj2 = this.e.get(size);
                        }
                    }
                    while (i6 > bzVar3.b) {
                        f4 -= this.h.b(i6) + f2;
                        i6--;
                    }
                    f4 -= bzVar3.d + f2;
                    bzVar3.e = f4;
                    i6--;
                }
            }
        }
        int size2 = this.e.size();
        float f5 = bzVar.e;
        int i7 = bzVar.b - 1;
        this.s = bzVar.b == 0 ? bzVar.e : -3.4028235E38f;
        this.t = bzVar.b == a2 + -1 ? (bzVar.e + bzVar.d) - 1.0f : Float.MAX_VALUE;
        for (int i8 = i2 - 1; i8 >= 0; i8--) {
            bz bzVar5 = (bz) this.e.get(i8);
            float f6 = f5;
            while (i7 > bzVar5.b) {
                f6 -= this.h.b(i7) + f2;
                i7--;
            }
            f5 = f6 - (bzVar5.d + f2);
            bzVar5.e = f5;
            if (bzVar5.b == 0) {
                this.s = f5;
            }
            i7--;
        }
        float f7 = bzVar.e + bzVar.d + f2;
        int i9 = bzVar.b + 1;
        for (int i10 = i2 + 1; i10 < size2; i10++) {
            bz bzVar6 = (bz) this.e.get(i10);
            float f8 = f7;
            while (i9 < bzVar6.b) {
                f8 = this.h.b(i9) + f2 + f8;
                i9++;
            }
            if (bzVar6.b == a2 - 1) {
                this.t = (bzVar6.d + f8) - 1.0f;
            }
            bzVar6.e = f8;
            f7 = f8 + bzVar6.d + f2;
            i9++;
        }
        this.T = false;
    }

    private void a(MotionEvent motionEvent) {
        int b2 = z.b(motionEvent);
        if (z.b(motionEvent, b2) == this.J) {
            int i2 = b2 == 0 ? 1 : 0;
            this.F = z.c(motionEvent, i2);
            this.J = z.b(motionEvent, i2);
            if (this.K != null) {
                this.K.clear();
            }
        }
    }

    private void a(boolean z2) {
        boolean z3 = this.ah == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            this.m.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.m.getCurrX();
            int currY = this.m.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
        }
        this.y = false;
        boolean z4 = z3;
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            bz bzVar = (bz) this.e.get(i2);
            if (bzVar.c) {
                bzVar.c = false;
                z4 = true;
            }
        }
        if (!z4) {
            return;
        }
        if (z2) {
            at.a((View) this, this.ag);
        } else {
            this.ag.run();
        }
    }

    private boolean a(float f2, float f3) {
        return (f2 < ((float) this.D) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.D)) && f3 < 0.0f);
    }

    private void b(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            at.a(getChildAt(i2), z2 ? 2 : 0, (Paint) null);
        }
    }

    private boolean b(float f2) {
        boolean z2;
        float f3;
        boolean z3 = true;
        boolean z4 = false;
        this.F = f2;
        float scrollX = ((float) getScrollX()) + (this.F - f2);
        int clientWidth = getClientWidth();
        float f4 = ((float) clientWidth) * this.s;
        float f5 = ((float) clientWidth) * this.t;
        bz bzVar = (bz) this.e.get(0);
        bz bzVar2 = (bz) this.e.get(this.e.size() - 1);
        if (bzVar.b != 0) {
            f4 = bzVar.e * ((float) clientWidth);
            z2 = false;
        } else {
            z2 = true;
        }
        if (bzVar2.b != this.h.a() - 1) {
            f3 = bzVar2.e * ((float) clientWidth);
            z3 = false;
        } else {
            f3 = f5;
        }
        if (scrollX < f4) {
            if (z2) {
                z4 = this.Q.a(Math.abs(f4 - scrollX) / ((float) clientWidth));
            }
        } else if (scrollX > f3) {
            if (z3) {
                z4 = this.R.a(Math.abs(scrollX - f3) / ((float) clientWidth));
            }
            f4 = f3;
        } else {
            f4 = scrollX;
        }
        this.F += f4 - ((float) ((int) f4));
        scrollTo((int) f4, getScrollY());
        d((int) f4);
        return z4;
    }

    private void c(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    private boolean d(int i2) {
        if (this.e.size() == 0) {
            this.U = false;
            a(0, 0.0f, 0);
            if (this.U) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        bz i3 = i();
        int clientWidth = getClientWidth();
        int i4 = this.o + clientWidth;
        float f2 = ((float) this.o) / ((float) clientWidth);
        int i5 = i3.b;
        float f3 = ((((float) i2) / ((float) clientWidth)) - i3.e) / (i3.d + f2);
        this.U = false;
        a(i5, f3, (int) (((float) i4) * f3));
        if (this.U) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void g() {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i3).getLayoutParams()).a) {
                    removeViewAt(i3);
                    i3--;
                }
                i2 = i3 + 1;
            } else {
                return;
            }
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void h() {
        if (this.ad != 0) {
            if (this.ae == null) {
                this.ae = new ArrayList();
            } else {
                this.ae.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.ae.add(getChildAt(i2));
            }
            Collections.sort(this.ae, af);
        }
    }

    private bz i() {
        int i2;
        bz bzVar;
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f2 = clientWidth > 0 ? ((float) this.o) / ((float) clientWidth) : 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = true;
        bz bzVar2 = null;
        while (i4 < this.e.size()) {
            bz bzVar3 = (bz) this.e.get(i4);
            if (z2 || bzVar3.b == i3 + 1) {
                bz bzVar4 = bzVar3;
                i2 = i4;
                bzVar = bzVar4;
            } else {
                bz bzVar5 = this.f;
                bzVar5.e = f3 + f4 + f2;
                bzVar5.b = i3 + 1;
                bzVar5.d = this.h.b(bzVar5.b);
                bz bzVar6 = bzVar5;
                i2 = i4 - 1;
                bzVar = bzVar6;
            }
            float f5 = bzVar.e;
            float f6 = bzVar.d + f5 + f2;
            if (!z2 && scrollX < f5) {
                return bzVar2;
            }
            if (scrollX < f6 || i2 == this.e.size() - 1) {
                return bzVar;
            }
            f4 = f5;
            i3 = bzVar.b;
            z2 = false;
            f3 = bzVar.d;
            bzVar2 = bzVar;
            i4 = i2 + 1;
        }
        return bzVar2;
    }

    private void j() {
        this.A = false;
        this.B = false;
        if (this.K != null) {
            this.K.recycle();
            this.K = null;
        }
    }

    /* access modifiers changed from: private */
    public void setScrollState(int i2) {
        if (this.ah != i2) {
            this.ah = i2;
            if (this.ab != null) {
                b(i2 != 0);
            }
            if (this.W != null) {
                this.W.b(i2);
            }
        }
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.x != z2) {
            this.x = z2;
        }
    }

    /* access modifiers changed from: package-private */
    public float a(float f2) {
        return (float) Math.sin((double) ((float) (((double) (f2 - 0.5f)) * 0.4712389167638204d)));
    }

    /* access modifiers changed from: package-private */
    public bz a(int i2, int i3) {
        bz bzVar = new bz();
        bzVar.b = i2;
        bzVar.a = this.h.a((ViewGroup) this, i2);
        bzVar.d = this.h.b(i2);
        if (i3 < 0 || i3 >= this.e.size()) {
            this.e.add(bzVar);
        } else {
            this.e.add(i3, bzVar);
        }
        return bzVar;
    }

    /* access modifiers changed from: package-private */
    public bz a(View view) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.e.size()) {
                return null;
            }
            bz bzVar = (bz) this.e.get(i3);
            if (this.h.a(view, bzVar.a)) {
                return bzVar;
            }
            i2 = i3 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    public cc a(cc ccVar) {
        cc ccVar2 = this.Z;
        this.Z = ccVar;
        return ccVar2;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.m = new Scroller(context, d);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.E = bj.a(viewConfiguration);
        this.L = (int) (400.0f * f2);
        this.M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Q = new h(context);
        this.R = new h(context);
        this.N = (int) (25.0f * f2);
        this.O = (int) (2.0f * f2);
        this.C = (int) (16.0f * f2);
        at.a((View) this, (a) new ca(this));
        if (at.c(this) == 0) {
            at.b(this, 1);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ff, code lost:
        if (r2.b == r18.i) goto L_0x0101;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r19) {
        /*
            r18 = this;
            r3 = 0
            r2 = 2
            r0 = r18
            int r4 = r0.i
            r0 = r19
            if (r4 == r0) goto L_0x033f
            r0 = r18
            int r2 = r0.i
            r0 = r19
            if (r2 >= r0) goto L_0x0030
            r2 = 66
        L_0x0014:
            r0 = r18
            int r3 = r0.i
            r0 = r18
            android.support.v4.view.bz r3 = r0.b((int) r3)
            r0 = r19
            r1 = r18
            r1.i = r0
            r4 = r3
            r3 = r2
        L_0x0026:
            r0 = r18
            android.support.v4.view.ae r2 = r0.h
            if (r2 != 0) goto L_0x0033
            r18.h()
        L_0x002f:
            return
        L_0x0030:
            r2 = 17
            goto L_0x0014
        L_0x0033:
            r0 = r18
            boolean r2 = r0.y
            if (r2 == 0) goto L_0x003d
            r18.h()
            goto L_0x002f
        L_0x003d:
            android.os.IBinder r2 = r18.getWindowToken()
            if (r2 == 0) goto L_0x002f
            r0 = r18
            android.support.v4.view.ae r2 = r0.h
            r0 = r18
            r2.a((android.view.ViewGroup) r0)
            r0 = r18
            int r2 = r0.z
            r5 = 0
            r0 = r18
            int r6 = r0.i
            int r6 = r6 - r2
            int r11 = java.lang.Math.max(r5, r6)
            r0 = r18
            android.support.v4.view.ae r5 = r0.h
            int r12 = r5.a()
            int r5 = r12 + -1
            r0 = r18
            int r6 = r0.i
            int r2 = r2 + r6
            int r13 = java.lang.Math.min(r5, r2)
            r0 = r18
            int r2 = r0.b
            if (r12 == r2) goto L_0x00da
            android.content.res.Resources r2 = r18.getResources()     // Catch:{ NotFoundException -> 0x00d0 }
            int r3 = r18.getId()     // Catch:{ NotFoundException -> 0x00d0 }
            java.lang.String r2 = r2.getResourceName(r3)     // Catch:{ NotFoundException -> 0x00d0 }
        L_0x007f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            java.lang.StringBuilder r4 = r4.append(r5)
            r0 = r18
            int r5 = r0.b
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ", found: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r12)
            java.lang.String r5 = " Pager id: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = " Pager class: "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.Class r4 = r18.getClass()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = " Problematic adapter: "
            java.lang.StringBuilder r2 = r2.append(r4)
            r0 = r18
            android.support.v4.view.ae r4 = r0.h
            java.lang.Class r4 = r4.getClass()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L_0x00d0:
            r2 = move-exception
            int r2 = r18.getId()
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            goto L_0x007f
        L_0x00da:
            r6 = 0
            r2 = 0
            r5 = r2
        L_0x00dd:
            r0 = r18
            java.util.ArrayList r2 = r0.e
            int r2 = r2.size()
            if (r5 >= r2) goto L_0x033c
            r0 = r18
            java.util.ArrayList r2 = r0.e
            java.lang.Object r2 = r2.get(r5)
            android.support.v4.view.bz r2 = (android.support.v4.view.bz) r2
            int r7 = r2.b
            r0 = r18
            int r8 = r0.i
            if (r7 < r8) goto L_0x01cf
            int r7 = r2.b
            r0 = r18
            int r8 = r0.i
            if (r7 != r8) goto L_0x033c
        L_0x0101:
            if (r2 != 0) goto L_0x0339
            if (r12 <= 0) goto L_0x0339
            r0 = r18
            int r2 = r0.i
            r0 = r18
            android.support.v4.view.bz r2 = r0.a((int) r2, (int) r5)
            r10 = r2
        L_0x0110:
            if (r10 == 0) goto L_0x0180
            r9 = 0
            int r8 = r5 + -1
            if (r8 < 0) goto L_0x01d4
            r0 = r18
            java.util.ArrayList r2 = r0.e
            java.lang.Object r2 = r2.get(r8)
            android.support.v4.view.bz r2 = (android.support.v4.view.bz) r2
        L_0x0121:
            int r14 = r18.getClientWidth()
            if (r14 > 0) goto L_0x01d7
            r6 = 0
        L_0x0128:
            r0 = r18
            int r7 = r0.i
            int r7 = r7 + -1
            r16 = r7
            r7 = r9
            r9 = r16
            r17 = r8
            r8 = r5
            r5 = r17
        L_0x0138:
            if (r9 < 0) goto L_0x0142
            int r15 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r15 < 0) goto L_0x0216
            if (r9 >= r11) goto L_0x0216
            if (r2 != 0) goto L_0x01e6
        L_0x0142:
            float r6 = r10.d
            int r9 = r8 + 1
            r2 = 1073741824(0x40000000, float:2.0)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x017b
            r0 = r18
            java.util.ArrayList r2 = r0.e
            int r2 = r2.size()
            if (r9 >= r2) goto L_0x024c
            r0 = r18
            java.util.ArrayList r2 = r0.e
            java.lang.Object r2 = r2.get(r9)
            android.support.v4.view.bz r2 = (android.support.v4.view.bz) r2
            r7 = r2
        L_0x0161:
            if (r14 > 0) goto L_0x024f
            r2 = 0
            r5 = r2
        L_0x0165:
            r0 = r18
            int r2 = r0.i
            int r2 = r2 + 1
            r16 = r2
            r2 = r7
            r7 = r9
            r9 = r16
        L_0x0171:
            if (r9 >= r12) goto L_0x017b
            int r11 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r11 < 0) goto L_0x029a
            if (r9 <= r13) goto L_0x029a
            if (r2 != 0) goto L_0x025c
        L_0x017b:
            r0 = r18
            r0.a((android.support.v4.view.bz) r10, (int) r8, (android.support.v4.view.bz) r4)
        L_0x0180:
            r0 = r18
            android.support.v4.view.ae r4 = r0.h
            r0 = r18
            int r5 = r0.i
            if (r10 == 0) goto L_0x02e8
            java.lang.Object r2 = r10.a
        L_0x018c:
            r0 = r18
            r4.b((android.view.ViewGroup) r0, (int) r5, (java.lang.Object) r2)
            r0 = r18
            android.support.v4.view.ae r2 = r0.h
            r0 = r18
            r2.b((android.view.ViewGroup) r0)
            int r5 = r18.getChildCount()
            r2 = 0
            r4 = r2
        L_0x01a0:
            if (r4 >= r5) goto L_0x02eb
            r0 = r18
            android.view.View r6 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            android.support.v4.view.ViewPager$LayoutParams r2 = (android.support.v4.view.ViewPager.LayoutParams) r2
            r2.f = r4
            boolean r7 = r2.a
            if (r7 != 0) goto L_0x01cb
            float r7 = r2.c
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x01cb
            r0 = r18
            android.support.v4.view.bz r6 = r0.a((android.view.View) r6)
            if (r6 == 0) goto L_0x01cb
            float r7 = r6.d
            r2.c = r7
            int r6 = r6.b
            r2.e = r6
        L_0x01cb:
            int r2 = r4 + 1
            r4 = r2
            goto L_0x01a0
        L_0x01cf:
            int r2 = r5 + 1
            r5 = r2
            goto L_0x00dd
        L_0x01d4:
            r2 = 0
            goto L_0x0121
        L_0x01d7:
            r6 = 1073741824(0x40000000, float:2.0)
            float r7 = r10.d
            float r6 = r6 - r7
            int r7 = r18.getPaddingLeft()
            float r7 = (float) r7
            float r15 = (float) r14
            float r7 = r7 / r15
            float r6 = r6 + r7
            goto L_0x0128
        L_0x01e6:
            int r15 = r2.b
            if (r9 != r15) goto L_0x0210
            boolean r15 = r2.c
            if (r15 != 0) goto L_0x0210
            r0 = r18
            java.util.ArrayList r15 = r0.e
            r15.remove(r5)
            r0 = r18
            android.support.v4.view.ae r15 = r0.h
            java.lang.Object r2 = r2.a
            r0 = r18
            r15.a((android.view.ViewGroup) r0, (int) r9, (java.lang.Object) r2)
            int r5 = r5 + -1
            int r8 = r8 + -1
            if (r5 < 0) goto L_0x0214
            r0 = r18
            java.util.ArrayList r2 = r0.e
            java.lang.Object r2 = r2.get(r5)
            android.support.v4.view.bz r2 = (android.support.v4.view.bz) r2
        L_0x0210:
            int r9 = r9 + -1
            goto L_0x0138
        L_0x0214:
            r2 = 0
            goto L_0x0210
        L_0x0216:
            if (r2 == 0) goto L_0x0230
            int r15 = r2.b
            if (r9 != r15) goto L_0x0230
            float r2 = r2.d
            float r7 = r7 + r2
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x022e
            r0 = r18
            java.util.ArrayList r2 = r0.e
            java.lang.Object r2 = r2.get(r5)
            android.support.v4.view.bz r2 = (android.support.v4.view.bz) r2
            goto L_0x0210
        L_0x022e:
            r2 = 0
            goto L_0x0210
        L_0x0230:
            int r2 = r5 + 1
            r0 = r18
            android.support.v4.view.bz r2 = r0.a((int) r9, (int) r2)
            float r2 = r2.d
            float r7 = r7 + r2
            int r8 = r8 + 1
            if (r5 < 0) goto L_0x024a
            r0 = r18
            java.util.ArrayList r2 = r0.e
            java.lang.Object r2 = r2.get(r5)
            android.support.v4.view.bz r2 = (android.support.v4.view.bz) r2
            goto L_0x0210
        L_0x024a:
            r2 = 0
            goto L_0x0210
        L_0x024c:
            r7 = 0
            goto L_0x0161
        L_0x024f:
            int r2 = r18.getPaddingRight()
            float r2 = (float) r2
            float r5 = (float) r14
            float r2 = r2 / r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 + r5
            r5 = r2
            goto L_0x0165
        L_0x025c:
            int r11 = r2.b
            if (r9 != r11) goto L_0x0332
            boolean r11 = r2.c
            if (r11 != 0) goto L_0x0332
            r0 = r18
            java.util.ArrayList r11 = r0.e
            r11.remove(r7)
            r0 = r18
            android.support.v4.view.ae r11 = r0.h
            java.lang.Object r2 = r2.a
            r0 = r18
            r11.a((android.view.ViewGroup) r0, (int) r9, (java.lang.Object) r2)
            r0 = r18
            java.util.ArrayList r2 = r0.e
            int r2 = r2.size()
            if (r7 >= r2) goto L_0x0298
            r0 = r18
            java.util.ArrayList r2 = r0.e
            java.lang.Object r2 = r2.get(r7)
            android.support.v4.view.bz r2 = (android.support.v4.view.bz) r2
        L_0x028a:
            r16 = r6
            r6 = r2
            r2 = r16
        L_0x028f:
            int r9 = r9 + 1
            r16 = r2
            r2 = r6
            r6 = r16
            goto L_0x0171
        L_0x0298:
            r2 = 0
            goto L_0x028a
        L_0x029a:
            if (r2 == 0) goto L_0x02c1
            int r11 = r2.b
            if (r9 != r11) goto L_0x02c1
            float r2 = r2.d
            float r6 = r6 + r2
            int r7 = r7 + 1
            r0 = r18
            java.util.ArrayList r2 = r0.e
            int r2 = r2.size()
            if (r7 >= r2) goto L_0x02bf
            r0 = r18
            java.util.ArrayList r2 = r0.e
            java.lang.Object r2 = r2.get(r7)
            android.support.v4.view.bz r2 = (android.support.v4.view.bz) r2
        L_0x02b9:
            r16 = r6
            r6 = r2
            r2 = r16
            goto L_0x028f
        L_0x02bf:
            r2 = 0
            goto L_0x02b9
        L_0x02c1:
            r0 = r18
            android.support.v4.view.bz r2 = r0.a((int) r9, (int) r7)
            int r7 = r7 + 1
            float r2 = r2.d
            float r6 = r6 + r2
            r0 = r18
            java.util.ArrayList r2 = r0.e
            int r2 = r2.size()
            if (r7 >= r2) goto L_0x02e6
            r0 = r18
            java.util.ArrayList r2 = r0.e
            java.lang.Object r2 = r2.get(r7)
            android.support.v4.view.bz r2 = (android.support.v4.view.bz) r2
        L_0x02e0:
            r16 = r6
            r6 = r2
            r2 = r16
            goto L_0x028f
        L_0x02e6:
            r2 = 0
            goto L_0x02e0
        L_0x02e8:
            r2 = 0
            goto L_0x018c
        L_0x02eb:
            r18.h()
            boolean r2 = r18.hasFocus()
            if (r2 == 0) goto L_0x002f
            android.view.View r2 = r18.findFocus()
            if (r2 == 0) goto L_0x0330
            r0 = r18
            android.support.v4.view.bz r2 = r0.b((android.view.View) r2)
        L_0x0300:
            if (r2 == 0) goto L_0x030a
            int r2 = r2.b
            r0 = r18
            int r4 = r0.i
            if (r2 == r4) goto L_0x002f
        L_0x030a:
            r2 = 0
        L_0x030b:
            int r4 = r18.getChildCount()
            if (r2 >= r4) goto L_0x002f
            r0 = r18
            android.view.View r4 = r0.getChildAt(r2)
            r0 = r18
            android.support.v4.view.bz r5 = r0.a((android.view.View) r4)
            if (r5 == 0) goto L_0x032d
            int r5 = r5.b
            r0 = r18
            int r6 = r0.i
            if (r5 != r6) goto L_0x032d
            boolean r4 = r4.requestFocus(r3)
            if (r4 != 0) goto L_0x002f
        L_0x032d:
            int r2 = r2 + 1
            goto L_0x030b
        L_0x0330:
            r2 = 0
            goto L_0x0300
        L_0x0332:
            r16 = r6
            r6 = r2
            r2 = r16
            goto L_0x028f
        L_0x0339:
            r10 = r2
            goto L_0x0110
        L_0x033c:
            r2 = r6
            goto L_0x0101
        L_0x033f:
            r4 = r3
            r3 = r2
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.a(int):void");
    }

    /* access modifiers changed from: protected */
    public void a(int i2, float f2, int i3) {
        int measuredWidth;
        int i4;
        int i5;
        if (this.V > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            int i6 = 0;
            while (i6 < childCount) {
                View childAt = getChildAt(i6);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (!layoutParams.a) {
                    int i7 = paddingRight;
                    i4 = paddingLeft;
                    i5 = i7;
                } else {
                    switch (layoutParams.b & 7) {
                        case e.MapAttrs_cameraBearing /*1*/:
                            measuredWidth = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            int i8 = paddingRight;
                            i4 = paddingLeft;
                            i5 = i8;
                            break;
                        case e.MapAttrs_cameraTargetLng /*3*/:
                            int width2 = childAt.getWidth() + paddingLeft;
                            int i9 = paddingLeft;
                            i5 = paddingRight;
                            i4 = width2;
                            measuredWidth = i9;
                            break;
                        case e.MapAttrs_cameraZoom /*5*/:
                            measuredWidth = (width - paddingRight) - childAt.getMeasuredWidth();
                            int measuredWidth2 = paddingRight + childAt.getMeasuredWidth();
                            i4 = paddingLeft;
                            i5 = measuredWidth2;
                            break;
                        default:
                            measuredWidth = paddingLeft;
                            int i10 = paddingRight;
                            i4 = paddingLeft;
                            i5 = i10;
                            break;
                    }
                    int left = (measuredWidth + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                }
                i6++;
                int i11 = i5;
                paddingLeft = i4;
                paddingRight = i11;
            }
        }
        if (this.W != null) {
            this.W.a(i2, f2, i3);
        }
        if (this.Z != null) {
            this.Z.a(i2, f2, i3);
        }
        if (this.ab != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = getChildAt(i12);
                if (!((LayoutParams) childAt2.getLayoutParams()).a) {
                    this.ab.a(childAt2, ((float) (childAt2.getLeft() - scrollX2)) / ((float) getClientWidth()));
                }
            }
        }
        this.U = true;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3, int i4) {
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i5 = i2 - scrollX;
        int i6 = i3 - scrollY;
        if (i5 == 0 && i6 == 0) {
            a(false);
            c();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float a2 = (((float) i7) * a(Math.min(1.0f, (((float) Math.abs(i5)) * 1.0f) / ((float) clientWidth)))) + ((float) i7);
        int abs2 = Math.abs(i4);
        if (abs2 > 0) {
            abs = Math.round(1000.0f * Math.abs(a2 / ((float) abs2))) * 4;
        } else {
            abs = (int) (((((float) Math.abs(i5)) / ((((float) clientWidth) * this.h.b(this.i)) + ((float) this.o))) + 1.0f) * 100.0f);
        }
        this.m.startScroll(scrollX, scrollY, i5, i6, Math.min(abs, 600));
        at.b(this);
    }

    public void a(int i2, boolean z2) {
        this.y = false;
        a(i2, z2, false);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, boolean z2, boolean z3) {
        a(i2, z2, z3, 0);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, boolean z2, boolean z3, int i3) {
        boolean z4 = false;
        if (this.h == null || this.h.a() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z3 || this.i != i2 || this.e.size() == 0) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.h.a()) {
                i2 = this.h.a() - 1;
            }
            int i4 = this.z;
            if (i2 > this.i + i4 || i2 < this.i - i4) {
                for (int i5 = 0; i5 < this.e.size(); i5++) {
                    ((bz) this.e.get(i5)).c = true;
                }
            }
            if (this.i != i2) {
                z4 = true;
            }
            if (this.S) {
                this.i = i2;
                if (z4 && this.W != null) {
                    this.W.a(i2);
                }
                if (z4 && this.Z != null) {
                    this.Z.a(i2);
                }
                requestLayout();
                return;
            }
            a(i2);
            a(i2, z2, i3, z4);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                return c(17);
            case 22:
                return c(66);
            case 61:
                if (Build.VERSION.SDK_INT < 11) {
                    return false;
                }
                if (s.a(keyEvent)) {
                    return c(2);
                }
                if (s.a(keyEvent, 1)) {
                    return c(1);
                }
                return false;
            default:
                return false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(View view, boolean z2, int i2, int i3, int i4) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i3 + scrollX >= childAt.getLeft() && i3 + scrollX < childAt.getRight() && i4 + scrollY >= childAt.getTop() && i4 + scrollY < childAt.getBottom()) {
                    if (a(childAt, true, i2, (i3 + scrollX) - childAt.getLeft(), (i4 + scrollY) - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z2 && at.a(view, -i2);
    }

    public void addFocusables(ArrayList arrayList, int i2, int i3) {
        bz a2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.i) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i3 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList arrayList) {
        bz a2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.i) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams generateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : layoutParams;
        LayoutParams layoutParams2 = (LayoutParams) generateLayoutParams;
        layoutParams2.a |= view instanceof by;
        if (!this.w) {
            super.addView(view, i2, generateLayoutParams);
        } else if (layoutParams2 == null || !layoutParams2.a) {
            layoutParams2.d = true;
            addViewInLayout(view, i2, generateLayoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* access modifiers changed from: package-private */
    public bz b(int i2) {
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= this.e.size()) {
                return null;
            }
            bz bzVar = (bz) this.e.get(i4);
            if (bzVar.b == i2) {
                return bzVar;
            }
            i3 = i4 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    public bz b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return a(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int a2 = this.h.a();
        this.b = a2;
        boolean z4 = this.e.size() < (this.z * 2) + 1 && this.e.size() < a2;
        boolean z5 = false;
        int i4 = this.i;
        boolean z6 = z4;
        int i5 = 0;
        while (i5 < this.e.size()) {
            bz bzVar = (bz) this.e.get(i5);
            int a3 = this.h.a(bzVar.a);
            if (a3 == -1) {
                i2 = i5;
                z2 = z5;
                i3 = i4;
                z3 = z6;
            } else if (a3 == -2) {
                this.e.remove(i5);
                int i6 = i5 - 1;
                if (!z5) {
                    this.h.a((ViewGroup) this);
                    z5 = true;
                }
                this.h.a((ViewGroup) this, bzVar.b, bzVar.a);
                if (this.i == bzVar.b) {
                    i2 = i6;
                    z2 = z5;
                    i3 = Math.max(0, Math.min(this.i, a2 - 1));
                    z3 = true;
                } else {
                    i2 = i6;
                    z2 = z5;
                    i3 = i4;
                    z3 = true;
                }
            } else if (bzVar.b != a3) {
                if (bzVar.b == this.i) {
                    i4 = a3;
                }
                bzVar.b = a3;
                i2 = i5;
                z2 = z5;
                i3 = i4;
                z3 = true;
            } else {
                i2 = i5;
                z2 = z5;
                i3 = i4;
                z3 = z6;
            }
            z6 = z3;
            i4 = i3;
            z5 = z2;
            i5 = i2 + 1;
        }
        if (z5) {
            this.h.b((ViewGroup) this);
        }
        Collections.sort(this.e, c);
        if (z6) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i7).getLayoutParams();
                if (!layoutParams.a) {
                    layoutParams.c = 0.0f;
                }
            }
            a(i4, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        a(this.i);
    }

    public boolean c(int i2) {
        View view;
        boolean z2;
        boolean z3;
        View findFocus = findFocus();
        if (findFocus == this) {
            view = null;
        } else {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z2 = false;
                        break;
                    } else if (parent == this) {
                        z2 = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (!z2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ").append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                    view = null;
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i2);
        if (findNextFocus == null || findNextFocus == view) {
            if (i2 == 17 || i2 == 1) {
                z3 = d();
            } else {
                if (i2 == 66 || i2 == 2) {
                    z3 = e();
                }
                z3 = false;
            }
        } else if (i2 == 17) {
            z3 = (view == null || a(this.g, findNextFocus).left < a(this.g, view).left) ? findNextFocus.requestFocus() : d();
        } else {
            if (i2 == 66) {
                z3 = (view == null || a(this.g, findNextFocus).left > a(this.g, view).left) ? findNextFocus.requestFocus() : e();
            }
            z3 = false;
        }
        if (z3) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return z3;
    }

    public boolean canScrollHorizontally(int i2) {
        boolean z2 = true;
        if (this.h == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i2 < 0) {
            if (scrollX <= ((int) (((float) clientWidth) * this.s))) {
                z2 = false;
            }
            return z2;
        } else if (i2 <= 0) {
            return false;
        } else {
            if (scrollX >= ((int) (((float) clientWidth) * this.t))) {
                z2 = false;
            }
            return z2;
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (this.m.isFinished() || !this.m.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.m.getCurrX();
        int currY = this.m.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!d(currX)) {
                this.m.abortAnimation();
                scrollTo(0, currY);
            }
        }
        at.b(this);
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        if (this.i <= 0) {
            return false;
        }
        a(this.i - 1, true);
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        bz a2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z2 = false;
        int a2 = at.a(this);
        if (a2 == 0 || (a2 == 1 && this.h != null && this.h.a() > 1)) {
            if (!this.Q.a()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.s * ((float) width));
                this.Q.a(height, width);
                z2 = false | this.Q.a(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.R.a()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.t + 1.0f)) * ((float) width2));
                this.R.a(height2, width2);
                z2 |= this.R.a(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.Q.b();
            this.R.b();
        }
        if (z2) {
            at.b(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.p;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        if (this.h == null || this.i >= this.h.a() - 1) {
            return false;
        }
        a(this.i + 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public ae getAdapter() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.ad == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((LayoutParams) ((View) this.ae.get(i3)).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.i;
    }

    public int getOffscreenPageLimit() {
        return this.z;
    }

    public int getPageMargin() {
        return this.o;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.ag);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f2;
        super.onDraw(canvas);
        if (this.o > 0 && this.p != null && this.e.size() > 0 && this.h != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f3 = ((float) this.o) / ((float) width);
            bz bzVar = (bz) this.e.get(0);
            float f4 = bzVar.e;
            int size = this.e.size();
            int i2 = bzVar.b;
            int i3 = ((bz) this.e.get(size - 1)).b;
            int i4 = 0;
            int i5 = i2;
            while (i5 < i3) {
                while (i5 > bzVar.b && i4 < size) {
                    i4++;
                    bzVar = (bz) this.e.get(i4);
                }
                if (i5 == bzVar.b) {
                    f2 = (bzVar.e + bzVar.d) * ((float) width);
                    f4 = bzVar.e + bzVar.d + f3;
                } else {
                    float b2 = this.h.b(i5);
                    f2 = (f4 + b2) * ((float) width);
                    f4 += b2 + f3;
                }
                if (((float) this.o) + f2 > ((float) scrollX)) {
                    this.p.setBounds((int) f2, this.q, (int) (((float) this.o) + f2 + 0.5f), this.r);
                    this.p.draw(canvas);
                }
                if (f2 <= ((float) (scrollX + width))) {
                    i5++;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.A = false;
            this.B = false;
            this.J = -1;
            if (this.K == null) {
                return false;
            }
            this.K.recycle();
            this.K = null;
            return false;
        }
        if (action != 0) {
            if (this.A) {
                return true;
            }
            if (this.B) {
                return false;
            }
        }
        switch (action) {
            case e.MapAttrs_mapType /*0*/:
                float x2 = motionEvent.getX();
                this.H = x2;
                this.F = x2;
                float y2 = motionEvent.getY();
                this.I = y2;
                this.G = y2;
                this.J = z.b(motionEvent, 0);
                this.B = false;
                this.m.computeScrollOffset();
                if (this.ah == 2 && Math.abs(this.m.getFinalX() - this.m.getCurrX()) > this.O) {
                    this.m.abortAnimation();
                    this.y = false;
                    c();
                    this.A = true;
                    c(true);
                    setScrollState(1);
                    break;
                } else {
                    a(false);
                    this.A = false;
                    break;
                }
                break;
            case e.MapAttrs_cameraTargetLat /*2*/:
                int i2 = this.J;
                if (i2 != -1) {
                    int a2 = z.a(motionEvent, i2);
                    float c2 = z.c(motionEvent, a2);
                    float f2 = c2 - this.F;
                    float abs = Math.abs(f2);
                    float d2 = z.d(motionEvent, a2);
                    float abs2 = Math.abs(d2 - this.I);
                    if (f2 != 0.0f && !a(this.F, f2)) {
                        if (a(this, false, (int) f2, (int) c2, (int) d2)) {
                            this.F = c2;
                            this.G = d2;
                            this.B = true;
                            return false;
                        }
                    }
                    if (abs > ((float) this.E) && 0.5f * abs > abs2) {
                        this.A = true;
                        c(true);
                        setScrollState(1);
                        this.F = f2 > 0.0f ? this.H + ((float) this.E) : this.H - ((float) this.E);
                        this.G = d2;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > ((float) this.E)) {
                        this.B = true;
                    }
                    if (this.A && b(c2)) {
                        at.b(this);
                        break;
                    }
                }
                break;
            case e.MapAttrs_uiCompass /*6*/:
                a(motionEvent);
                break;
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        return this.A;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        bz a2;
        int i6;
        int i7;
        int i8;
        int measuredHeight;
        int i9;
        int i10;
        int childCount = getChildCount();
        int i11 = i4 - i2;
        int i12 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i13 = 0;
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.a) {
                    int i15 = layoutParams.b & 7;
                    int i16 = layoutParams.b & 112;
                    switch (i15) {
                        case e.MapAttrs_cameraBearing /*1*/:
                            i8 = Math.max((i11 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case e.MapAttrs_cameraTargetLng /*3*/:
                            i8 = paddingLeft;
                            paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                            break;
                        case e.MapAttrs_cameraZoom /*5*/:
                            int measuredWidth = (i11 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            i8 = measuredWidth;
                            break;
                        default:
                            i8 = paddingLeft;
                            break;
                    }
                    switch (i16) {
                        case 16:
                            measuredHeight = Math.max((i12 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            int i17 = paddingBottom;
                            i9 = paddingTop;
                            i10 = i17;
                            break;
                        case 48:
                            int measuredHeight2 = childAt.getMeasuredHeight() + paddingTop;
                            int i18 = paddingTop;
                            i10 = paddingBottom;
                            i9 = measuredHeight2;
                            measuredHeight = i18;
                            break;
                        case 80:
                            measuredHeight = (i12 - paddingBottom) - childAt.getMeasuredHeight();
                            int measuredHeight3 = paddingBottom + childAt.getMeasuredHeight();
                            i9 = paddingTop;
                            i10 = measuredHeight3;
                            break;
                        default:
                            measuredHeight = paddingTop;
                            int i19 = paddingBottom;
                            i9 = paddingTop;
                            i10 = i19;
                            break;
                    }
                    int i20 = i8 + scrollX;
                    childAt.layout(i20, measuredHeight, childAt.getMeasuredWidth() + i20, childAt.getMeasuredHeight() + measuredHeight);
                    i6 = i13 + 1;
                    i7 = i9;
                    paddingBottom = i10;
                    i14++;
                    paddingLeft = paddingLeft;
                    paddingRight = paddingRight;
                    paddingTop = i7;
                    i13 = i6;
                }
            }
            i6 = i13;
            i7 = paddingTop;
            i14++;
            paddingLeft = paddingLeft;
            paddingRight = paddingRight;
            paddingTop = i7;
            i13 = i6;
        }
        int i21 = (i11 - paddingLeft) - paddingRight;
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt2 = getChildAt(i22);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.a && (a2 = a(childAt2)) != null) {
                    int i23 = ((int) (a2.e * ((float) i21))) + paddingLeft;
                    if (layoutParams2.d) {
                        layoutParams2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (layoutParams2.c * ((float) i21)), 1073741824), View.MeasureSpec.makeMeasureSpec((i12 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i23, paddingTop, childAt2.getMeasuredWidth() + i23, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.q = paddingTop;
        this.r = i12 - paddingBottom;
        this.V = i13;
        if (this.S) {
            a(this.i, false, 0, false);
        }
        this.S = false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            int r0 = getDefaultSize(r0, r14)
            r1 = 0
            int r1 = getDefaultSize(r1, r15)
            r13.setMeasuredDimension(r0, r1)
            int r0 = r13.getMeasuredWidth()
            int r1 = r0 / 10
            int r2 = r13.C
            int r1 = java.lang.Math.min(r1, r2)
            r13.D = r1
            int r1 = r13.getPaddingLeft()
            int r0 = r0 - r1
            int r1 = r13.getPaddingRight()
            int r3 = r0 - r1
            int r0 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r0 = r0 - r1
            int r1 = r13.getPaddingBottom()
            int r5 = r0 - r1
            int r9 = r13.getChildCount()
            r0 = 0
            r8 = r0
        L_0x003b:
            if (r8 >= r9) goto L_0x00bc
            android.view.View r10 = r13.getChildAt(r8)
            int r0 = r10.getVisibility()
            r1 = 8
            if (r0 == r1) goto L_0x00a5
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            android.support.v4.view.ViewPager$LayoutParams r0 = (android.support.v4.view.ViewPager.LayoutParams) r0
            if (r0 == 0) goto L_0x00a5
            boolean r1 = r0.a
            if (r1 == 0) goto L_0x00a5
            int r1 = r0.b
            r6 = r1 & 7
            int r1 = r0.b
            r4 = r1 & 112(0x70, float:1.57E-43)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 48
            if (r4 == r7) goto L_0x0069
            r7 = 80
            if (r4 != r7) goto L_0x00a9
        L_0x0069:
            r4 = 1
            r7 = r4
        L_0x006b:
            r4 = 3
            if (r6 == r4) goto L_0x0071
            r4 = 5
            if (r6 != r4) goto L_0x00ac
        L_0x0071:
            r4 = 1
            r6 = r4
        L_0x0073:
            if (r7 == 0) goto L_0x00af
            r2 = 1073741824(0x40000000, float:2.0)
        L_0x0077:
            int r4 = r0.width
            r11 = -2
            if (r4 == r11) goto L_0x010f
            r4 = 1073741824(0x40000000, float:2.0)
            int r2 = r0.width
            r11 = -1
            if (r2 == r11) goto L_0x010c
            int r2 = r0.width
        L_0x0085:
            int r11 = r0.height
            r12 = -2
            if (r11 == r12) goto L_0x010a
            r1 = 1073741824(0x40000000, float:2.0)
            int r11 = r0.height
            r12 = -1
            if (r11 == r12) goto L_0x010a
            int r0 = r0.height
        L_0x0093:
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r4)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r10.measure(r2, r0)
            if (r7 == 0) goto L_0x00b4
            int r0 = r10.getMeasuredHeight()
            int r5 = r5 - r0
        L_0x00a5:
            int r0 = r8 + 1
            r8 = r0
            goto L_0x003b
        L_0x00a9:
            r4 = 0
            r7 = r4
            goto L_0x006b
        L_0x00ac:
            r4 = 0
            r6 = r4
            goto L_0x0073
        L_0x00af:
            if (r6 == 0) goto L_0x0077
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x0077
        L_0x00b4:
            if (r6 == 0) goto L_0x00a5
            int r0 = r10.getMeasuredWidth()
            int r3 = r3 - r0
            goto L_0x00a5
        L_0x00bc:
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            r13.u = r0
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            r13.v = r0
            r0 = 1
            r13.w = r0
            r13.c()
            r0 = 0
            r13.w = r0
            int r2 = r13.getChildCount()
            r0 = 0
            r1 = r0
        L_0x00db:
            if (r1 >= r2) goto L_0x0109
            android.view.View r4 = r13.getChildAt(r1)
            int r0 = r4.getVisibility()
            r5 = 8
            if (r0 == r5) goto L_0x0105
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            android.support.v4.view.ViewPager$LayoutParams r0 = (android.support.v4.view.ViewPager.LayoutParams) r0
            if (r0 == 0) goto L_0x00f5
            boolean r5 = r0.a
            if (r5 != 0) goto L_0x0105
        L_0x00f5:
            float r5 = (float) r3
            float r0 = r0.c
            float r0 = r0 * r5
            int r0 = (int) r0
            r5 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            int r5 = r13.v
            r4.measure(r0, r5)
        L_0x0105:
            int r0 = r1 + 1
            r1 = r0
            goto L_0x00db
        L_0x0109:
            return
        L_0x010a:
            r0 = r5
            goto L_0x0093
        L_0x010c:
            r2 = r3
            goto L_0x0085
        L_0x010f:
            r4 = r2
            r2 = r3
            goto L_0x0085
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        bz a2;
        int i4 = -1;
        int childCount = getChildCount();
        if ((i2 & 2) != 0) {
            i4 = 1;
            i3 = 0;
        } else {
            i3 = childCount - 1;
            childCount = -1;
        }
        while (i3 != childCount) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.i && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.h != null) {
            this.h.a(savedState.b, savedState.c);
            a(savedState.a, false, true);
            return;
        }
        this.j = savedState.a;
        this.k = savedState.b;
        this.l = savedState.c;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.i;
        if (this.h != null) {
            savedState.b = this.h.b();
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            a(i2, i4, this.o, this.o);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2 = false;
        if (this.P) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.h == null || this.h.a() == 0) {
            return false;
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case e.MapAttrs_mapType /*0*/:
                this.m.abortAnimation();
                this.y = false;
                c();
                float x2 = motionEvent.getX();
                this.H = x2;
                this.F = x2;
                float y2 = motionEvent.getY();
                this.I = y2;
                this.G = y2;
                this.J = z.b(motionEvent, 0);
                break;
            case e.MapAttrs_cameraBearing /*1*/:
                if (this.A) {
                    VelocityTracker velocityTracker = this.K;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.M);
                    int a2 = (int) ao.a(velocityTracker, this.J);
                    this.y = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    bz i2 = i();
                    a(a(i2.b, ((((float) scrollX) / ((float) clientWidth)) - i2.e) / i2.d, a2, (int) (z.c(motionEvent, z.a(motionEvent, this.J)) - this.H)), true, true, a2);
                    this.J = -1;
                    j();
                    z2 = this.R.c() | this.Q.c();
                    break;
                }
                break;
            case e.MapAttrs_cameraTargetLat /*2*/:
                if (!this.A) {
                    int a3 = z.a(motionEvent, this.J);
                    float c2 = z.c(motionEvent, a3);
                    float abs = Math.abs(c2 - this.F);
                    float d2 = z.d(motionEvent, a3);
                    float abs2 = Math.abs(d2 - this.G);
                    if (abs > ((float) this.E) && abs > abs2) {
                        this.A = true;
                        c(true);
                        this.F = c2 - this.H > 0.0f ? this.H + ((float) this.E) : this.H - ((float) this.E);
                        this.G = d2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.A) {
                    z2 = false | b(z.c(motionEvent, z.a(motionEvent, this.J)));
                    break;
                }
                break;
            case e.MapAttrs_cameraTargetLng /*3*/:
                if (this.A) {
                    a(this.i, true, 0, false);
                    this.J = -1;
                    j();
                    z2 = this.R.c() | this.Q.c();
                    break;
                }
                break;
            case e.MapAttrs_cameraZoom /*5*/:
                int b2 = z.b(motionEvent);
                this.F = z.c(motionEvent, b2);
                this.J = z.b(motionEvent, b2);
                break;
            case e.MapAttrs_uiCompass /*6*/:
                a(motionEvent);
                this.F = z.c(motionEvent, z.a(motionEvent, this.J));
                break;
        }
        if (z2) {
            at.b(this);
        }
        return true;
    }

    public void removeView(View view) {
        if (this.w) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(ae aeVar) {
        if (this.h != null) {
            this.h.b((DataSetObserver) this.n);
            this.h.a((ViewGroup) this);
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                bz bzVar = (bz) this.e.get(i2);
                this.h.a((ViewGroup) this, bzVar.b, bzVar.a);
            }
            this.h.b((ViewGroup) this);
            this.e.clear();
            g();
            this.i = 0;
            scrollTo(0, 0);
        }
        ae aeVar2 = this.h;
        this.h = aeVar;
        this.b = 0;
        if (this.h != null) {
            if (this.n == null) {
                this.n = new ce(this, (bv) null);
            }
            this.h.a((DataSetObserver) this.n);
            this.y = false;
            boolean z2 = this.S;
            this.S = true;
            this.b = this.h.a();
            if (this.j >= 0) {
                this.h.a(this.k, this.l);
                a(this.j, false, true);
                this.j = -1;
                this.k = null;
                this.l = null;
            } else if (!z2) {
                c();
            } else {
                requestLayout();
            }
        }
        if (this.aa != null && aeVar2 != aeVar) {
            this.aa.a(aeVar2, aeVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void setChildrenDrawingOrderEnabledCompat(boolean z2) {
        if (Build.VERSION.SDK_INT >= 7) {
            if (this.ac == null) {
                Class<ViewGroup> cls = ViewGroup.class;
                try {
                    this.ac = cls.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
                } catch (NoSuchMethodException e2) {
                    Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e2);
                }
            }
            try {
                this.ac.invoke(this, new Object[]{Boolean.valueOf(z2)});
            } catch (Exception e3) {
                Log.e("ViewPager", "Error changing children drawing order", e3);
            }
        }
    }

    public void setCurrentItem(int i2) {
        this.y = false;
        a(i2, !this.S, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to " + 1);
            i2 = 1;
        }
        if (i2 != this.z) {
            this.z = i2;
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public void setOnAdapterChangeListener(cb cbVar) {
        this.aa = cbVar;
    }

    public void setOnPageChangeListener(cc ccVar) {
        this.W = ccVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.o;
        this.o = i2;
        int width = getWidth();
        a(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i2));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.p = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p;
    }
}
