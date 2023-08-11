package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.a */
/* compiled from: com.google.android.gms:play-services-flags@@17.0.1 */
final class C4806a implements Callable<Boolean> {

    /* renamed from: b */
    final /* synthetic */ SharedPreferences f5095b;

    /* renamed from: c */
    final /* synthetic */ String f5096c;

    /* renamed from: d */
    final /* synthetic */ Boolean f5097d;

    C4806a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f5095b = sharedPreferences;
        this.f5096c = str;
        this.f5097d = bool;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return Boolean.valueOf(this.f5095b.getBoolean(this.f5096c, this.f5097d.booleanValue()));
    }
}
