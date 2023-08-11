package com.google.android.gms.internal.measurement;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.n6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C5873n6 extends C5953s6<Double> {
    C5873n6(C5905p6 p6Var, String str, Double d, boolean z) {
        super(p6Var, "measurement.test.double_flag", d, true, (C5937r6) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo34164a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String c = super.mo34350c();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 27 + str.length());
            sb.append("Invalid double value for ");
            sb.append(c);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
