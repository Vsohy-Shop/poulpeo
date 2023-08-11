package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.gtm.rb */
final class C5527rb implements C5588vb {

    /* renamed from: a */
    private final /* synthetic */ Context f6286a;

    C5527rb(Context context) {
        this.f6286a = context;
    }

    /* renamed from: a */
    public final InputStream mo33498a(String str) {
        return this.f6286a.getAssets().open(str);
    }
}
