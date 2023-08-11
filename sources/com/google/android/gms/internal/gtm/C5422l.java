package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.C4718a;

/* renamed from: com.google.android.gms.internal.gtm.l */
public final class C5422l {

    /* renamed from: a */
    public static final String f6100a;

    /* renamed from: b */
    public static final String f6101b;

    static {
        String str;
        String replaceAll = String.valueOf(C4718a.f4882a / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
        f6100a = replaceAll;
        String valueOf = String.valueOf(replaceAll);
        if (valueOf.length() != 0) {
            str = "ma".concat(valueOf);
        } else {
            str = new String("ma");
        }
        f6101b = str;
    }
}
