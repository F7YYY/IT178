package com.google.tagmanager;

import android.content.SharedPreferences;

final class q implements Runnable {
    final /* synthetic */ SharedPreferences.Editor a;

    q(SharedPreferences.Editor editor) {
        this.a = editor;
    }

    public void run() {
        this.a.commit();
    }
}
