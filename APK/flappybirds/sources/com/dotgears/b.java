package com.dotgears;

class b implements Runnable {
    final /* synthetic */ GameActivity a;

    b(GameActivity gameActivity) {
        this.a = gameActivity;
    }

    public void run() {
        this.a.a.setVisibility(0);
    }
}
