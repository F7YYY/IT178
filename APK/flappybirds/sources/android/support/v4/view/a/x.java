package android.support.v4.view.a;

import android.os.Build;

public class x {
    private static final aa a;
    private final Object b;

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            a = new ab();
        } else if (Build.VERSION.SDK_INT >= 15) {
            a = new z();
        } else if (Build.VERSION.SDK_INT >= 14) {
            a = new y();
        } else {
            a = new ac();
        }
    }

    public x(Object obj) {
        this.b = obj;
    }

    public static x a() {
        return new x(a.a());
    }

    public void a(int i) {
        a.b(this.b, i);
    }

    public void a(boolean z) {
        a.a(this.b, z);
    }

    public void b(int i) {
        a.a(this.b, i);
    }

    public void c(int i) {
        a.c(this.b, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.b == null ? xVar.b == null : this.b.equals(xVar.b);
    }

    public int hashCode() {
        if (this.b == null) {
            return 0;
        }
        return this.b.hashCode();
    }
}
