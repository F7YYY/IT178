package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.Game;
import java.util.ArrayList;

public final class b extends com.google.android.gms.common.data.b implements Invitation {
    private final Game c;
    private final d d;
    private final ArrayList e;

    public Game b() {
        return this.c;
    }

    public String c() {
        return d("external_invitation_id");
    }

    public Participant d() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public long e() {
        return a("creation_timestamp");
    }

    public boolean equals(Object obj) {
        return InvitationEntity.a(this, obj);
    }

    public int f() {
        return b("type");
    }

    public int g() {
        return b("variant");
    }

    /* renamed from: h */
    public Invitation a() {
        return new InvitationEntity(this);
    }

    public int hashCode() {
        return InvitationEntity.a((Invitation) this);
    }

    public ArrayList i() {
        return this.e;
    }

    public String toString() {
        return InvitationEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((InvitationEntity) a()).writeToParcel(parcel, i);
    }
}
