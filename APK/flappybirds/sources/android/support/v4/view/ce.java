package android.support.v4.view;

import android.database.DataSetObserver;

class ce extends DataSetObserver {
    final /* synthetic */ ViewPager a;

    private ce(ViewPager viewPager) {
        this.a = viewPager;
    }

    /* synthetic */ ce(ViewPager viewPager, bv bvVar) {
        this(viewPager);
    }

    public void onChanged() {
        this.a.b();
    }

    public void onInvalidated() {
        this.a.b();
    }
}
