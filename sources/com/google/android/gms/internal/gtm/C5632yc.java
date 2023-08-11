package com.google.android.gms.internal.gtm;

import com.adjust.sdk.Constants;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.yc */
public final class C5632yc extends C5528rc<List<C5528rc<?>>> {

    /* renamed from: c */
    private static final Map<String, C5491p5> f6741c;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ArrayList<C5528rc<?>> f6742b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("concat", new C5536s5());
        hashMap.put("every", new C5552t5());
        hashMap.put("filter", new C5567u5());
        hashMap.put("forEach", new C5582v5());
        hashMap.put("indexOf", new C5597w5());
        hashMap.put("hasOwnProperty", C5508q7.f6257a);
        hashMap.put("join", new C5611x5());
        hashMap.put("lastIndexOf", new C5625y5());
        hashMap.put("map", new C5639z5());
        hashMap.put("pop", new C5263a6());
        hashMap.put(Constants.PUSH, new C5278b6());
        hashMap.put("reduce", new C5293c6());
        hashMap.put("reduceRight", new C5308d6());
        hashMap.put("reverse", new C5323e6());
        hashMap.put("shift", new C5338f6());
        hashMap.put("slice", new C5353g6());
        hashMap.put("some", new C5369h6());
        hashMap.put(APIParams.SORT, new C5384i6());
        hashMap.put("splice", new C5444m6());
        hashMap.put("toString", new C5539s8());
        hashMap.put("unshift", new C5459n6());
        f6741c = Collections.unmodifiableMap(hashMap);
    }

    public C5632yc(List<C5528rc<?>> list) {
        C9713p.m20275j(list);
        this.f6742b = new ArrayList<>(list);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo33142a() {
        return this.f6742b;
    }

    /* renamed from: e */
    public final boolean mo33144e(String str) {
        return f6741c.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5632yc) {
            List list = (List) ((C5632yc) obj).mo33142a();
            if (this.f6742b.size() == list.size()) {
                boolean z = true;
                for (int i = 0; i < this.f6742b.size(); i++) {
                    if (this.f6742b.get(i) != null) {
                        z = this.f6742b.get(i).equals(list.get(i));
                    } else if (list.get(i) == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        break;
                    }
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final C5491p5 mo33146f(String str) {
        if (mo33144e(str)) {
            return f6741c.get(str);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Native Method ");
        sb.append(str);
        sb.append(" is not defined for type ListWrapper.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: g */
    public final Iterator<C5528rc<?>> mo33147g() {
        return new C5270ad(this, new C5646zc(this), super.mo33501h());
    }

    /* renamed from: i */
    public final void mo33625i(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20267b(z, "Invalid array length");
        if (this.f6742b.size() != i) {
            if (this.f6742b.size() < i) {
                this.f6742b.ensureCapacity(i);
                for (int size = this.f6742b.size(); size < i; size++) {
                    this.f6742b.add((Object) null);
                }
                return;
            }
            ArrayList<C5528rc<?>> arrayList = this.f6742b;
            arrayList.subList(i, arrayList.size()).clear();
        }
    }

    /* renamed from: k */
    public final void mo33626k(int i, C5528rc<?> rcVar) {
        if (i >= 0) {
            if (i >= this.f6742b.size()) {
                mo33625i(i + 1);
            }
            this.f6742b.set(i, rcVar);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: l */
    public final C5528rc<?> mo33627l(int i) {
        if (i < 0 || i >= this.f6742b.size()) {
            return C5618xc.f6732h;
        }
        C5528rc<?> rcVar = this.f6742b.get(i);
        if (rcVar == null) {
            return C5618xc.f6732h;
        }
        return rcVar;
    }

    /* renamed from: m */
    public final boolean mo33628m(int i) {
        if (i < 0 || i >= this.f6742b.size() || this.f6742b.get(i) == null) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.f6742b.toString();
    }
}
