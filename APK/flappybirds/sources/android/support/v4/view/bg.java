package android.support.v4.view;

import android.view.View;

class bg {
    public static void a(View view, Object obj) {
        view.setAccessibilityDelegate((View.AccessibilityDelegate) obj);
    }

    public static boolean a(View view, int i) {
        return view.canScrollHorizontally(i);
    }
}
