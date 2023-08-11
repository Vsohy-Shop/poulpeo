package com.google.android.gms.internal.gtm;

import android.util.Log;
import p296z3.C10800e;

@Deprecated
/* renamed from: com.google.android.gms.internal.gtm.f1 */
public final class C5333f1 {

    /* renamed from: a */
    private static volatile C10800e f5986a = new C5486p0();

    /* renamed from: a */
    private static boolean m7922a(int i) {
        if (f5986a == null || f5986a.mo33326b() > i) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m7923b(C10800e eVar) {
        f5986a = eVar;
    }

    /* renamed from: c */
    public static void m7924c(String str) {
        C5348g1 V0 = C5348g1.m7949V0();
        if (V0 != null) {
            V0.mo33269L0(str);
        } else if (m7922a(2)) {
            Log.w(C5592w0.f6420c.mo33605a(), str);
        }
        C10800e eVar = f5986a;
        if (eVar != null) {
            eVar.mo33327c(str);
        }
    }

    /* renamed from: d */
    public static void m7925d(String str, Object obj) {
        String str2;
        C5348g1 V0 = C5348g1.m7949V0();
        if (V0 != null) {
            V0.mo33265H0(str, obj);
        } else if (m7922a(3)) {
            if (obj != null) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + valueOf.length());
                sb.append(str);
                sb.append(":");
                sb.append(valueOf);
                str2 = sb.toString();
            } else {
                str2 = str;
            }
            Log.e(C5592w0.f6420c.mo33605a(), str2);
        }
        C10800e eVar = f5986a;
        if (eVar != null) {
            eVar.mo33325a(str);
        }
    }
}
