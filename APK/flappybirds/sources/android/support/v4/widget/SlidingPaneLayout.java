package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.a;
import android.support.v4.view.at;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.google.android.gms.e;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup {
    static final y a;
    private int b;
    private int c;
    private Drawable d;
    private final int e;
    private boolean f;
    /* access modifiers changed from: private */
    public View g;
    /* access modifiers changed from: private */
    public float h;
    private float i;
    /* access modifiers changed from: private */
    public int j;
    /* access modifiers changed from: private */
    public boolean k;
    private int l;
    private float m;
    private float n;
    private w o;
    /* access modifiers changed from: private */
    public final ac p;
    /* access modifiers changed from: private */
    public boolean q;
    private boolean r;
    private final Rect s;
    /* access modifiers changed from: private */
    public final ArrayList t;

    public class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final int[] e = {16843137};
        public float a = 0.0f;
        boolean b;
        boolean c;
        Paint d;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e);
            this.a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new x();
        boolean a;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt() != 0;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17) {
            a = new ab();
        } else if (i2 >= 16) {
            a = new aa();
        } else {
            a = new z();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.b = -858993460;
        this.r = true;
        this.s = new Rect();
        this.t = new ArrayList();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.e = (int) ((32.0f * f2) + 0.5f);
        ViewConfiguration.get(context);
        setWillNotDraw(false);
        at.a((View) this, (a) new t(this));
        at.b(this, 1);
        this.p = ac.a((ViewGroup) this, 0.5f, (af) new v(this));
        this.p.a(1);
        this.p.a(f2 * 400.0f);
    }

    private void a(float f2) {
        LayoutParams layoutParams = (LayoutParams) this.g.getLayoutParams();
        boolean z = layoutParams.c && layoutParams.leftMargin <= 0;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != this.g) {
                this.i = f2;
                childAt.offsetLeftAndRight(((int) ((1.0f - this.i) * ((float) this.l))) - ((int) ((1.0f - f2) * ((float) this.l))));
                if (z) {
                    a(childAt, 1.0f - this.i, this.c);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(int i2) {
        LayoutParams layoutParams = (LayoutParams) this.g.getLayoutParams();
        this.h = ((float) (i2 - (getPaddingLeft() + layoutParams.leftMargin))) / ((float) this.j);
        if (this.l != 0) {
            a(this.h);
        }
        if (layoutParams.c) {
            a(this.g, this.h, this.b);
        }
        a(this.g);
    }

    private void a(View view, float f2, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f2 > 0.0f && i2 != 0) {
            int i3 = (((int) (((float) ((-16777216 & i2) >>> 24)) * f2)) << 24) | (16777215 & i2);
            if (layoutParams.d == null) {
                layoutParams.d = new Paint();
            }
            layoutParams.d.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_OVER));
            if (at.d(view) != 2) {
                at.a(view, 2, layoutParams.d);
            }
            g(view);
        } else if (at.d(view) != 0) {
            if (layoutParams.d != null) {
                layoutParams.d.setColorFilter((ColorFilter) null);
            }
            u uVar = new u(this, view);
            this.t.add(uVar);
            at.a((View) this, (Runnable) uVar);
        }
    }

    private boolean a(View view, int i2) {
        if (!this.r && !a(0.0f, i2)) {
            return false;
        }
        this.q = false;
        return true;
    }

    private boolean b(View view, int i2) {
        if (!this.r && !a(1.0f, i2)) {
            return false;
        }
        this.q = true;
        return true;
    }

    private static boolean f(View view) {
        if (at.g(view)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            return false;
        }
        Drawable background = view.getBackground();
        if (background != null) {
            return background.getOpacity() == -1;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void g(View view) {
        a.a(this, view);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(View view) {
        if (this.o != null) {
            this.o.a(view, this.h);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(float f2, int i2) {
        if (!this.f) {
            return false;
        }
        int paddingLeft = getPaddingLeft();
        if (!this.p.a(this.g, (int) (((float) (((LayoutParams) this.g.getLayoutParams()).leftMargin + paddingLeft)) + (((float) this.j) * f2)), this.g.getTop())) {
            return false;
        }
        a();
        at.b(this);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void b(View view) {
        if (this.o != null) {
            this.o.a(view);
        }
        sendAccessibilityEvent(32);
    }

    public boolean b() {
        return b(this.g, 0);
    }

    /* access modifiers changed from: package-private */
    public void c(View view) {
        if (this.o != null) {
            this.o.b(view);
        }
        sendAccessibilityEvent(32);
    }

    public boolean c() {
        return a(this.g, 0);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (!this.p.a(true)) {
            return;
        }
        if (!this.f) {
            this.p.f();
        } else {
            at.b(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(View view) {
        int i2;
        int i3;
        int i4;
        int i5;
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view == null || !f(view)) {
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        } else {
            i5 = view.getLeft();
            i4 = view.getRight();
            i3 = view.getTop();
            i2 = view.getBottom();
        }
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            if (childAt != view) {
                childAt.setVisibility((Math.max(paddingLeft, childAt.getLeft()) < i5 || Math.max(paddingTop, childAt.getTop()) < i3 || Math.min(width, childAt.getRight()) > i4 || Math.min(height, childAt.getBottom()) > i2) ? 0 : 4);
                i6++;
            } else {
                return;
            }
        }
    }

    public boolean d() {
        return !this.f || this.h == 1.0f;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && this.d != null) {
            int intrinsicWidth = this.d.getIntrinsicWidth();
            int left = childAt.getLeft();
            this.d.setBounds(left - intrinsicWidth, childAt.getTop(), left, childAt.getBottom());
            this.d.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        boolean drawChild;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save(2);
        if (this.f && !layoutParams.b && this.g != null) {
            canvas.getClipBounds(this.s);
            this.s.right = Math.min(this.s.right, this.g.getLeft());
            canvas.clipRect(this.s);
        }
        if (Build.VERSION.SDK_INT >= 11) {
            drawChild = super.drawChild(canvas, view, j2);
        } else if (!layoutParams.c || this.h <= 0.0f) {
            if (view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(false);
            }
            drawChild = super.drawChild(canvas, view, j2);
        } else {
            if (!view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(true);
            }
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                canvas.drawBitmap(drawingCache, (float) view.getLeft(), (float) view.getTop(), layoutParams.d);
                drawChild = false;
            } else {
                Log.e("SlidingPaneLayout", "drawChild: child view " + view + " returned null drawing cache");
                drawChild = super.drawChild(canvas, view, j2);
            }
        }
        canvas.restoreToCount(save);
        return drawChild;
    }

    public boolean e() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public boolean e(View view) {
        if (view == null) {
            return false;
        }
        return this.f && ((LayoutParams) view.getLayoutParams()).c && this.h > 0.0f;
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
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.c;
    }

    public int getParallaxDistance() {
        return this.l;
    }

    public int getSliderFadeColor() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r = true;
        int size = this.t.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((u) this.t.get(i2)).run();
        }
        this.t.clear();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r2 = 0
            r1 = 1
            int r3 = android.support.v4.view.z.a(r8)
            boolean r0 = r7.f
            if (r0 != 0) goto L_0x002d
            if (r3 != 0) goto L_0x002d
            int r0 = r7.getChildCount()
            if (r0 <= r1) goto L_0x002d
            android.view.View r0 = r7.getChildAt(r1)
            if (r0 == 0) goto L_0x002d
            android.support.v4.widget.ac r4 = r7.p
            float r5 = r8.getX()
            int r5 = (int) r5
            float r6 = r8.getY()
            int r6 = (int) r6
            boolean r0 = r4.b((android.view.View) r0, (int) r5, (int) r6)
            if (r0 != 0) goto L_0x0041
            r0 = r1
        L_0x002b:
            r7.q = r0
        L_0x002d:
            boolean r0 = r7.f
            if (r0 == 0) goto L_0x0037
            boolean r0 = r7.k
            if (r0 == 0) goto L_0x0043
            if (r3 == 0) goto L_0x0043
        L_0x0037:
            android.support.v4.widget.ac r0 = r7.p
            r0.e()
            boolean r2 = super.onInterceptTouchEvent(r8)
        L_0x0040:
            return r2
        L_0x0041:
            r0 = r2
            goto L_0x002b
        L_0x0043:
            r0 = 3
            if (r3 == r0) goto L_0x0048
            if (r3 != r1) goto L_0x004e
        L_0x0048:
            android.support.v4.widget.ac r0 = r7.p
            r0.e()
            goto L_0x0040
        L_0x004e:
            switch(r3) {
                case 0: goto L_0x005e;
                case 1: goto L_0x0051;
                case 2: goto L_0x0082;
                default: goto L_0x0051;
            }
        L_0x0051:
            r0 = r2
        L_0x0052:
            android.support.v4.widget.ac r3 = r7.p
            boolean r3 = r3.a((android.view.MotionEvent) r8)
            if (r3 != 0) goto L_0x005c
            if (r0 == 0) goto L_0x0040
        L_0x005c:
            r2 = r1
            goto L_0x0040
        L_0x005e:
            r7.k = r2
            float r0 = r8.getX()
            float r3 = r8.getY()
            r7.m = r0
            r7.n = r3
            android.support.v4.widget.ac r4 = r7.p
            android.view.View r5 = r7.g
            int r0 = (int) r0
            int r3 = (int) r3
            boolean r0 = r4.b((android.view.View) r5, (int) r0, (int) r3)
            if (r0 == 0) goto L_0x0051
            android.view.View r0 = r7.g
            boolean r0 = r7.e((android.view.View) r0)
            if (r0 == 0) goto L_0x0051
            r0 = r1
            goto L_0x0052
        L_0x0082:
            float r0 = r8.getX()
            float r3 = r8.getY()
            float r4 = r7.m
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            float r4 = r7.n
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            android.support.v4.widget.ac r4 = r7.p
            int r4 = r4.d()
            float r4 = (float) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0051
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0051
            android.support.v4.widget.ac r0 = r7.p
            r0.e()
            r7.k = r1
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SlidingPaneLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.r) {
            this.h = (!this.f || !this.q) ? 0.0f : 1.0f;
        }
        int i9 = 0;
        int i10 = paddingLeft;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                i7 = i10;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.b) {
                    int min = (Math.min(paddingLeft, (i8 - paddingRight) - this.e) - i10) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.j = min;
                    layoutParams.c = ((layoutParams.leftMargin + i10) + min) + (measuredWidth / 2) > i8 - paddingRight;
                    i7 = layoutParams.leftMargin + ((int) (((float) min) * this.h)) + i10;
                    i6 = 0;
                } else if (!this.f || this.l == 0) {
                    i6 = 0;
                    i7 = paddingLeft;
                } else {
                    i6 = (int) ((1.0f - this.h) * ((float) this.l));
                    i7 = paddingLeft;
                }
                int i11 = i7 - i6;
                childAt.layout(i11, paddingTop, i11 + measuredWidth, childAt.getMeasuredHeight() + paddingTop);
                paddingLeft += childAt.getWidth();
            }
            i9++;
            i10 = i7;
        }
        if (this.r) {
            if (this.f) {
                if (this.l != 0) {
                    a(this.h);
                }
                if (((LayoutParams) this.g.getLayoutParams()).c) {
                    a(this.g, this.h, this.b);
                }
            } else {
                for (int i12 = 0; i12 < childCount; i12++) {
                    a(getChildAt(i12), 0.0f, this.b);
                }
            }
            d(this.g);
        }
        this.r = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        boolean z;
        float f2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode == 1073741824) {
            if (mode2 == 0) {
                if (!isInEditMode()) {
                    throw new IllegalStateException("Height must not be UNSPECIFIED");
                } else if (mode2 == 0) {
                    i4 = Integer.MIN_VALUE;
                    i5 = size;
                    i6 = 300;
                }
            }
            i4 = mode2;
            i5 = size;
            i6 = size2;
        } else if (!isInEditMode()) {
            throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        } else if (mode == Integer.MIN_VALUE) {
            i4 = mode2;
            i5 = size;
            i6 = size2;
        } else {
            if (mode == 0) {
                i4 = mode2;
                i5 = 300;
                i6 = size2;
            }
            i4 = mode2;
            i5 = size;
            i6 = size2;
        }
        switch (i4) {
            case Integer.MIN_VALUE:
                i7 = 0;
                paddingTop = (i6 - getPaddingTop()) - getPaddingBottom();
                break;
            case 1073741824:
                i7 = (i6 - getPaddingTop()) - getPaddingBottom();
                paddingTop = i7;
                break;
            default:
                i7 = 0;
                paddingTop = -1;
                break;
        }
        boolean z2 = false;
        int paddingLeft = (i5 - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.g = null;
        int i10 = 0;
        int i11 = i7;
        float f3 = 0.0f;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.c = false;
                i8 = paddingLeft;
                f2 = f3;
                i9 = i11;
                z = z2;
            } else {
                if (layoutParams.a > 0.0f) {
                    f3 += layoutParams.a;
                    if (layoutParams.width == 0) {
                        i8 = paddingLeft;
                        f2 = f3;
                        i9 = i11;
                        z = z2;
                    }
                }
                int i12 = layoutParams.leftMargin + layoutParams.rightMargin;
                childAt.measure(layoutParams.width == -2 ? View.MeasureSpec.makeMeasureSpec(i5 - i12, Integer.MIN_VALUE) : layoutParams.width == -1 ? View.MeasureSpec.makeMeasureSpec(i5 - i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), layoutParams.height == -2 ? View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE) : layoutParams.height == -1 ? View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824) : View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (i4 == Integer.MIN_VALUE && measuredHeight > i11) {
                    i11 = Math.min(measuredHeight, paddingTop);
                }
                int i13 = paddingLeft - measuredWidth;
                boolean z3 = i13 < 0;
                layoutParams.b = z3;
                boolean z4 = z3 | z2;
                if (layoutParams.b) {
                    this.g = childAt;
                }
                i8 = i13;
                i9 = i11;
                float f4 = f3;
                z = z4;
                f2 = f4;
            }
            i10++;
            z2 = z;
            i11 = i9;
            f3 = f2;
            paddingLeft = i8;
        }
        if (z2 || f3 > 0.0f) {
            int i14 = i5 - this.e;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt2 = getChildAt(i15);
                if (childAt2.getVisibility() != 8) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != 8) {
                        boolean z5 = layoutParams2.width == 0 && layoutParams2.a > 0.0f;
                        int measuredWidth2 = z5 ? 0 : childAt2.getMeasuredWidth();
                        if (!z2 || childAt2 == this.g) {
                            if (layoutParams2.a > 0.0f) {
                                int makeMeasureSpec = layoutParams2.width == 0 ? layoutParams2.height == -2 ? View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE) : layoutParams2.height == -1 ? View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824) : View.MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824) : View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                if (z2) {
                                    int i16 = i5 - (layoutParams2.rightMargin + layoutParams2.leftMargin);
                                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                                    if (measuredWidth2 != i16) {
                                        childAt2.measure(makeMeasureSpec2, makeMeasureSpec);
                                    }
                                } else {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(((int) ((layoutParams2.a * ((float) Math.max(0, paddingLeft))) / f3)) + measuredWidth2, 1073741824), makeMeasureSpec);
                                }
                            }
                        } else if (layoutParams2.width < 0 && (measuredWidth2 > i14 || layoutParams2.a > 0.0f)) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), z5 ? layoutParams2.height == -2 ? View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE) : layoutParams2.height == -1 ? View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824) : View.MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824) : View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824));
                        }
                    }
                }
            }
        }
        setMeasuredDimension(i5, i11);
        this.f = z2;
        if (this.p.a() != 0 && !z2) {
            this.p.f();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.a) {
            b();
        } else {
            c();
        }
        this.q = savedState.a;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = e() ? d() : this.q;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            this.r = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f) {
            return super.onTouchEvent(motionEvent);
        }
        this.p.b(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case e.MapAttrs_mapType /*0*/:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.m = x;
                this.n = y;
                return true;
            case e.MapAttrs_cameraBearing /*1*/:
                if (!e(this.g)) {
                    return true;
                }
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float f2 = x2 - this.m;
                float f3 = y2 - this.n;
                int d2 = this.p.d();
                if ((f2 * f2) + (f3 * f3) >= ((float) (d2 * d2)) || !this.p.b(this.g, (int) x2, (int) y2)) {
                    return true;
                }
                a(this.g, 0);
                return true;
            default:
                return true;
        }
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f) {
            this.q = view == this.g;
        }
    }

    public void setCoveredFadeColor(int i2) {
        this.c = i2;
    }

    public void setPanelSlideListener(w wVar) {
        this.o = wVar;
    }

    public void setParallaxDistance(int i2) {
        this.l = i2;
        requestLayout();
    }

    public void setShadowDrawable(Drawable drawable) {
        this.d = drawable;
    }

    public void setShadowResource(int i2) {
        setShadowDrawable(getResources().getDrawable(i2));
    }

    public void setSliderFadeColor(int i2) {
        this.b = i2;
    }
}
