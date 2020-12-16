package android.support.v4.view;

import android.os.Build;
import android.view.ViewGroup;

public class bo {
    static final br a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            a = new bs();
        } else if (i >= 14) {
            a = new bq();
        } else if (i >= 11) {
            a = new bp();
        } else {
            a = new bt();
        }
    }

    public static void a(ViewGroup viewGroup, boolean z) {
        a.a(viewGroup, z);
    }
}
