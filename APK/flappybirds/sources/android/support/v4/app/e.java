package android.support.v4.app;

import android.view.View;

class e implements l {
    final /* synthetic */ Fragment a;

    e(Fragment fragment) {
        this.a = fragment;
    }

    public View a(int i) {
        if (this.a.I != null) {
            return this.a.I.findViewById(i);
        }
        throw new IllegalStateException("Fragment does not have a view");
    }
}
