package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import p231t4.C9713p;
import p286y4.C10671e;
import p296z3.C10797b;
import p296z3.C10812p;

/* renamed from: com.google.android.gms.internal.gtm.j */
public class C5392j {

    /* renamed from: b */
    private final C5437m f6055b;

    protected C5392j(C5437m mVar) {
        C9713p.m20275j(mVar);
        this.f6055b = mVar;
    }

    /* renamed from: G0 */
    public static boolean m8046G0() {
        return Log.isLoggable(C5592w0.f6420c.mo33605a(), 2);
    }

    /* renamed from: Q */
    private static String m8047Q(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            if (obj == Boolean.TRUE) {
                return "true";
            }
            return "false";
        } else if (obj instanceof Throwable) {
            return ((Throwable) obj).toString();
        } else {
            return obj.toString();
        }
    }

    /* renamed from: Y */
    protected static String m8048Y(String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String Q = m8047Q(obj);
        String Q2 = m8047Q(obj2);
        String Q3 = m8047Q(obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(Q)) {
            sb.append(str2);
            sb.append(Q);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(Q2)) {
            sb.append(str2);
            sb.append(Q2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(Q3)) {
            sb.append(str3);
            sb.append(Q3);
        }
        return sb.toString();
    }

    /* renamed from: k */
    private final void m8049k(int i, String str, Object obj, Object obj2, Object obj3) {
        C5348g1 g1Var;
        C5437m mVar = this.f6055b;
        if (mVar != null) {
            g1Var = mVar.mo33340o();
        } else {
            g1Var = null;
        }
        C5348g1 g1Var2 = g1Var;
        if (g1Var2 != null) {
            String a = C5592w0.f6420c.mo33605a();
            if (Log.isLoggable(a, i)) {
                Log.println(i, a, m8048Y(str, obj, obj2, obj3));
            }
            if (i >= 5) {
                g1Var2.mo33216T0(i, str, obj, obj2, obj3);
                return;
            }
            return;
        }
        String a2 = C5592w0.f6420c.mo33605a();
        if (Log.isLoggable(a2, i)) {
            Log.println(i, a2, m8048Y(str, obj, obj2, obj3));
        }
    }

    /* renamed from: A */
    public final void mo33257A(String str, Object obj) {
        m8049k(2, str, obj, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A0 */
    public final C5332f0 mo33258A0() {
        return this.f6055b.mo33344s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B0 */
    public final C5316e mo33259B0() {
        return this.f6055b.mo33343r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C0 */
    public final C5619y mo33260C0() {
        return this.f6055b.mo33337l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public final C5531s0 mo33261D0() {
        return this.f6055b.mo33338m();
    }

    /* renamed from: E0 */
    public final void mo33262E0(String str, Object obj) {
        m8049k(5, str, obj, (Object) null, (Object) null);
    }

    /* renamed from: F0 */
    public final void mo33263F0(String str, Object obj, Object obj2) {
        m8049k(6, str, obj, obj2, (Object) null);
    }

    /* renamed from: G */
    public final void mo33264G(String str, Object obj, Object obj2) {
        m8049k(2, str, obj, obj2, (Object) null);
    }

    /* renamed from: H0 */
    public final void mo33265H0(String str, Object obj) {
        m8049k(6, str, obj, (Object) null, (Object) null);
    }

    /* renamed from: I0 */
    public final void mo33266I0(String str) {
        m8049k(2, str, (Object) null, (Object) null, (Object) null);
    }

    /* renamed from: J0 */
    public final void mo33267J0(String str) {
        m8049k(3, str, (Object) null, (Object) null, (Object) null);
    }

    /* renamed from: K0 */
    public final void mo33268K0(String str) {
        m8049k(4, str, (Object) null, (Object) null, (Object) null);
    }

    /* renamed from: L0 */
    public final void mo33269L0(String str) {
        m8049k(5, str, (Object) null, (Object) null, (Object) null);
    }

    /* renamed from: M0 */
    public final void mo33270M0(String str) {
        m8049k(6, str, (Object) null, (Object) null, (Object) null);
    }

    /* renamed from: O */
    public final void mo33271O(String str, Object obj, Object obj2, Object obj3) {
        m8049k(3, str, obj, obj2, obj3);
    }

    /* renamed from: R */
    public final void mo33272R(String str, Object obj) {
        m8049k(3, str, obj, (Object) null, (Object) null);
    }

    /* renamed from: V */
    public final void mo33273V(String str, Object obj, Object obj2) {
        m8049k(3, str, obj, obj2, (Object) null);
    }

    /* renamed from: X */
    public final void mo33274X(String str, Object obj, Object obj2, Object obj3) {
        m8049k(5, str, obj, obj2, obj3);
    }

    /* renamed from: a0 */
    public final void mo33275a0(String str, Object obj) {
        m8049k(4, str, obj, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Context mo33276c() {
        return this.f6055b.mo33328a();
    }

    /* renamed from: c0 */
    public final void mo33277c0(String str, Object obj, Object obj2) {
        m8049k(5, str, obj, obj2, (Object) null);
    }

    /* renamed from: j0 */
    public final C5437m mo33278j0() {
        return this.f6055b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public final C10671e mo33279k0() {
        return this.f6055b.mo33329d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public final C5348g1 mo33280p0() {
        return this.f6055b.mo33330e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public final C5468o0 mo33281t0() {
        return this.f6055b.mo33331f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public final C10812p mo33282u0() {
        return this.f6055b.mo33332g();
    }

    /* renamed from: v0 */
    public final C10797b mo33283v0() {
        return this.f6055b.mo33341p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w0 */
    public final C5331f mo33284w0() {
        return this.f6055b.mo33333h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public final C5546t0 mo33285x0() {
        return this.f6055b.mo33334i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public final C5517r1 mo33286y0() {
        return this.f6055b.mo33335j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z0 */
    public final C5409k1 mo33287z0() {
        return this.f6055b.mo33336k();
    }
}
