package com.google.android.gms.internal.gtm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.rc */
public abstract class C5528rc<T> {

    /* renamed from: a */
    protected Map<String, C5528rc<?>> f6287a;

    /* renamed from: a */
    public abstract T mo33142a();

    /* renamed from: b */
    public final void mo33499b(String str, C5528rc<?> rcVar) {
        if (this.f6287a == null) {
            this.f6287a = new HashMap();
        }
        this.f6287a.put(str, rcVar);
    }

    /* renamed from: c */
    public final boolean mo33500c(String str) {
        Map<String, C5528rc<?>> map = this.f6287a;
        if (map == null || !map.containsKey(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public C5528rc<?> mo33143d(String str) {
        Map<String, C5528rc<?>> map = this.f6287a;
        if (map != null) {
            return map.get(str);
        }
        return C5618xc.f6732h;
    }

    /* renamed from: e */
    public boolean mo33144e(String str) {
        return false;
    }

    /* renamed from: f */
    public C5491p5 mo33146f(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
        sb.append("Attempting to access Native Method ");
        sb.append(str);
        sb.append(" on unsupported type.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: g */
    public Iterator<C5528rc<?>> mo33147g() {
        return new C5559tc((C5543sc) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final Iterator<C5528rc<?>> mo33501h() {
        Map<String, C5528rc<?>> map = this.f6287a;
        if (map == null) {
            return new C5559tc((C5543sc) null);
        }
        return new C5543sc(this, map.keySet().iterator());
    }

    public abstract String toString();
}
