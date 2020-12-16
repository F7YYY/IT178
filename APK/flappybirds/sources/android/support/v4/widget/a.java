package android.support.v4.widget;

class a implements Runnable {
    final /* synthetic */ ContentLoadingProgressBar a;

    a(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.a = contentLoadingProgressBar;
    }

    public void run() {
        boolean unused = this.a.b = false;
        long unused2 = this.a.a = -1;
        this.a.setVisibility(8);
    }
}
