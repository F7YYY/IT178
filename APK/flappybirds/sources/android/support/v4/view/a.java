package android.support.v4.view;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.a.k;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class a {
    private static final d b;
    private static final Object c = b.a();
    final Object a = b.a(this);

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            b = new e();
        } else if (Build.VERSION.SDK_INT >= 14) {
            b = new b();
        } else {
            b = new g();
        }
    }

    public k a(View view) {
        return b.a(c, view);
    }

    /* access modifiers changed from: package-private */
    public Object a() {
        return this.a;
    }

    public void a(View view, int i) {
        b.a(c, view, i);
    }

    public void a(View view, android.support.v4.view.a.a aVar) {
        b.a(c, view, aVar);
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        b.d(c, view, accessibilityEvent);
    }

    public boolean a(View view, int i, Bundle bundle) {
        return b.a(c, view, i, bundle);
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return b.a(c, viewGroup, view, accessibilityEvent);
    }

    public boolean b(View view, AccessibilityEvent accessibilityEvent) {
        return b.a(c, view, accessibilityEvent);
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        b.c(c, view, accessibilityEvent);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        b.b(c, view, accessibilityEvent);
    }
}
