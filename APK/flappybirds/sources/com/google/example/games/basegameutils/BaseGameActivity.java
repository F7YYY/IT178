package com.google.example.games.basegameutils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public abstract class BaseGameActivity extends FragmentActivity implements b {
    protected a n = new a(this);
    protected int o = 1;
    protected String p = "BaseGameActivity";
    protected boolean q = false;
    private String[] r;

    protected BaseGameActivity() {
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.n.a(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.n = new a(this);
        if (this.q) {
            this.n.a(this.q, this.p);
        }
        this.n.a((b) this, this.o, this.r);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.n.a((Activity) this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.n.d();
    }
}
