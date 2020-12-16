package com.google.android.gms.plus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.be;
import com.google.android.gms.internal.dq;

public final class PlusOneButton extends FrameLayout {
    /* access modifiers changed from: private */
    public View a;
    private int b;
    private int c;
    private String d;
    /* access modifiers changed from: private */
    public int e = -1;
    private e f;

    public PlusOneButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = a(context, attributeSet);
        this.c = b(context, attributeSet);
        a(getContext());
        if (isInEditMode()) {
        }
    }

    protected static int a(Context context, AttributeSet attributeSet) {
        String a2 = dq.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeSet, true, false, "PlusOneButton");
        if ("SMALL".equalsIgnoreCase(a2)) {
            return 0;
        }
        if ("MEDIUM".equalsIgnoreCase(a2)) {
            return 1;
        }
        return "TALL".equalsIgnoreCase(a2) ? 2 : 3;
    }

    private void a(Context context) {
        if (this.a != null) {
            removeView(this.a);
        }
        this.a = be.a(context, this.b, this.c, this.d, this.e);
        setOnPlusOneClickListener(this.f);
        addView(this.a);
    }

    protected static int b(Context context, AttributeSet attributeSet) {
        String a2 = dq.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attributeSet, true, false, "PlusOneButton");
        if ("INLINE".equalsIgnoreCase(a2)) {
            return 2;
        }
        return !"NONE".equalsIgnoreCase(a2) ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.layout(0, 0, i3 - i, i4 - i2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        View view = this.a;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setAnnotation(int i) {
        this.c = i;
        a(getContext());
    }

    public void setOnPlusOneClickListener(e eVar) {
        this.f = eVar;
        this.a.setOnClickListener(new d(this, eVar));
    }

    public void setSize(int i) {
        this.b = i;
        a(getContext());
    }
}
