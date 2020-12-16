package android.support.v4.view;

import android.os.Parcel;
import android.support.v4.a.c;
import android.support.v4.view.ViewPager;

final class cf implements c {
    cf() {
    }

    /* renamed from: b */
    public ViewPager.SavedState a(Parcel parcel, ClassLoader classLoader) {
        return new ViewPager.SavedState(parcel, classLoader);
    }

    /* renamed from: b */
    public ViewPager.SavedState[] a(int i) {
        return new ViewPager.SavedState[i];
    }
}
