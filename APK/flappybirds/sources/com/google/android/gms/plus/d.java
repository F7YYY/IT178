package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class d implements View.OnClickListener, e {
    final /* synthetic */ PlusOneButton a;
    private final e b;

    public d(PlusOneButton plusOneButton, e eVar) {
        this.a = plusOneButton;
        this.b = eVar;
    }

    public void a(Intent intent) {
        Context context = this.a.getContext();
        if ((context instanceof Activity) && intent != null) {
            ((Activity) context).startActivityForResult(intent, this.a.e);
        }
    }

    public void onClick(View view) {
        Intent intent = (Intent) this.a.a.getTag();
        if (this.b != null) {
            this.b.a(intent);
        } else {
            a(intent);
        }
    }
}
