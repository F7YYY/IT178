package org.andengine.ui.activity;

import org.andengine.ui.d;

class a implements d {
    final /* synthetic */ BaseGameActivity a;

    a(BaseGameActivity baseGameActivity) {
        this.a = baseGameActivity;
    }

    public void a() {
        try {
            org.andengine.d.e.a.b(String.valueOf(this.a.getClass().getSimpleName()) + ".onGameCreated" + " @(Thread: '" + Thread.currentThread().getName() + "')");
            this.a.r();
        } catch (Throwable th) {
            org.andengine.d.e.a.b(String.valueOf(this.a.getClass().getSimpleName()) + ".onGameCreated failed." + " @(Thread: '" + Thread.currentThread().getName() + "')", th);
        }
        this.a.c();
    }
}
