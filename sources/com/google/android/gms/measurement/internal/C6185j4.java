package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import com.google.android.gms.internal.measurement.C5652a4;
import com.google.android.gms.internal.measurement.C5683c1;
import com.google.android.gms.internal.measurement.C5697cf;
import com.google.android.gms.internal.measurement.C5713de;
import com.google.android.gms.internal.measurement.C5796ic;
import com.google.android.gms.internal.measurement.C5806j5;
import com.google.android.gms.internal.measurement.C5840l5;
import com.google.android.gms.internal.measurement.C5982u3;
import com.google.android.gms.internal.measurement.C6024wd;
import com.google.android.gms.internal.measurement.C6030x3;
import com.google.android.gms.internal.measurement.C6046y3;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzkh;
import java.util.ArrayList;
import java.util.Map;
import p201q5.C9263j;
import p201q5.C9267n;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.j4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C6185j4 extends C6343x8 implements C6136f {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map<String, Map<String, String>> f7891d = new ArrayMap();

    /* renamed from: e */
    final Map<String, Map<String, Boolean>> f7892e = new ArrayMap();

    /* renamed from: f */
    final Map<String, Map<String, Boolean>> f7893f = new ArrayMap();

    /* renamed from: g */
    private final Map<String, C6046y3> f7894g = new ArrayMap();

    /* renamed from: h */
    private final Map<String, Map<String, Integer>> f7895h = new ArrayMap();

    /* renamed from: i */
    final LruCache<String, C5683c1> f7896i = new C6152g4(this, 20);

    /* renamed from: j */
    final C5697cf f7897j = new C6163h4(this);

    /* renamed from: k */
    private final Map<String, String> f7898k = new ArrayMap();

    C6185j4(C6157g9 g9Var) {
        super(g9Var);
    }

    @WorkerThread
    /* renamed from: A */
    private final C6046y3 m10816A(String str, byte[] bArr) {
        Long l;
        if (bArr == null) {
            return C6046y3.m10278D();
        }
        try {
            C6046y3 y3Var = (C6046y3) ((C6030x3) C6179i9.m10729D(C6046y3.m10276B(), bArr)).mo34354l();
            C6184j3 v = this.f7899a.mo34920b().mo35079v();
            String str2 = null;
            if (y3Var.mo34631N()) {
                l = Long.valueOf(y3Var.mo34634y());
            } else {
                l = null;
            }
            if (y3Var.mo34630M()) {
                str2 = y3Var.mo34625E();
            }
            v.mo35039c("Parsed config. version, gmp_app_id", l, str2);
            return y3Var;
        } catch (zzkh e) {
            this.f7899a.mo34920b().mo35080w().mo35039c("Unable to merge remote config. appId", C6206l3.m10862z(str), e);
            return C6046y3.m10278D();
        } catch (RuntimeException e2) {
            this.f7899a.mo34920b().mo35080w().mo35039c("Unable to merge remote config. appId", C6206l3.m10862z(str), e2);
            return C6046y3.m10278D();
        }
    }

    /* renamed from: B */
    private final void m10817B(String str, C6030x3 x3Var) {
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        if (x3Var != null) {
            for (int i = 0; i < x3Var.mo34598r(); i++) {
                C5982u3 u3Var = (C5982u3) x3Var.mo34599s(i).mo34557q();
                if (TextUtils.isEmpty(u3Var.mo34465t())) {
                    this.f7899a.mo34920b().mo35080w().mo35037a("EventConfig contained null event name");
                } else {
                    String t = u3Var.mo34465t();
                    String b = C9267n.m19030b(u3Var.mo34465t());
                    if (!TextUtils.isEmpty(b)) {
                        u3Var.mo34464s(b);
                        x3Var.mo34601u(i, u3Var);
                    }
                    C5796ic.m9411b();
                    C6147g z = this.f7899a.mo35211z();
                    C6359z2<Boolean> z2Var = C6084a3.f7546E0;
                    if (!z.mo34873B((String) null, z2Var)) {
                        arrayMap.put(t, Boolean.valueOf(u3Var.mo34466u()));
                    } else if (u3Var.mo34468w() && u3Var.mo34466u()) {
                        arrayMap.put(t, Boolean.TRUE);
                    }
                    C5796ic.m9411b();
                    if (!this.f7899a.mo35211z().mo34873B((String) null, z2Var)) {
                        arrayMap2.put(u3Var.mo34465t(), Boolean.valueOf(u3Var.mo34467v()));
                    } else if (u3Var.mo34469x() && u3Var.mo34467v()) {
                        arrayMap2.put(u3Var.mo34465t(), Boolean.TRUE);
                    }
                    if (u3Var.mo34470y()) {
                        if (u3Var.mo34463r() < 2 || u3Var.mo34463r() > 65535) {
                            this.f7899a.mo34920b().mo35080w().mo35039c("Invalid sampling rate. Event name, sample rate", u3Var.mo34465t(), Integer.valueOf(u3Var.mo34463r()));
                        } else {
                            arrayMap3.put(u3Var.mo34465t(), Integer.valueOf(u3Var.mo34463r()));
                        }
                    }
                }
            }
        }
        this.f7892e.put(str, arrayMap);
        this.f7893f.put(str, arrayMap2);
        this.f7895h.put(str, arrayMap3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008d, code lost:
        if (r2 != null) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011e  */
    @androidx.annotation.WorkerThread
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m10818C(java.lang.String r13) {
        /*
            r12 = this;
            r12.mo35406i()
            r12.mo34778h()
            p231t4.C9713p.m20271f(r13)
            java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.y3> r0 = r12.f7894g
            java.lang.Object r0 = r0.get(r13)
            if (r0 != 0) goto L_0x0122
            com.google.android.gms.measurement.internal.g9 r0 = r12.f8374b
            com.google.android.gms.measurement.internal.j r0 = r0.mo34914V()
            p231t4.C9713p.m20271f(r13)
            r0.mo34778h()
            r0.mo35406i()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.mo35005R()     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String[] r4 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            r11 = 0
            r6[r11] = r13     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "apps"
            java.lang.String r5 = "app_id=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0072 }
            if (r3 != 0) goto L_0x0045
            goto L_0x008f
        L_0x0045:
            byte[] r3 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r4 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x0072 }
            boolean r5 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0072 }
            if (r5 == 0) goto L_0x0066
            com.google.android.gms.measurement.internal.p4 r5 = r0.f7899a     // Catch:{ SQLiteException -> 0x0072 }
            com.google.android.gms.measurement.internal.l3 r5 = r5.mo34920b()     // Catch:{ SQLiteException -> 0x0072 }
            com.google.android.gms.measurement.internal.j3 r5 = r5.mo35075r()     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r13)     // Catch:{ SQLiteException -> 0x0072 }
            r5.mo35038b(r6, r7)     // Catch:{ SQLiteException -> 0x0072 }
        L_0x0066:
            if (r3 != 0) goto L_0x0069
            goto L_0x008f
        L_0x0069:
            android.util.Pair r5 = new android.util.Pair     // Catch:{ SQLiteException -> 0x0072 }
            r5.<init>(r3, r4)     // Catch:{ SQLiteException -> 0x0072 }
            r2.close()
            goto L_0x0093
        L_0x0072:
            r3 = move-exception
            goto L_0x007a
        L_0x0074:
            r13 = move-exception
            goto L_0x011c
        L_0x0077:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x007a:
            com.google.android.gms.measurement.internal.p4 r0 = r0.f7899a     // Catch:{ all -> 0x011a }
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()     // Catch:{ all -> 0x011a }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35075r()     // Catch:{ all -> 0x011a }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r13)     // Catch:{ all -> 0x011a }
            r0.mo35039c(r4, r5, r3)     // Catch:{ all -> 0x011a }
            if (r2 == 0) goto L_0x0092
        L_0x008f:
            r2.close()
        L_0x0092:
            r5 = r1
        L_0x0093:
            if (r5 != 0) goto L_0x00b4
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = r12.f7891d
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r0 = r12.f7892e
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r0 = r12.f7893f
            r0.put(r13, r1)
            java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.y3> r0 = r12.f7894g
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r12.f7898k
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r0 = r12.f7895h
            r0.put(r13, r1)
            return
        L_0x00b4:
            java.lang.Object r0 = r5.first
            byte[] r0 = (byte[]) r0
            com.google.android.gms.internal.measurement.y3 r0 = r12.m10816A(r13, r0)
            com.google.android.gms.internal.measurement.s8 r0 = r0.mo34557q()
            com.google.android.gms.internal.measurement.x3 r0 = (com.google.android.gms.internal.measurement.C6030x3) r0
            r12.m10817B(r13, r0)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r2 = r12.f7891d
            com.google.android.gms.internal.measurement.v8 r3 = r0.mo34354l()
            com.google.android.gms.internal.measurement.y3 r3 = (com.google.android.gms.internal.measurement.C6046y3) r3
            java.util.Map r3 = m10820E(r3)
            r2.put(r13, r3)
            java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.y3> r2 = r12.f7894g
            com.google.android.gms.internal.measurement.v8 r3 = r0.mo34354l()
            com.google.android.gms.internal.measurement.y3 r3 = (com.google.android.gms.internal.measurement.C6046y3) r3
            r2.put(r13, r3)
            com.google.android.gms.internal.measurement.C5713de.m9057b()
            com.google.android.gms.measurement.internal.p4 r2 = r12.f7899a
            com.google.android.gms.measurement.internal.g r2 = r2.mo35211z()
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C6084a3.f7611v0
            boolean r2 = r2.mo34873B(r1, r3)
            if (r2 == 0) goto L_0x00f9
            com.google.android.gms.internal.measurement.v8 r0 = r0.mo34354l()
            com.google.android.gms.internal.measurement.y3 r0 = (com.google.android.gms.internal.measurement.C6046y3) r0
            r12.m10819D(r13, r0)
        L_0x00f9:
            com.google.android.gms.internal.measurement.C6024wd.m10227b()
            com.google.android.gms.measurement.internal.p4 r0 = r12.f7899a
            com.google.android.gms.measurement.internal.g r0 = r0.mo35211z()
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C6084a3.f7605s0
            boolean r0 = r0.mo34873B(r1, r2)
            if (r0 == 0) goto L_0x0114
            java.util.Map<java.lang.String, java.lang.String> r0 = r12.f7898k
            java.lang.Object r1 = r5.second
            java.lang.String r1 = (java.lang.String) r1
            r0.put(r13, r1)
            return
        L_0x0114:
            java.util.Map<java.lang.String, java.lang.String> r0 = r12.f7898k
            r0.put(r13, r1)
            return
        L_0x011a:
            r13 = move-exception
            r1 = r2
        L_0x011c:
            if (r1 == 0) goto L_0x0121
            r1.close()
        L_0x0121:
            throw r13
        L_0x0122:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6185j4.m10818C(java.lang.String):void");
    }

    @WorkerThread
    /* renamed from: D */
    private final void m10819D(String str, C6046y3 y3Var) {
        if (y3Var.mo34632w() != 0) {
            this.f7899a.mo34920b().mo35079v().mo35038b("EES programs found", Integer.valueOf(y3Var.mo34632w()));
            C5840l5 l5Var = y3Var.mo34627H().get(0);
            try {
                C5683c1 c1Var = new C5683c1();
                c1Var.mo33734d("internal.remoteConfig", new C6130e4(this, str));
                c1Var.mo33734d("internal.appMetadata", new C9263j(this, str));
                c1Var.mo33734d("internal.logger", new C6119d4(this));
                c1Var.mo33733c(l5Var);
                this.f7896i.put(str, c1Var);
                this.f7899a.mo34920b().mo35079v().mo35039c("EES program loaded for appId, activities", str, Integer.valueOf(l5Var.mo34162w().mo34070w()));
                for (C5806j5 x : l5Var.mo34162w().mo34071z()) {
                    this.f7899a.mo34920b().mo35079v().mo35038b("EES program activity", x.mo34121x());
                }
            } catch (zzd unused) {
                this.f7899a.mo34920b().mo35075r().mo35038b("Failed to load EES program. appId", str);
            }
        } else {
            this.f7896i.remove(str);
        }
    }

    /* renamed from: E */
    private static final Map<String, String> m10820E(C6046y3 y3Var) {
        ArrayMap arrayMap = new ArrayMap();
        if (y3Var != null) {
            for (C5652a4 next : y3Var.mo34628I()) {
                arrayMap.put(next.mo33647x(), next.mo33648y());
            }
        }
        return arrayMap;
    }

    /* renamed from: n */
    static /* bridge */ /* synthetic */ C5683c1 m10821n(C6185j4 j4Var, String str) {
        j4Var.mo35406i();
        C9713p.m20271f(str);
        C5713de.m9057b();
        if (!j4Var.f7899a.mo35211z().mo34873B((String) null, C6084a3.f7611v0) || !j4Var.mo35047u(str)) {
            return null;
        }
        if (!j4Var.f7894g.containsKey(str) || j4Var.f7894g.get(str) == null) {
            j4Var.m10818C(str);
        } else {
            j4Var.m10819D(str, j4Var.f7894g.get(str));
        }
        return j4Var.f7896i.snapshot().get(str);
    }

    @WorkerThread
    /* renamed from: e */
    public final String mo34844e(String str, String str2) {
        mo34778h();
        m10818C(str);
        Map map = this.f7891d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo34749l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: m */
    public final int mo35041m(String str, String str2) {
        Integer num;
        mo34778h();
        m10818C(str);
        Map map = this.f7895h.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: o */
    public final C6046y3 mo35042o(String str) {
        mo35406i();
        mo34778h();
        C9713p.m20271f(str);
        m10818C(str);
        return this.f7894g.get(str);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: p */
    public final String mo35043p(String str) {
        mo34778h();
        return this.f7898k.get(str);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: r */
    public final void mo35044r(String str) {
        mo34778h();
        this.f7898k.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: s */
    public final void mo35045s(String str) {
        mo34778h();
        this.f7894g.remove(str);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: t */
    public final boolean mo35046t(String str) {
        mo34778h();
        C6046y3 o = mo35042o(str);
        if (o == null) {
            return false;
        }
        return o.mo34629L();
    }

    /* renamed from: u */
    public final boolean mo35047u(String str) {
        C6046y3 y3Var;
        C5713de.m9057b();
        if (!this.f7899a.mo35211z().mo34873B((String) null, C6084a3.f7611v0) || TextUtils.isEmpty(str) || (y3Var = this.f7894g.get(str)) == null || y3Var.mo34632w() == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo35048v(String str) {
        return "1".equals(mo34844e(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: w */
    public final boolean mo35049w(String str, String str2) {
        Boolean bool;
        mo34778h();
        m10818C(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = this.f7893f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: x */
    public final boolean mo35050x(String str, String str2) {
        Boolean bool;
        mo34778h();
        m10818C(str);
        if (mo35048v(str) && C6234n9.m10921V(str2)) {
            return true;
        }
        if (mo35051y(str) && C6234n9.m10922W(str2)) {
            return true;
        }
        Map map = this.f7892e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final boolean mo35051y(String str) {
        return "1".equals(mo34844e(str, "measurement.upload.blacklist_public"));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: z */
    public final boolean mo35052z(String str, byte[] bArr, String str2) {
        mo35406i();
        mo34778h();
        C9713p.m20271f(str);
        C6030x3 x3Var = (C6030x3) m10816A(str, bArr).mo34557q();
        if (x3Var == null) {
            return false;
        }
        m10817B(str, x3Var);
        C5713de.m9057b();
        if (this.f7899a.mo35211z().mo34873B((String) null, C6084a3.f7611v0)) {
            m10819D(str, (C6046y3) x3Var.mo34354l());
        }
        this.f7894g.put(str, (C6046y3) x3Var.mo34354l());
        this.f7898k.put(str, str2);
        this.f7891d.put(str, m10820E((C6046y3) x3Var.mo34354l()));
        this.f8374b.mo34914V().mo35025o(str, new ArrayList(x3Var.mo34602v()));
        try {
            x3Var.mo34600t();
            bArr = ((C6046y3) x3Var.mo34354l()).mo34044j();
        } catch (RuntimeException e) {
            this.f7899a.mo34920b().mo35080w().mo35039c("Unable to serialize reduced-size config. Storing full config instead. appId", C6206l3.m10862z(str), e);
        }
        C6024wd.m10227b();
        if (this.f7899a.mo35211z().mo34873B((String) null, C6084a3.f7605s0)) {
            this.f8374b.mo34914V().mo35029s(str, bArr, str2);
        } else {
            this.f8374b.mo34914V().mo35029s(str, bArr, (String) null);
        }
        this.f7894g.put(str, (C6046y3) x3Var.mo34354l());
        return true;
    }
}
