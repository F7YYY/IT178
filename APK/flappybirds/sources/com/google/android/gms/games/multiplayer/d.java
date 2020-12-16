package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.b;
import com.google.android.gms.games.Player;

public final class d extends b implements Participant {
    private final com.google.android.gms.games.d c;

    public d(com.google.android.gms.common.data.d dVar, int i) {
        super(dVar, i);
        this.c = new com.google.android.gms.games.d(dVar, i);
    }

    public int b() {
        return b("player_status");
    }

    public String c() {
        return d("client_address");
    }

    public int d() {
        return b("capabilities");
    }

    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return b("connected") > 0;
    }

    public boolean equals(Object obj) {
        return ParticipantEntity.a(this, obj);
    }

    public String f() {
        return f("external_player_id") ? d("default_display_name") : this.c.c();
    }

    public Uri g() {
        return f("external_player_id") ? e("default_display_image_uri") : this.c.d();
    }

    public Uri h() {
        if (f("external_player_id")) {
            return null;
        }
        return this.c.e();
    }

    public int hashCode() {
        return ParticipantEntity.a((Participant) this);
    }

    public String i() {
        return d("external_participant_id");
    }

    public Player j() {
        if (f("external_player_id")) {
            return null;
        }
        return this.c;
    }

    /* renamed from: k */
    public Participant a() {
        return new ParticipantEntity(this);
    }

    public String toString() {
        return ParticipantEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((ParticipantEntity) a()).writeToParcel(parcel, i);
    }
}
