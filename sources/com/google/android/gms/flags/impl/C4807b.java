package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.b */
/* compiled from: com.google.android.gms:play-services-flags@@17.0.1 */
final class C4807b implements Callable<Integer> {

    /* renamed from: b */
    final /* synthetic */ SharedPreferences f5098b;

    /* renamed from: c */
    final /* synthetic */ String f5099c;

    /* renamed from: d */
    final /* synthetic */ Integer f5100d;

    C4807b(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f5098b = sharedPreferences;
        this.f5099c = str;
        this.f5100d = num;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return Integer.valueOf(this.f5098b.getInt(this.f5099c, this.f5100d.intValue()));
    }
}
