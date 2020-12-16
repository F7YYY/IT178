package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.a;
import android.support.v4.view.at;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

class t extends a {
    final /* synthetic */ SlidingPaneLayout b;
    private final Rect c = new Rect();

    t(SlidingPaneLayout slidingPaneLayout) {
        this.b = slidingPaneLayout;
    }

    private void a(android.support.v4.view.a.a aVar, android.support.v4.view.a.a aVar2) {
        Rect rect = this.c;
        aVar2.a(rect);
        aVar.b(rect);
        aVar2.c(rect);
        aVar.d(rect);
        aVar.c(aVar2.h());
        aVar.a(aVar2.p());
        aVar.b(aVar2.q());
        aVar.c(aVar2.s());
        aVar.h(aVar2.m());
        aVar.f(aVar2.k());
        aVar.a(aVar2.f());
        aVar.b(aVar2.g());
        aVar.d(aVar2.i());
        aVar.e(aVar2.j());
        aVar.g(aVar2.l());
        aVar.a(aVar2.b());
        aVar.b(aVar2.c());
    }

    public void a(View view, android.support.v4.view.a.a aVar) {
        android.support.v4.view.a.a a = android.support.v4.view.a.a.a(aVar);
        super.a(view, a);
        a(aVar, a);
        a.t();
        aVar.b((CharSequence) SlidingPaneLayout.class.getName());
        aVar.a(view);
        ViewParent f = at.f(view);
        if (f instanceof View) {
            aVar.c((View) f);
        }
        int childCount = this.b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.b.getChildAt(i);
            if (!b(childAt) && childAt.getVisibility() == 0) {
                at.b(childAt, 1);
                aVar.b(childAt);
            }
        }
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (!b(view)) {
            return super.a(viewGroup, view, accessibilityEvent);
        }
        return false;
    }

    public boolean b(View view) {
        return this.b.e(view);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
    }
}
