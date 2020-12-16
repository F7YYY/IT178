package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.a;
import android.support.v4.view.a.x;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

class ca extends a {
    final /* synthetic */ ViewPager b;

    ca(ViewPager viewPager) {
        this.b = viewPager;
    }

    private boolean b() {
        return this.b.h != null && this.b.h.a() > 1;
    }

    public void a(View view, a aVar) {
        super.a(view, aVar);
        aVar.b((CharSequence) ViewPager.class.getName());
        aVar.i(b());
        if (this.b.canScrollHorizontally(1)) {
            aVar.a(4096);
        }
        if (this.b.canScrollHorizontally(-1)) {
            aVar.a(8192);
        }
    }

    public boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        switch (i) {
            case 4096:
                if (!this.b.canScrollHorizontally(1)) {
                    return false;
                }
                this.b.setCurrentItem(this.b.i + 1);
                return true;
            case 8192:
                if (!this.b.canScrollHorizontally(-1)) {
                    return false;
                }
                this.b.setCurrentItem(this.b.i - 1);
                return true;
            default:
                return false;
        }
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        x a = x.a();
        a.a(b());
        if (accessibilityEvent.getEventType() == 4096 && this.b.h != null) {
            a.a(this.b.h.a());
            a.b(this.b.i);
            a.c(this.b.i);
        }
    }
}
