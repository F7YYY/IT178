package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.k;
import android.view.View;

class e extends b {
    e() {
    }

    public k a(Object obj, View view) {
        Object a = k.a(obj, view);
        if (a != null) {
            return new k(a);
        }
        return null;
    }

    public Object a(a aVar) {
        return k.a(new f(this, aVar));
    }

    public boolean a(Object obj, View view, int i, Bundle bundle) {
        return k.a(obj, view, i, bundle);
    }
}
