package android.support.v4.widget;

import android.graphics.Paint;
import android.support.v4.view.at;
import android.view.View;

class u implements Runnable {
    final View a;
    final /* synthetic */ SlidingPaneLayout b;

    u(SlidingPaneLayout slidingPaneLayout, View view) {
        this.b = slidingPaneLayout;
        this.a = view;
    }

    public void run() {
        if (this.a.getParent() == this.b) {
            at.a(this.a, 0, (Paint) null);
            this.b.g(this.a);
        }
        this.b.t.remove(this);
    }
}
