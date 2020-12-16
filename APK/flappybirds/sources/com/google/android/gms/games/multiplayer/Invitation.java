package com.google.android.gms.games.multiplayer;

import android.os.Parcelable;
import com.google.android.gms.common.data.a;
import com.google.android.gms.games.Game;

public interface Invitation extends Parcelable, a, e {
    Game b();

    String c();

    Participant d();

    long e();

    int f();

    int g();
}
