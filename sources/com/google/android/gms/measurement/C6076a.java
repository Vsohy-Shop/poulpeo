package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.measurement.internal.C6190j9;
import com.google.android.gms.measurement.internal.C6251p4;
import com.google.android.gms.measurement.internal.C6264q6;
import java.util.List;
import java.util.Map;
import p201q5.C9270q;
import p201q5.C9271r;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.a */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6076a extends C6079d {

    /* renamed from: a */
    private final C6251p4 f7524a;

    /* renamed from: b */
    private final C6264q6 f7525b;

    public C6076a(@NonNull C6251p4 p4Var) {
        super((C6078c) null);
        C9713p.m20275j(p4Var);
        this.f7524a = p4Var;
        this.f7525b = p4Var.mo35186I();
    }

    /* renamed from: A */
    public final String mo34723A() {
        return this.f7525b.mo35242X();
    }

    /* renamed from: a */
    public final int mo34724a(String str) {
        this.f7525b.mo35237S(str);
        return 25;
    }

    /* renamed from: b */
    public final String mo34725b() {
        return this.f7525b.mo35243Y();
    }

    /* renamed from: c */
    public final List<Bundle> mo34726c(String str, String str2) {
        return this.f7525b.mo35246b0(str, str2);
    }

    /* renamed from: d */
    public final Map<String, Object> mo34727d(String str, String str2, boolean z) {
        return this.f7525b.mo35248d0(str, str2, z);
    }

    /* renamed from: e */
    public final void mo34728e(String str, String str2, Bundle bundle, long j) {
        this.f7525b.mo35255s(str, str2, bundle, true, false, j);
    }

    /* renamed from: f */
    public final void mo34729f(Bundle bundle) {
        this.f7525b.mo35225D(bundle);
    }

    /* renamed from: g */
    public final void mo34730g(String str, String str2, Bundle bundle) {
        this.f7525b.mo35254r(str, str2, bundle);
    }

    /* renamed from: h */
    public final void mo34731h(String str) {
        this.f7524a.mo35210y().mo34775l(str, this.f7524a.mo34922c().mo33548b());
    }

    /* renamed from: i */
    public final void mo34732i(C9271r rVar) {
        this.f7525b.mo35260x(rVar);
    }

    /* renamed from: j */
    public final void mo34733j(String str, String str2, Bundle bundle) {
        this.f7524a.mo35186I().mo35250i0(str, str2, bundle);
    }

    /* renamed from: k */
    public final void mo34734k(String str) {
        this.f7524a.mo35210y().mo34776m(str, this.f7524a.mo34922c().mo33548b());
    }

    /* renamed from: l */
    public final void mo34735l(C9270q qVar) {
        this.f7525b.mo35230I(qVar);
    }

    /* renamed from: m */
    public final Map<String, Object> mo34736m(boolean z) {
        List<C6190j9> c0 = this.f7525b.mo35247c0(z);
        ArrayMap arrayMap = new ArrayMap(c0.size());
        for (C6190j9 next : c0) {
            Object A = next.mo35057A();
            if (A != null) {
                arrayMap.put(next.f7907c, A);
            }
        }
        return arrayMap;
    }

    /* renamed from: n */
    public final String mo34737n() {
        return this.f7525b.mo35244Z();
    }

    /* renamed from: y */
    public final String mo34738y() {
        return this.f7525b.mo35242X();
    }

    public final long zzb() {
        return this.f7524a.mo35191N().mo35149r0();
    }
}
