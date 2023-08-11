package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C5859m8;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.n8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5875n8<T extends C5859m8<T>> {

    /* renamed from: d */
    private static final C5875n8 f7151d = new C5875n8(true);

    /* renamed from: a */
    final C5973ta<T, Object> f7152a = new C5861ma(16);

    /* renamed from: b */
    private boolean f7153b;

    /* renamed from: c */
    private boolean f7154c;

    private C5875n8() {
    }

    /* renamed from: a */
    public static <T extends C5859m8<T>> C5875n8<T> m9687a() {
        throw null;
    }

    /* renamed from: d */
    private static final void m9688d(T t, Object obj) {
        boolean z;
        C5878nb zzb = t.zzb();
        C5708d9.m9018e(obj);
        C5878nb nbVar = C5878nb.DOUBLE;
        C5894ob obVar = C5894ob.INT;
        switch (zzb.mo34229a().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof C6018w7) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if (obj instanceof Integer) {
                    return;
                }
                break;
            case 8:
                if (obj instanceof C6052y9) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.zzb().mo34229a(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo34219b() {
        if (!this.f7153b) {
            this.f7152a.mo34188a();
            this.f7153b = true;
        }
    }

    /* renamed from: c */
    public final void mo34220c(T t, Object obj) {
        if (!t.mo34177x()) {
            m9688d(t, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m9688d(t, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f7152a.put(t, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C5875n8 n8Var = new C5875n8();
        for (int i = 0; i < this.f7152a.mo34440b(); i++) {
            Map.Entry<T, Object> h = this.f7152a.mo34448h(i);
            n8Var.mo34220c((C5859m8) h.getKey(), h.getValue());
        }
        for (Map.Entry next : this.f7152a.mo34441c()) {
            n8Var.mo34220c((C5859m8) next.getKey(), next.getValue());
        }
        n8Var.f7154c = this.f7154c;
        return n8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5875n8)) {
            return false;
        }
        return this.f7152a.equals(((C5875n8) obj).f7152a);
    }

    public final int hashCode() {
        return this.f7152a.hashCode();
    }

    private C5875n8(boolean z) {
        mo34219b();
        mo34219b();
    }
}
