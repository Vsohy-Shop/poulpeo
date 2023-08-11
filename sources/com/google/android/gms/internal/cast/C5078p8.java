package com.google.android.gms.internal.cast;

import android.os.Bundle;
import androidx.annotation.MainThread;
import java.math.BigInteger;
import java.util.Map;
import p150l4.C8675b;

@MainThread
/* renamed from: com.google.android.gms.internal.cast.p8 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C5078p8 {

    /* renamed from: d */
    private static final C8675b f5465d = new C8675b("ApplicationAnalyticsUtils");

    /* renamed from: e */
    private static final String f5466e = "21.2.0";

    /* renamed from: a */
    private final String f5467a;

    /* renamed from: b */
    private final Map f5468b;

    /* renamed from: c */
    private final Map f5469c;

    public C5078p8(Bundle bundle, String str) {
        this.f5467a = str;
        this.f5468b = C4899f.m6957a(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.f5469c = C4899f.m6957a(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }

    /* renamed from: h */
    private final C5061o8 m7352h(C5060o7 o7Var) {
        long j;
        C5061o8 z = C5095q8.m7384z();
        z.mo32925x(o7Var.f5437c);
        int i = o7Var.f5438d;
        o7Var.f5438d = i + 1;
        z.mo32922u(i);
        String str = o7Var.f5436b;
        if (str != null) {
            z.mo32923v(str);
        }
        String str2 = o7Var.f5441g;
        if (str2 != null) {
            z.mo32921t(str2);
        }
        C4891e8 y = C4908f8.m6974y();
        y.mo32763o(f5466e);
        y.mo32762i(this.f5467a);
        z.mo32916o((C4908f8) y.mo32643e());
        C4925g8 y2 = C4942h8.m7040y();
        if (o7Var.f5435a != null) {
            C4838b9 y3 = C4856c9.m6842y();
            y3.mo32638i(o7Var.f5435a);
            y2.mo32799i((C4856c9) y3.mo32643e());
        }
        y2.mo32803r(false);
        String str3 = o7Var.f5439e;
        if (str3 != null) {
            try {
                String replace = str3.replace("-", "");
                j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e) {
                f5465d.mo42760g(e, "receiverSessionId %s is not valid for hash", str3);
                j = 0;
            }
            y2.mo32805t(j);
        }
        y2.mo32800o(o7Var.f5440f);
        y2.mo32802q(o7Var.f5442h);
        z.mo32918q(y2);
        return z;
    }

    /* renamed from: i */
    private static void m7353i(C5061o8 o8Var, boolean z) {
        C4925g8 z2 = C4942h8.m7041z(o8Var.mo32915i());
        z2.mo32803r(z);
        o8Var.mo32918q(z2);
    }

    /* renamed from: a */
    public final C5095q8 mo32949a(C5060o7 o7Var) {
        return (C5095q8) m7352h(o7Var).mo32643e();
    }

    /* renamed from: b */
    public final C5095q8 mo32950b(C5060o7 o7Var, boolean z) {
        C5061o8 h = m7352h(o7Var);
        m7353i(h, z);
        return (C5095q8) h.mo32643e();
    }

    /* renamed from: c */
    public final C5095q8 mo32951c(C5060o7 o7Var) {
        C5061o8 h = m7352h(o7Var);
        C4925g8 z = C4942h8.m7041z(h.mo32915i());
        z.mo32804s(10);
        h.mo32919r((C4942h8) z.mo32643e());
        m7353i(h, true);
        return (C5095q8) h.mo32643e();
    }

    /* renamed from: d */
    public final C5095q8 mo32952d(C5060o7 o7Var) {
        C5061o8 h = m7352h(o7Var);
        if (o7Var.f5443i == 1) {
            C4925g8 z = C4942h8.m7041z(h.mo32915i());
            z.mo32804s(17);
            h.mo32919r((C4942h8) z.mo32643e());
        }
        return (C5095q8) h.mo32643e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0037  */
    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.cast.C5095q8 mo32953e(com.google.android.gms.internal.cast.C5060o7 r4, int r5) {
        /*
            r3 = this;
            com.google.android.gms.internal.cast.o8 r4 = r3.m7352h(r4)
            com.google.android.gms.internal.cast.h8 r0 = r4.mo32915i()
            com.google.android.gms.internal.cast.g8 r0 = com.google.android.gms.internal.cast.C4942h8.m7041z(r0)
            java.util.Map r1 = r3.f5469c
            if (r1 == 0) goto L_0x002e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L_0x001b
            goto L_0x002e
        L_0x001b:
            java.util.Map r1 = r3.f5469c
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r1 = p231t4.C9713p.m20275j(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0030
        L_0x002e:
            int r1 = r5 + 10000
        L_0x0030:
            r0.mo32804s(r1)
            java.util.Map r1 = r3.f5468b
            if (r1 == 0) goto L_0x0055
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L_0x0042
            goto L_0x0055
        L_0x0042:
            java.util.Map r5 = r3.f5468b
            java.lang.Object r5 = r5.get(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r5 = p231t4.C9713p.m20275j(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L_0x0057
        L_0x0055:
            int r5 = r5 + 10000
        L_0x0057:
            r0.mo32801p(r5)
            com.google.android.gms.internal.cast.dd r5 = r0.mo32643e()
            com.google.android.gms.internal.cast.h8 r5 = (com.google.android.gms.internal.cast.C4942h8) r5
            r4.mo32919r(r5)
            com.google.android.gms.internal.cast.dd r4 = r4.mo32643e()
            com.google.android.gms.internal.cast.q8 r4 = (com.google.android.gms.internal.cast.C5095q8) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C5078p8.mo32953e(com.google.android.gms.internal.cast.o7, int):com.google.android.gms.internal.cast.q8");
    }

    /* renamed from: f */
    public final C5095q8 mo32954f(C5060o7 o7Var, int i, int i2) {
        C5061o8 h = m7352h(o7Var);
        C4925g8 z = C4942h8.m7041z(h.mo32915i());
        z.mo32807v(i);
        z.mo32806u(i2);
        h.mo32919r((C4942h8) z.mo32643e());
        return (C5095q8) h.mo32643e();
    }

    /* renamed from: g */
    public final C5095q8 mo32955g(C5060o7 o7Var, int i) {
        C5061o8 h = m7352h(o7Var);
        C4925g8 z = C4942h8.m7041z(h.mo32915i());
        z.mo32807v(i);
        h.mo32919r((C4942h8) z.mo32643e());
        return (C5095q8) h.mo32643e();
    }
}
