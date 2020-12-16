package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.b;
import com.google.android.gms.games.multiplayer.d;
import java.util.ArrayList;

public final class c extends b implements Room {
    private final int c;

    public String b() {
        return d("external_match_id");
    }

    public String c() {
        return d("creator_external");
    }

    public long d() {
        return a("creation_timestamp");
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        return b("status");
    }

    public boolean equals(Object obj) {
        return RoomEntity.a(this, obj);
    }

    public String f() {
        return d("description");
    }

    public int g() {
        return b("variant");
    }

    public Bundle h() {
        if (!c("has_automatch_criteria")) {
            return null;
        }
        return b.a(b("automatch_min_players"), b("automatch_max_players"), a("automatch_bit_mask"));
    }

    public int hashCode() {
        return RoomEntity.a((Room) this);
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList(this.c);
        for (int i = 0; i < this.c; i++) {
            arrayList.add(new d(this.a, this.b + i));
        }
        return arrayList;
    }

    public int j() {
        return b("automatch_wait_estimate_sec");
    }

    /* renamed from: k */
    public Room a() {
        return new RoomEntity(this);
    }

    public String toString() {
        return RoomEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((RoomEntity) a()).writeToParcel(parcel, i);
    }
}
