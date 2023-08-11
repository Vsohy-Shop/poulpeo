package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.dd */
public final class C5315dd extends C5528rc<String> {

    /* renamed from: c */
    private static final Map<String, C5491p5> f5933c;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f5934b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("charAt", new C5340f8());
        hashMap.put("concat", new C5355g8());
        hashMap.put("hasOwnProperty", C5508q7.f6257a);
        hashMap.put("indexOf", new C5371h8());
        hashMap.put("lastIndexOf", new C5386i8());
        hashMap.put("match", new C5401j8());
        hashMap.put("replace", new C5416k8());
        hashMap.put("search", new C5431l8());
        hashMap.put("slice", new C5446m8());
        hashMap.put("split", new C5461n8());
        hashMap.put("substring", new C5479o8());
        hashMap.put("toLocaleLowerCase", new C5494p8());
        hashMap.put("toLocaleUpperCase", new C5509q8());
        hashMap.put("toLowerCase", new C5524r8());
        hashMap.put("toUpperCase", new C5555t8());
        hashMap.put("toString", new C5539s8());
        hashMap.put("trim", new C5570u8());
        f5933c = Collections.unmodifiableMap(hashMap);
    }

    public C5315dd(String str) {
        C9713p.m20275j(str);
        this.f5934b = str;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo33142a() {
        return this.f5934b;
    }

    /* renamed from: e */
    public final boolean mo33144e(String str) {
        return f5933c.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5315dd) {
            return this.f5934b.equals((String) ((C5315dd) obj).mo33142a());
        }
        return false;
    }

    /* renamed from: f */
    public final C5491p5 mo33146f(String str) {
        if (mo33144e(str)) {
            return f5933c.get(str);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Native Method ");
        sb.append(str);
        sb.append(" is not defined for type ListWrapper.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: g */
    public final Iterator<C5528rc<?>> mo33147g() {
        return new C5330ed(this);
    }

    /* renamed from: j */
    public final C5528rc<?> mo33180j(int i) {
        if (i < 0 || i >= this.f5934b.length()) {
            return C5618xc.f6732h;
        }
        return new C5315dd(String.valueOf(this.f5934b.charAt(i)));
    }

    public final String toString() {
        return this.f5934b.toString();
    }
}
