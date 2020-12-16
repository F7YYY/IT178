package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.b;

public final class d extends b implements Player {
    public d(com.google.android.gms.common.data.d dVar, int i) {
        super(dVar, i);
    }

    public String b() {
        return d("external_player_id");
    }

    public String c() {
        return d("profile_name");
    }

    public Uri d() {
        return e("profile_icon_image_uri");
    }

    public int describeContents() {
        return 0;
    }

    public Uri e() {
        return e("profile_hi_res_image_uri");
    }

    public boolean equals(Object obj) {
        return PlayerEntity.a(this, obj);
    }

    public long f() {
        return a("last_updated");
    }

    /* renamed from: g */
    public Player a() {
        return new PlayerEntity(this);
    }

    public int hashCode() {
        return PlayerEntity.a((Player) this);
    }

    public String toString() {
        return PlayerEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((PlayerEntity) a()).writeToParcel(parcel, i);
    }
}
