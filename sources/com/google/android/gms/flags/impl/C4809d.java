package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.d */
/* compiled from: com.google.android.gms:play-services-flags@@17.0.1 */
final class C4809d implements Callable<String> {

    /* renamed from: b */
    final /* synthetic */ SharedPreferences f5104b;

    /* renamed from: c */
    final /* synthetic */ String f5105c;

    /* renamed from: d */
    final /* synthetic */ String f5106d;

    C4809d(SharedPreferences sharedPreferences, String str, String str2) {
        this.f5104b = sharedPreferences;
        this.f5105c = str;
        this.f5106d = str2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return this.f5104b.getString(this.f5105c, this.f5106d);
    }
}
