package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

final class am extends ai implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    private WeakReference c;
    private boolean d = false;

    protected am(r rVar, int i) {
        super(rVar, i);
    }

    private void b(View view) {
        Display display;
        int i = -1;
        if (p.e() && (display = view.getDisplay()) != null) {
            i = display.getDisplayId();
        }
        IBinder windowToken = view.getWindowToken();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = view.getWidth();
        int height = view.getHeight();
        this.b.c = i;
        this.b.a = windowToken;
        this.b.d = iArr[0];
        this.b.e = iArr[1];
        this.b.f = iArr[0] + width;
        this.b.g = iArr[1] + height;
        if (this.d) {
            a();
            this.d = false;
        }
    }

    public void a() {
        if (this.b.a != null) {
            super.a();
        } else {
            this.d = this.c != null;
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i) {
        this.b = new al(i, (IBinder) null);
    }

    public void a(View view) {
        this.a.g();
        if (this.c != null) {
            View view2 = (View) this.c.get();
            Context j = this.a.j();
            if (view2 == null && (j instanceof Activity)) {
                view2 = ((Activity) j).getWindow().getDecorView();
            }
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(this);
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                if (p.d()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
        this.c = null;
        Context j2 = this.a.j();
        if (view == null && (j2 instanceof Activity)) {
            View findViewById = ((Activity) j2).findViewById(16908290);
            if (findViewById == null) {
                findViewById = ((Activity) j2).getWindow().getDecorView();
            }
            w.a("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view which may not work properly in future versions of the API. Use setViewForPopups() to set your content view.");
            view = findViewById;
        }
        if (view != null) {
            b(view);
            this.c = new WeakReference(view);
            view.addOnAttachStateChangeListener(this);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            return;
        }
        w.b("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
    }

    public void onGlobalLayout() {
        View view;
        if (this.c != null && (view = (View) this.c.get()) != null) {
            b(view);
        }
    }

    public void onViewAttachedToWindow(View view) {
        b(view);
    }

    public void onViewDetachedFromWindow(View view) {
        this.a.g();
        view.removeOnAttachStateChangeListener(this);
    }
}
