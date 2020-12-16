package android.support.v4.view;

import android.view.KeyEvent;

class t implements w {
    t() {
    }

    private static int a(int i, int i2, int i3, int i4, int i5) {
        boolean z = true;
        boolean z2 = (i2 & i3) != 0;
        int i6 = i4 | i5;
        if ((i2 & i6) == 0) {
            z = false;
        }
        if (!z2) {
            return z ? i & (i3 ^ -1) : i;
        }
        if (!z) {
            return i & (i6 ^ -1);
        }
        throw new IllegalArgumentException("bad arguments");
    }

    public int a(int i) {
        int i2 = (i & 192) != 0 ? i | 1 : i;
        if ((i2 & 48) != 0) {
            i2 |= 2;
        }
        return i2 & 247;
    }

    public void a(KeyEvent keyEvent) {
    }

    public boolean a(int i, int i2) {
        return a(a(a(i) & 247, i2, 1, 64, 128), i2, 2, 16, 32) == i2;
    }

    public boolean b(int i) {
        return (a(i) & 247) == 0;
    }
}
