package com.dotgears;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.ads.AdView;
import com.google.ads.d;
import com.google.ads.g;
import com.google.example.games.basegameutils.b;
import java.io.IOException;
import org.andengine.a.c.a;
import org.andengine.b.c.h;
import org.andengine.b.e;
import org.andengine.opengl.c.c.c;
import org.andengine.opengl.c.f;
import org.andengine.opengl.view.RenderSurfaceView;
import org.andengine.ui.activity.BaseGameActivity;
import org.andengine.ui.activity.SimpleBaseGameActivity;

public class GameActivity extends SimpleBaseGameActivity implements b {
    public AdView a;
    public a b;
    public a c;
    public a d;
    public a e;
    public a f;
    protected com.google.example.games.basegameutils.a g;
    protected int h = 1;
    protected String i = "BaseGameActivity";
    protected boolean j = false;
    private org.andengine.b.a.a m;
    private c n;
    private String[] o;

    public org.andengine.b.a a(org.andengine.b.c.b bVar) {
        return new e(bVar, 60);
    }

    public org.andengine.b.c.b a() {
        this.m = new org.andengine.b.a.a(0.0f, 0.0f, 288.0f, 512.0f);
        org.andengine.b.c.b bVar = new org.andengine.b.c.b(true, org.andengine.b.c.e.PORTRAIT_FIXED, new org.andengine.b.c.a.b(288.0f, 512.0f), this.m);
        bVar.d().b(true).a(true);
        bVar.e().a(true);
        bVar.c().a(true);
        bVar.a(h.SCREEN_ON);
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void b() {
        RelativeLayout relativeLayout = new RelativeLayout(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.l = new RenderSurfaceView(this);
        this.l.a(this.k, (org.andengine.opengl.view.h) this);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(BaseGameActivity.B());
        layoutParams2.addRule(13);
        relativeLayout.addView(this.l, layoutParams2);
        FrameLayout frameLayout = new FrameLayout(this);
        this.a = new AdView((Activity) this, g.a, "a152df006159b75");
        this.a.refreshDrawableState();
        frameLayout.addView(this.a, new FrameLayout.LayoutParams(-2, -2, 49));
        relativeLayout.addView(frameLayout);
        this.a.a(new d());
        setContentView(relativeLayout, layoutParams);
    }

    public void c() {
        runOnUiThread(new a(this));
    }

    public void d() {
        runOnUiThread(new b(this));
    }

    public void e() {
        this.b.d();
    }

    public void f() {
        this.c.d();
    }

    public void g() {
        this.d.d();
    }

    public void h() {
        this.e.d();
    }

    public void i() {
        this.f.d();
    }

    public void j() {
    }

    public void k() {
    }

    /* access modifiers changed from: protected */
    public void l() {
        org.andengine.opengl.c.a.a.b.a("gfx/");
        org.andengine.opengl.c.a.a.a aVar = new org.andengine.opengl.c.a.a.a(y(), 1024, 1024, f.i);
        this.n = org.andengine.opengl.c.a.a.b.a(aVar, (Context) this, "atlas.png", 0, 0);
        aVar.i();
        org.andengine.a.c.b.a("sounds/");
        try {
            this.b = org.andengine.a.c.b.a(this.k.i(), this, "sfx_point.ogg");
            this.c = org.andengine.a.c.b.a(this.k.i(), this, "sfx_die.ogg");
            this.d = org.andengine.a.c.b.a(this.k.i(), this, "sfx_hit.ogg");
            this.e = org.andengine.a.c.b.a(this.k.i(), this, "sfx_swooshing.ogg");
            this.f = org.andengine.a.c.b.a(this.k.i(), this, "sfx_wing.ogg");
        } catch (IOException e2) {
        }
    }

    /* access modifiers changed from: protected */
    public org.andengine.c.b.e m() {
        return new c(this, this.n);
    }

    /* access modifiers changed from: protected */
    public com.google.android.gms.games.c n() {
        return this.g.b();
    }

    public boolean o() {
        return this.g.c();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        this.g.a(i2, i3, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g = new com.google.example.games.basegameutils.a(this);
        if (this.j) {
            this.g.a(this.j, this.i);
        }
        this.g.a((b) this, this.h, this.o);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        System.exit(0);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return false;
        }
        Log.i("FlappyBird", "Back key pressed.");
        return false;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.g.a((Activity) this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.g.d();
    }

    public void p() {
        this.g.f();
    }
}
