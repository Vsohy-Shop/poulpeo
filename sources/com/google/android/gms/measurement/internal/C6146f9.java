package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C5822k4;
import com.google.android.gms.internal.measurement.C5983u4;
import java.util.ArrayList;
import java.util.List;
import p201q5.C9276w;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.f9 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6146f9 {

    /* renamed from: a */
    C5983u4 f7777a;

    /* renamed from: b */
    List<Long> f7778b;

    /* renamed from: c */
    List<C5822k4> f7779c;

    /* renamed from: d */
    long f7780d;

    /* renamed from: e */
    final /* synthetic */ C6157g9 f7781e;

    /* synthetic */ C6146f9(C6157g9 g9Var, C9276w wVar) {
        this.f7781e = g9Var;
    }

    /* renamed from: b */
    private static final long m10586b(C5822k4 k4Var) {
        return ((k4Var.mo34142z() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final boolean mo34871a(long j, C5822k4 k4Var) {
        C9713p.m20275j(k4Var);
        if (this.f7779c == null) {
            this.f7779c = new ArrayList();
        }
        if (this.f7778b == null) {
            this.f7778b = new ArrayList();
        }
        if (this.f7779c.size() > 0 && m10586b(this.f7779c.get(0)) != m10586b(k4Var)) {
            return false;
        }
        long b = this.f7780d + ((long) k4Var.mo34551b());
        this.f7781e.mo34912T();
        if (b >= ((long) Math.max(0, C6084a3.f7586j.mo35421a(null).intValue()))) {
            return false;
        }
        this.f7780d = b;
        this.f7779c.add(k4Var);
        this.f7778b.add(Long.valueOf(j));
        int size = this.f7779c.size();
        this.f7781e.mo34912T();
        if (size >= Math.max(1, C6084a3.f7588k.mo35421a(null).intValue())) {
            return false;
        }
        return true;
    }
}
