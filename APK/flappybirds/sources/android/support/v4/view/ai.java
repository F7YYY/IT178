package android.support.v4.view;

import android.database.DataSetObserver;

class ai extends DataSetObserver implements cb, cc {
    final /* synthetic */ PagerTitleStrip a;
    private int b;

    private ai(PagerTitleStrip pagerTitleStrip) {
        this.a = pagerTitleStrip;
    }

    public void a(int i) {
        float f = 0.0f;
        if (this.b == 0) {
            this.a.a(this.a.a.getCurrentItem(), this.a.a.getAdapter());
            if (this.a.g >= 0.0f) {
                f = this.a.g;
            }
            this.a.a(this.a.a.getCurrentItem(), f, true);
        }
    }

    public void a(int i, float f, int i2) {
        if (f > 0.5f) {
            i++;
        }
        this.a.a(i, f, false);
    }

    public void a(ae aeVar, ae aeVar2) {
        this.a.a(aeVar, aeVar2);
    }

    public void b(int i) {
        this.b = i;
    }

    public void onChanged() {
        float f = 0.0f;
        this.a.a(this.a.a.getCurrentItem(), this.a.a.getAdapter());
        if (this.a.g >= 0.0f) {
            f = this.a.g;
        }
        this.a.a(this.a.a.getCurrentItem(), f, true);
    }
}
