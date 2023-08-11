package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import p037b6.C2903f0;

public abstract class AssetPackState {
    /* renamed from: a */
    static AssetPackState m11322a(Bundle bundle, String str, C6777v0 v0Var, C6780w wVar) {
        return m11323b(str, wVar.mo39374a(bundle.getInt(C2903f0.m2319a(NotificationCompat.CATEGORY_STATUS, str)), str), bundle.getInt(C2903f0.m2319a("error_code", str)), bundle.getLong(C2903f0.m2319a("bytes_downloaded", str)), bundle.getLong(C2903f0.m2319a("total_bytes_to_download", str)), v0Var.mo39377c(str));
    }

    /* renamed from: b */
    public static AssetPackState m11323b(@NonNull String str, int i, int i2, long j, long j2, double d) {
        return new C6709e0(str, i, i2, j, j2, (int) Math.rint(100.0d * d));
    }

    /* renamed from: c */
    public abstract long mo39252c();

    /* renamed from: d */
    public abstract int mo39253d();

    /* renamed from: e */
    public abstract String mo39254e();

    /* renamed from: f */
    public abstract int mo39255f();

    /* renamed from: g */
    public abstract long mo39256g();

    /* renamed from: h */
    public abstract int mo39257h();
}
