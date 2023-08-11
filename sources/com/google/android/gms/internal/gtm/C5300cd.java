package com.google.android.gms.internal.gtm;

import androidx.webkit.ProxyConfig;
import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.cd */
public final class C5300cd extends C5528rc<String> {

    /* renamed from: b */
    private final String f5912b;

    /* renamed from: c */
    private final List<C5528rc<?>> f5913c;

    public C5300cd(String str, List<C5528rc<?>> list) {
        C9713p.m20276k(str, "Instruction name must be a string.");
        C9713p.m20275j(list);
        this.f5912b = str;
        this.f5913c = list;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo33142a() {
        return toString();
    }

    /* renamed from: i */
    public final String mo33163i() {
        return this.f5912b;
    }

    /* renamed from: j */
    public final List<C5528rc<?>> mo33164j() {
        return this.f5913c;
    }

    public final String toString() {
        String str = this.f5912b;
        String obj = this.f5913c.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(obj).length());
        sb.append(ProxyConfig.MATCH_ALL_SCHEMES);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        return sb.toString();
    }
}
