package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p022a4.C2200a;
import p022a4.C2201b;
import p022a4.C2202c;
import p296z3.C10810n;

/* renamed from: com.google.android.gms.internal.gtm.sd */
public final class C5544sd extends C10810n<C5544sd> {

    /* renamed from: a */
    private final List<C2200a> f6313a = new ArrayList();

    /* renamed from: b */
    private final List<C2202c> f6314b = new ArrayList();

    /* renamed from: c */
    private final Map<String, List<C2200a>> f6315c = new HashMap();

    /* renamed from: d */
    private C2201b f6316d;

    /* renamed from: d */
    public final /* synthetic */ void mo33104d(C10810n nVar) {
        String str;
        C5544sd sdVar = (C5544sd) nVar;
        sdVar.f6313a.addAll(this.f6313a);
        sdVar.f6314b.addAll(this.f6314b);
        for (Map.Entry next : this.f6315c.entrySet()) {
            String str2 = (String) next.getKey();
            for (C2200a aVar : (List) next.getValue()) {
                if (aVar != null) {
                    if (str2 == null) {
                        str = "";
                    } else {
                        str = str2;
                    }
                    if (!sdVar.f6315c.containsKey(str)) {
                        sdVar.f6315c.put(str, new ArrayList());
                    }
                    sdVar.f6315c.get(str).add(aVar);
                }
            }
        }
        C2201b bVar = this.f6316d;
        if (bVar != null) {
            sdVar.f6316d = bVar;
        }
    }

    /* renamed from: e */
    public final C2201b mo33520e() {
        return this.f6316d;
    }

    /* renamed from: f */
    public final List<C2200a> mo33521f() {
        return Collections.unmodifiableList(this.f6313a);
    }

    /* renamed from: g */
    public final Map<String, List<C2200a>> mo33522g() {
        return this.f6315c;
    }

    /* renamed from: h */
    public final List<C2202c> mo33523h() {
        return Collections.unmodifiableList(this.f6314b);
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        if (!this.f6313a.isEmpty()) {
            hashMap.put("products", this.f6313a);
        }
        if (!this.f6314b.isEmpty()) {
            hashMap.put("promotions", this.f6314b);
        }
        if (!this.f6315c.isEmpty()) {
            hashMap.put("impressions", this.f6315c);
        }
        hashMap.put("productAction", this.f6316d);
        return C10810n.m23055a(hashMap);
    }
}
