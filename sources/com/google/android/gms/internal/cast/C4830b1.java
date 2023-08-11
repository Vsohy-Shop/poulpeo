package com.google.android.gms.internal.cast;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.cast.b1 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4830b1 {

    /* renamed from: a */
    Object[] f5151a;

    /* renamed from: b */
    int f5152b = 0;

    /* renamed from: c */
    C4812a1 f5153c;

    C4830b1(int i) {
        this.f5151a = new Object[(i + i)];
    }

    /* renamed from: b */
    private final void m6814b(int i) {
        int i2 = i + i;
        Object[] objArr = this.f5151a;
        int length = objArr.length;
        if (i2 > length) {
            this.f5151a = Arrays.copyOf(objArr, C5155u0.m7520a(length, i2));
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.cast.C4830b1 mo32637a(java.lang.Iterable r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x000e
            int r0 = r5.f5152b
            int r1 = r6.size()
            int r0 = r0 + r1
            r5.m6814b(r0)
        L_0x000e:
            java.util.Iterator r6 = r6.iterator()
        L_0x0012:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0041
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            int r2 = r5.f5152b
            int r2 = r2 + 1
            r5.m6814b(r2)
            com.google.android.gms.internal.cast.C5104r0.m7429a(r1, r0)
            java.lang.Object[] r2 = r5.f5151a
            int r3 = r5.f5152b
            int r4 = r3 + r3
            r2[r4] = r1
            int r4 = r4 + 1
            r2[r4] = r0
            int r3 = r3 + 1
            r5.f5152b = r3
            goto L_0x0012
        L_0x0041:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C4830b1.mo32637a(java.lang.Iterable):com.google.android.gms.internal.cast.b1");
    }
}
