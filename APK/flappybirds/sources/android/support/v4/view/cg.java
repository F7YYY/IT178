package android.support.v4.view;

import android.support.v4.view.ViewPager;
import android.view.View;
import java.util.Comparator;

class cg implements Comparator {
    cg() {
    }

    /* renamed from: a */
    public int compare(View view, View view2) {
        ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) view.getLayoutParams();
        ViewPager.LayoutParams layoutParams2 = (ViewPager.LayoutParams) view2.getLayoutParams();
        return layoutParams.a != layoutParams2.a ? layoutParams.a ? 1 : -1 : layoutParams.e - layoutParams2.e;
    }
}
