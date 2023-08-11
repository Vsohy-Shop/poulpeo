package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.c */
/* compiled from: com.google.android.gms:play-services-flags@@17.0.1 */
final class C4808c implements Callable<Long> {

    /* renamed from: b */
    final /* synthetic */ SharedPreferences f5101b;

    /* renamed from: c */
    final /* synthetic */ String f5102c;

    /* renamed from: d */
    final /* synthetic */ Long f5103d;

    C4808c(SharedPreferences sharedPreferences, String str, Long l) {
        this.f5101b = sharedPreferences;
        this.f5102c = str;
        this.f5103d = l;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return Long.valueOf(this.f5101b.getLong(this.f5102c, this.f5103d.longValue()));
    }
}
