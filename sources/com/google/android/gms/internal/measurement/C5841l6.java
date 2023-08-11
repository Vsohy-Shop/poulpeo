package com.google.android.gms.internal.measurement;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.l6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C5841l6 extends C5953s6<Long> {
    C5841l6(C5905p6 p6Var, String str, Long l, boolean z) {
        super(p6Var, str, l, true, (C5937r6) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo34164a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String c = super.mo34350c();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 25 + str.length());
            sb.append("Invalid long value for ");
            sb.append(c);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
