package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C5704d5;
import com.google.android.gms.internal.measurement.C5721e5;
import com.google.android.gms.internal.measurement.C5805j4;
import com.google.android.gms.internal.measurement.C5822k4;
import com.google.android.gms.internal.measurement.C5831kd;
import com.google.android.gms.internal.measurement.C5839l4;
import com.google.android.gms.internal.measurement.C5855m4;
import com.google.android.gms.internal.measurement.C5871n4;
import com.google.android.gms.internal.measurement.C5887o4;
import com.google.android.gms.internal.measurement.C5935r4;
import com.google.android.gms.internal.measurement.C5951s4;
import com.google.android.gms.internal.measurement.C5967t4;
import com.google.android.gms.internal.measurement.C5983u4;
import com.google.android.gms.internal.measurement.C5999v4;
import com.google.android.gms.internal.measurement.C6047y4;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p201q5.C9254a;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.d5 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6120d5 implements Callable<byte[]> {

    /* renamed from: b */
    final /* synthetic */ C6290t f7709b;

    /* renamed from: c */
    final /* synthetic */ String f7710c;

    /* renamed from: d */
    final /* synthetic */ C6175i5 f7711d;

    C6120d5(C6175i5 i5Var, C6290t tVar, String str) {
        this.f7711d = i5Var;
        this.f7709b = tVar;
        this.f7710c = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        byte[] bArr;
        C6157g9 g9Var;
        C6212l9 l9Var;
        Object obj;
        C5935r4 r4Var;
        C5967t4 t4Var;
        Bundle bundle;
        String str;
        C6306u4 u4Var;
        long j;
        C6246p pVar;
        this.f7711d.f7865a.mo34926e();
        C6308u6 c0 = this.f7711d.f7865a.mo34923c0();
        C6290t tVar = this.f7709b;
        String str2 = this.f7710c;
        c0.mo34778h();
        C6251p4.m10990t();
        C9713p.m20275j(tVar);
        C9713p.m20271f(str2);
        if (!c0.f7899a.mo35211z().mo34873B(str2, C6084a3.f7564W)) {
            c0.f7899a.mo34920b().mo35074q().mo35038b("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        } else if ("_iap".equals(tVar.f8229b) || "_iapx".equals(tVar.f8229b)) {
            C5935r4 w = C5951s4.m9862w();
            c0.f8374b.mo34914V().mo35019g0();
            C6306u4 T = c0.f8374b.mo34914V().mo35007T(str2);
            if (T == null) {
                c0.f7899a.mo34920b().mo35074q().mo35038b("Log and bundle not available. package_name", str2);
                bArr = new byte[0];
                g9Var = c0.f8374b;
            } else if (!T.mo35324K()) {
                c0.f7899a.mo34920b().mo35074q().mo35038b("Log and bundle disabled. package_name", str2);
                bArr = new byte[0];
                g9Var = c0.f8374b;
            } else {
                C5967t4 J1 = C5983u4.m10013J1();
                J1.mo34403Y(1);
                J1.mo34398S(SystemMediaRouteProvider.PACKAGE_NAME);
                if (!TextUtils.isEmpty(T.mo35349e0())) {
                    J1.mo34422r(T.mo35349e0());
                }
                if (!TextUtils.isEmpty(T.mo35353g0())) {
                    J1.mo34426t((String) C9713p.m20275j(T.mo35353g0()));
                }
                if (!TextUtils.isEmpty(T.mo35355h0())) {
                    J1.mo34428u((String) C9713p.m20275j(T.mo35355h0()));
                }
                if (T.mo35326M() != -2147483648L) {
                    J1.mo34430v((int) T.mo35326M());
                }
                J1.mo34392L(T.mo35337X());
                J1.mo34379E(T.mo35335V());
                String k0 = T.mo35361k0();
                String c02 = T.mo35345c0();
                C5831kd.m9523b();
                if (c0.f7899a.mo35211z().mo34873B(T.mo35349e0(), C6084a3.f7577e0)) {
                    String j0 = T.mo35359j0();
                    if (!TextUtils.isEmpty(k0)) {
                        J1.mo34390K(k0);
                    } else if (!TextUtils.isEmpty(j0)) {
                        J1.mo34388J(j0);
                    } else if (!TextUtils.isEmpty(c02)) {
                        J1.mo34393L0(c02);
                    }
                } else if (!TextUtils.isEmpty(k0)) {
                    J1.mo34390K(k0);
                } else if (!TextUtils.isEmpty(c02)) {
                    J1.mo34393L0(c02);
                }
                C9254a U = c0.f8374b.mo34913U(str2);
                J1.mo34373B(T.mo35334U());
                if (c0.f7899a.mo35204o() && c0.f7899a.mo35211z().mo34874C(J1.mo34414j0()) && U.mo43553j() && !TextUtils.isEmpty((CharSequence) null)) {
                    J1.mo34377D((String) null);
                }
                J1.mo34438z(U.mo43552i());
                if (U.mo43553j()) {
                    Pair<String, Boolean> n = c0.f8374b.mo34925d0().mo34855n(T.mo35349e0(), U);
                    if (T.mo35323J() && !TextUtils.isEmpty((CharSequence) n.first)) {
                        try {
                            J1.mo34404Z(C6308u6.m11184e((String) n.first, Long.toString(tVar.f8232e)));
                            Object obj2 = n.second;
                            if (obj2 != null) {
                                J1.mo34396N(((Boolean) obj2).booleanValue());
                            }
                        } catch (SecurityException e) {
                            c0.f7899a.mo34920b().mo35074q().mo35038b("Resettable device id encryption failed", e.getMessage());
                            bArr = new byte[0];
                            g9Var = c0.f8374b;
                        } catch (Throwable th) {
                            c0.f8374b.mo34914V().mo35021i0();
                            throw th;
                        }
                    }
                }
                c0.f7899a.mo35179A().mo35062k();
                J1.mo34375C(Build.MODEL);
                c0.f7899a.mo35179A().mo35062k();
                J1.mo34397P(Build.VERSION.RELEASE);
                J1.mo34408d0((int) c0.f7899a.mo35179A().mo35100p());
                J1.mo34412h0(c0.f7899a.mo35179A().mo35101q());
                try {
                    if (U.mo43554k() && T.mo35351f0() != null) {
                        J1.mo34424s(C6308u6.m11184e((String) C9713p.m20275j(T.mo35351f0()), Long.toString(tVar.f8232e)));
                    }
                    if (!TextUtils.isEmpty(T.mo35357i0())) {
                        J1.mo34386I((String) C9713p.m20275j(T.mo35357i0()));
                    }
                    String e0 = T.mo35349e0();
                    List<C6212l9> e02 = c0.f8374b.mo34914V().mo35017e0(e0);
                    Iterator<C6212l9> it = e02.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            l9Var = null;
                            break;
                        }
                        l9Var = it.next();
                        if ("_lte".equals(l9Var.f7962c)) {
                            break;
                        }
                    }
                    if (l9Var == null || l9Var.f7964e == null) {
                        C6212l9 l9Var2 = new C6212l9(e0, "auto", "_lte", c0.f7899a.mo34922c().mo33547a(), 0L);
                        e02.add(l9Var2);
                        c0.f8374b.mo34914V().mo35036z(l9Var2);
                    }
                    C6179i9 f0 = c0.f8374b.mo34928f0();
                    f0.f7899a.mo34920b().mo35079v().mo35037a("Checking account type status for ad personalization signals");
                    if (f0.f7899a.mo35179A().mo35103s()) {
                        String e03 = T.mo35349e0();
                        C9713p.m20275j(e03);
                        if (T.mo35323J() && f0.f8374b.mo34918Z().mo35046t(e03)) {
                            f0.f7899a.mo34920b().mo35074q().mo35037a("Turning off ad personalization due to account type");
                            Iterator<C6212l9> it2 = e02.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if ("_npa".equals(it2.next().f7962c)) {
                                    it2.remove();
                                    break;
                                }
                            }
                            e02.add(new C6212l9(e03, "auto", "_npa", f0.f7899a.mo34922c().mo33547a(), 1L));
                        }
                    }
                    C5721e5[] e5VarArr = new C5721e5[e02.size()];
                    for (int i = 0; i < e02.size(); i++) {
                        C5704d5 z = C5721e5.m9094z();
                        z.mo33830w(e02.get(i).f7962c);
                        z.mo33831x(e02.get(i).f7963d);
                        c0.f8374b.mo34928f0().mo34994M(z, e02.get(i).f7964e);
                        e5VarArr[i] = (C5721e5) z.mo34354l();
                    }
                    J1.mo34431v0(Arrays.asList(e5VarArr));
                    C6217m3 b = C6217m3.m10886b(tVar);
                    c0.f7899a.mo35191N().mo35158y(b.f7975d, c0.f8374b.mo34914V().mo35006S(str2));
                    c0.f7899a.mo35191N().mo35159z(b, c0.f7899a.mo35211z().mo34883n(str2));
                    Bundle bundle2 = b.f7975d;
                    bundle2.putLong("_c", 1);
                    c0.f7899a.mo34920b().mo35074q().mo35037a("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1);
                    bundle2.putString("_o", tVar.f8231d);
                    if (c0.f7899a.mo35191N().mo35133S(J1.mo34414j0())) {
                        c0.f7899a.mo35191N().mo35116B(bundle2, "_dbg", 1L);
                        c0.f7899a.mo35191N().mo35116B(bundle2, "_r", 1L);
                    }
                    C6246p X = c0.f8374b.mo34914V().mo35011X(str2, tVar.f8229b);
                    if (X == null) {
                        t4Var = J1;
                        u4Var = T;
                        r4Var = w;
                        str = str2;
                        bundle = bundle2;
                        obj = null;
                        pVar = new C6246p(str2, tVar.f8229b, 0, 0, 0, tVar.f8232e, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                        j = 0;
                    } else {
                        u4Var = T;
                        r4Var = w;
                        str = str2;
                        bundle = bundle2;
                        t4Var = J1;
                        obj = null;
                        long j2 = X.f8071f;
                        pVar = X.mo35177c(tVar.f8232e);
                        j = j2;
                    }
                    c0.f8374b.mo34914V().mo35028r(pVar);
                    C6235o oVar = new C6235o(c0.f7899a, tVar.f8231d, str, tVar.f8229b, tVar.f8232e, j, bundle);
                    C5805j4 B = C5822k4.m9480B();
                    B.mo34107E(oVar.f8039d);
                    B.mo34120z(oVar.f8037b);
                    B.mo34106D(oVar.f8040e);
                    C6257q qVar = new C6257q(oVar.f8041f);
                    while (qVar.hasNext()) {
                        String a = qVar.next();
                        C5871n4 B2 = C5887o4.m9708B();
                        B2.mo34206B(a);
                        Object J = oVar.f8041f.mo35273J(a);
                        if (J != null) {
                            c0.f8374b.mo34928f0().mo34993L(B2, J);
                            B.mo34116v(B2);
                        }
                    }
                    C5967t4 t4Var2 = t4Var;
                    t4Var2.mo34433w0(B);
                    C5999v4 w2 = C6047y4.m10293w();
                    C5839l4 w3 = C5855m4.m9625w();
                    w3.mo34160r(pVar.f8068c);
                    w3.mo34161s(tVar.f8229b);
                    w2.mo34544r(w3);
                    t4Var2.mo34399T(w2);
                    t4Var2.mo34425s0(c0.f8374b.mo34911S().mo34750m(u4Var.mo35349e0(), Collections.emptyList(), t4Var2.mo34418n0(), Long.valueOf(B.mo34114t()), Long.valueOf(B.mo34114t())));
                    if (B.mo34111J()) {
                        t4Var2.mo34407c0(B.mo34114t());
                        t4Var2.mo34381F(B.mo34114t());
                    }
                    long Y = u4Var.mo35338Y();
                    int i2 = (Y > 0 ? 1 : (Y == 0 ? 0 : -1));
                    if (i2 != 0) {
                        t4Var2.mo34400U(Y);
                    }
                    long a0 = u4Var.mo35341a0();
                    if (a0 != 0) {
                        t4Var2.mo34401W(a0);
                    } else if (i2 != 0) {
                        t4Var2.mo34401W(Y);
                    }
                    u4Var.mo35348e();
                    t4Var2.mo34432w((int) u4Var.mo35339Z());
                    c0.f7899a.mo35211z().mo34886q();
                    t4Var2.mo34410f0(46000);
                    t4Var2.mo34409e0(c0.f7899a.mo34922c().mo33547a());
                    t4Var2.mo34406b0(true);
                    C5935r4 r4Var2 = r4Var;
                    r4Var2.mo34313r(t4Var2);
                    C6306u4 u4Var2 = u4Var;
                    u4Var2.mo35318E(t4Var2.mo34421q0());
                    u4Var2.mo35316C(t4Var2.mo34420p0());
                    c0.f8374b.mo34914V().mo35027q(u4Var2);
                    c0.f8374b.mo34914V().mo35026p();
                    c0.f8374b.mo34914V().mo35021i0();
                    try {
                        return c0.f8374b.mo34928f0().mo34996Q(((C5951s4) r4Var2.mo34354l()).mo34044j());
                    } catch (IOException e2) {
                        c0.f7899a.mo34920b().mo35075r().mo35039c("Data loss. Failed to bundle and serialize. appId", C6206l3.m10862z(str), e2);
                        return obj;
                    }
                } catch (SecurityException e3) {
                    c0.f7899a.mo34920b().mo35074q().mo35038b("app instance id encryption failed", e3.getMessage());
                    bArr = new byte[0];
                    g9Var = c0.f8374b;
                }
            }
            g9Var.mo34914V().mo35021i0();
            return bArr;
        } else {
            c0.f7899a.mo34920b().mo35074q().mo35039c("Generating a payload for this event is not available. package_name, event_name", str2, tVar.f8229b);
            return null;
        }
    }
}
