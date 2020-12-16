package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.b.k;
import com.google.android.gms.internal.Cdo;
import com.google.android.gms.internal.dp;
import com.google.android.gms.internal.u;

public final class SignInButton extends FrameLayout implements View.OnClickListener {
    private int a;
    private int b;
    private View c;
    private View.OnClickListener d;

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = null;
        a(0, 0);
    }

    private static Button a(Context context, int i, int i2) {
        u uVar = new u(context);
        uVar.a(context.getResources(), i, i2);
        return uVar;
    }

    private void a(Context context) {
        if (this.c != null) {
            removeView(this.c);
        }
        try {
            this.c = dp.a(context, this.a, this.b);
        } catch (k e) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            this.c = a(context, this.a, this.b);
        }
        addView(this.c);
        this.c.setEnabled(isEnabled());
        this.c.setOnClickListener(this);
    }

    public void a(int i, int i2) {
        boolean z = true;
        Cdo.a(i >= 0 && i < 3, (Object) "Unknown button size " + i);
        if (i2 < 0 || i2 >= 2) {
            z = false;
        }
        Cdo.a(z, (Object) "Unknown color scheme " + i2);
        this.a = i;
        this.b = i2;
        a(getContext());
    }

    public void onClick(View view) {
        if (this.d != null && view == this.c) {
            this.d.onClick(this);
        }
    }

    public void setColorScheme(int i) {
        a(this.a, i);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.c.setEnabled(z);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.d = onClickListener;
        if (this.c != null) {
            this.c.setOnClickListener(this);
        }
    }

    public void setSize(int i) {
        a(i, this.b);
    }
}
