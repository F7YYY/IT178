package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.a;
import android.support.v4.view.at;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.e;

class c extends a {
    final /* synthetic */ DrawerLayout b;
    private final Rect c = new Rect();

    c(DrawerLayout drawerLayout) {
        this.b = drawerLayout;
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
    }

    private void a(android.support.v4.view.a.a aVar, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (!b(childAt)) {
                switch (at.c(childAt)) {
                    case e.MapAttrs_mapType /*0*/:
                        at.b(childAt, 1);
                        break;
                    case e.MapAttrs_cameraBearing /*1*/:
                        break;
                    case e.MapAttrs_cameraTargetLat /*2*/:
                        if (childAt instanceof ViewGroup) {
                            a(aVar, (ViewGroup) childAt);
                            break;
                        } else {
                            continue;
                        }
                }
                aVar.b(childAt);
            }
        }
    }

    public void a(View view, android.support.v4.view.a.a aVar) {
        android.support.v4.view.a.a a = android.support.v4.view.a.a.a(aVar);
        super.a(view, a);
        aVar.a(view);
        ViewParent f = at.f(view);
        if (f instanceof View) {
            aVar.c((View) f);
        }
        a(aVar, a);
        a.t();
        a(aVar, (ViewGroup) view);
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (!b(view)) {
            return super.a(viewGroup, view, accessibilityEvent);
        }
        return false;
    }

    public boolean b(View view) {
        View a = this.b.a();
        return (a == null || a == view) ? false : true;
    }
}
