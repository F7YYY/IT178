package android.support.v4.view.a;

import android.os.Build;
import android.os.Bundle;
import java.util.List;

public class k {
    private static final l a;
    private final Object b;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            a = new o();
        } else if (Build.VERSION.SDK_INT >= 16) {
            a = new m();
        } else {
            a = new q();
        }
    }

    public k() {
        this.b = a.a(this);
    }

    public k(Object obj) {
        this.b = obj;
    }

    public a a(int i) {
        return null;
    }

    public Object a() {
        return this.b;
    }

    public List a(String str, int i) {
        return null;
    }

    public boolean a(int i, int i2, Bundle bundle) {
        return false;
    }

    public a b(int i) {
        return null;
    }
}
