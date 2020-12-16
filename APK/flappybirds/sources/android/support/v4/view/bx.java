package android.support.v4.view;

class bx implements Runnable {
    final /* synthetic */ ViewPager a;

    bx(ViewPager viewPager) {
        this.a = viewPager;
    }

    public void run() {
        this.a.setScrollState(0);
        this.a.c();
    }
}
