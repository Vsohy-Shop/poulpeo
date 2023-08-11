package com.google.android.gms.common;

import android.content.Context;
import android.os.Message;
import android.util.Log;
import p121i5.C8185f;

/* renamed from: com.google.android.gms.common.d */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C4786d extends C8185f {

    /* renamed from: a */
    private final Context f5068a;

    /* renamed from: b */
    final /* synthetic */ GoogleApiAvailability f5069b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4786d(com.google.android.gms.common.GoogleApiAvailability r1, android.content.Context r2) {
        /*
            r0 = this;
            r0.f5069b = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto L_0x000d
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L_0x0011
        L_0x000d:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L_0x0011:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.f5068a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C4786d.<init>(com.google.android.gms.common.GoogleApiAvailability, android.content.Context):void");
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int g = this.f5069b.mo32346g(this.f5068a);
        if (this.f5069b.mo32348j(g)) {
            this.f5069b.mo32352p(this.f5068a, g);
        }
    }
}
