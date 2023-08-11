package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.o */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6235o {

    /* renamed from: a */
    final String f8036a;

    /* renamed from: b */
    final String f8037b;

    /* renamed from: c */
    final String f8038c;

    /* renamed from: d */
    final long f8039d;

    /* renamed from: e */
    final long f8040e;

    /* renamed from: f */
    final C6268r f8041f;

    C6235o(C6251p4 p4Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        C6268r rVar;
        C9713p.m20271f(str2);
        C9713p.m20271f(str3);
        this.f8036a = str2;
        this.f8037b = str3;
        this.f8038c = true == TextUtils.isEmpty(str) ? null : str;
        this.f8039d = j;
        this.f8040e = j2;
        if (j2 != 0 && j2 > j) {
            p4Var.mo34920b().mo35080w().mo35038b("Event created with reverse previous/current timestamps. appId", C6206l3.m10862z(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            rVar = new C6268r(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    p4Var.mo34920b().mo35075r().mo35037a("Param name can't be null");
                    it.remove();
                } else {
                    Object o = p4Var.mo35191N().mo35143o(next, bundle2.get(next));
                    if (o == null) {
                        p4Var.mo34920b().mo35080w().mo35038b("Param value can't be null", p4Var.mo35182D().mo34900e(next));
                        it.remove();
                    } else {
                        p4Var.mo35191N().mo35116B(bundle2, next, o);
                    }
                }
            }
            rVar = new C6268r(bundle2);
        }
        this.f8041f = rVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C6235o mo35160a(C6251p4 p4Var, long j) {
        return new C6235o(p4Var, this.f8038c, this.f8036a, this.f8037b, this.f8039d, j, this.f8041f);
    }

    public final String toString() {
        String str = this.f8036a;
        String str2 = this.f8037b;
        String obj = this.f8041f.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + obj.length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    private C6235o(C6251p4 p4Var, String str, String str2, String str3, long j, long j2, C6268r rVar) {
        C9713p.m20271f(str2);
        C9713p.m20271f(str3);
        C9713p.m20275j(rVar);
        this.f8036a = str2;
        this.f8037b = str3;
        this.f8038c = true == TextUtils.isEmpty(str) ? null : str;
        this.f8039d = j;
        this.f8040e = j2;
        if (j2 != 0 && j2 > j) {
            p4Var.mo34920b().mo35080w().mo35039c("Event created with reverse previous/current timestamps. appId, name", C6206l3.m10862z(str2), C6206l3.m10862z(str3));
        }
        this.f8041f = rVar;
    }
}
