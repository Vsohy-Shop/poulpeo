package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5939r8 implements C6020w9 {

    /* renamed from: a */
    private static final C5939r8 f7322a = new C5939r8();

    private C5939r8() {
    }

    /* renamed from: c */
    public static C5939r8 m9828c() {
        return f7322a;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C5988u9 mo34224a(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<com.google.android.gms.internal.measurement.v8> r0 = com.google.android.gms.internal.measurement.C6003v8.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L_0x0024
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.getName()
            int r1 = r5.length()
            java.lang.String r2 = "Unsupported message type: "
            if (r1 == 0) goto L_0x001b
            java.lang.String r5 = r2.concat(r5)
            goto L_0x0020
        L_0x001b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x0020:
            r0.<init>(r5)
            throw r0
        L_0x0024:
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch:{ Exception -> 0x0035 }
            com.google.android.gms.internal.measurement.v8 r0 = com.google.android.gms.internal.measurement.C6003v8.m10159r(r0)     // Catch:{ Exception -> 0x0035 }
            r1 = 3
            r2 = 0
            java.lang.Object r0 = r0.mo33646v(r1, r2, r2)     // Catch:{ Exception -> 0x0035 }
            com.google.android.gms.internal.measurement.u9 r0 = (com.google.android.gms.internal.measurement.C5988u9) r0     // Catch:{ Exception -> 0x0035 }
            return r0
        L_0x0035:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r5 = r5.getName()
            int r2 = r5.length()
            java.lang.String r3 = "Unable to get message info for "
            if (r2 == 0) goto L_0x0049
            java.lang.String r5 = r3.concat(r5)
            goto L_0x004e
        L_0x0049:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
        L_0x004e:
            r1.<init>(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5939r8.mo34224a(java.lang.Class):com.google.android.gms.internal.measurement.u9");
    }

    /* renamed from: b */
    public final boolean mo34225b(Class<?> cls) {
        return C6003v8.class.isAssignableFrom(cls);
    }
}
