package android.support.v4.app;

import android.view.animation.Animation;

class q implements Animation.AnimationListener {
    final /* synthetic */ Fragment a;
    final /* synthetic */ o b;

    q(o oVar, Fragment fragment) {
        this.b = oVar;
        this.a = fragment;
    }

    public void onAnimationEnd(Animation animation) {
        if (this.a.b != null) {
            this.a.b = null;
            this.b.a(this.a, this.a.c, 0, 0, false);
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
