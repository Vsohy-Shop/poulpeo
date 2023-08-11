package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5810j9 extends C5844l9 {

    /* renamed from: c */
    private static final Class<?> f7027c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ C5810j9(C5793i9 i9Var) {
        super((C5793i9) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34126a(Object obj, long j) {
        Object obj2;
        List list = (List) C5778hb.m9361k(obj, j);
        if (list instanceof C5776h9) {
            obj2 = ((C5776h9) list).mo33776e();
        } else if (!f7027c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C5743fa) || !(list instanceof C5691c9)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C5691c9 c9Var = (C5691c9) list;
                if (c9Var.mo33774x()) {
                    c9Var.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C5778hb.m9374x(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.measurement.g9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.google.android.gms.internal.measurement.g9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.gms.internal.measurement.g9} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> void mo34127b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C5776h9
            if (r2 == 0) goto L_0x0020
            com.google.android.gms.internal.measurement.g9 r1 = new com.google.android.gms.internal.measurement.g9
            r1.<init>((int) r0)
            goto L_0x0035
        L_0x0020:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C5743fa
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C5691c9
            if (r2 == 0) goto L_0x0030
            com.google.android.gms.internal.measurement.c9 r1 = (com.google.android.gms.internal.measurement.C5691c9) r1
            com.google.android.gms.internal.measurement.c9 r0 = r1.mo33773m(r0)
            r1 = r0
            goto L_0x0035
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0035:
            com.google.android.gms.internal.measurement.C5778hb.m9374x(r5, r7, r1)
            goto L_0x008f
        L_0x0039:
            java.lang.Class<?> r2 = f7027c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0057
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            com.google.android.gms.internal.measurement.C5778hb.m9374x(r5, r7, r2)
        L_0x0055:
            r1 = r2
            goto L_0x008f
        L_0x0057:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C5693cb
            if (r2 == 0) goto L_0x0072
            com.google.android.gms.internal.measurement.g9 r2 = new com.google.android.gms.internal.measurement.g9
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.google.android.gms.internal.measurement.cb r1 = (com.google.android.gms.internal.measurement.C5693cb) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            com.google.android.gms.internal.measurement.C5778hb.m9374x(r5, r7, r2)
            goto L_0x0055
        L_0x0072:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C5743fa
            if (r2 == 0) goto L_0x008f
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C5691c9
            if (r2 == 0) goto L_0x008f
            r2 = r1
            com.google.android.gms.internal.measurement.c9 r2 = (com.google.android.gms.internal.measurement.C5691c9) r2
            boolean r3 = r2.mo33774x()
            if (r3 != 0) goto L_0x008f
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.measurement.c9 r1 = r2.mo33773m(r1)
            com.google.android.gms.internal.measurement.C5778hb.m9374x(r5, r7, r1)
        L_0x008f:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x009e
            if (r2 <= 0) goto L_0x009e
            r1.addAll(r6)
        L_0x009e:
            if (r0 > 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r6 = r1
        L_0x00a2:
            com.google.android.gms.internal.measurement.C5778hb.m9374x(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5810j9.mo34127b(java.lang.Object, java.lang.Object, long):void");
    }
}
