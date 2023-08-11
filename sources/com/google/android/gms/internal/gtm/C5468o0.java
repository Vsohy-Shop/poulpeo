package com.google.android.gms.internal.gtm;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import p231t4.C9713p;
import p286y4.C10681o;

/* renamed from: com.google.android.gms.internal.gtm.o0 */
public final class C5468o0 {

    /* renamed from: a */
    private final C5437m f6169a;

    /* renamed from: b */
    private volatile Boolean f6170b;

    /* renamed from: c */
    private String f6171c;

    /* renamed from: d */
    private Set<Integer> f6172d;

    protected C5468o0(C5437m mVar) {
        C9713p.m20275j(mVar);
        this.f6169a = mVar;
    }

    /* renamed from: b */
    public static boolean m8256b() {
        return C5592w0.f6419b.mo33605a().booleanValue();
    }

    /* renamed from: c */
    public static int m8257c() {
        return C5592w0.f6442y.mo33605a().intValue();
    }

    /* renamed from: d */
    public static long m8258d() {
        return C5592w0.f6427j.mo33605a().longValue();
    }

    /* renamed from: e */
    public static long m8259e() {
        return C5592w0.f6430m.mo33605a().longValue();
    }

    /* renamed from: f */
    public static int m8260f() {
        return C5592w0.f6432o.mo33605a().intValue();
    }

    /* renamed from: g */
    public static int m8261g() {
        return C5592w0.f6433p.mo33605a().intValue();
    }

    /* renamed from: h */
    public static String m8262h() {
        return C5592w0.f6435r.mo33605a();
    }

    /* renamed from: i */
    public static String m8263i() {
        return C5592w0.f6434q.mo33605a();
    }

    /* renamed from: j */
    public static String m8264j() {
        return C5592w0.f6436s.mo33605a();
    }

    /* renamed from: l */
    public static long m8265l() {
        return C5592w0.f6406G.mo33605a().longValue();
    }

    /* renamed from: a */
    public final boolean mo33417a() {
        boolean z;
        if (this.f6170b == null) {
            synchronized (this) {
                if (this.f6170b == null) {
                    ApplicationInfo applicationInfo = this.f6169a.mo33328a().getApplicationInfo();
                    String a = C10681o.m22708a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        if (str == null || !str.equals(a)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        this.f6170b = Boolean.valueOf(z);
                    }
                    if ((this.f6170b == null || !this.f6170b.booleanValue()) && "com.google.android.gms.analytics".equals(a)) {
                        this.f6170b = Boolean.TRUE;
                    }
                    if (this.f6170b == null) {
                        this.f6170b = Boolean.TRUE;
                        this.f6169a.mo33330e().mo33270M0("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f6170b.booleanValue();
    }

    /* renamed from: k */
    public final Set<Integer> mo33418k() {
        String str;
        String a = C5592w0.f6401B.mo33605a();
        if (this.f6172d == null || (str = this.f6171c) == null || !str.equals(a)) {
            String[] split = TextUtils.split(a, ",");
            HashSet hashSet = new HashSet();
            for (String parseInt : split) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(parseInt)));
                } catch (NumberFormatException unused) {
                }
            }
            this.f6171c = a;
            this.f6172d = hashSet;
        }
        return this.f6172d;
    }
}
