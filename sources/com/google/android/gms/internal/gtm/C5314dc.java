package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.dc */
public final class C5314dc {

    /* renamed from: a */
    private final List<C5375hc> f5929a = new ArrayList();

    /* renamed from: b */
    private final Map<String, C5329ec> f5930b = new HashMap();

    /* renamed from: c */
    private String f5931c = "";

    /* renamed from: d */
    private int f5932d = 0;

    /* renamed from: a */
    public final C5314dc mo33175a(C5375hc hcVar) {
        this.f5929a.add(hcVar);
        return this;
    }

    /* renamed from: b */
    public final C5314dc mo33176b(C5329ec ecVar) {
        this.f5930b.put(ecVar.mo33194a().get("instance_name").toString(), ecVar);
        return this;
    }

    /* renamed from: c */
    public final C5314dc mo33177c(String str) {
        this.f5931c = str;
        return this;
    }

    /* renamed from: d */
    public final C5299cc mo33178d() {
        return new C5299cc(this.f5929a, this.f5930b, this.f5931c, 0);
    }
}
