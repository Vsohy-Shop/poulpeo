package com.google.android.gms.common.api;

import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class ApiException extends Exception {
    @NonNull
    @Deprecated

    /* renamed from: b */
    protected final Status f4884b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ApiException(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r5) {
        /*
            r4 = this;
            int r0 = r5.mo32378F()
            java.lang.String r1 = r5.mo32379G()
            if (r1 == 0) goto L_0x000f
            java.lang.String r1 = r5.mo32379G()
            goto L_0x0011
        L_0x000f:
            java.lang.String r1 = ""
        L_0x0011:
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 13
            r3.<init>(r2)
            r3.append(r0)
            java.lang.String r0 = ": "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r4.<init>(r0)
            r4.f4884b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.ApiException.<init>(com.google.android.gms.common.api.Status):void");
    }

    @NonNull
    /* renamed from: a */
    public Status mo32365a() {
        return this.f4884b;
    }

    /* renamed from: b */
    public int mo32366b() {
        return this.f4884b.mo32378F();
    }
}
