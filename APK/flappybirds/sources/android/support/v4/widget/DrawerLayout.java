package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.a;
import android.support.v4.view.at;
import android.support.v4.view.bo;
import android.support.v4.view.n;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.e;

public class DrawerLayout extends ViewGroup {
    /* access modifiers changed from: private */
    public static final int[] a = {16842931};
    private int b;
    private int c;
    private float d;
    private Paint e;
    private final ac f;
    private final ac g;
    private final f h;
    private final f i;
    private int j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private d q;
    private float r;
    private float s;
    private Drawable t;
    private Drawable u;

    public class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int a = 0;
        float b;
        boolean c;
        boolean d;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.a);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.a = layoutParams.a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new e();
        int a = 0;
        int b = 0;
        int c = 0;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.c = -1728053248;
        this.e = new Paint();
        this.l = true;
        float f2 = getResources().getDisplayMetrics().density;
        this.b = (int) ((64.0f * f2) + 0.5f);
        float f3 = f2 * 400.0f;
        this.h = new f(this, 3);
        this.i = new f(this, 5);
        this.f = ac.a((ViewGroup) this, 1.0f, (af) this.h);
        this.f.a(1);
        this.f.a(f3);
        this.h.a(this.f);
        this.g = ac.a((ViewGroup) this, 1.0f, (af) this.i);
        this.g.a(2);
        this.g.a(f3);
        this.i.a(this.g);
        setFocusableInTouchMode(true);
        at.a((View) this, (a) new c(this));
        bo.a(this, false);
    }

    static String b(int i2) {
        return (i2 & 3) == 3 ? "LEFT" : (i2 & 5) == 5 ? "RIGHT" : Integer.toHexString(i2);
    }

    private boolean e() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((LayoutParams) getChildAt(i2).getLayoutParams()).c) {
                return true;
            }
        }
        return false;
    }

    private boolean f() {
        return g() != null;
    }

    private View g() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (g(childAt) && j(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    private static boolean k(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public int a(View view) {
        int e2 = e(view);
        if (e2 == 3) {
            return this.m;
        }
        if (e2 == 5) {
            return this.n;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public View a() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (((LayoutParams) childAt.getLayoutParams()).d) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View a(int i2) {
        int a2 = n.a(i2, at.e(this)) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((e(childAt) & 7) == a2) {
                return childAt;
            }
        }
        return null;
    }

    public void a(int i2, int i3) {
        int a2 = n.a(i3, at.e(this));
        if (a2 == 3) {
            this.m = i2;
        } else if (a2 == 5) {
            this.n = i2;
        }
        if (i2 != 0) {
            (a2 == 3 ? this.f : this.g).e();
        }
        switch (i2) {
            case e.MapAttrs_cameraBearing /*1*/:
                View a3 = a(a2);
                if (a3 != null) {
                    i(a3);
                    return;
                }
                return;
            case e.MapAttrs_cameraTargetLat /*2*/:
                View a4 = a(a2);
                if (a4 != null) {
                    h(a4);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3, View view) {
        int i4 = 1;
        int a2 = this.f.a();
        int a3 = this.g.a();
        if (!(a2 == 1 || a3 == 1)) {
            i4 = (a2 == 2 || a3 == 2) ? 2 : 0;
        }
        if (view != null && i3 == 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams.b == 0.0f) {
                b(view);
            } else if (layoutParams.b == 1.0f) {
                c(view);
            }
        }
        if (i4 != this.j) {
            this.j = i4;
            if (this.q != null) {
                this.q.a(i4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(View view, float f2) {
        if (this.q != null) {
            this.q.a(view, f2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (g(childAt) && (!z || layoutParams.c)) {
                z2 = a(childAt, 3) ? z2 | this.f.a(childAt, -childAt.getWidth(), childAt.getTop()) : z2 | this.g.a(childAt, getWidth(), childAt.getTop());
                layoutParams.c = false;
            }
        }
        this.h.a();
        this.i.a();
        if (z2) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(View view, int i2) {
        return (e(view) & i2) == i2;
    }

    public void b() {
        a(false);
    }

    /* access modifiers changed from: package-private */
    public void b(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.d) {
            layoutParams.d = false;
            if (this.q != null) {
                this.q.b(view);
            }
            sendAccessibilityEvent(32);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(View view, float f2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f2 != layoutParams.b) {
            layoutParams.b = f2;
            a(view, f2);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (!this.p) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.p = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void c(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.d) {
            layoutParams.d = true;
            if (this.q != null) {
                this.q.a(view);
            }
            view.sendAccessibilityEvent(32);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            f2 = Math.max(f2, ((LayoutParams) getChildAt(i2).getLayoutParams()).b);
        }
        this.d = f2;
        if (this.f.a(true) || this.g.a(true)) {
            at.b(this);
        }
    }

    /* access modifiers changed from: package-private */
    public float d(View view) {
        return ((LayoutParams) view.getLayoutParams()).b;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        int i2;
        int height = getHeight();
        boolean f2 = f(view);
        int i3 = 0;
        int width = getWidth();
        int save = canvas.save();
        if (f2) {
            int childCount = getChildCount();
            int i4 = 0;
            while (i4 < childCount) {
                View childAt = getChildAt(i4);
                if (childAt != view && childAt.getVisibility() == 0 && k(childAt) && g(childAt)) {
                    if (childAt.getHeight() < height) {
                        i2 = width;
                    } else if (a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right <= i3) {
                            right = i3;
                        }
                        i3 = right;
                        i2 = width;
                    } else {
                        i2 = childAt.getLeft();
                        if (i2 < width) {
                        }
                    }
                    i4++;
                    width = i2;
                }
                i2 = width;
                i4++;
                width = i2;
            }
            canvas.clipRect(i3, 0, width, getHeight());
        }
        int i5 = width;
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(save);
        if (this.d > 0.0f && f2) {
            this.e.setColor((((int) (((float) ((this.c & -16777216) >>> 24)) * this.d)) << 24) | (this.c & 16777215));
            canvas.drawRect((float) i3, 0.0f, (float) i5, (float) getHeight(), this.e);
        } else if (this.t != null && a(view, 3)) {
            int intrinsicWidth = this.t.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f.b()), 1.0f));
            this.t.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.t.setAlpha((int) (255.0f * max));
            this.t.draw(canvas);
        } else if (this.u != null && a(view, 5)) {
            int intrinsicWidth2 = this.u.getIntrinsicWidth();
            int left = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left)) / ((float) this.g.b()), 1.0f));
            this.u.setBounds(left - intrinsicWidth2, view.getTop(), left, view.getBottom());
            this.u.setAlpha((int) (255.0f * max2));
            this.u.draw(canvas);
        }
        return drawChild;
    }

    /* access modifiers changed from: package-private */
    public int e(View view) {
        return n.a(((LayoutParams) view.getLayoutParams()).a, at.e(this));
    }

    /* access modifiers changed from: package-private */
    public boolean f(View view) {
        return ((LayoutParams) view.getLayoutParams()).a == 0;
    }

    /* access modifiers changed from: package-private */
    public boolean g(View view) {
        return (n.a(((LayoutParams) view.getLayoutParams()).a, at.e(view)) & 7) != 0;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public void h(View view) {
        if (!g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        if (this.l) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.b = 1.0f;
            layoutParams.d = true;
        } else if (a(view, 3)) {
            this.f.a(view, 0, view.getTop());
        } else {
            this.g.a(view, getWidth() - view.getWidth(), view.getTop());
        }
        invalidate();
    }

    public void i(View view) {
        if (!g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        if (this.l) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.b = 0.0f;
            layoutParams.d = false;
        } else if (a(view, 3)) {
            this.f.a(view, -view.getWidth(), view.getTop());
        } else {
            this.g.a(view, getWidth(), view.getTop());
        }
        invalidate();
    }

    public boolean j(View view) {
        if (g(view)) {
            return ((LayoutParams) view.getLayoutParams()).b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.l = true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r1 = 1
            r2 = 0
            int r0 = android.support.v4.view.z.a(r8)
            android.support.v4.widget.ac r3 = r7.f
            boolean r3 = r3.a((android.view.MotionEvent) r8)
            android.support.v4.widget.ac r4 = r7.g
            boolean r4 = r4.a((android.view.MotionEvent) r8)
            r3 = r3 | r4
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0063;
                case 2: goto L_0x004e;
                case 3: goto L_0x0063;
                default: goto L_0x0016;
            }
        L_0x0016:
            r0 = r2
        L_0x0017:
            if (r3 != 0) goto L_0x0025
            if (r0 != 0) goto L_0x0025
            boolean r0 = r7.e()
            if (r0 != 0) goto L_0x0025
            boolean r0 = r7.p
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            r2 = r1
        L_0x0026:
            return r2
        L_0x0027:
            float r0 = r8.getX()
            float r4 = r8.getY()
            r7.r = r0
            r7.s = r4
            float r5 = r7.d
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x006b
            android.support.v4.widget.ac r5 = r7.f
            int r0 = (int) r0
            int r4 = (int) r4
            android.view.View r0 = r5.d(r0, r4)
            boolean r0 = r7.f(r0)
            if (r0 == 0) goto L_0x006b
            r0 = r1
        L_0x0049:
            r7.o = r2
            r7.p = r2
            goto L_0x0017
        L_0x004e:
            android.support.v4.widget.ac r0 = r7.f
            r4 = 3
            boolean r0 = r0.d(r4)
            if (r0 == 0) goto L_0x0016
            android.support.v4.widget.f r0 = r7.h
            r0.a()
            android.support.v4.widget.f r0 = r7.i
            r0.a()
            r0 = r2
            goto L_0x0017
        L_0x0063:
            r7.a((boolean) r1)
            r7.o = r2
            r7.p = r2
            goto L_0x0016
        L_0x006b:
            r0 = r2
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || !f()) {
            return super.onKeyDown(i2, keyEvent);
        }
        s.b(keyEvent);
        return true;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyUp(i2, keyEvent);
        }
        View g2 = g();
        if (g2 != null && a(g2) == 0) {
            b();
        }
        return g2 != null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        float f2;
        this.k = true;
        int i7 = i4 - i2;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (f(childAt)) {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        i6 = ((int) (((float) measuredWidth) * layoutParams.b)) + (-measuredWidth);
                        f2 = ((float) (measuredWidth + i6)) / ((float) measuredWidth);
                    } else {
                        i6 = i7 - ((int) (((float) measuredWidth) * layoutParams.b));
                        f2 = ((float) (i7 - i6)) / ((float) measuredWidth);
                    }
                    boolean z2 = f2 != layoutParams.b;
                    switch (layoutParams.a & 112) {
                        case 16:
                            int i9 = i5 - i3;
                            int i10 = (i9 - measuredHeight) / 2;
                            if (i10 < layoutParams.topMargin) {
                                i10 = layoutParams.topMargin;
                            } else if (i10 + measuredHeight > i9 - layoutParams.bottomMargin) {
                                i10 = (i9 - layoutParams.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(i6, i10, measuredWidth + i6, measuredHeight + i10);
                            break;
                        case 80:
                            int i11 = i5 - i3;
                            childAt.layout(i6, (i11 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i11 - layoutParams.bottomMargin);
                            break;
                        default:
                            childAt.layout(i6, layoutParams.topMargin, measuredWidth + i6, measuredHeight + layoutParams.topMargin);
                            break;
                    }
                    if (z2) {
                        b(childAt, f2);
                    }
                    int i12 = layoutParams.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i12) {
                        childAt.setVisibility(i12);
                    }
                }
            }
        }
        this.k = false;
        this.l = false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r5 != 0) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            r1 = 300(0x12c, float:4.2E-43)
            r4 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.getMode(r12)
            int r5 = android.view.View.MeasureSpec.getMode(r13)
            int r2 = android.view.View.MeasureSpec.getSize(r12)
            int r0 = android.view.View.MeasureSpec.getSize(r13)
            if (r3 != r10) goto L_0x001b
            if (r5 == r10) goto L_0x0046
        L_0x001b:
            boolean r6 = r11.isInEditMode()
            if (r6 == 0) goto L_0x0048
            if (r3 != r7) goto L_0x0040
        L_0x0023:
            if (r5 != r7) goto L_0x0044
            r1 = r0
        L_0x0026:
            r11.setMeasuredDimension(r2, r1)
            int r5 = r11.getChildCount()
            r3 = r4
        L_0x002e:
            if (r3 >= r5) goto L_0x0109
            android.view.View r6 = r11.getChildAt(r3)
            int r0 = r6.getVisibility()
            r7 = 8
            if (r0 != r7) goto L_0x0050
        L_0x003c:
            int r0 = r3 + 1
            r3 = r0
            goto L_0x002e
        L_0x0040:
            if (r3 != 0) goto L_0x0023
            r2 = r1
            goto L_0x0023
        L_0x0044:
            if (r5 == 0) goto L_0x0026
        L_0x0046:
            r1 = r0
            goto L_0x0026
        L_0x0048:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "DrawerLayout must be measured with MeasureSpec.EXACTLY."
            r0.<init>(r1)
            throw r0
        L_0x0050:
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.support.v4.widget.DrawerLayout$LayoutParams r0 = (android.support.v4.widget.DrawerLayout.LayoutParams) r0
            boolean r7 = r11.f(r6)
            if (r7 == 0) goto L_0x0077
            int r7 = r0.leftMargin
            int r7 = r2 - r7
            int r8 = r0.rightMargin
            int r7 = r7 - r8
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r10)
            int r8 = r0.topMargin
            int r8 = r1 - r8
            int r0 = r0.bottomMargin
            int r0 = r8 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            r6.measure(r7, r0)
            goto L_0x003c
        L_0x0077:
            boolean r7 = r11.g(r6)
            if (r7 == 0) goto L_0x00da
            int r7 = r11.e(r6)
            r7 = r7 & 7
            r8 = r4 & r7
            if (r8 == 0) goto L_0x00bc
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Child drawer has absolute gravity "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = b((int) r7)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " but this "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "DrawerLayout"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " already has a "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "drawer view along that edge"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00bc:
            int r7 = r11.b
            int r8 = r0.leftMargin
            int r7 = r7 + r8
            int r8 = r0.rightMargin
            int r7 = r7 + r8
            int r8 = r0.width
            int r7 = getChildMeasureSpec(r12, r7, r8)
            int r8 = r0.topMargin
            int r9 = r0.bottomMargin
            int r8 = r8 + r9
            int r0 = r0.height
            int r0 = getChildMeasureSpec(r13, r8, r0)
            r6.measure(r7, r0)
            goto L_0x003c
        L_0x00da:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Child "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = " at index "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " does not have a valid layout_gravity - must be Gravity.LEFT, "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "Gravity.RIGHT or Gravity.NO_GRAVITY"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View a2;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!(savedState.a == 0 || (a2 = a(savedState.a)) == null)) {
            h(a2);
        }
        a(savedState.b, 3);
        a(savedState.c, 5);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (g(childAt)) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.d) {
                    savedState.a = layoutParams.a;
                    break;
                }
            }
            i2++;
        }
        savedState.b = this.m;
        savedState.c = this.n;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View a2;
        this.f.b(motionEvent);
        this.g.b(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case e.MapAttrs_mapType /*0*/:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.r = x;
                this.s = y;
                this.o = false;
                this.p = false;
                break;
            case e.MapAttrs_cameraBearing /*1*/:
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                View d2 = this.f.d((int) x2, (int) y2);
                if (d2 != null && f(d2)) {
                    float f2 = x2 - this.r;
                    float f3 = y2 - this.s;
                    int d3 = this.f.d();
                    if ((f2 * f2) + (f3 * f3) < ((float) (d3 * d3)) && (a2 = a()) != null) {
                        z = a(a2) == 2;
                        a(z);
                        this.o = false;
                        break;
                    }
                }
                z = true;
                a(z);
                this.o = false;
            case e.MapAttrs_cameraTargetLng /*3*/:
                a(true);
                this.o = false;
                this.p = false;
                break;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.o = z;
        if (z) {
            a(true);
        }
    }

    public void requestLayout() {
        if (!this.k) {
            super.requestLayout();
        }
    }

    public void setDrawerListener(d dVar) {
        this.q = dVar;
    }

    public void setDrawerLockMode(int i2) {
        a(i2, 3);
        a(i2, 5);
    }

    public void setScrimColor(int i2) {
        this.c = i2;
        invalidate();
    }
}
