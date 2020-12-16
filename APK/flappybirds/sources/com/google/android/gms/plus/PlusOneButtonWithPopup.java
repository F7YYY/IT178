package com.google.android.gms.plus;

import android.app.PendingIntent;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ax;
import com.google.android.gms.internal.ay;
import com.google.android.gms.internal.be;

public final class PlusOneButtonWithPopup extends ViewGroup {
    private View a;
    private int b;
    private int c;
    private View.OnClickListener d;
    private String e;
    private String f;

    public PlusOneButtonWithPopup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = PlusOneButton.a(context, attributeSet);
        this.c = PlusOneButton.b(context, attributeSet);
        this.a = new f(context, this.b);
        addView(this.a);
    }

    private int a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        switch (mode) {
            case Integer.MIN_VALUE:
            case 1073741824:
                return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - i2, mode);
            default:
                return i;
        }
    }

    private void a() {
        if (this.a != null) {
            removeView(this.a);
        }
        this.a = be.a(getContext(), this.b, this.c, this.e, this.f);
        if (this.d != null) {
            setOnClickListener(this.d);
        }
        addView(this.a);
    }

    private ax b() {
        ax a2 = ay.a((IBinder) this.a.getTag());
        if (a2 != null) {
            return a2;
        }
        if (Log.isLoggable("PlusOneButtonWithPopup", 5)) {
            Log.w("PlusOneButtonWithPopup", "Failed to get PlusOneDelegate");
        }
        throw new RemoteException();
    }

    public PendingIntent getResolution() {
        if (this.a != null) {
            try {
                return b().a();
            } catch (RemoteException e2) {
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        this.a.measure(a(i, paddingLeft), a(i2, paddingTop));
        setMeasuredDimension(paddingLeft + this.a.getMeasuredWidth(), paddingTop + this.a.getMeasuredHeight());
    }

    public void setAnnotation(int i) {
        this.c = i;
        a();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.d = onClickListener;
        this.a.setOnClickListener(onClickListener);
    }

    public void setSize(int i) {
        this.b = i;
        a();
    }
}
