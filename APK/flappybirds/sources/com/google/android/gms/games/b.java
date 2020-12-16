package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;

public final class b extends com.google.android.gms.common.data.b implements Game {
    public String b() {
        return d("external_game_id");
    }

    public String c() {
        return d("display_name");
    }

    public String d() {
        return d("primary_category");
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return d("secondary_category");
    }

    public boolean equals(Object obj) {
        return GameEntity.a(this, obj);
    }

    public String f() {
        return d("game_description");
    }

    public String g() {
        return d("developer_name");
    }

    public Uri h() {
        return e("game_icon_image_uri");
    }

    public int hashCode() {
        return GameEntity.a((Game) this);
    }

    public Uri i() {
        return e("game_hi_res_image_uri");
    }

    public Uri j() {
        return e("featured_image_uri");
    }

    public boolean k() {
        return c("play_enabled_game");
    }

    public boolean l() {
        return b("installed") > 0;
    }

    public String m() {
        return d("package_name");
    }

    public int n() {
        return b("gameplay_acl_status");
    }

    public int o() {
        return b("achievement_total_count");
    }

    public int p() {
        return b("leaderboard_count");
    }

    /* renamed from: q */
    public Game a() {
        return new GameEntity(this);
    }

    public String toString() {
        return GameEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((GameEntity) a()).writeToParcel(parcel, i);
    }
}
