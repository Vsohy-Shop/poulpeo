package com.google.android.gms.internal.gtm;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.b4 */
public final class C5276b4 {

    /* renamed from: a */
    private C5276b4 f5871a;

    /* renamed from: b */
    private Map<String, C5528rc> f5872b;

    public C5276b4() {
        this((C5276b4) null);
    }

    /* renamed from: a */
    public final boolean mo33121a(String str) {
        C5276b4 b4Var = this;
        do {
            Map<String, C5528rc> map = b4Var.f5872b;
            if (map != null && map.containsKey(str)) {
                return true;
            }
            b4Var = b4Var.f5871a;
        } while (b4Var != null);
        return false;
    }

    /* renamed from: b */
    public final void mo33122b(String str) {
        C5276b4 b4Var = this;
        while (true) {
            C9713p.m20278m(b4Var.mo33121a(str));
            Map<String, C5528rc> map = b4Var.f5872b;
            if (map == null || !map.containsKey(str)) {
                b4Var = b4Var.f5871a;
            } else {
                b4Var.f5872b.remove(str);
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo33123c(String str, C5528rc<?> rcVar) {
        if (this.f5872b == null) {
            this.f5872b = new HashMap();
        }
        this.f5872b.put(str, rcVar);
    }

    /* renamed from: d */
    public final void mo33124d(String str, C5528rc<?> rcVar) {
        String str2;
        C5276b4 b4Var = this;
        do {
            Map<String, C5528rc> map = b4Var.f5872b;
            if (map == null || !map.containsKey(str)) {
                b4Var = b4Var.f5871a;
            } else {
                b4Var.f5872b.put(str, rcVar);
                return;
            }
        } while (b4Var != null);
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Trying to modify a non existent symbol: ".concat(valueOf);
        } else {
            str2 = new String("Trying to modify a non existent symbol: ");
        }
        throw new IllegalStateException(str2);
    }

    /* renamed from: e */
    public final C5528rc<?> mo33125e(String str) {
        String str2;
        C5276b4 b4Var = this;
        do {
            Map<String, C5528rc> map = b4Var.f5872b;
            if (map != null && map.containsKey(str)) {
                return b4Var.f5872b.get(str);
            }
            b4Var = b4Var.f5871a;
        } while (b4Var != null);
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Trying to get a non existent symbol: ".concat(valueOf);
        } else {
            str2 = new String("Trying to get a non existent symbol: ");
        }
        throw new IllegalStateException(str2);
    }

    /* renamed from: f */
    public final C5276b4 mo33126f() {
        return new C5276b4(this);
    }

    private C5276b4(@Nullable C5276b4 b4Var) {
        this.f5872b = null;
        this.f5871a = b4Var;
    }
}
