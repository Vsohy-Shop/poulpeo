package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.cast.yc */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5235yc {

    /* renamed from: d */
    private static final C5235yc f5605d = new C5235yc(true);

    /* renamed from: a */
    final C4949hf f5606a = new C5220xe(16);

    /* renamed from: b */
    private boolean f5607b;

    /* renamed from: c */
    private boolean f5608c;

    private C5235yc() {
    }

    /* renamed from: a */
    public static C5235yc m7700a() {
        throw null;
    }

    /* renamed from: d */
    private static final void m7701d(C5218xc xcVar, Object obj) {
        boolean z;
        C4827ag zzb = xcVar.zzb();
        C5032md.m7198e(obj);
        C4827ag agVar = C4827ag.DOUBLE;
        C4845bg bgVar = C4845bg.INT;
        switch (zzb.mo32618a().ordinal()) {
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
                if ((obj instanceof C4980jc) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof C4913fd)) {
                    return;
                }
            case 8:
                if (obj instanceof C4982je) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(xcVar.zza()), xcVar.zzb().mo32618a(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo33061b() {
        if (!this.f5607b) {
            for (int i = 0; i < this.f5606a.mo32825b(); i++) {
                Map.Entry h = this.f5606a.mo32833h(i);
                if (h.getValue() instanceof C4878dd) {
                    ((C4878dd) h.getValue()).mo32734g();
                }
            }
            this.f5606a.mo32824a();
            this.f5607b = true;
        }
    }

    /* renamed from: c */
    public final void mo33062c(C5218xc xcVar, Object obj) {
        if (!xcVar.mo33051x()) {
            m7701d(xcVar, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m7701d(xcVar, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f5606a.put(xcVar, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C5235yc ycVar = new C5235yc();
        for (int i = 0; i < this.f5606a.mo32825b(); i++) {
            Map.Entry h = this.f5606a.mo32833h(i);
            ycVar.mo33062c((C5218xc) h.getKey(), h.getValue());
        }
        for (Map.Entry entry : this.f5606a.mo32826c()) {
            ycVar.mo33062c((C5218xc) entry.getKey(), entry.getValue());
        }
        ycVar.f5608c = this.f5608c;
        return ycVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5235yc)) {
            return false;
        }
        return this.f5606a.equals(((C5235yc) obj).f5606a);
    }

    public final int hashCode() {
        return this.f5606a.hashCode();
    }

    private C5235yc(boolean z) {
        mo33061b();
        mo33061b();
    }
}
