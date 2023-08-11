package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.C5653a5;
import com.google.android.gms.internal.measurement.C5670b5;
import com.google.android.gms.internal.measurement.C5687c5;
import com.google.android.gms.internal.measurement.C5737f4;
import com.google.android.gms.internal.measurement.C5754g4;
import com.google.android.gms.internal.measurement.C5771h4;
import com.google.android.gms.internal.measurement.C5788i4;
import com.google.android.gms.internal.measurement.C6055yc;
import com.google.android.gms.internal.measurement.C6063z4;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p201q5.C9277x;

/* renamed from: com.google.android.gms.measurement.internal.v9 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6322v9 {

    /* renamed from: a */
    private String f8337a;

    /* renamed from: b */
    private boolean f8338b;

    /* renamed from: c */
    private C5653a5 f8339c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public BitSet f8340d;

    /* renamed from: e */
    private BitSet f8341e;

    /* renamed from: f */
    private Map<Integer, Long> f8342f;

    /* renamed from: g */
    private Map<Integer, List<Long>> f8343g;

    /* renamed from: h */
    final /* synthetic */ C6091aa f8344h;

    /* synthetic */ C6322v9(C6091aa aaVar, String str, C9277x xVar) {
        this.f8344h = aaVar;
        this.f8337a = str;
        this.f8338b = true;
        this.f8340d = new BitSet();
        this.f8341e = new BitSet();
        this.f8342f = new ArrayMap();
        this.f8343g = new ArrayMap();
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public final C5754g4 mo35391a(int i) {
        ArrayList arrayList;
        List list;
        C5737f4 x = C5754g4.m9272x();
        x.mo33989r(i);
        x.mo33991t(this.f8338b);
        C5653a5 a5Var = this.f8339c;
        if (a5Var != null) {
            x.mo33992u(a5Var);
        }
        C6063z4 C = C5653a5.m8736C();
        C.mo34676s(C6179i9.m10731J(this.f8340d));
        C.mo34678u(C6179i9.m10731J(this.f8341e));
        Map<Integer, Long> map = this.f8342f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer intValue : this.f8342f.keySet()) {
                int intValue2 = intValue.intValue();
                Long l = this.f8342f.get(Integer.valueOf(intValue2));
                if (l != null) {
                    C5771h4 y = C5788i4.m9391y();
                    y.mo34069s(intValue2);
                    y.mo34068r(l.longValue());
                    arrayList2.add((C5788i4) y.mo34354l());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            C.mo34675r(arrayList);
        }
        Map<Integer, List<Long>> map2 = this.f8343g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer next : this.f8343g.keySet()) {
                C5670b5 z = C5687c5.m8882z();
                z.mo33699s(next.intValue());
                List list2 = this.f8343g.get(next);
                if (list2 != null) {
                    Collections.sort(list2);
                    z.mo33698r(list2);
                }
                arrayList3.add((C5687c5) z.mo34354l());
            }
            list = arrayList3;
        }
        C.mo34677t(list);
        x.mo33990s(C);
        return (C5754g4) x.mo34354l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo35392c(@NonNull C6355y9 y9Var) {
        int a = y9Var.mo35409a();
        Boolean bool = y9Var.f8417c;
        if (bool != null) {
            this.f8341e.set(a, bool.booleanValue());
        }
        Boolean bool2 = y9Var.f8418d;
        if (bool2 != null) {
            this.f8340d.set(a, bool2.booleanValue());
        }
        if (y9Var.f8419e != null) {
            Map<Integer, Long> map = this.f8342f;
            Integer valueOf = Integer.valueOf(a);
            Long l = map.get(valueOf);
            long longValue = y9Var.f8419e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f8342f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (y9Var.f8420f != null) {
            Map<Integer, List<Long>> map2 = this.f8343g;
            Integer valueOf2 = Integer.valueOf(a);
            List list = map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f8343g.put(valueOf2, list);
            }
            if (y9Var.mo35411c()) {
                list.clear();
            }
            C6055yc.m10320b();
            C6147g z = this.f8344h.f7899a.mo35211z();
            String str = this.f8337a;
            C6359z2<Boolean> z2Var = C6084a3.f7569a0;
            if (z.mo34873B(str, z2Var) && y9Var.mo35410b()) {
                list.clear();
            }
            C6055yc.m10320b();
            if (this.f8344h.f7899a.mo35211z().mo34873B(this.f8337a, z2Var)) {
                Long valueOf3 = Long.valueOf(y9Var.f8420f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(y9Var.f8420f.longValue() / 1000));
        }
    }

    /* synthetic */ C6322v9(C6091aa aaVar, String str, C5653a5 a5Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, C9277x xVar) {
        this.f8344h = aaVar;
        this.f8337a = str;
        this.f8340d = bitSet;
        this.f8341e = bitSet2;
        this.f8342f = map;
        this.f8343g = new ArrayMap();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f8343g.put(num, arrayList);
        }
        this.f8338b = false;
        this.f8339c = a5Var;
    }
}
