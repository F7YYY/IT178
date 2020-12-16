package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.gms.e;

public final class ch extends Drawable implements Drawable.Callback {
    private int a;
    private long b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private cl j;
    private Drawable k;
    private Drawable l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;

    public ch(Drawable drawable, Drawable drawable2) {
        this((cl) null);
        drawable = drawable == null ? cj.a : drawable;
        this.k = drawable;
        drawable.setCallback(this);
        this.j.b |= drawable.getChangingConfigurations();
        drawable2 = drawable2 == null ? cj.a : drawable2;
        this.l = drawable2;
        drawable2.setCallback(this);
        this.j.b |= drawable2.getChangingConfigurations();
    }

    ch(cl clVar) {
        this.a = 0;
        this.e = 255;
        this.g = 0;
        this.h = true;
        this.j = new cl(clVar);
    }

    public void a(int i2) {
        this.c = 0;
        this.d = this.e;
        this.g = 0;
        this.f = i2;
        this.a = 1;
        invalidateSelf();
    }

    public boolean a() {
        if (!this.m) {
            this.n = (this.k.getConstantState() == null || this.l.getConstantState() == null) ? false : true;
            this.m = true;
        }
        return this.n;
    }

    public Drawable b() {
        return this.l;
    }

    public void draw(Canvas canvas) {
        boolean z = true;
        boolean z2 = false;
        switch (this.a) {
            case e.MapAttrs_cameraBearing:
                this.b = SystemClock.uptimeMillis();
                this.a = 2;
                break;
            case e.MapAttrs_cameraTargetLat:
                if (this.b >= 0) {
                    float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.b)) / ((float) this.f);
                    if (uptimeMillis < 1.0f) {
                        z = false;
                    }
                    if (z) {
                        this.a = 0;
                    }
                    this.g = (int) ((Math.min(uptimeMillis, 1.0f) * ((float) (this.d - this.c))) + ((float) this.c));
                    break;
                }
                break;
        }
        z2 = z;
        int i2 = this.g;
        boolean z3 = this.h;
        Drawable drawable = this.k;
        Drawable drawable2 = this.l;
        if (z2) {
            if (!z3 || i2 == 0) {
                drawable.draw(canvas);
            }
            if (i2 == this.e) {
                drawable2.setAlpha(this.e);
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        if (z3) {
            drawable.setAlpha(this.e - i2);
        }
        drawable.draw(canvas);
        if (z3) {
            drawable.setAlpha(this.e);
        }
        if (i2 > 0) {
            drawable2.setAlpha(i2);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.e);
        }
        invalidateSelf();
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.j.a | this.j.b;
    }

    public Drawable.ConstantState getConstantState() {
        if (!a()) {
            return null;
        }
        this.j.a = getChangingConfigurations();
        return this.j;
    }

    public int getIntrinsicHeight() {
        return Math.max(this.k.getIntrinsicHeight(), this.l.getIntrinsicHeight());
    }

    public int getIntrinsicWidth() {
        return Math.max(this.k.getIntrinsicWidth(), this.l.getIntrinsicWidth());
    }

    public int getOpacity() {
        if (!this.o) {
            this.p = Drawable.resolveOpacity(this.k.getOpacity(), this.l.getOpacity());
            this.o = true;
        }
        return this.p;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback;
        if (p.a() && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    public Drawable mutate() {
        if (!this.i && super.mutate() == this) {
            if (!a()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.k.mutate();
            this.l.mutate();
            this.i = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.k.setBounds(rect);
        this.l.setBounds(rect);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback;
        if (p.a() && (callback = getCallback()) != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        if (this.g == this.e) {
            this.g = i2;
        }
        this.e = i2;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.k.setColorFilter(colorFilter);
        this.l.setColorFilter(colorFilter);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback;
        if (p.a() && (callback = getCallback()) != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
