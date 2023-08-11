package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.b1 */
public final class C5273b1 {

    /* renamed from: a */
    private final Map<String, String> f5842a;

    /* renamed from: b */
    private final List<C5378i0> f5843b;

    /* renamed from: c */
    private final long f5844c;

    /* renamed from: d */
    private final long f5845d;

    /* renamed from: e */
    private final int f5846e;

    /* renamed from: f */
    private final boolean f5847f;

    /* renamed from: g */
    private final String f5848g;

    public C5273b1(C5392j jVar, Map<String, String> map, long j, boolean z) {
        this(jVar, map, j, z, 0, 0, (List<C5378i0>) null);
    }

    /* renamed from: a */
    private static String m7761a(C5392j jVar, Object obj) {
        if (obj == null) {
            return null;
        }
        String obj2 = obj.toString();
        if (obj2.startsWith("&")) {
            obj2 = obj2.substring(1);
        }
        int length = obj2.length();
        if (length > 256) {
            obj2 = obj2.substring(0, 256);
            jVar.mo33277c0("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
        }
        if (TextUtils.isEmpty(obj2)) {
            return null;
        }
        return obj2;
    }

    /* renamed from: b */
    private static String m7762b(C5392j jVar, Object obj) {
        String str;
        if (obj == null) {
            str = "";
        } else {
            str = obj.toString();
        }
        int length = str.length();
        if (length <= 8192) {
            return str;
        }
        String substring = str.substring(0, 8192);
        jVar.mo33277c0("Hit param value is too long and will be trimmed", Integer.valueOf(length), substring);
        return substring;
    }

    /* renamed from: c */
    private static boolean m7763c(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.toString().startsWith("&");
    }

    /* renamed from: d */
    private final String m7764d(String str, String str2) {
        C9713p.m20271f(str);
        C9713p.m20267b(!str.startsWith("&"), "Short param name required");
        String str3 = this.f5842a.get(str);
        if (str3 != null) {
            return str3;
        }
        return str2;
    }

    /* renamed from: e */
    public final Map<String, String> mo33109e() {
        return this.f5842a;
    }

    /* renamed from: f */
    public final int mo33110f() {
        return this.f5846e;
    }

    /* renamed from: g */
    public final long mo33111g() {
        return this.f5844c;
    }

    /* renamed from: h */
    public final long mo33112h() {
        return this.f5845d;
    }

    /* renamed from: i */
    public final List<C5378i0> mo33113i() {
        return this.f5843b;
    }

    /* renamed from: j */
    public final boolean mo33114j() {
        return this.f5847f;
    }

    /* renamed from: k */
    public final long mo33115k() {
        return C5502q1.m8400g(m7764d("_s", "0"));
    }

    /* renamed from: l */
    public final String mo33116l() {
        return m7764d("_m", "");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ht=");
        sb.append(this.f5845d);
        if (this.f5844c != 0) {
            sb.append(", dbId=");
            sb.append(this.f5844c);
        }
        if (this.f5846e != 0) {
            sb.append(", appUID=");
            sb.append(this.f5846e);
        }
        ArrayList arrayList = new ArrayList(this.f5842a.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            sb.append(", ");
            sb.append(str);
            sb.append("=");
            sb.append(this.f5842a.get(str));
        }
        return sb.toString();
    }

    public C5273b1(C5392j jVar, Map<String, String> map, long j, boolean z, long j2, int i) {
        this(jVar, map, j, z, j2, i, (List<C5378i0>) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5273b1(com.google.android.gms.internal.gtm.C5392j r1, java.util.Map<java.lang.String, java.lang.String> r2, long r3, boolean r5, long r6, int r8, java.util.List<com.google.android.gms.internal.gtm.C5378i0> r9) {
        /*
            r0 = this;
            r0.<init>()
            p231t4.C9713p.m20275j(r1)
            p231t4.C9713p.m20275j(r2)
            r0.f5845d = r3
            r0.f5847f = r5
            r0.f5844c = r6
            r0.f5846e = r8
            if (r9 == 0) goto L_0x0015
            r3 = r9
            goto L_0x0019
        L_0x0015:
            java.util.List r3 = java.util.Collections.emptyList()
        L_0x0019:
            r0.f5843b = r3
            r3 = 0
            if (r9 == 0) goto L_0x003f
            java.util.Iterator r4 = r9.iterator()
        L_0x0022:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x003f
            java.lang.Object r5 = r4.next()
            com.google.android.gms.internal.gtm.i0 r5 = (com.google.android.gms.internal.gtm.C5378i0) r5
            java.lang.String r6 = r5.mo33246a()
            java.lang.String r7 = "appendVersion"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0022
            java.lang.String r4 = r5.mo33247b()
            goto L_0x0040
        L_0x003f:
            r4 = r3
        L_0x0040:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r3 = r4
        L_0x0048:
            r0.f5848g = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Set r4 = r2.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0057:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0083
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            boolean r6 = m7763c(r6)
            if (r6 == 0) goto L_0x0057
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = m7761a(r1, r6)
            if (r6 == 0) goto L_0x0057
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = m7762b(r1, r5)
            r3.put(r6, r5)
            goto L_0x0057
        L_0x0083:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x008b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00b7
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            boolean r5 = m7763c(r5)
            if (r5 != 0) goto L_0x008b
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = m7761a(r1, r5)
            if (r5 == 0) goto L_0x008b
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = m7762b(r1, r4)
            r3.put(r5, r4)
            goto L_0x008b
        L_0x00b7:
            java.lang.String r1 = r0.f5848g
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00df
            java.lang.String r1 = "_v"
            java.lang.String r2 = r0.f5848g
            com.google.android.gms.internal.gtm.C5502q1.m8403j(r3, r1, r2)
            java.lang.String r1 = r0.f5848g
            java.lang.String r2 = "ma4.0.0"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00da
            java.lang.String r1 = r0.f5848g
            java.lang.String r2 = "ma4.0.1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00df
        L_0x00da:
            java.lang.String r1 = "adid"
            r3.remove(r1)
        L_0x00df:
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r3)
            r0.f5842a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C5273b1.<init>(com.google.android.gms.internal.gtm.j, java.util.Map, long, boolean, long, int, java.util.List):void");
    }
}
