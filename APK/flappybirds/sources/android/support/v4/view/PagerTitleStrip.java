package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public class PagerTitleStrip extends ViewGroup implements by {
    private static final int[] n = {16842804, 16842901, 16842904, 16842927};
    private static final int[] o = {16843660};
    private static final aj q;
    ViewPager a;
    TextView b;
    TextView c;
    TextView d;
    int e;
    private int f = -1;
    /* access modifiers changed from: private */
    public float g = -1.0f;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private final ai l = new ai(this);
    private WeakReference m;
    private int p;

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            q = new al();
        } else {
            q = new ak();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        TextView textView = new TextView(context);
        this.b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.b.setTextAppearance(context, resourceId);
            this.c.setTextAppearance(context, resourceId);
            this.d.setTextAppearance(context, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            a(0, (float) dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.b.setTextColor(color);
            this.c.setTextColor(color);
            this.d.setTextColor(color);
        }
        this.i = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.e = this.c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.c.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, o);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.b);
            setSingleLineAllCaps(this.c);
            setSingleLineAllCaps(this.d);
        } else {
            this.b.setSingleLine();
            this.c.setSingleLine();
            this.d.setSingleLine();
        }
        this.h = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        q.a(textView);
    }

    public void a(int i2, float f2) {
        this.b.setTextSize(i2, f2);
        this.c.setTextSize(i2, f2);
        this.d.setTextSize(i2, f2);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, float f2, boolean z) {
        int i3;
        int i4;
        int i5;
        if (i2 != this.f) {
            a(i2, this.a.getAdapter());
        } else if (!z && f2 == this.g) {
            return;
        }
        this.k = true;
        int measuredWidth = this.b.getMeasuredWidth();
        int measuredWidth2 = this.c.getMeasuredWidth();
        int measuredWidth3 = this.d.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f3 = 0.5f + f2;
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (f3 * ((float) i8)))) - (measuredWidth2 / 2);
        int i10 = i9 + measuredWidth2;
        int baseline = this.b.getBaseline();
        int baseline2 = this.c.getBaseline();
        int baseline3 = this.d.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = max - baseline;
        int i12 = max - baseline2;
        int i13 = max - baseline3;
        int max2 = Math.max(Math.max(this.b.getMeasuredHeight() + i11, this.c.getMeasuredHeight() + i12), this.d.getMeasuredHeight() + i13);
        switch (this.i & 112) {
            case 16:
                int i14 = (((height - paddingTop) - paddingBottom) - max2) / 2;
                i3 = i14 + i11;
                i4 = i12 + i14;
                i5 = i14 + i13;
                break;
            case 80:
                int i15 = (height - paddingBottom) - max2;
                i3 = i15 + i11;
                i4 = i12 + i15;
                i5 = i15 + i13;
                break;
            default:
                i3 = paddingTop + i11;
                i4 = i12 + paddingTop;
                i5 = paddingTop + i13;
                break;
        }
        this.c.layout(i9, i4, i10, this.c.getMeasuredHeight() + i4);
        int min = Math.min(paddingLeft, (i9 - this.h) - measuredWidth);
        this.b.layout(min, i3, measuredWidth + min, this.b.getMeasuredHeight() + i3);
        int max3 = Math.max((width - paddingRight) - measuredWidth3, this.h + i10);
        this.d.layout(max3, i5, max3 + measuredWidth3, this.d.getMeasuredHeight() + i5);
        this.g = f2;
        this.k = false;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, ae aeVar) {
        CharSequence charSequence = null;
        int a2 = aeVar != null ? aeVar.a() : 0;
        this.j = true;
        this.b.setText((i2 < 1 || aeVar == null) ? null : aeVar.a(i2 - 1));
        this.c.setText((aeVar == null || i2 >= a2) ? null : aeVar.a(i2));
        if (i2 + 1 < a2 && aeVar != null) {
            charSequence = aeVar.a(i2 + 1);
        }
        this.d.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((getHeight() - getPaddingTop()) - getPaddingBottom(), Integer.MIN_VALUE);
        this.b.measure(makeMeasureSpec, makeMeasureSpec2);
        this.c.measure(makeMeasureSpec, makeMeasureSpec2);
        this.d.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f = i2;
        if (!this.k) {
            a(i2, this.g, false);
        }
        this.j = false;
    }

    /* access modifiers changed from: package-private */
    public void a(ae aeVar, ae aeVar2) {
        if (aeVar != null) {
            aeVar.b((DataSetObserver) this.l);
            this.m = null;
        }
        if (aeVar2 != null) {
            aeVar2.a((DataSetObserver) this.l);
            this.m = new WeakReference(aeVar2);
        }
        if (this.a != null) {
            this.f = -1;
            this.g = -1.0f;
            a(this.a.getCurrentItem(), aeVar2);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        ae adapter = viewPager.getAdapter();
        viewPager.a((cc) this.l);
        viewPager.setOnAdapterChangeListener(this.l);
        this.a = viewPager;
        a(this.m != null ? (ae) this.m.get() : null, adapter);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a != null) {
            a(this.a.getAdapter(), (ae) null);
            this.a.a((cc) null);
            this.a.setOnAdapterChangeListener((cb) null);
            this.a = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        float f2 = 0.0f;
        if (this.a != null) {
            if (this.g >= 0.0f) {
                f2 = this.g;
            }
            a(this.f, f2, true);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int minHeight = getMinHeight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (((float) size) * 0.8f), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - paddingTop, Integer.MIN_VALUE);
        this.b.measure(makeMeasureSpec, makeMeasureSpec2);
        this.c.measure(makeMeasureSpec, makeMeasureSpec2);
        this.d.measure(makeMeasureSpec, makeMeasureSpec2);
        if (mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(size, Math.max(minHeight, this.c.getMeasuredHeight() + paddingTop));
        }
    }

    public void requestLayout() {
        if (!this.j) {
            super.requestLayout();
        }
    }

    public void setGravity(int i2) {
        this.i = i2;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f2) {
        this.p = ((int) (255.0f * f2)) & 255;
        int i2 = (this.p << 24) | (this.e & 16777215);
        this.b.setTextColor(i2);
        this.d.setTextColor(i2);
    }

    public void setTextColor(int i2) {
        this.e = i2;
        this.c.setTextColor(i2);
        int i3 = (this.p << 24) | (this.e & 16777215);
        this.b.setTextColor(i3);
        this.d.setTextColor(i3);
    }

    public void setTextSpacing(int i2) {
        this.h = i2;
        requestLayout();
    }
}
