package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.ComposerKt;
import com.google.android.gms.internal.measurement.C5704d5;
import com.google.android.gms.internal.measurement.C5713de;
import com.google.android.gms.internal.measurement.C5721e5;
import com.google.android.gms.internal.measurement.C5805j4;
import com.google.android.gms.internal.measurement.C5822k4;
import com.google.android.gms.internal.measurement.C5831kd;
import com.google.android.gms.internal.measurement.C5865me;
import com.google.android.gms.internal.measurement.C5871n4;
import com.google.android.gms.internal.measurement.C5884o1;
import com.google.android.gms.internal.measurement.C5887o4;
import com.google.android.gms.internal.measurement.C5910pb;
import com.google.android.gms.internal.measurement.C5967t4;
import com.google.android.gms.internal.measurement.C6046y3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p023a5.C2207e;
import p201q5.C9254a;
import p231t4.C9713p;
import p286y4.C10671e;

/* renamed from: com.google.android.gms.measurement.internal.g9 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C6157g9 implements C6208l5 {

    /* renamed from: C */
    private static volatile C6157g9 f7802C;

    /* renamed from: A */
    private final Map<String, C9254a> f7803A;

    /* renamed from: B */
    private final C6223m9 f7804B = new C6135e9(this);

    /* renamed from: a */
    private final C6185j4 f7805a;

    /* renamed from: b */
    private final C6261q3 f7806b;

    /* renamed from: c */
    private C6180j f7807c;

    /* renamed from: d */
    private C6283s3 f7808d;

    /* renamed from: e */
    private C6321v8 f7809e;

    /* renamed from: f */
    private C6091aa f7810f;

    /* renamed from: g */
    private final C6179i9 f7811g;

    /* renamed from: h */
    private C6308u6 f7812h;

    /* renamed from: i */
    private C6134e8 f7813i;

    /* renamed from: j */
    private final C6354y8 f7814j;

    /* renamed from: k */
    private C6108c4 f7815k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C6251p4 f7816l;

    /* renamed from: m */
    private boolean f7817m = false;

    /* renamed from: n */
    private boolean f7818n;

    /* renamed from: o */
    long f7819o;

    /* renamed from: p */
    private List<Runnable> f7820p;

    /* renamed from: q */
    private int f7821q;

    /* renamed from: r */
    private int f7822r;

    /* renamed from: s */
    private boolean f7823s;

    /* renamed from: t */
    private boolean f7824t;

    /* renamed from: u */
    private boolean f7825u;

    /* renamed from: v */
    private FileLock f7826v;

    /* renamed from: w */
    private FileChannel f7827w;

    /* renamed from: x */
    private List<Long> f7828x;

    /* renamed from: y */
    private List<Long> f7829y;

    /* renamed from: z */
    private long f7830z;

    C6157g9(C6168h9 h9Var, C6251p4 p4Var) {
        C9713p.m20275j(h9Var);
        this.f7816l = C6251p4.m10988H(h9Var.f7852a, (C5884o1) null, (Long) null);
        this.f7830z = -1;
        this.f7814j = new C6354y8(this);
        C6179i9 i9Var = new C6179i9(this);
        i9Var.mo35407j();
        this.f7811g = i9Var;
        C6261q3 q3Var = new C6261q3(this);
        q3Var.mo35407j();
        this.f7806b = q3Var;
        C6185j4 j4Var = new C6185j4(this);
        j4Var.mo35407j();
        this.f7805a = j4Var;
        this.f7803A = new HashMap();
        mo34919a().mo35110z(new C6365z8(this, h9Var));
    }

    /* renamed from: D */
    static final void m10622D(C5805j4 j4Var, int i, String str) {
        List<C5887o4> I = j4Var.mo34110I();
        int i2 = 0;
        while (i2 < I.size()) {
            if (!"_err".equals(I.get(i2).mo34240D())) {
                i2++;
            } else {
                return;
            }
        }
        C5871n4 B = C5887o4.m9708B();
        B.mo34206B("_err");
        B.mo34216z(Long.valueOf((long) i).longValue());
        C5871n4 B2 = C5887o4.m9708B();
        B2.mo34206B("_ev");
        B2.mo34207C(str);
        j4Var.mo34117w((C5887o4) B.mo34354l());
        j4Var.mo34117w((C5887o4) B2.mo34354l());
    }

    /* renamed from: E */
    static final void m10623E(C5805j4 j4Var, @NonNull String str) {
        List<C5887o4> I = j4Var.mo34110I();
        for (int i = 0; i < I.size(); i++) {
            if (str.equals(I.get(i).mo34240D())) {
                j4Var.mo34119y(i);
                return;
            }
        }
    }

    @WorkerThread
    /* renamed from: G */
    private final C6289s9 m10624G(String str) {
        String str2;
        String str3 = str;
        C6180j jVar = this.f7807c;
        m10634Q(jVar);
        C6306u4 T = jVar.mo35007T(str3);
        if (T == null || TextUtils.isEmpty(T.mo35355h0())) {
            mo34920b().mo35074q().mo35038b("No app data available; dropping", str3);
            return null;
        }
        Boolean H = m10625H(T);
        if (H == null || H.booleanValue()) {
            String k0 = T.mo35361k0();
            String h0 = T.mo35355h0();
            long M = T.mo35326M();
            String g0 = T.mo35353g0();
            long X = T.mo35337X();
            long U = T.mo35334U();
            boolean K = T.mo35324K();
            String i0 = T.mo35357i0();
            long A = T.mo35314A();
            boolean J = T.mo35323J();
            String c0 = T.mo35345c0();
            Boolean b0 = T.mo35343b0();
            long V = T.mo35335V();
            List<String> c = T.mo35344c();
            C5831kd.m9523b();
            if (mo34912T().mo34873B(str3, C6084a3.f7577e0)) {
                str2 = T.mo35359j0();
            } else {
                str2 = null;
            }
            return new C6289s9(str, k0, h0, M, g0, X, U, (String) null, K, false, i0, A, 0, 0, J, false, c0, b0, V, c, str2, mo34913U(str).mo43552i());
        }
        mo34920b().mo35075r().mo35038b("App version does not match; dropping. appId", C6206l3.m10862z(str));
        return null;
    }

    @WorkerThread
    /* renamed from: H */
    private final Boolean m10625H(C6306u4 u4Var) {
        try {
            if (u4Var.mo35326M() != -2147483648L) {
                if (u4Var.mo35326M() == ((long) C2207e.m1805a(this.f7816l.mo34927f()).mo23530e(u4Var.mo35349e0(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = C2207e.m1805a(this.f7816l.mo34927f()).mo23530e(u4Var.mo35349e0(), 0).versionName;
                String h0 = u4Var.mo35355h0();
                if (h0 != null && h0.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @WorkerThread
    /* renamed from: I */
    private final void m10626I() {
        mo34919a().mo34778h();
        if (this.f7823s || this.f7824t || this.f7825u) {
            mo34920b().mo35079v().mo35040d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f7823s), Boolean.valueOf(this.f7824t), Boolean.valueOf(this.f7825u));
            return;
        }
        mo34920b().mo35079v().mo35037a("Stopping uploading service(s)");
        List<Runnable> list = this.f7820p;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            ((List) C9713p.m20275j(this.f7820p)).clear();
        }
    }

    /* renamed from: J */
    private final void m10627J(C5967t4 t4Var, long j, boolean z) {
        String str;
        C6212l9 l9Var;
        String str2;
        C5967t4 t4Var2 = t4Var;
        boolean z2 = z;
        if (true != z2) {
            str = "_lte";
        } else {
            str = "_se";
        }
        C6180j jVar = this.f7807c;
        m10634Q(jVar);
        C6212l9 Z = jVar.mo35012Z(t4Var.mo34414j0(), str);
        if (Z == null || Z.f7964e == null) {
            l9Var = new C6212l9(t4Var.mo34414j0(), "auto", str, mo34922c().mo33547a(), Long.valueOf(j));
        } else {
            l9Var = new C6212l9(t4Var.mo34414j0(), "auto", str, mo34922c().mo33547a(), Long.valueOf(((Long) Z.f7964e).longValue() + j));
        }
        C5704d5 z3 = C5721e5.m9094z();
        z3.mo33830w(str);
        z3.mo33831x(mo34922c().mo33547a());
        z3.mo33829v(((Long) l9Var.f7964e).longValue());
        C5721e5 e5Var = (C5721e5) z3.mo34354l();
        int x = C6179i9.m10745x(t4Var2, str);
        if (x >= 0) {
            t4Var2.mo34411g0(x, e5Var);
        } else {
            t4Var2.mo34437y0(e5Var);
        }
        if (j > 0) {
            C6180j jVar2 = this.f7807c;
            m10634Q(jVar2);
            jVar2.mo35036z(l9Var);
            if (true != z2) {
                str2 = "lifetime";
            } else {
                str2 = "session-scoped";
            }
            mo34920b().mo35079v().mo35039c("Updated engagement user property. scope, value", str2, l9Var.f7964e);
        }
    }

    /* renamed from: K */
    private final void m10628K(C5805j4 j4Var, C5805j4 j4Var2) {
        C9713p.m20266a("_e".equals(j4Var.mo34109H()));
        m10634Q(this.f7811g);
        C5887o4 o = C6179i9.m10736o((C5822k4) j4Var.mo34354l(), "_et");
        if (o != null && o.mo34245U() && o.mo34251z() > 0) {
            long z = o.mo34251z();
            m10634Q(this.f7811g);
            C5887o4 o2 = C6179i9.m10736o((C5822k4) j4Var2.mo34354l(), "_et");
            if (o2 != null && o2.mo34251z() > 0) {
                z += o2.mo34251z();
            }
            m10634Q(this.f7811g);
            C6179i9.m10734m(j4Var2, "_et", Long.valueOf(z));
            m10634Q(this.f7811g);
            C6179i9.m10734m(j4Var, "_fr", 1L);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0237  */
    @androidx.annotation.WorkerThread
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m10629L() {
        /*
            r20 = this;
            r0 = r20
            com.google.android.gms.measurement.internal.n4 r1 = r20.mo34919a()
            r1.mo34778h()
            r20.mo34929g()
            long r1 = r0.f7819o
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004e
            y4.e r1 = r20.mo34922c()
            long r1 = r1.mo33548b()
            long r5 = r0.f7819o
            long r1 = r1 - r5
            long r1 = java.lang.Math.abs(r1)
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004c
            com.google.android.gms.measurement.internal.l3 r1 = r20.mo34920b()
            com.google.android.gms.measurement.internal.j3 r1 = r1.mo35079v()
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r1.mo35038b(r2, r3)
            com.google.android.gms.measurement.internal.s3 r1 = r20.mo34917Y()
            r1.mo35290c()
            com.google.android.gms.measurement.internal.v8 r1 = r0.f7809e
            m10634Q(r1)
            r1.mo35389m()
            return
        L_0x004c:
            r0.f7819o = r3
        L_0x004e:
            com.google.android.gms.measurement.internal.p4 r1 = r0.f7816l
            boolean r1 = r1.mo35207r()
            if (r1 == 0) goto L_0x0254
            boolean r1 = r20.m10632O()
            if (r1 != 0) goto L_0x005e
            goto L_0x0254
        L_0x005e:
            y4.e r1 = r20.mo34922c()
            long r1 = r1.mo33547a()
            r20.mo34912T()
            com.google.android.gms.measurement.internal.z2<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C6084a3.f7539B
            r6 = 0
            java.lang.Object r5 = r5.mo35421a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.j r5 = r0.f7807c
            m10634Q(r5)
            boolean r5 = r5.mo35032v()
            r10 = 1
            if (r5 != 0) goto L_0x0093
            com.google.android.gms.measurement.internal.j r5 = r0.f7807c
            m10634Q(r5)
            boolean r5 = r5.mo35031u()
            if (r5 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r10 = 0
        L_0x0093:
            if (r10 == 0) goto L_0x00d3
            com.google.android.gms.measurement.internal.g r5 = r20.mo34912T()
            java.lang.String r5 = r5.mo34890u()
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 != 0) goto L_0x00bf
            java.lang.String r11 = ".none."
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L_0x00bf
            r20.mo34912T()
            com.google.android.gms.measurement.internal.z2<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C6084a3.f7612w
            java.lang.Object r5 = r5.mo35421a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00e6
        L_0x00bf:
            r20.mo34912T()
            com.google.android.gms.measurement.internal.z2<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C6084a3.f7610v
            java.lang.Object r5 = r5.mo35421a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00e6
        L_0x00d3:
            r20.mo34912T()
            com.google.android.gms.measurement.internal.z2<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C6084a3.f7608u
            java.lang.Object r5 = r5.mo35421a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
        L_0x00e6:
            com.google.android.gms.measurement.internal.e8 r5 = r0.f7813i
            com.google.android.gms.measurement.internal.v3 r5 = r5.f7754i
            long r13 = r5.mo35384a()
            com.google.android.gms.measurement.internal.e8 r5 = r0.f7813i
            com.google.android.gms.measurement.internal.v3 r5 = r5.f7755j
            long r15 = r5.mo35384a()
            com.google.android.gms.measurement.internal.j r5 = r0.f7807c
            m10634Q(r5)
            r17 = r10
            long r9 = r5.mo35002O()
            com.google.android.gms.measurement.internal.j r5 = r0.f7807c
            m10634Q(r5)
            r18 = r7
            long r6 = r5.mo35003P()
            long r5 = java.lang.Math.max(r9, r6)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0117
        L_0x0114:
            r7 = r3
            goto L_0x018e
        L_0x0117:
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r13 = r13 - r1
            long r7 = java.lang.Math.abs(r13)
            long r15 = r15 - r1
            long r9 = java.lang.Math.abs(r15)
            long r9 = r1 - r9
            long r1 = r1 - r7
            long r1 = java.lang.Math.max(r1, r9)
            long r7 = r5 + r18
            if (r17 == 0) goto L_0x013c
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x013c
            long r7 = java.lang.Math.min(r5, r1)
            long r7 = r7 + r11
        L_0x013c:
            com.google.android.gms.measurement.internal.i9 r13 = r0.f7811g
            m10634Q(r13)
            boolean r13 = r13.mo34995O(r1, r11)
            if (r13 != 0) goto L_0x0149
            long r7 = r1 + r11
        L_0x0149:
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x018e
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x018e
            r1 = 0
        L_0x0152:
            r20.mo34912T()
            com.google.android.gms.measurement.internal.z2<java.lang.Integer> r2 = com.google.android.gms.measurement.internal.C6084a3.f7543D
            r5 = 0
            java.lang.Object r2 = r2.mo35421a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r6 = 0
            int r2 = java.lang.Math.max(r6, r2)
            r11 = 20
            int r2 = java.lang.Math.min(r11, r2)
            if (r1 >= r2) goto L_0x0114
            r20.mo34912T()
            com.google.android.gms.measurement.internal.z2<java.lang.Long> r2 = com.google.android.gms.measurement.internal.C6084a3.f7541C
            java.lang.Object r2 = r2.mo35421a(r5)
            java.lang.Long r2 = (java.lang.Long) r2
            long r11 = r2.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            r13 = 1
            long r13 = r13 << r1
            long r11 = r11 * r13
            long r7 = r7 + r11
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x018e
            int r1 = r1 + 1
            goto L_0x0152
        L_0x018e:
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0237
            com.google.android.gms.measurement.internal.q3 r1 = r0.f7806b
            m10634Q(r1)
            boolean r1 = r1.mo35219m()
            if (r1 == 0) goto L_0x021a
            com.google.android.gms.measurement.internal.e8 r1 = r0.f7813i
            com.google.android.gms.measurement.internal.v3 r1 = r1.f7753h
            long r1 = r1.mo35384a()
            r20.mo34912T()
            com.google.android.gms.measurement.internal.z2<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C6084a3.f7604s
            r6 = 0
            java.lang.Object r5 = r5.mo35421a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.i9 r9 = r0.f7811g
            m10634Q(r9)
            boolean r9 = r9.mo34995O(r1, r5)
            if (r9 != 0) goto L_0x01c9
            long r1 = r1 + r5
            long r7 = java.lang.Math.max(r7, r1)
        L_0x01c9:
            com.google.android.gms.measurement.internal.s3 r1 = r20.mo34917Y()
            r1.mo35290c()
            y4.e r1 = r20.mo34922c()
            long r1 = r1.mo33547a()
            long r7 = r7 - r1
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0200
            r20.mo34912T()
            com.google.android.gms.measurement.internal.z2<java.lang.Long> r1 = com.google.android.gms.measurement.internal.C6084a3.f7614x
            r2 = 0
            java.lang.Object r1 = r1.mo35421a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r7 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.e8 r1 = r0.f7813i
            com.google.android.gms.measurement.internal.v3 r1 = r1.f7754i
            y4.e r2 = r20.mo34922c()
            long r2 = r2.mo33547a()
            r1.mo35385b(r2)
        L_0x0200:
            com.google.android.gms.measurement.internal.l3 r1 = r20.mo34920b()
            com.google.android.gms.measurement.internal.j3 r1 = r1.mo35079v()
            java.lang.String r2 = "Upload scheduled in approximately ms"
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r1.mo35038b(r2, r3)
            com.google.android.gms.measurement.internal.v8 r1 = r0.f7809e
            m10634Q(r1)
            r1.mo35390n(r7)
            return
        L_0x021a:
            com.google.android.gms.measurement.internal.l3 r1 = r20.mo34920b()
            com.google.android.gms.measurement.internal.j3 r1 = r1.mo35079v()
            java.lang.String r2 = "No network"
            r1.mo35037a(r2)
            com.google.android.gms.measurement.internal.s3 r1 = r20.mo34917Y()
            r1.mo35289b()
            com.google.android.gms.measurement.internal.v8 r1 = r0.f7809e
            m10634Q(r1)
            r1.mo35389m()
            return
        L_0x0237:
            com.google.android.gms.measurement.internal.l3 r1 = r20.mo34920b()
            com.google.android.gms.measurement.internal.j3 r1 = r1.mo35079v()
            java.lang.String r2 = "Next upload time is 0"
            r1.mo35037a(r2)
            com.google.android.gms.measurement.internal.s3 r1 = r20.mo34917Y()
            r1.mo35290c()
            com.google.android.gms.measurement.internal.v8 r1 = r0.f7809e
            m10634Q(r1)
            r1.mo35389m()
            return
        L_0x0254:
            com.google.android.gms.measurement.internal.l3 r1 = r20.mo34920b()
            com.google.android.gms.measurement.internal.j3 r1 = r1.mo35079v()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo35037a(r2)
            com.google.android.gms.measurement.internal.s3 r1 = r20.mo34917Y()
            r1.mo35290c()
            com.google.android.gms.measurement.internal.v8 r1 = r0.f7809e
            m10634Q(r1)
            r1.mo35389m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6157g9.m10629L():void");
    }

    /* renamed from: M */
    private final boolean m10630M(C6289s9 s9Var) {
        C5831kd.m9523b();
        if (mo34912T().mo34873B(s9Var.f8207b, C6084a3.f7577e0)) {
            if (!TextUtils.isEmpty(s9Var.f8208c) || !TextUtils.isEmpty(s9Var.f8227v) || !TextUtils.isEmpty(s9Var.f8223r)) {
                return true;
            }
            return false;
        } else if (!TextUtils.isEmpty(s9Var.f8208c) || !TextUtils.isEmpty(s9Var.f8223r)) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0ce3, code lost:
        if (r10 > (com.google.android.gms.measurement.internal.C6147g.m10589i() + r8)) goto L_0x0ce5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03c7 A[Catch:{ NumberFormatException -> 0x094d, all -> 0x0e1c }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x048b A[Catch:{ NumberFormatException -> 0x094d, all -> 0x0e1c }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x04ea A[Catch:{ NumberFormatException -> 0x094d, all -> 0x0e1c }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x063f A[Catch:{ NumberFormatException -> 0x094d, all -> 0x0e1c }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0657 A[Catch:{ NumberFormatException -> 0x094d, all -> 0x0e1c }] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0986 A[Catch:{ NumberFormatException -> 0x094d, all -> 0x0e1c }] */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x09cf A[Catch:{ NumberFormatException -> 0x094d, all -> 0x0e1c }] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x09f2 A[Catch:{ NumberFormatException -> 0x094d, all -> 0x0e1c }] */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0a69 A[Catch:{ NumberFormatException -> 0x094d, all -> 0x0e1c }] */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0a6b A[Catch:{ NumberFormatException -> 0x094d, all -> 0x0e1c }] */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0a73 A[Catch:{ NumberFormatException -> 0x094d, all -> 0x0e1c }] */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0a9f A[Catch:{ NumberFormatException -> 0x094d, all -> 0x0e1c }] */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0cd3 A[Catch:{ NumberFormatException -> 0x094d, all -> 0x0e1c }] */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0d5a A[Catch:{ NumberFormatException -> 0x094d, all -> 0x0e1c }] */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x0d76 A[Catch:{ SQLiteException -> 0x0d8e }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:69:0x01fa=Splitter:B:69:0x01fa, B:456:0x0e0a=Splitter:B:456:0x0e0a} */
    @androidx.annotation.WorkerThread
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m10631N(java.lang.String r48, long r49) {
        /*
            r47 = this;
            r1 = r47
            java.lang.String r2 = "_sn"
            java.lang.String r3 = "_npa"
            java.lang.String r4 = "_ai"
            com.google.android.gms.measurement.internal.j r5 = r1.f7807c
            m10634Q(r5)
            r5.mo35019g0()
            com.google.android.gms.measurement.internal.f9 r5 = new com.google.android.gms.measurement.internal.f9     // Catch:{ all -> 0x0e1c }
            r13 = 0
            r5.<init>(r1, r13)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j r6 = r1.f7807c     // Catch:{ all -> 0x0e1c }
            m10634Q(r6)     // Catch:{ all -> 0x0e1c }
            r7 = 0
            long r10 = r1.f7830z     // Catch:{ all -> 0x0e1c }
            r8 = r49
            r12 = r5
            r6.mo34999I(r7, r8, r10, r12)     // Catch:{ all -> 0x0e1c }
            java.util.List<com.google.android.gms.internal.measurement.k4> r6 = r5.f7779c     // Catch:{ all -> 0x0e1c }
            if (r6 == 0) goto L_0x0e0a
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0e1c }
            if (r6 == 0) goto L_0x0030
            goto L_0x0e0a
        L_0x0030:
            com.google.android.gms.internal.measurement.u4 r6 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.s8 r6 = r6.mo34557q()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.t4 r6 = (com.google.android.gms.internal.measurement.C5967t4) r6     // Catch:{ all -> 0x0e1c }
            r6.mo34376C0()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.g r8 = r47.mo34912T()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.u4 r9 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r9 = r9.mo34495N1()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.C6084a3.f7563V     // Catch:{ all -> 0x0e1c }
            boolean r8 = r8.mo34873B(r9, r10)     // Catch:{ all -> 0x0e1c }
            r17 = r13
            r18 = r17
            r7 = -1
            r12 = 0
            r13 = -1
            r14 = 0
            r16 = 0
            r19 = 0
        L_0x0058:
            java.util.List<com.google.android.gms.internal.measurement.k4> r9 = r5.f7779c     // Catch:{ all -> 0x0e1c }
            int r9 = r9.size()     // Catch:{ all -> 0x0e1c }
            java.lang.String r10 = "_fr"
            java.lang.String r11 = "_et"
            r23 = r3
            java.lang.String r3 = "_e"
            r24 = r14
            if (r12 >= r9) goto L_0x06a9
            java.util.List<com.google.android.gms.internal.measurement.k4> r9 = r5.f7779c     // Catch:{ all -> 0x0e1c }
            java.lang.Object r9 = r9.get(r12)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.k4 r9 = (com.google.android.gms.internal.measurement.C5822k4) r9     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.s8 r9 = r9.mo34557q()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.j4 r9 = (com.google.android.gms.internal.measurement.C5805j4) r9     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j4 r15 = r1.f7805a     // Catch:{ all -> 0x0e1c }
            m10634Q(r15)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.u4 r14 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r14 = r14.mo34495N1()     // Catch:{ all -> 0x0e1c }
            r28 = r12
            java.lang.String r12 = r9.mo34109H()     // Catch:{ all -> 0x0e1c }
            boolean r12 = r15.mo35050x(r14, r12)     // Catch:{ all -> 0x0e1c }
            java.lang.String r14 = "_err"
            if (r12 == 0) goto L_0x010b
            com.google.android.gms.measurement.internal.l3 r3 = r47.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r3 = r3.mo35080w()     // Catch:{ all -> 0x0e1c }
            java.lang.String r10 = "Dropping blocked raw event. appId"
            com.google.android.gms.internal.measurement.u4 r11 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r11 = r11.mo34495N1()     // Catch:{ all -> 0x0e1c }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r11)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.p4 r12 = r1.f7816l     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.g3 r12 = r12.mo35182D()     // Catch:{ all -> 0x0e1c }
            java.lang.String r15 = r9.mo34109H()     // Catch:{ all -> 0x0e1c }
            java.lang.String r12 = r12.mo34899d(r15)     // Catch:{ all -> 0x0e1c }
            r3.mo35039c(r10, r11, r12)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j4 r3 = r1.f7805a     // Catch:{ all -> 0x0e1c }
            m10634Q(r3)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.u4 r10 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r10 = r10.mo34495N1()     // Catch:{ all -> 0x0e1c }
            boolean r3 = r3.mo35048v(r10)     // Catch:{ all -> 0x0e1c }
            if (r3 != 0) goto L_0x00fe
            com.google.android.gms.measurement.internal.j4 r3 = r1.f7805a     // Catch:{ all -> 0x0e1c }
            m10634Q(r3)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.u4 r10 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r10 = r10.mo34495N1()     // Catch:{ all -> 0x0e1c }
            boolean r3 = r3.mo35051y(r10)     // Catch:{ all -> 0x0e1c }
            if (r3 == 0) goto L_0x00d9
            goto L_0x00fe
        L_0x00d9:
            java.lang.String r3 = r9.mo34109H()     // Catch:{ all -> 0x0e1c }
            boolean r3 = r14.equals(r3)     // Catch:{ all -> 0x0e1c }
            if (r3 != 0) goto L_0x00fe
            com.google.android.gms.measurement.internal.n9 r29 = r47.mo34930g0()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.m9 r3 = r1.f7804B     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.u4 r10 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r31 = r10.mo34495N1()     // Catch:{ all -> 0x0e1c }
            r32 = 11
            java.lang.String r33 = "_ev"
            java.lang.String r34 = r9.mo34109H()     // Catch:{ all -> 0x0e1c }
            r35 = 0
            r30 = r3
            r29.mo35115A(r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0e1c }
        L_0x00fe:
            r30 = r4
            r4 = r6
            r29 = r8
            r14 = r24
            r10 = r28
            r3 = -1
            r8 = r2
            goto L_0x069d
        L_0x010b:
            java.lang.String r12 = r9.mo34109H()     // Catch:{ all -> 0x0e1c }
            java.lang.String r15 = p201q5.C9267n.m19029a(r4)     // Catch:{ all -> 0x0e1c }
            boolean r12 = r12.equals(r15)     // Catch:{ all -> 0x0e1c }
            if (r12 == 0) goto L_0x0181
            r9.mo34120z(r4)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.l3 r12 = r47.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r12 = r12.mo35079v()     // Catch:{ all -> 0x0e1c }
            java.lang.String r15 = "Renaming ad_impression to _ai"
            r12.mo35037a(r15)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.l3 r12 = r47.mo34920b()     // Catch:{ all -> 0x0e1c }
            java.lang.String r12 = r12.mo35072C()     // Catch:{ all -> 0x0e1c }
            r15 = 5
            boolean r12 = android.util.Log.isLoggable(r12, r15)     // Catch:{ all -> 0x0e1c }
            if (r12 == 0) goto L_0x0181
            r12 = 0
        L_0x0139:
            int r15 = r9.mo34112r()     // Catch:{ all -> 0x0e1c }
            if (r12 >= r15) goto L_0x0181
            java.lang.String r15 = "ad_platform"
            com.google.android.gms.internal.measurement.o4 r29 = r9.mo34108F(r12)     // Catch:{ all -> 0x0e1c }
            r30 = r4
            java.lang.String r4 = r29.mo34240D()     // Catch:{ all -> 0x0e1c }
            boolean r4 = r15.equals(r4)     // Catch:{ all -> 0x0e1c }
            if (r4 == 0) goto L_0x017c
            com.google.android.gms.internal.measurement.o4 r4 = r9.mo34108F(r12)     // Catch:{ all -> 0x0e1c }
            java.lang.String r4 = r4.mo34241E()     // Catch:{ all -> 0x0e1c }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0e1c }
            if (r4 != 0) goto L_0x017c
            java.lang.String r4 = "admob"
            com.google.android.gms.internal.measurement.o4 r15 = r9.mo34108F(r12)     // Catch:{ all -> 0x0e1c }
            java.lang.String r15 = r15.mo34241E()     // Catch:{ all -> 0x0e1c }
            boolean r4 = r4.equalsIgnoreCase(r15)     // Catch:{ all -> 0x0e1c }
            if (r4 == 0) goto L_0x017c
            com.google.android.gms.measurement.internal.l3 r4 = r47.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r4 = r4.mo35081x()     // Catch:{ all -> 0x0e1c }
            java.lang.String r15 = "AdMob ad impression logged from app. Potentially duplicative."
            r4.mo35037a(r15)     // Catch:{ all -> 0x0e1c }
        L_0x017c:
            int r12 = r12 + 1
            r4 = r30
            goto L_0x0139
        L_0x0181:
            r30 = r4
            com.google.android.gms.measurement.internal.j4 r4 = r1.f7805a     // Catch:{ all -> 0x0e1c }
            m10634Q(r4)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.u4 r12 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r12 = r12.mo34495N1()     // Catch:{ all -> 0x0e1c }
            java.lang.String r15 = r9.mo34109H()     // Catch:{ all -> 0x0e1c }
            boolean r4 = r4.mo35049w(r12, r15)     // Catch:{ all -> 0x0e1c }
            java.lang.String r12 = "_c"
            if (r4 != 0) goto L_0x01f1
            com.google.android.gms.measurement.internal.i9 r15 = r1.f7811g     // Catch:{ all -> 0x0e1c }
            m10634Q(r15)     // Catch:{ all -> 0x0e1c }
            java.lang.String r15 = r9.mo34109H()     // Catch:{ all -> 0x0e1c }
            p231t4.C9713p.m20271f(r15)     // Catch:{ all -> 0x0e1c }
            r29 = r8
            int r8 = r15.hashCode()     // Catch:{ all -> 0x0e1c }
            r31 = r2
            r2 = 94660(0x171c4, float:1.32647E-40)
            if (r8 == r2) goto L_0x01d2
            r2 = 95025(0x17331, float:1.33158E-40)
            if (r8 == r2) goto L_0x01c8
            r2 = 95027(0x17333, float:1.33161E-40)
            if (r8 == r2) goto L_0x01be
            goto L_0x01dc
        L_0x01be:
            java.lang.String r2 = "_ui"
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x01dc
            r2 = 1
            goto L_0x01dd
        L_0x01c8:
            java.lang.String r2 = "_ug"
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x01dc
            r2 = 2
            goto L_0x01dd
        L_0x01d2:
            java.lang.String r2 = "_in"
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x01dc
            r2 = 0
            goto L_0x01dd
        L_0x01dc:
            r2 = -1
        L_0x01dd:
            if (r2 == 0) goto L_0x01f5
            r8 = 1
            if (r2 == r8) goto L_0x01f5
            r8 = 2
            if (r2 == r8) goto L_0x01f5
            r33 = r7
            r8 = r10
            r32 = r11
            r22 = r13
            r4 = 0
            r10 = r3
            r13 = r6
            goto L_0x03c5
        L_0x01f1:
            r31 = r2
            r29 = r8
        L_0x01f5:
            r22 = r13
            r2 = 0
            r8 = 0
            r15 = 0
        L_0x01fa:
            int r13 = r9.mo34112r()     // Catch:{ all -> 0x0e1c }
            r32 = r11
            java.lang.String r11 = "_r"
            if (r2 >= r13) goto L_0x0266
            com.google.android.gms.internal.measurement.o4 r13 = r9.mo34108F(r2)     // Catch:{ all -> 0x0e1c }
            java.lang.String r13 = r13.mo34240D()     // Catch:{ all -> 0x0e1c }
            boolean r13 = r12.equals(r13)     // Catch:{ all -> 0x0e1c }
            if (r13 == 0) goto L_0x0230
            com.google.android.gms.internal.measurement.o4 r8 = r9.mo34108F(r2)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.s8 r8 = r8.mo34557q()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.n4 r8 = (com.google.android.gms.internal.measurement.C5871n4) r8     // Catch:{ all -> 0x0e1c }
            r13 = r6
            r33 = r7
            r6 = 1
            r8.mo34216z(r6)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.v8 r6 = r8.mo34354l()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.o4 r6 = (com.google.android.gms.internal.measurement.C5887o4) r6     // Catch:{ all -> 0x0e1c }
            r9.mo34105C(r2, r6)     // Catch:{ all -> 0x0e1c }
            r7 = r10
            r8 = 1
            goto L_0x025d
        L_0x0230:
            r13 = r6
            r33 = r7
            com.google.android.gms.internal.measurement.o4 r6 = r9.mo34108F(r2)     // Catch:{ all -> 0x0e1c }
            java.lang.String r6 = r6.mo34240D()     // Catch:{ all -> 0x0e1c }
            boolean r6 = r11.equals(r6)     // Catch:{ all -> 0x0e1c }
            if (r6 == 0) goto L_0x025c
            com.google.android.gms.internal.measurement.o4 r6 = r9.mo34108F(r2)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.s8 r6 = r6.mo34557q()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.n4 r6 = (com.google.android.gms.internal.measurement.C5871n4) r6     // Catch:{ all -> 0x0e1c }
            r7 = r10
            r10 = 1
            r6.mo34216z(r10)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.v8 r6 = r6.mo34354l()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.o4 r6 = (com.google.android.gms.internal.measurement.C5887o4) r6     // Catch:{ all -> 0x0e1c }
            r9.mo34105C(r2, r6)     // Catch:{ all -> 0x0e1c }
            r15 = 1
            goto L_0x025d
        L_0x025c:
            r7 = r10
        L_0x025d:
            int r2 = r2 + 1
            r10 = r7
            r6 = r13
            r11 = r32
            r7 = r33
            goto L_0x01fa
        L_0x0266:
            r13 = r6
            r33 = r7
            r7 = r10
            if (r8 != 0) goto L_0x029a
            if (r4 == 0) goto L_0x029a
            com.google.android.gms.measurement.internal.l3 r2 = r47.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35079v()     // Catch:{ all -> 0x0e1c }
            java.lang.String r6 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.p4 r8 = r1.f7816l     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.g3 r8 = r8.mo35182D()     // Catch:{ all -> 0x0e1c }
            java.lang.String r10 = r9.mo34109H()     // Catch:{ all -> 0x0e1c }
            java.lang.String r8 = r8.mo34899d(r10)     // Catch:{ all -> 0x0e1c }
            r2.mo35038b(r6, r8)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.n4 r2 = com.google.android.gms.internal.measurement.C5887o4.m9708B()     // Catch:{ all -> 0x0e1c }
            r2.mo34206B(r12)     // Catch:{ all -> 0x0e1c }
            r8 = r7
            r6 = 1
            r2.mo34216z(r6)     // Catch:{ all -> 0x0e1c }
            r9.mo34116v(r2)     // Catch:{ all -> 0x0e1c }
            goto L_0x029b
        L_0x029a:
            r8 = r7
        L_0x029b:
            if (r15 != 0) goto L_0x02c7
            com.google.android.gms.measurement.internal.l3 r2 = r47.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35079v()     // Catch:{ all -> 0x0e1c }
            java.lang.String r6 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.p4 r7 = r1.f7816l     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.g3 r7 = r7.mo35182D()     // Catch:{ all -> 0x0e1c }
            java.lang.String r10 = r9.mo34109H()     // Catch:{ all -> 0x0e1c }
            java.lang.String r7 = r7.mo34899d(r10)     // Catch:{ all -> 0x0e1c }
            r2.mo35038b(r6, r7)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.n4 r2 = com.google.android.gms.internal.measurement.C5887o4.m9708B()     // Catch:{ all -> 0x0e1c }
            r2.mo34206B(r11)     // Catch:{ all -> 0x0e1c }
            r6 = 1
            r2.mo34216z(r6)     // Catch:{ all -> 0x0e1c }
            r9.mo34116v(r2)     // Catch:{ all -> 0x0e1c }
        L_0x02c7:
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c     // Catch:{ all -> 0x0e1c }
            m10634Q(r2)     // Catch:{ all -> 0x0e1c }
            long r35 = r47.mo34909F()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.u4 r6 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r37 = r6.mo34495N1()     // Catch:{ all -> 0x0e1c }
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 1
            r34 = r2
            com.google.android.gms.measurement.internal.h r2 = r34.mo35009V(r35, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x0e1c }
            long r6 = r2.f7835e     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.g r2 = r47.mo34912T()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.u4 r10 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r10 = r10.mo34495N1()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.z2<java.lang.Integer> r15 = com.google.android.gms.measurement.internal.C6084a3.f7598p     // Catch:{ all -> 0x0e1c }
            int r2 = r2.mo34884o(r10, r15)     // Catch:{ all -> 0x0e1c }
            r10 = r3
            long r2 = (long) r2     // Catch:{ all -> 0x0e1c }
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0302
            m10623E(r9, r11)     // Catch:{ all -> 0x0e1c }
            goto L_0x0304
        L_0x0302:
            r19 = 1
        L_0x0304:
            java.lang.String r2 = r9.mo34109H()     // Catch:{ all -> 0x0e1c }
            boolean r2 = com.google.android.gms.measurement.internal.C6234n9.m10922W(r2)     // Catch:{ all -> 0x0e1c }
            if (r2 == 0) goto L_0x03c5
            if (r4 == 0) goto L_0x03c5
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c     // Catch:{ all -> 0x0e1c }
            m10634Q(r2)     // Catch:{ all -> 0x0e1c }
            long r35 = r47.mo34909F()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.u4 r3 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r37 = r3.mo34495N1()     // Catch:{ all -> 0x0e1c }
            r38 = 0
            r39 = 0
            r40 = 1
            r41 = 0
            r42 = 0
            r34 = r2
            com.google.android.gms.measurement.internal.h r2 = r34.mo35009V(r35, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x0e1c }
            long r2 = r2.f7833c     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.g r6 = r47.mo34912T()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.u4 r7 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r7 = r7.mo34495N1()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.z2<java.lang.Integer> r11 = com.google.android.gms.measurement.internal.C6084a3.f7596o     // Catch:{ all -> 0x0e1c }
            int r6 = r6.mo34884o(r7, r11)     // Catch:{ all -> 0x0e1c }
            long r6 = (long) r6     // Catch:{ all -> 0x0e1c }
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x03c5
            com.google.android.gms.measurement.internal.l3 r2 = r47.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35080w()     // Catch:{ all -> 0x0e1c }
            java.lang.String r3 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.u4 r6 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r6 = r6.mo34495N1()     // Catch:{ all -> 0x0e1c }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r6)     // Catch:{ all -> 0x0e1c }
            r2.mo35038b(r3, r6)     // Catch:{ all -> 0x0e1c }
            r2 = 0
            r3 = 0
            r6 = 0
            r7 = -1
        L_0x0361:
            int r11 = r9.mo34112r()     // Catch:{ all -> 0x0e1c }
            if (r3 >= r11) goto L_0x038b
            com.google.android.gms.internal.measurement.o4 r11 = r9.mo34108F(r3)     // Catch:{ all -> 0x0e1c }
            java.lang.String r15 = r11.mo34240D()     // Catch:{ all -> 0x0e1c }
            boolean r15 = r12.equals(r15)     // Catch:{ all -> 0x0e1c }
            if (r15 == 0) goto L_0x037d
            com.google.android.gms.internal.measurement.s8 r2 = r11.mo34557q()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.n4 r2 = (com.google.android.gms.internal.measurement.C5871n4) r2     // Catch:{ all -> 0x0e1c }
            r7 = r3
            goto L_0x0388
        L_0x037d:
            java.lang.String r11 = r11.mo34240D()     // Catch:{ all -> 0x0e1c }
            boolean r11 = r14.equals(r11)     // Catch:{ all -> 0x0e1c }
            if (r11 == 0) goto L_0x0388
            r6 = 1
        L_0x0388:
            int r3 = r3 + 1
            goto L_0x0361
        L_0x038b:
            if (r6 == 0) goto L_0x0394
            if (r2 == 0) goto L_0x0393
            r9.mo34119y(r7)     // Catch:{ all -> 0x0e1c }
            goto L_0x03c5
        L_0x0393:
            r2 = 0
        L_0x0394:
            if (r2 == 0) goto L_0x03ae
            com.google.android.gms.internal.measurement.s8 r2 = r2.clone()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.n4 r2 = (com.google.android.gms.internal.measurement.C5871n4) r2     // Catch:{ all -> 0x0e1c }
            r2.mo34206B(r14)     // Catch:{ all -> 0x0e1c }
            r14 = 10
            r2.mo34216z(r14)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.v8 r2 = r2.mo34354l()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.o4 r2 = (com.google.android.gms.internal.measurement.C5887o4) r2     // Catch:{ all -> 0x0e1c }
            r9.mo34105C(r7, r2)     // Catch:{ all -> 0x0e1c }
            goto L_0x03c5
        L_0x03ae:
            com.google.android.gms.measurement.internal.l3 r2 = r47.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ all -> 0x0e1c }
            java.lang.String r3 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.u4 r6 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r6 = r6.mo34495N1()     // Catch:{ all -> 0x0e1c }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r6)     // Catch:{ all -> 0x0e1c }
            r2.mo35038b(r3, r6)     // Catch:{ all -> 0x0e1c }
        L_0x03c5:
            if (r4 == 0) goto L_0x047e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0e1c }
            java.util.List r3 = r9.mo34110I()     // Catch:{ all -> 0x0e1c }
            r2.<init>(r3)     // Catch:{ all -> 0x0e1c }
            r3 = 0
            r4 = -1
            r6 = -1
        L_0x03d3:
            int r7 = r2.size()     // Catch:{ all -> 0x0e1c }
            java.lang.String r11 = "currency"
            java.lang.String r14 = "value"
            if (r3 >= r7) goto L_0x0403
            java.lang.Object r7 = r2.get(r3)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.o4 r7 = (com.google.android.gms.internal.measurement.C5887o4) r7     // Catch:{ all -> 0x0e1c }
            java.lang.String r7 = r7.mo34240D()     // Catch:{ all -> 0x0e1c }
            boolean r7 = r14.equals(r7)     // Catch:{ all -> 0x0e1c }
            if (r7 == 0) goto L_0x03ef
            r4 = r3
            goto L_0x0400
        L_0x03ef:
            java.lang.Object r7 = r2.get(r3)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.o4 r7 = (com.google.android.gms.internal.measurement.C5887o4) r7     // Catch:{ all -> 0x0e1c }
            java.lang.String r7 = r7.mo34240D()     // Catch:{ all -> 0x0e1c }
            boolean r7 = r11.equals(r7)     // Catch:{ all -> 0x0e1c }
            if (r7 == 0) goto L_0x0400
            r6 = r3
        L_0x0400:
            int r3 = r3 + 1
            goto L_0x03d3
        L_0x0403:
            r3 = -1
            if (r4 != r3) goto L_0x0408
            goto L_0x047f
        L_0x0408:
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.o4 r3 = (com.google.android.gms.internal.measurement.C5887o4) r3     // Catch:{ all -> 0x0e1c }
            boolean r3 = r3.mo34245U()     // Catch:{ all -> 0x0e1c }
            if (r3 != 0) goto L_0x0439
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.o4 r3 = (com.google.android.gms.internal.measurement.C5887o4) r3     // Catch:{ all -> 0x0e1c }
            boolean r3 = r3.mo34243S()     // Catch:{ all -> 0x0e1c }
            if (r3 != 0) goto L_0x0439
            com.google.android.gms.measurement.internal.l3 r2 = r47.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35081x()     // Catch:{ all -> 0x0e1c }
            java.lang.String r3 = "Value must be specified with a numeric type."
            r2.mo35037a(r3)     // Catch:{ all -> 0x0e1c }
            r9.mo34119y(r4)     // Catch:{ all -> 0x0e1c }
            m10623E(r9, r12)     // Catch:{ all -> 0x0e1c }
            r2 = 18
            m10622D(r9, r2, r14)     // Catch:{ all -> 0x0e1c }
            goto L_0x047e
        L_0x0439:
            r3 = -1
            if (r6 != r3) goto L_0x043d
            goto L_0x0465
        L_0x043d:
            java.lang.Object r2 = r2.get(r6)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.o4 r2 = (com.google.android.gms.internal.measurement.C5887o4) r2     // Catch:{ all -> 0x0e1c }
            java.lang.String r2 = r2.mo34241E()     // Catch:{ all -> 0x0e1c }
            int r6 = r2.length()     // Catch:{ all -> 0x0e1c }
            r7 = 3
            if (r6 != r7) goto L_0x0465
            r6 = 0
        L_0x044f:
            int r7 = r2.length()     // Catch:{ all -> 0x0e1c }
            if (r6 >= r7) goto L_0x047f
            int r7 = r2.codePointAt(r6)     // Catch:{ all -> 0x0e1c }
            boolean r14 = java.lang.Character.isLetter(r7)     // Catch:{ all -> 0x0e1c }
            if (r14 == 0) goto L_0x0465
            int r7 = java.lang.Character.charCount(r7)     // Catch:{ all -> 0x0e1c }
            int r6 = r6 + r7
            goto L_0x044f
        L_0x0465:
            com.google.android.gms.measurement.internal.l3 r2 = r47.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35081x()     // Catch:{ all -> 0x0e1c }
            java.lang.String r6 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.mo35037a(r6)     // Catch:{ all -> 0x0e1c }
            r9.mo34119y(r4)     // Catch:{ all -> 0x0e1c }
            m10623E(r9, r12)     // Catch:{ all -> 0x0e1c }
            r2 = 19
            m10622D(r9, r2, r11)     // Catch:{ all -> 0x0e1c }
            goto L_0x047f
        L_0x047e:
            r3 = -1
        L_0x047f:
            java.lang.String r2 = r9.mo34109H()     // Catch:{ all -> 0x0e1c }
            boolean r2 = r10.equals(r2)     // Catch:{ all -> 0x0e1c }
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x04ea
            com.google.android.gms.measurement.internal.i9 r2 = r1.f7811g     // Catch:{ all -> 0x0e1c }
            m10634Q(r2)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.v8 r2 = r9.mo34354l()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.k4 r2 = (com.google.android.gms.internal.measurement.C5822k4) r2     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.o4 r2 = com.google.android.gms.measurement.internal.C6179i9.m10736o(r2, r8)     // Catch:{ all -> 0x0e1c }
            if (r2 != 0) goto L_0x04df
            if (r18 == 0) goto L_0x04d1
            long r11 = r18.mo34114t()     // Catch:{ all -> 0x0e1c }
            long r14 = r9.mo34114t()     // Catch:{ all -> 0x0e1c }
            long r11 = r11 - r14
            long r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0e1c }
            int r2 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x04d1
            com.google.android.gms.internal.measurement.s8 r2 = r18.clone()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.j4 r2 = (com.google.android.gms.internal.measurement.C5805j4) r2     // Catch:{ all -> 0x0e1c }
            boolean r4 = r1.m10633P(r9, r2)     // Catch:{ all -> 0x0e1c }
            if (r4 == 0) goto L_0x04c7
            r4 = r13
            r11 = r33
            r4.mo34384H(r11, r2)     // Catch:{ all -> 0x0e1c }
            r13 = r22
            r2 = 0
            r18 = 0
            goto L_0x04cd
        L_0x04c7:
            r4 = r13
            r11 = r33
            r2 = r9
            r13 = r16
        L_0x04cd:
            r17 = r2
            r7 = r11
            goto L_0x04d9
        L_0x04d1:
            r4 = r13
            r11 = r33
            r17 = r9
            r7 = r11
            r13 = r16
        L_0x04d9:
            r8 = r31
            r12 = r32
            goto L_0x062d
        L_0x04df:
            r4 = r13
            r11 = r33
            r6 = r22
            r8 = r31
            r12 = r32
            goto L_0x062b
        L_0x04ea:
            r4 = r13
            r11 = r33
            java.lang.String r2 = "_vs"
            java.lang.String r8 = r9.mo34109H()     // Catch:{ all -> 0x0e1c }
            boolean r2 = r2.equals(r8)     // Catch:{ all -> 0x0e1c }
            if (r2 == 0) goto L_0x054e
            com.google.android.gms.measurement.internal.i9 r2 = r1.f7811g     // Catch:{ all -> 0x0e1c }
            m10634Q(r2)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.v8 r2 = r9.mo34354l()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.k4 r2 = (com.google.android.gms.internal.measurement.C5822k4) r2     // Catch:{ all -> 0x0e1c }
            r12 = r32
            com.google.android.gms.internal.measurement.o4 r2 = com.google.android.gms.measurement.internal.C6179i9.m10736o(r2, r12)     // Catch:{ all -> 0x0e1c }
            if (r2 != 0) goto L_0x054a
            if (r17 == 0) goto L_0x053f
            long r13 = r17.mo34114t()     // Catch:{ all -> 0x0e1c }
            long r26 = r9.mo34114t()     // Catch:{ all -> 0x0e1c }
            long r13 = r13 - r26
            long r13 = java.lang.Math.abs(r13)     // Catch:{ all -> 0x0e1c }
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x053f
            com.google.android.gms.internal.measurement.s8 r2 = r17.clone()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.j4 r2 = (com.google.android.gms.internal.measurement.C5805j4) r2     // Catch:{ all -> 0x0e1c }
            boolean r6 = r1.m10633P(r2, r9)     // Catch:{ all -> 0x0e1c }
            if (r6 == 0) goto L_0x0536
            r6 = r22
            r4.mo34384H(r6, r2)     // Catch:{ all -> 0x0e1c }
            r7 = r11
            r2 = 0
            r17 = 0
            goto L_0x053b
        L_0x0536:
            r6 = r22
            r2 = r9
            r7 = r16
        L_0x053b:
            r18 = r2
            r13 = r6
            goto L_0x0546
        L_0x053f:
            r6 = r22
            r13 = r6
            r18 = r9
            r7 = r16
        L_0x0546:
            r8 = r31
            goto L_0x062d
        L_0x054a:
            r6 = r22
            goto L_0x0629
        L_0x054e:
            r6 = r22
            r12 = r32
            com.google.android.gms.measurement.internal.g r2 = r47.mo34912T()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.u4 r7 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r7 = r7.mo34495N1()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.C6084a3.f7583h0     // Catch:{ all -> 0x0e1c }
            boolean r2 = r2.mo34873B(r7, r8)     // Catch:{ all -> 0x0e1c }
            if (r2 == 0) goto L_0x0629
            java.lang.String r2 = "_ab"
            java.lang.String r7 = r9.mo34109H()     // Catch:{ all -> 0x0e1c }
            boolean r2 = r2.equals(r7)     // Catch:{ all -> 0x0e1c }
            if (r2 == 0) goto L_0x0629
            com.google.android.gms.measurement.internal.i9 r2 = r1.f7811g     // Catch:{ all -> 0x0e1c }
            m10634Q(r2)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.v8 r2 = r9.mo34354l()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.k4 r2 = (com.google.android.gms.internal.measurement.C5822k4) r2     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.o4 r2 = com.google.android.gms.measurement.internal.C6179i9.m10736o(r2, r12)     // Catch:{ all -> 0x0e1c }
            if (r2 != 0) goto L_0x0629
            if (r17 == 0) goto L_0x0629
            long r7 = r17.mo34114t()     // Catch:{ all -> 0x0e1c }
            long r13 = r9.mo34114t()     // Catch:{ all -> 0x0e1c }
            long r7 = r7 - r13
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0e1c }
            r13 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x0629
            com.google.android.gms.internal.measurement.s8 r2 = r17.clone()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.j4 r2 = (com.google.android.gms.internal.measurement.C5805j4) r2     // Catch:{ all -> 0x0e1c }
            r1.m10628K(r2, r9)     // Catch:{ all -> 0x0e1c }
            java.lang.String r7 = r2.mo34109H()     // Catch:{ all -> 0x0e1c }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x0e1c }
            p231t4.C9713p.m20266a(r7)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.i9 r7 = r1.f7811g     // Catch:{ all -> 0x0e1c }
            m10634Q(r7)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.v8 r7 = r2.mo34354l()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.k4 r7 = (com.google.android.gms.internal.measurement.C5822k4) r7     // Catch:{ all -> 0x0e1c }
            r8 = r31
            com.google.android.gms.internal.measurement.o4 r7 = com.google.android.gms.measurement.internal.C6179i9.m10736o(r7, r8)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.i9 r13 = r1.f7811g     // Catch:{ all -> 0x0e1c }
            m10634Q(r13)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.v8 r13 = r2.mo34354l()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.k4 r13 = (com.google.android.gms.internal.measurement.C5822k4) r13     // Catch:{ all -> 0x0e1c }
            java.lang.String r14 = "_sc"
            com.google.android.gms.internal.measurement.o4 r13 = com.google.android.gms.measurement.internal.C6179i9.m10736o(r13, r14)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.i9 r14 = r1.f7811g     // Catch:{ all -> 0x0e1c }
            m10634Q(r14)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.v8 r14 = r2.mo34354l()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.k4 r14 = (com.google.android.gms.internal.measurement.C5822k4) r14     // Catch:{ all -> 0x0e1c }
            java.lang.String r15 = "_si"
            com.google.android.gms.internal.measurement.o4 r14 = com.google.android.gms.measurement.internal.C6179i9.m10736o(r14, r15)     // Catch:{ all -> 0x0e1c }
            if (r7 == 0) goto L_0x05e4
            java.lang.String r7 = r7.mo34241E()     // Catch:{ all -> 0x0e1c }
            goto L_0x05e6
        L_0x05e4:
            java.lang.String r7 = ""
        L_0x05e6:
            boolean r15 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0e1c }
            if (r15 != 0) goto L_0x05f4
            com.google.android.gms.measurement.internal.i9 r15 = r1.f7811g     // Catch:{ all -> 0x0e1c }
            m10634Q(r15)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.C6179i9.m10734m(r9, r8, r7)     // Catch:{ all -> 0x0e1c }
        L_0x05f4:
            if (r13 == 0) goto L_0x05fb
            java.lang.String r7 = r13.mo34241E()     // Catch:{ all -> 0x0e1c }
            goto L_0x05fd
        L_0x05fb:
            java.lang.String r7 = ""
        L_0x05fd:
            boolean r13 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0e1c }
            if (r13 != 0) goto L_0x060d
            com.google.android.gms.measurement.internal.i9 r13 = r1.f7811g     // Catch:{ all -> 0x0e1c }
            m10634Q(r13)     // Catch:{ all -> 0x0e1c }
            java.lang.String r13 = "_sc"
            com.google.android.gms.measurement.internal.C6179i9.m10734m(r9, r13, r7)     // Catch:{ all -> 0x0e1c }
        L_0x060d:
            if (r14 == 0) goto L_0x0621
            com.google.android.gms.measurement.internal.i9 r7 = r1.f7811g     // Catch:{ all -> 0x0e1c }
            m10634Q(r7)     // Catch:{ all -> 0x0e1c }
            java.lang.String r7 = "_si"
            long r13 = r14.mo34251z()     // Catch:{ all -> 0x0e1c }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.C6179i9.m10734m(r9, r7, r13)     // Catch:{ all -> 0x0e1c }
        L_0x0621:
            r4.mo34384H(r6, r2)     // Catch:{ all -> 0x0e1c }
            r13 = r6
            r7 = r11
            r17 = 0
            goto L_0x062d
        L_0x0629:
            r8 = r31
        L_0x062b:
            r13 = r6
            r7 = r11
        L_0x062d:
            if (r29 != 0) goto L_0x0689
            java.lang.String r2 = r9.mo34109H()     // Catch:{ all -> 0x0e1c }
            boolean r2 = r10.equals(r2)     // Catch:{ all -> 0x0e1c }
            if (r2 == 0) goto L_0x0689
            int r2 = r9.mo34112r()     // Catch:{ all -> 0x0e1c }
            if (r2 != 0) goto L_0x0657
            com.google.android.gms.measurement.internal.l3 r2 = r47.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35080w()     // Catch:{ all -> 0x0e1c }
            java.lang.String r6 = "Engagement event does not contain any parameters. appId"
            com.google.android.gms.internal.measurement.u4 r10 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r10 = r10.mo34495N1()     // Catch:{ all -> 0x0e1c }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r10)     // Catch:{ all -> 0x0e1c }
            r2.mo35038b(r6, r10)     // Catch:{ all -> 0x0e1c }
            goto L_0x0689
        L_0x0657:
            com.google.android.gms.measurement.internal.i9 r2 = r1.f7811g     // Catch:{ all -> 0x0e1c }
            m10634Q(r2)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.v8 r2 = r9.mo34354l()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.k4 r2 = (com.google.android.gms.internal.measurement.C5822k4) r2     // Catch:{ all -> 0x0e1c }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C6179i9.m10737p(r2, r12)     // Catch:{ all -> 0x0e1c }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0e1c }
            if (r2 != 0) goto L_0x0682
            com.google.android.gms.measurement.internal.l3 r2 = r47.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35080w()     // Catch:{ all -> 0x0e1c }
            java.lang.String r6 = "Engagement event does not include duration. appId"
            com.google.android.gms.internal.measurement.u4 r10 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r10 = r10.mo34495N1()     // Catch:{ all -> 0x0e1c }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r10)     // Catch:{ all -> 0x0e1c }
            r2.mo35038b(r6, r10)     // Catch:{ all -> 0x0e1c }
            goto L_0x0689
        L_0x0682:
            long r10 = r2.longValue()     // Catch:{ all -> 0x0e1c }
            long r14 = r24 + r10
            goto L_0x068b
        L_0x0689:
            r14 = r24
        L_0x068b:
            java.util.List<com.google.android.gms.internal.measurement.k4> r2 = r5.f7779c     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.v8 r6 = r9.mo34354l()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.k4 r6 = (com.google.android.gms.internal.measurement.C5822k4) r6     // Catch:{ all -> 0x0e1c }
            r10 = r28
            r2.set(r10, r6)     // Catch:{ all -> 0x0e1c }
            int r16 = r16 + 1
            r4.mo34433w0(r9)     // Catch:{ all -> 0x0e1c }
        L_0x069d:
            int r12 = r10 + 1
            r6 = r4
            r2 = r8
            r3 = r23
            r8 = r29
            r4 = r30
            goto L_0x0058
        L_0x06a9:
            r4 = r6
            r29 = r8
            r8 = r10
            r12 = r11
            r10 = r3
            if (r29 == 0) goto L_0x0708
            r3 = r16
            r14 = r24
            r2 = 0
        L_0x06b6:
            if (r2 >= r3) goto L_0x070a
            com.google.android.gms.internal.measurement.k4 r6 = r4.mo34423r0(r2)     // Catch:{ all -> 0x0e1c }
            java.lang.String r7 = r6.mo34134E()     // Catch:{ all -> 0x0e1c }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x0e1c }
            if (r7 == 0) goto L_0x06d9
            com.google.android.gms.measurement.internal.i9 r7 = r1.f7811g     // Catch:{ all -> 0x0e1c }
            m10634Q(r7)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.o4 r7 = com.google.android.gms.measurement.internal.C6179i9.m10736o(r6, r8)     // Catch:{ all -> 0x0e1c }
            if (r7 == 0) goto L_0x06d9
            r4.mo34389J0(r2)     // Catch:{ all -> 0x0e1c }
            int r3 = r3 + -1
            int r2 = r2 + -1
            goto L_0x0705
        L_0x06d9:
            com.google.android.gms.measurement.internal.i9 r7 = r1.f7811g     // Catch:{ all -> 0x0e1c }
            m10634Q(r7)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.o4 r6 = com.google.android.gms.measurement.internal.C6179i9.m10736o(r6, r12)     // Catch:{ all -> 0x0e1c }
            if (r6 == 0) goto L_0x0705
            boolean r7 = r6.mo34245U()     // Catch:{ all -> 0x0e1c }
            if (r7 == 0) goto L_0x06f3
            long r6 = r6.mo34251z()     // Catch:{ all -> 0x0e1c }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0e1c }
            goto L_0x06f4
        L_0x06f3:
            r6 = 0
        L_0x06f4:
            if (r6 == 0) goto L_0x0705
            long r16 = r6.longValue()     // Catch:{ all -> 0x0e1c }
            r20 = 0
            int r7 = (r16 > r20 ? 1 : (r16 == r20 ? 0 : -1))
            if (r7 <= 0) goto L_0x0705
            long r6 = r6.longValue()     // Catch:{ all -> 0x0e1c }
            long r14 = r14 + r6
        L_0x0705:
            r6 = 1
            int r2 = r2 + r6
            goto L_0x06b6
        L_0x0708:
            r14 = r24
        L_0x070a:
            r2 = 0
            r1.m10627J(r4, r14, r2)     // Catch:{ all -> 0x0e1c }
            java.util.List r2 = r4.mo34417m0()     // Catch:{ all -> 0x0e1c }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0e1c }
        L_0x0716:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0e1c }
            java.lang.String r6 = "_se"
            if (r3 == 0) goto L_0x073c
            java.lang.String r3 = "_s"
            java.lang.Object r7 = r2.next()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.k4 r7 = (com.google.android.gms.internal.measurement.C5822k4) r7     // Catch:{ all -> 0x0e1c }
            java.lang.String r7 = r7.mo34134E()     // Catch:{ all -> 0x0e1c }
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x0e1c }
            if (r3 == 0) goto L_0x0716
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c     // Catch:{ all -> 0x0e1c }
            m10634Q(r2)     // Catch:{ all -> 0x0e1c }
            java.lang.String r3 = r4.mo34414j0()     // Catch:{ all -> 0x0e1c }
            r2.mo35024n(r3, r6)     // Catch:{ all -> 0x0e1c }
        L_0x073c:
            java.lang.String r2 = "_sid"
            int r2 = com.google.android.gms.measurement.internal.C6179i9.m10745x(r4, r2)     // Catch:{ all -> 0x0e1c }
            if (r2 < 0) goto L_0x0749
            r2 = 1
            r1.m10627J(r4, r14, r2)     // Catch:{ all -> 0x0e1c }
            goto L_0x0769
        L_0x0749:
            int r2 = com.google.android.gms.measurement.internal.C6179i9.m10745x(r4, r6)     // Catch:{ all -> 0x0e1c }
            if (r2 < 0) goto L_0x0769
            r4.mo34391K0(r2)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.l3 r2 = r47.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ all -> 0x0e1c }
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.u4 r6 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r6 = r6.mo34495N1()     // Catch:{ all -> 0x0e1c }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r6)     // Catch:{ all -> 0x0e1c }
            r2.mo35038b(r3, r6)     // Catch:{ all -> 0x0e1c }
        L_0x0769:
            com.google.android.gms.measurement.internal.i9 r2 = r1.f7811g     // Catch:{ all -> 0x0e1c }
            m10634Q(r2)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.p4 r3 = r2.f7899a     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.l3 r3 = r3.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r3 = r3.mo35079v()     // Catch:{ all -> 0x0e1c }
            java.lang.String r6 = "Checking account type status for ad personalization signals"
            r3.mo35037a(r6)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.g9 r3 = r2.f8374b     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j4 r3 = r3.f7805a     // Catch:{ all -> 0x0e1c }
            m10634Q(r3)     // Catch:{ all -> 0x0e1c }
            java.lang.String r6 = r4.mo34414j0()     // Catch:{ all -> 0x0e1c }
            boolean r3 = r3.mo35046t(r6)     // Catch:{ all -> 0x0e1c }
            if (r3 == 0) goto L_0x0800
            com.google.android.gms.measurement.internal.g9 r3 = r2.f8374b     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j r3 = r3.f7807c     // Catch:{ all -> 0x0e1c }
            m10634Q(r3)     // Catch:{ all -> 0x0e1c }
            java.lang.String r6 = r4.mo34414j0()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.u4 r3 = r3.mo35007T(r6)     // Catch:{ all -> 0x0e1c }
            if (r3 == 0) goto L_0x0800
            boolean r3 = r3.mo35323J()     // Catch:{ all -> 0x0e1c }
            if (r3 == 0) goto L_0x0800
            com.google.android.gms.measurement.internal.p4 r3 = r2.f7899a     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.n r3 = r3.mo35179A()     // Catch:{ all -> 0x0e1c }
            boolean r3 = r3.mo35103s()     // Catch:{ all -> 0x0e1c }
            if (r3 == 0) goto L_0x0800
            com.google.android.gms.measurement.internal.p4 r3 = r2.f7899a     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.l3 r3 = r3.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r3 = r3.mo35074q()     // Catch:{ all -> 0x0e1c }
            java.lang.String r6 = "Turning off ad personalization due to account type"
            r3.mo35037a(r6)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.d5 r3 = com.google.android.gms.internal.measurement.C5721e5.m9094z()     // Catch:{ all -> 0x0e1c }
            r6 = r23
            r3.mo33830w(r6)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.n r2 = r2.mo35179A()     // Catch:{ all -> 0x0e1c }
            long r7 = r2.mo35099o()     // Catch:{ all -> 0x0e1c }
            r3.mo33831x(r7)     // Catch:{ all -> 0x0e1c }
            r7 = 1
            r3.mo33829v(r7)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.v8 r2 = r3.mo34354l()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.e5 r2 = (com.google.android.gms.internal.measurement.C5721e5) r2     // Catch:{ all -> 0x0e1c }
            r3 = 0
        L_0x07e2:
            int r7 = r4.mo34419o0()     // Catch:{ all -> 0x0e1c }
            if (r3 >= r7) goto L_0x07fd
            com.google.android.gms.internal.measurement.e5 r7 = r4.mo34413i0(r3)     // Catch:{ all -> 0x0e1c }
            java.lang.String r7 = r7.mo33891C()     // Catch:{ all -> 0x0e1c }
            boolean r7 = r6.equals(r7)     // Catch:{ all -> 0x0e1c }
            if (r7 == 0) goto L_0x07fa
            r4.mo34411g0(r3, r2)     // Catch:{ all -> 0x0e1c }
            goto L_0x0800
        L_0x07fa:
            int r3 = r3 + 1
            goto L_0x07e2
        L_0x07fd:
            r4.mo34437y0(r2)     // Catch:{ all -> 0x0e1c }
        L_0x0800:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4.mo34407c0(r2)     // Catch:{ all -> 0x0e1c }
            r2 = -9223372036854775808
            r4.mo34381F(r2)     // Catch:{ all -> 0x0e1c }
            r2 = 0
        L_0x080e:
            int r3 = r4.mo34402X()     // Catch:{ all -> 0x0e1c }
            if (r2 >= r3) goto L_0x0841
            com.google.android.gms.internal.measurement.k4 r3 = r4.mo34423r0(r2)     // Catch:{ all -> 0x0e1c }
            long r6 = r3.mo34142z()     // Catch:{ all -> 0x0e1c }
            long r8 = r4.mo34421q0()     // Catch:{ all -> 0x0e1c }
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x082b
            long r6 = r3.mo34142z()     // Catch:{ all -> 0x0e1c }
            r4.mo34407c0(r6)     // Catch:{ all -> 0x0e1c }
        L_0x082b:
            long r6 = r3.mo34142z()     // Catch:{ all -> 0x0e1c }
            long r8 = r4.mo34420p0()     // Catch:{ all -> 0x0e1c }
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x083e
            long r6 = r3.mo34142z()     // Catch:{ all -> 0x0e1c }
            r4.mo34381F(r6)     // Catch:{ all -> 0x0e1c }
        L_0x083e:
            int r2 = r2 + 1
            goto L_0x080e
        L_0x0841:
            r4.mo34387I0()     // Catch:{ all -> 0x0e1c }
            r4.mo34372A0()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.aa r6 = r1.f7810f     // Catch:{ all -> 0x0e1c }
            m10634Q(r6)     // Catch:{ all -> 0x0e1c }
            java.lang.String r7 = r4.mo34414j0()     // Catch:{ all -> 0x0e1c }
            java.util.List r8 = r4.mo34417m0()     // Catch:{ all -> 0x0e1c }
            java.util.List r9 = r4.mo34418n0()     // Catch:{ all -> 0x0e1c }
            long r2 = r4.mo34421q0()     // Catch:{ all -> 0x0e1c }
            java.lang.Long r10 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0e1c }
            long r2 = r4.mo34420p0()     // Catch:{ all -> 0x0e1c }
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0e1c }
            java.util.List r2 = r6.mo34750m(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0e1c }
            r4.mo34425s0(r2)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.g r2 = r47.mo34912T()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.u4 r3 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r3 = r3.mo34495N1()     // Catch:{ all -> 0x0e1c }
            boolean r2 = r2.mo34877F(r3)     // Catch:{ all -> 0x0e1c }
            if (r2 == 0) goto L_0x0bb7
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0e1c }
            r2.<init>()     // Catch:{ all -> 0x0e1c }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0e1c }
            r3.<init>()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.n9 r6 = r47.mo34930g0()     // Catch:{ all -> 0x0e1c }
            java.security.SecureRandom r6 = r6.mo35151t()     // Catch:{ all -> 0x0e1c }
            r7 = 0
        L_0x0892:
            int r8 = r4.mo34402X()     // Catch:{ all -> 0x0e1c }
            if (r7 >= r8) goto L_0x0b7f
            com.google.android.gms.internal.measurement.k4 r8 = r4.mo34423r0(r7)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.s8 r8 = r8.mo34557q()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.j4 r8 = (com.google.android.gms.internal.measurement.C5805j4) r8     // Catch:{ all -> 0x0e1c }
            java.lang.String r9 = r8.mo34109H()     // Catch:{ all -> 0x0e1c }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0e1c }
            java.lang.String r10 = "_sr"
            if (r9 == 0) goto L_0x0931
            com.google.android.gms.measurement.internal.i9 r9 = r1.f7811g     // Catch:{ all -> 0x0e1c }
            m10634Q(r9)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.v8 r9 = r8.mo34354l()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.k4 r9 = (com.google.android.gms.internal.measurement.C5822k4) r9     // Catch:{ all -> 0x0e1c }
            java.lang.String r11 = "_en"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C6179i9.m10737p(r9, r11)     // Catch:{ all -> 0x0e1c }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0e1c }
            java.lang.Object r11 = r2.get(r9)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.p r11 = (com.google.android.gms.measurement.internal.C6246p) r11     // Catch:{ all -> 0x0e1c }
            if (r11 != 0) goto L_0x08e5
            com.google.android.gms.measurement.internal.j r11 = r1.f7807c     // Catch:{ all -> 0x0e1c }
            m10634Q(r11)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.u4 r12 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r12 = r12.mo34495N1()     // Catch:{ all -> 0x0e1c }
            java.lang.Object r13 = p231t4.C9713p.m20275j(r9)     // Catch:{ all -> 0x0e1c }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.p r11 = r11.mo35011X(r12, r13)     // Catch:{ all -> 0x0e1c }
            if (r11 == 0) goto L_0x08e5
            r2.put(r9, r11)     // Catch:{ all -> 0x0e1c }
        L_0x08e5:
            if (r11 == 0) goto L_0x0926
            java.lang.Long r9 = r11.f8074i     // Catch:{ all -> 0x0e1c }
            if (r9 != 0) goto L_0x0926
            java.lang.Long r9 = r11.f8075j     // Catch:{ all -> 0x0e1c }
            if (r9 == 0) goto L_0x0903
            long r12 = r9.longValue()     // Catch:{ all -> 0x0e1c }
            r14 = 1
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x0903
            com.google.android.gms.measurement.internal.i9 r9 = r1.f7811g     // Catch:{ all -> 0x0e1c }
            m10634Q(r9)     // Catch:{ all -> 0x0e1c }
            java.lang.Long r9 = r11.f8075j     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.C6179i9.m10734m(r8, r10, r9)     // Catch:{ all -> 0x0e1c }
        L_0x0903:
            java.lang.Boolean r9 = r11.f8076k     // Catch:{ all -> 0x0e1c }
            if (r9 == 0) goto L_0x091d
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0e1c }
            if (r9 == 0) goto L_0x091d
            com.google.android.gms.measurement.internal.i9 r9 = r1.f7811g     // Catch:{ all -> 0x0e1c }
            m10634Q(r9)     // Catch:{ all -> 0x0e1c }
            java.lang.String r9 = "_efs"
            r10 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.C6179i9.m10734m(r8, r9, r12)     // Catch:{ all -> 0x0e1c }
        L_0x091d:
            com.google.android.gms.internal.measurement.v8 r9 = r8.mo34354l()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.k4 r9 = (com.google.android.gms.internal.measurement.C5822k4) r9     // Catch:{ all -> 0x0e1c }
            r3.add(r9)     // Catch:{ all -> 0x0e1c }
        L_0x0926:
            r4.mo34384H(r7, r8)     // Catch:{ all -> 0x0e1c }
        L_0x0929:
            r16 = r5
            r50 = r6
            r5 = 1
            goto L_0x0b77
        L_0x0931:
            com.google.android.gms.measurement.internal.j4 r9 = r1.f7805a     // Catch:{ all -> 0x0e1c }
            m10634Q(r9)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.u4 r11 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r11 = r11.mo34495N1()     // Catch:{ all -> 0x0e1c }
            java.lang.String r12 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r12 = r9.mo34844e(r11, r12)     // Catch:{ all -> 0x0e1c }
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0e1c }
            if (r13 != 0) goto L_0x0962
            long r11 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x094d }
            goto L_0x0964
        L_0x094d:
            r0 = move-exception
            r12 = r0
            com.google.android.gms.measurement.internal.p4 r9 = r9.f7899a     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.l3 r9 = r9.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r9 = r9.mo35080w()     // Catch:{ all -> 0x0e1c }
            java.lang.String r13 = "Unable to parse timezone offset. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r11)     // Catch:{ all -> 0x0e1c }
            r9.mo35039c(r13, r11, r12)     // Catch:{ all -> 0x0e1c }
        L_0x0962:
            r11 = 0
        L_0x0964:
            com.google.android.gms.measurement.internal.n9 r9 = r47.mo34930g0()     // Catch:{ all -> 0x0e1c }
            long r13 = r8.mo34114t()     // Catch:{ all -> 0x0e1c }
            long r13 = r9.mo35150s0(r13, r11)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.v8 r9 = r8.mo34354l()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.k4 r9 = (com.google.android.gms.internal.measurement.C5822k4) r9     // Catch:{ all -> 0x0e1c }
            r17 = r11
            r15 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0e1c }
            java.lang.String r12 = "_dbg"
            boolean r15 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0e1c }
            if (r15 != 0) goto L_0x09ba
            java.util.List r9 = r9.mo34135F()     // Catch:{ all -> 0x0e1c }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0e1c }
        L_0x098e:
            boolean r15 = r9.hasNext()     // Catch:{ all -> 0x0e1c }
            if (r15 == 0) goto L_0x09ba
            java.lang.Object r15 = r9.next()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.o4 r15 = (com.google.android.gms.internal.measurement.C5887o4) r15     // Catch:{ all -> 0x0e1c }
            r50 = r9
            java.lang.String r9 = r15.mo34240D()     // Catch:{ all -> 0x0e1c }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0e1c }
            if (r9 == 0) goto L_0x09b7
            long r15 = r15.mo34251z()     // Catch:{ all -> 0x0e1c }
            java.lang.Long r9 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0e1c }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0e1c }
            if (r9 != 0) goto L_0x09b5
            goto L_0x09ba
        L_0x09b5:
            r9 = 1
            goto L_0x09cd
        L_0x09b7:
            r9 = r50
            goto L_0x098e
        L_0x09ba:
            com.google.android.gms.measurement.internal.j4 r9 = r1.f7805a     // Catch:{ all -> 0x0e1c }
            m10634Q(r9)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.u4 r11 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r11 = r11.mo34495N1()     // Catch:{ all -> 0x0e1c }
            java.lang.String r12 = r8.mo34109H()     // Catch:{ all -> 0x0e1c }
            int r9 = r9.mo35041m(r11, r12)     // Catch:{ all -> 0x0e1c }
        L_0x09cd:
            if (r9 > 0) goto L_0x09f2
            com.google.android.gms.measurement.internal.l3 r10 = r47.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r10 = r10.mo35080w()     // Catch:{ all -> 0x0e1c }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r8.mo34109H()     // Catch:{ all -> 0x0e1c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0e1c }
            r10.mo35039c(r11, r12, r9)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.v8 r9 = r8.mo34354l()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.k4 r9 = (com.google.android.gms.internal.measurement.C5822k4) r9     // Catch:{ all -> 0x0e1c }
            r3.add(r9)     // Catch:{ all -> 0x0e1c }
            r4.mo34384H(r7, r8)     // Catch:{ all -> 0x0e1c }
            goto L_0x0929
        L_0x09f2:
            java.lang.String r11 = r8.mo34109H()     // Catch:{ all -> 0x0e1c }
            java.lang.Object r11 = r2.get(r11)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.p r11 = (com.google.android.gms.measurement.internal.C6246p) r11     // Catch:{ all -> 0x0e1c }
            if (r11 != 0) goto L_0x0a52
            com.google.android.gms.measurement.internal.j r11 = r1.f7807c     // Catch:{ all -> 0x0e1c }
            m10634Q(r11)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.u4 r12 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r12 = r12.mo34495N1()     // Catch:{ all -> 0x0e1c }
            java.lang.String r15 = r8.mo34109H()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.p r11 = r11.mo35011X(r12, r15)     // Catch:{ all -> 0x0e1c }
            if (r11 != 0) goto L_0x0a52
            com.google.android.gms.measurement.internal.l3 r11 = r47.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r11 = r11.mo35080w()     // Catch:{ all -> 0x0e1c }
            java.lang.String r12 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.u4 r15 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r15 = r15.mo34495N1()     // Catch:{ all -> 0x0e1c }
            r23 = r13
            java.lang.String r13 = r8.mo34109H()     // Catch:{ all -> 0x0e1c }
            r11.mo35039c(r12, r15, r13)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.p r11 = new com.google.android.gms.measurement.internal.p     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.u4 r12 = r5.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r29 = r12.mo34495N1()     // Catch:{ all -> 0x0e1c }
            java.lang.String r30 = r8.mo34109H()     // Catch:{ all -> 0x0e1c }
            r31 = 1
            r33 = 1
            r35 = 1
            long r37 = r8.mo34114t()     // Catch:{ all -> 0x0e1c }
            r39 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r28 = r11
            r28.<init>(r29, r30, r31, r33, r35, r37, r39, r41, r42, r43, r44)     // Catch:{ all -> 0x0e1c }
            goto L_0x0a54
        L_0x0a52:
            r23 = r13
        L_0x0a54:
            com.google.android.gms.measurement.internal.i9 r12 = r1.f7811g     // Catch:{ all -> 0x0e1c }
            m10634Q(r12)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.v8 r12 = r8.mo34354l()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.k4 r12 = (com.google.android.gms.internal.measurement.C5822k4) r12     // Catch:{ all -> 0x0e1c }
            java.lang.String r13 = "_eid"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C6179i9.m10737p(r12, r13)     // Catch:{ all -> 0x0e1c }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x0e1c }
            if (r12 == 0) goto L_0x0a6b
            r13 = 1
            goto L_0x0a6c
        L_0x0a6b:
            r13 = 0
        L_0x0a6c:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x0e1c }
            r14 = 1
            if (r9 != r14) goto L_0x0a9f
            com.google.android.gms.internal.measurement.v8 r9 = r8.mo34354l()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.k4 r9 = (com.google.android.gms.internal.measurement.C5822k4) r9     // Catch:{ all -> 0x0e1c }
            r3.add(r9)     // Catch:{ all -> 0x0e1c }
            boolean r9 = r13.booleanValue()     // Catch:{ all -> 0x0e1c }
            if (r9 == 0) goto L_0x0a9a
            java.lang.Long r9 = r11.f8074i     // Catch:{ all -> 0x0e1c }
            if (r9 != 0) goto L_0x0a8e
            java.lang.Long r9 = r11.f8075j     // Catch:{ all -> 0x0e1c }
            if (r9 != 0) goto L_0x0a8e
            java.lang.Boolean r9 = r11.f8076k     // Catch:{ all -> 0x0e1c }
            if (r9 == 0) goto L_0x0a9a
        L_0x0a8e:
            r9 = 0
            com.google.android.gms.measurement.internal.p r10 = r11.mo35175a(r9, r9, r9)     // Catch:{ all -> 0x0e1c }
            java.lang.String r9 = r8.mo34109H()     // Catch:{ all -> 0x0e1c }
            r2.put(r9, r10)     // Catch:{ all -> 0x0e1c }
        L_0x0a9a:
            r4.mo34384H(r7, r8)     // Catch:{ all -> 0x0e1c }
            goto L_0x0929
        L_0x0a9f:
            int r14 = r6.nextInt(r9)     // Catch:{ all -> 0x0e1c }
            if (r14 != 0) goto L_0x0adf
            com.google.android.gms.measurement.internal.i9 r12 = r1.f7811g     // Catch:{ all -> 0x0e1c }
            m10634Q(r12)     // Catch:{ all -> 0x0e1c }
            long r14 = (long) r9     // Catch:{ all -> 0x0e1c }
            java.lang.Long r9 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.C6179i9.m10734m(r8, r10, r9)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.v8 r10 = r8.mo34354l()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.k4 r10 = (com.google.android.gms.internal.measurement.C5822k4) r10     // Catch:{ all -> 0x0e1c }
            r3.add(r10)     // Catch:{ all -> 0x0e1c }
            boolean r10 = r13.booleanValue()     // Catch:{ all -> 0x0e1c }
            if (r10 == 0) goto L_0x0ac6
            r10 = 0
            com.google.android.gms.measurement.internal.p r11 = r11.mo35175a(r10, r9, r10)     // Catch:{ all -> 0x0e1c }
        L_0x0ac6:
            java.lang.String r9 = r8.mo34109H()     // Catch:{ all -> 0x0e1c }
            long r12 = r8.mo34114t()     // Catch:{ all -> 0x0e1c }
            r14 = r23
            com.google.android.gms.measurement.internal.p r10 = r11.mo35176b(r12, r14)     // Catch:{ all -> 0x0e1c }
            r2.put(r9, r10)     // Catch:{ all -> 0x0e1c }
            r16 = r5
            r50 = r6
            r5 = 1
            goto L_0x0b74
        L_0x0adf:
            r50 = r6
            r14 = r23
            java.lang.Long r6 = r11.f8073h     // Catch:{ all -> 0x0e1c }
            if (r6 == 0) goto L_0x0af8
            long r16 = r6.longValue()     // Catch:{ all -> 0x0e1c }
            r23 = r4
            r25 = r11
            r24 = r12
            r45 = r16
            r16 = r5
            r4 = r45
            goto L_0x0b0e
        L_0x0af8:
            com.google.android.gms.measurement.internal.n9 r6 = r47.mo34930g0()     // Catch:{ all -> 0x0e1c }
            r23 = r4
            r16 = r5
            long r4 = r8.mo34113s()     // Catch:{ all -> 0x0e1c }
            r25 = r11
            r24 = r12
            r11 = r17
            long r4 = r6.mo35150s0(r4, r11)     // Catch:{ all -> 0x0e1c }
        L_0x0b0e:
            int r4 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x0b5a
            com.google.android.gms.measurement.internal.i9 r4 = r1.f7811g     // Catch:{ all -> 0x0e1c }
            m10634Q(r4)     // Catch:{ all -> 0x0e1c }
            java.lang.String r4 = "_efs"
            r5 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.C6179i9.m10734m(r8, r4, r11)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.i9 r4 = r1.f7811g     // Catch:{ all -> 0x0e1c }
            m10634Q(r4)     // Catch:{ all -> 0x0e1c }
            long r11 = (long) r9     // Catch:{ all -> 0x0e1c }
            java.lang.Long r4 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.C6179i9.m10734m(r8, r10, r4)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.v8 r9 = r8.mo34354l()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.k4 r9 = (com.google.android.gms.internal.measurement.C5822k4) r9     // Catch:{ all -> 0x0e1c }
            r3.add(r9)     // Catch:{ all -> 0x0e1c }
            boolean r9 = r13.booleanValue()     // Catch:{ all -> 0x0e1c }
            if (r9 == 0) goto L_0x0b48
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0e1c }
            r11 = r25
            r10 = 0
            com.google.android.gms.measurement.internal.p r11 = r11.mo35175a(r10, r4, r9)     // Catch:{ all -> 0x0e1c }
            goto L_0x0b4a
        L_0x0b48:
            r11 = r25
        L_0x0b4a:
            java.lang.String r4 = r8.mo34109H()     // Catch:{ all -> 0x0e1c }
            long r9 = r8.mo34114t()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.p r9 = r11.mo35176b(r9, r14)     // Catch:{ all -> 0x0e1c }
            r2.put(r4, r9)     // Catch:{ all -> 0x0e1c }
            goto L_0x0b72
        L_0x0b5a:
            r11 = r25
            r5 = 1
            boolean r4 = r13.booleanValue()     // Catch:{ all -> 0x0e1c }
            if (r4 == 0) goto L_0x0b72
            java.lang.String r4 = r8.mo34109H()     // Catch:{ all -> 0x0e1c }
            r12 = r24
            r9 = 0
            com.google.android.gms.measurement.internal.p r10 = r11.mo35175a(r12, r9, r9)     // Catch:{ all -> 0x0e1c }
            r2.put(r4, r10)     // Catch:{ all -> 0x0e1c }
        L_0x0b72:
            r4 = r23
        L_0x0b74:
            r4.mo34384H(r7, r8)     // Catch:{ all -> 0x0e1c }
        L_0x0b77:
            int r7 = r7 + 1
            r6 = r50
            r5 = r16
            goto L_0x0892
        L_0x0b7f:
            r16 = r5
            int r5 = r3.size()     // Catch:{ all -> 0x0e1c }
            int r6 = r4.mo34402X()     // Catch:{ all -> 0x0e1c }
            if (r5 >= r6) goto L_0x0b91
            r4.mo34376C0()     // Catch:{ all -> 0x0e1c }
            r4.mo34427t0(r3)     // Catch:{ all -> 0x0e1c }
        L_0x0b91:
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0e1c }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0e1c }
        L_0x0b99:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0e1c }
            if (r3 == 0) goto L_0x0bb4
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0e1c }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j r5 = r1.f7807c     // Catch:{ all -> 0x0e1c }
            m10634Q(r5)     // Catch:{ all -> 0x0e1c }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.p r3 = (com.google.android.gms.measurement.internal.C6246p) r3     // Catch:{ all -> 0x0e1c }
            r5.mo35028r(r3)     // Catch:{ all -> 0x0e1c }
            goto L_0x0b99
        L_0x0bb4:
            r2 = r16
            goto L_0x0bb8
        L_0x0bb7:
            r2 = r5
        L_0x0bb8:
            com.google.android.gms.internal.measurement.u4 r3 = r2.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r3 = r3.mo34495N1()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j r5 = r1.f7807c     // Catch:{ all -> 0x0e1c }
            m10634Q(r5)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.u4 r5 = r5.mo35007T(r3)     // Catch:{ all -> 0x0e1c }
            if (r5 != 0) goto L_0x0be1
            com.google.android.gms.measurement.internal.l3 r5 = r47.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r5 = r5.mo35075r()     // Catch:{ all -> 0x0e1c }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.u4 r7 = r2.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r7 = r7.mo34495N1()     // Catch:{ all -> 0x0e1c }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r7)     // Catch:{ all -> 0x0e1c }
            r5.mo35038b(r6, r7)     // Catch:{ all -> 0x0e1c }
            goto L_0x0c3d
        L_0x0be1:
            int r6 = r4.mo34402X()     // Catch:{ all -> 0x0e1c }
            if (r6 <= 0) goto L_0x0c3d
            long r6 = r5.mo35338Y()     // Catch:{ all -> 0x0e1c }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0bf5
            r4.mo34400U(r6)     // Catch:{ all -> 0x0e1c }
            goto L_0x0bf8
        L_0x0bf5:
            r4.mo34382F0()     // Catch:{ all -> 0x0e1c }
        L_0x0bf8:
            long r8 = r5.mo35341a0()     // Catch:{ all -> 0x0e1c }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0c03
            goto L_0x0c04
        L_0x0c03:
            r6 = r8
        L_0x0c04:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0c0c
            r4.mo34401W(r6)     // Catch:{ all -> 0x0e1c }
            goto L_0x0c0f
        L_0x0c0c:
            r4.mo34383G0()     // Catch:{ all -> 0x0e1c }
        L_0x0c0f:
            r5.mo35348e()     // Catch:{ all -> 0x0e1c }
            long r6 = r5.mo35339Z()     // Catch:{ all -> 0x0e1c }
            int r6 = (int) r6     // Catch:{ all -> 0x0e1c }
            r4.mo34432w(r6)     // Catch:{ all -> 0x0e1c }
            long r6 = r4.mo34421q0()     // Catch:{ all -> 0x0e1c }
            r5.mo35318E(r6)     // Catch:{ all -> 0x0e1c }
            long r6 = r4.mo34420p0()     // Catch:{ all -> 0x0e1c }
            r5.mo35316C(r6)     // Catch:{ all -> 0x0e1c }
            java.lang.String r6 = r5.mo35347d0()     // Catch:{ all -> 0x0e1c }
            if (r6 == 0) goto L_0x0c32
            r4.mo34394M(r6)     // Catch:{ all -> 0x0e1c }
            goto L_0x0c35
        L_0x0c32:
            r4.mo34378D0()     // Catch:{ all -> 0x0e1c }
        L_0x0c35:
            com.google.android.gms.measurement.internal.j r6 = r1.f7807c     // Catch:{ all -> 0x0e1c }
            m10634Q(r6)     // Catch:{ all -> 0x0e1c }
            r6.mo35027q(r5)     // Catch:{ all -> 0x0e1c }
        L_0x0c3d:
            int r5 = r4.mo34402X()     // Catch:{ all -> 0x0e1c }
            if (r5 <= 0) goto L_0x0dc1
            com.google.android.gms.measurement.internal.p4 r5 = r1.f7816l     // Catch:{ all -> 0x0e1c }
            r5.mo34924d()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j4 r5 = r1.f7805a     // Catch:{ all -> 0x0e1c }
            m10634Q(r5)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.u4 r6 = r2.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r6 = r6.mo34495N1()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.y3 r5 = r5.mo35042o(r6)     // Catch:{ all -> 0x0e1c }
            r6 = -1
            if (r5 == 0) goto L_0x0c6a
            boolean r8 = r5.mo34631N()     // Catch:{ all -> 0x0e1c }
            if (r8 != 0) goto L_0x0c62
            goto L_0x0c6a
        L_0x0c62:
            long r8 = r5.mo34634y()     // Catch:{ all -> 0x0e1c }
            r4.mo34436y(r8)     // Catch:{ all -> 0x0e1c }
            goto L_0x0c91
        L_0x0c6a:
            com.google.android.gms.internal.measurement.u4 r5 = r2.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r5 = r5.mo34479E()     // Catch:{ all -> 0x0e1c }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0e1c }
            if (r5 == 0) goto L_0x0c7a
            r4.mo34436y(r6)     // Catch:{ all -> 0x0e1c }
            goto L_0x0c91
        L_0x0c7a:
            com.google.android.gms.measurement.internal.l3 r5 = r47.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r5 = r5.mo35080w()     // Catch:{ all -> 0x0e1c }
            java.lang.String r8 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.u4 r9 = r2.f7777a     // Catch:{ all -> 0x0e1c }
            java.lang.String r9 = r9.mo34495N1()     // Catch:{ all -> 0x0e1c }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r9)     // Catch:{ all -> 0x0e1c }
            r5.mo35038b(r8, r9)     // Catch:{ all -> 0x0e1c }
        L_0x0c91:
            com.google.android.gms.measurement.internal.j r5 = r1.f7807c     // Catch:{ all -> 0x0e1c }
            m10634Q(r5)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.v8 r4 = r4.mo34354l()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.internal.measurement.u4 r4 = (com.google.android.gms.internal.measurement.C5983u4) r4     // Catch:{ all -> 0x0e1c }
            r5.mo34778h()     // Catch:{ all -> 0x0e1c }
            r5.mo35406i()     // Catch:{ all -> 0x0e1c }
            p231t4.C9713p.m20275j(r4)     // Catch:{ all -> 0x0e1c }
            java.lang.String r8 = r4.mo34495N1()     // Catch:{ all -> 0x0e1c }
            p231t4.C9713p.m20271f(r8)     // Catch:{ all -> 0x0e1c }
            boolean r8 = r4.mo34501g1()     // Catch:{ all -> 0x0e1c }
            p231t4.C9713p.m20278m(r8)     // Catch:{ all -> 0x0e1c }
            r5.mo35023m()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.p4 r8 = r5.f7899a     // Catch:{ all -> 0x0e1c }
            y4.e r8 = r8.mo34922c()     // Catch:{ all -> 0x0e1c }
            long r8 = r8.mo33547a()     // Catch:{ all -> 0x0e1c }
            long r10 = r4.mo34474B1()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.p4 r12 = r5.f7899a     // Catch:{ all -> 0x0e1c }
            r12.mo35211z()     // Catch:{ all -> 0x0e1c }
            long r12 = com.google.android.gms.measurement.internal.C6147g.m10589i()     // Catch:{ all -> 0x0e1c }
            long r12 = r8 - r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x0ce5
            long r10 = r4.mo34474B1()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.p4 r12 = r5.f7899a     // Catch:{ all -> 0x0e1c }
            r12.mo35211z()     // Catch:{ all -> 0x0e1c }
            long r12 = com.google.android.gms.measurement.internal.C6147g.m10589i()     // Catch:{ all -> 0x0e1c }
            long r12 = r12 + r8
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0d08
        L_0x0ce5:
            com.google.android.gms.measurement.internal.p4 r10 = r5.f7899a     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.l3 r10 = r10.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r10 = r10.mo35080w()     // Catch:{ all -> 0x0e1c }
            java.lang.String r11 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            java.lang.String r12 = r4.mo34495N1()     // Catch:{ all -> 0x0e1c }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r12)     // Catch:{ all -> 0x0e1c }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0e1c }
            long r13 = r4.mo34474B1()     // Catch:{ all -> 0x0e1c }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0e1c }
            r10.mo35040d(r11, r12, r8, r9)     // Catch:{ all -> 0x0e1c }
        L_0x0d08:
            byte[] r8 = r4.mo34044j()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.g9 r9 = r5.f8374b     // Catch:{ IOException -> 0x0da8 }
            com.google.android.gms.measurement.internal.i9 r9 = r9.f7811g     // Catch:{ IOException -> 0x0da8 }
            m10634Q(r9)     // Catch:{ IOException -> 0x0da8 }
            byte[] r8 = r9.mo34996Q(r8)     // Catch:{ IOException -> 0x0da8 }
            com.google.android.gms.measurement.internal.p4 r9 = r5.f7899a     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.l3 r9 = r9.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r9 = r9.mo35079v()     // Catch:{ all -> 0x0e1c }
            java.lang.String r10 = "Saving bundle, size"
            int r11 = r8.length     // Catch:{ all -> 0x0e1c }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0e1c }
            r9.mo35038b(r10, r11)     // Catch:{ all -> 0x0e1c }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0e1c }
            r9.<init>()     // Catch:{ all -> 0x0e1c }
            java.lang.String r10 = "app_id"
            java.lang.String r11 = r4.mo34495N1()     // Catch:{ all -> 0x0e1c }
            r9.put(r10, r11)     // Catch:{ all -> 0x0e1c }
            java.lang.String r10 = "bundle_end_timestamp"
            long r11 = r4.mo34474B1()     // Catch:{ all -> 0x0e1c }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0e1c }
            r9.put(r10, r11)     // Catch:{ all -> 0x0e1c }
            java.lang.String r10 = "data"
            r9.put(r10, r8)     // Catch:{ all -> 0x0e1c }
            java.lang.String r8 = "has_realtime"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x0e1c }
            r9.put(r8, r10)     // Catch:{ all -> 0x0e1c }
            boolean r8 = r4.mo34507m1()     // Catch:{ all -> 0x0e1c }
            if (r8 == 0) goto L_0x0d67
            java.lang.String r8 = "retry_count"
            int r10 = r4.mo34516u1()     // Catch:{ all -> 0x0e1c }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0e1c }
            r9.put(r8, r10)     // Catch:{ all -> 0x0e1c }
        L_0x0d67:
            android.database.sqlite.SQLiteDatabase r8 = r5.mo35005R()     // Catch:{ SQLiteException -> 0x0d8e }
            java.lang.String r10 = "queue"
            r11 = 0
            long r8 = r8.insert(r10, r11, r9)     // Catch:{ SQLiteException -> 0x0d8e }
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0dc1
            com.google.android.gms.measurement.internal.p4 r6 = r5.f7899a     // Catch:{ SQLiteException -> 0x0d8e }
            com.google.android.gms.measurement.internal.l3 r6 = r6.mo34920b()     // Catch:{ SQLiteException -> 0x0d8e }
            com.google.android.gms.measurement.internal.j3 r6 = r6.mo35075r()     // Catch:{ SQLiteException -> 0x0d8e }
            java.lang.String r7 = "Failed to insert bundle (got -1). appId"
            java.lang.String r8 = r4.mo34495N1()     // Catch:{ SQLiteException -> 0x0d8e }
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r8)     // Catch:{ SQLiteException -> 0x0d8e }
            r6.mo35038b(r7, r8)     // Catch:{ SQLiteException -> 0x0d8e }
            goto L_0x0dc1
        L_0x0d8e:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.p4 r5 = r5.f7899a     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.l3 r5 = r5.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r5 = r5.mo35075r()     // Catch:{ all -> 0x0e1c }
            java.lang.String r7 = "Error storing bundle. appId"
            java.lang.String r4 = r4.mo34495N1()     // Catch:{ all -> 0x0e1c }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r4)     // Catch:{ all -> 0x0e1c }
            r5.mo35039c(r7, r4, r6)     // Catch:{ all -> 0x0e1c }
            goto L_0x0dc1
        L_0x0da8:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.p4 r5 = r5.f7899a     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.l3 r5 = r5.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r5 = r5.mo35075r()     // Catch:{ all -> 0x0e1c }
            java.lang.String r7 = "Data loss. Failed to serialize bundle. appId"
            java.lang.String r4 = r4.mo34495N1()     // Catch:{ all -> 0x0e1c }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r4)     // Catch:{ all -> 0x0e1c }
            r5.mo35039c(r7, r4, r6)     // Catch:{ all -> 0x0e1c }
        L_0x0dc1:
            com.google.android.gms.measurement.internal.j r4 = r1.f7807c     // Catch:{ all -> 0x0e1c }
            m10634Q(r4)     // Catch:{ all -> 0x0e1c }
            java.util.List<java.lang.Long> r2 = r2.f7778b     // Catch:{ all -> 0x0e1c }
            r4.mo35020h0(r2)     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c     // Catch:{ all -> 0x0e1c }
            m10634Q(r2)     // Catch:{ all -> 0x0e1c }
            android.database.sqlite.SQLiteDatabase r4 = r2.mo35005R()     // Catch:{ all -> 0x0e1c }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0de3 }
            r6 = 0
            r5[r6] = r3     // Catch:{ SQLiteException -> 0x0de3 }
            r6 = 1
            r5[r6] = r3     // Catch:{ SQLiteException -> 0x0de3 }
            java.lang.String r6 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r4.execSQL(r6, r5)     // Catch:{ SQLiteException -> 0x0de3 }
            goto L_0x0df8
        L_0x0de3:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ all -> 0x0e1c }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r3)     // Catch:{ all -> 0x0e1c }
            r2.mo35039c(r5, r3, r4)     // Catch:{ all -> 0x0e1c }
        L_0x0df8:
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c     // Catch:{ all -> 0x0e1c }
            m10634Q(r2)     // Catch:{ all -> 0x0e1c }
            r2.mo35026p()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c
            m10634Q(r2)
            r2.mo35021i0()
            r2 = 1
            return r2
        L_0x0e0a:
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c     // Catch:{ all -> 0x0e1c }
            m10634Q(r2)     // Catch:{ all -> 0x0e1c }
            r2.mo35026p()     // Catch:{ all -> 0x0e1c }
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c
            m10634Q(r2)
            r2.mo35021i0()
            r2 = 0
            return r2
        L_0x0e1c:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.j r3 = r1.f7807c
            m10634Q(r3)
            r3.mo35021i0()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6157g9.m10631N(java.lang.String, long):boolean");
    }

    /* renamed from: O */
    private final boolean m10632O() {
        mo34919a().mo34778h();
        mo34929g();
        C6180j jVar = this.f7807c;
        m10634Q(jVar);
        if (jVar.mo35030t()) {
            return true;
        }
        C6180j jVar2 = this.f7807c;
        m10634Q(jVar2);
        if (!TextUtils.isEmpty(jVar2.mo35014b0())) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    private final boolean m10633P(C5805j4 j4Var, C5805j4 j4Var2) {
        String str;
        C9713p.m20266a("_e".equals(j4Var.mo34109H()));
        m10634Q(this.f7811g);
        C5887o4 o = C6179i9.m10736o((C5822k4) j4Var.mo34354l(), "_sc");
        String str2 = null;
        if (o == null) {
            str = null;
        } else {
            str = o.mo34241E();
        }
        m10634Q(this.f7811g);
        C5887o4 o2 = C6179i9.m10736o((C5822k4) j4Var2.mo34354l(), "_pc");
        if (o2 != null) {
            str2 = o2.mo34241E();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        m10628K(j4Var, j4Var2);
        return true;
    }

    /* renamed from: Q */
    private static final C6343x8 m10634Q(C6343x8 x8Var) {
        if (x8Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (x8Var.mo35408k()) {
            return x8Var;
        } else {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(x8Var.getClass())));
        }
    }

    /* renamed from: e0 */
    public static C6157g9 m10636e0(Context context) {
        C9713p.m20275j(context);
        C9713p.m20275j(context.getApplicationContext());
        if (f7802C == null) {
            synchronized (C6157g9.class) {
                if (f7802C == null) {
                    f7802C = new C6157g9((C6168h9) C9713p.m20275j(new C6168h9(context)), (C6251p4) null);
                }
            }
        }
        return f7802C;
    }

    /* renamed from: j0 */
    static /* bridge */ /* synthetic */ void m10637j0(C6157g9 g9Var, C6168h9 h9Var) {
        g9Var.mo34919a().mo34778h();
        g9Var.f7815k = new C6108c4(g9Var);
        C6180j jVar = new C6180j(g9Var);
        jVar.mo35407j();
        g9Var.f7807c = jVar;
        g9Var.mo34912T().mo34895z((C6136f) C9713p.m20275j(g9Var.f7805a));
        C6134e8 e8Var = new C6134e8(g9Var);
        e8Var.mo35407j();
        g9Var.f7813i = e8Var;
        C6091aa aaVar = new C6091aa(g9Var);
        aaVar.mo35407j();
        g9Var.f7810f = aaVar;
        C6308u6 u6Var = new C6308u6(g9Var);
        u6Var.mo35407j();
        g9Var.f7812h = u6Var;
        C6321v8 v8Var = new C6321v8(g9Var);
        v8Var.mo35407j();
        g9Var.f7809e = v8Var;
        g9Var.f7808d = new C6283s3(g9Var);
        if (g9Var.f7821q != g9Var.f7822r) {
            g9Var.mo34920b().mo35075r().mo35039c("Not all upload components initialized", Integer.valueOf(g9Var.f7821q), Integer.valueOf(g9Var.f7822r));
        }
        g9Var.f7817m = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v15, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: type inference failed for: r9v17 */
    /* JADX WARNING: type inference failed for: r9v18 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:214|215) */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0211, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0212, code lost:
        r8.f7899a.mo34920b().mo35075r().mo35039c("Failed to merge queued bundle. appId", com.google.android.gms.measurement.internal.C6206l3.m10862z(r6), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x026b, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
        r0 = r0.subList(0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02f9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02fa, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:?, code lost:
        mo34920b().mo35075r().mo35039c("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.C6206l3.m10862z(r6), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04e8, code lost:
        if (r3 != null) goto L_0x04c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0511, code lost:
        r1.f7825u = r2;
        m10626I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0516, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0126, code lost:
        if (r11 != null) goto L_0x0108;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:214:0x046e */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0294 A[SYNTHETIC, Splitter:B:142:0x0294] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x029d A[Catch:{ all -> 0x03af, all -> 0x050c }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0485 A[Catch:{ all -> 0x03af, all -> 0x050c }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0508 A[SYNTHETIC, Splitter:B:250:0x0508] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0130 A[Catch:{ all -> 0x012c, all -> 0x050f }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:170:0x0300=Splitter:B:170:0x0300, B:129:0x0268=Splitter:B:129:0x0268, B:228:0x04c9=Splitter:B:228:0x04c9, B:139:0x027b=Splitter:B:139:0x027b, B:240:0x04eb=Splitter:B:240:0x04eb, B:214:0x046e=Splitter:B:214:0x046e} */
    @androidx.annotation.WorkerThread
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34906A() {
        /*
            r22 = this;
            r1 = r22
            com.google.android.gms.measurement.internal.n4 r0 = r22.mo34919a()
            r0.mo34778h()
            r22.mo34929g()
            r2 = 1
            r1.f7825u = r2
            r3 = 0
            com.google.android.gms.measurement.internal.p4 r0 = r1.f7816l     // Catch:{ all -> 0x050f }
            r0.mo34924d()     // Catch:{ all -> 0x050f }
            com.google.android.gms.measurement.internal.p4 r0 = r1.f7816l     // Catch:{ all -> 0x050f }
            com.google.android.gms.measurement.internal.d8 r0 = r0.mo35189L()     // Catch:{ all -> 0x050f }
            java.lang.Boolean r0 = r0.mo34820J()     // Catch:{ all -> 0x050f }
            if (r0 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.l3 r0 = r22.mo34920b()     // Catch:{ all -> 0x050f }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35080w()     // Catch:{ all -> 0x050f }
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            r0.mo35037a(r2)     // Catch:{ all -> 0x050f }
            r1.f7825u = r3
        L_0x0030:
            r22.m10626I()
            return
        L_0x0034:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x050f }
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.measurement.internal.l3 r0 = r22.mo34920b()     // Catch:{ all -> 0x050f }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35075r()     // Catch:{ all -> 0x050f }
            java.lang.String r2 = "Upload called in the client side when service should be used"
            r0.mo35037a(r2)     // Catch:{ all -> 0x050f }
            r1.f7825u = r3
            goto L_0x0030
        L_0x004a:
            long r4 = r1.f7819o     // Catch:{ all -> 0x050f }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0058
            r22.m10629L()     // Catch:{ all -> 0x050f }
            r1.f7825u = r3
            goto L_0x0030
        L_0x0058:
            com.google.android.gms.measurement.internal.n4 r0 = r22.mo34919a()     // Catch:{ all -> 0x050f }
            r0.mo34778h()     // Catch:{ all -> 0x050f }
            java.util.List<java.lang.Long> r0 = r1.f7828x     // Catch:{ all -> 0x050f }
            if (r0 == 0) goto L_0x0073
            com.google.android.gms.measurement.internal.l3 r0 = r22.mo34920b()     // Catch:{ all -> 0x050f }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35079v()     // Catch:{ all -> 0x050f }
            java.lang.String r2 = "Uploading requested multiple times"
            r0.mo35037a(r2)     // Catch:{ all -> 0x050f }
            r1.f7825u = r3
            goto L_0x0030
        L_0x0073:
            com.google.android.gms.measurement.internal.q3 r0 = r1.f7806b     // Catch:{ all -> 0x050f }
            m10634Q(r0)     // Catch:{ all -> 0x050f }
            boolean r0 = r0.mo35219m()     // Catch:{ all -> 0x050f }
            if (r0 != 0) goto L_0x0091
            com.google.android.gms.measurement.internal.l3 r0 = r22.mo34920b()     // Catch:{ all -> 0x050f }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35079v()     // Catch:{ all -> 0x050f }
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.mo35037a(r2)     // Catch:{ all -> 0x050f }
            r22.m10629L()     // Catch:{ all -> 0x050f }
            r1.f7825u = r3
            goto L_0x0030
        L_0x0091:
            y4.e r0 = r22.mo34922c()     // Catch:{ all -> 0x050f }
            long r4 = r0.mo33547a()     // Catch:{ all -> 0x050f }
            com.google.android.gms.measurement.internal.g r0 = r22.mo34912T()     // Catch:{ all -> 0x050f }
            com.google.android.gms.measurement.internal.z2<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C6084a3.f7559R     // Catch:{ all -> 0x050f }
            r9 = 0
            int r0 = r0.mo34884o(r9, r8)     // Catch:{ all -> 0x050f }
            r22.mo34912T()     // Catch:{ all -> 0x050f }
            long r10 = com.google.android.gms.measurement.internal.C6147g.m10588I()     // Catch:{ all -> 0x050f }
            long r10 = r4 - r10
            r8 = r3
        L_0x00ae:
            if (r8 >= r0) goto L_0x00b9
            boolean r12 = r1.m10631N(r9, r10)     // Catch:{ all -> 0x050f }
            if (r12 == 0) goto L_0x00b9
            int r8 = r8 + 1
            goto L_0x00ae
        L_0x00b9:
            com.google.android.gms.measurement.internal.e8 r0 = r1.f7813i     // Catch:{ all -> 0x050f }
            com.google.android.gms.measurement.internal.v3 r0 = r0.f7754i     // Catch:{ all -> 0x050f }
            long r10 = r0.mo35384a()     // Catch:{ all -> 0x050f }
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00dc
            com.google.android.gms.measurement.internal.l3 r0 = r22.mo34920b()     // Catch:{ all -> 0x050f }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35074q()     // Catch:{ all -> 0x050f }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r4 - r10
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x050f }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x050f }
            r0.mo35038b(r6, r7)     // Catch:{ all -> 0x050f }
        L_0x00dc:
            com.google.android.gms.measurement.internal.j r0 = r1.f7807c     // Catch:{ all -> 0x050f }
            m10634Q(r0)     // Catch:{ all -> 0x050f }
            java.lang.String r6 = r0.mo35014b0()     // Catch:{ all -> 0x050f }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x050f }
            r7 = -1
            if (r0 != 0) goto L_0x0489
            long r10 = r1.f7830z     // Catch:{ all -> 0x050f }
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0134
            com.google.android.gms.measurement.internal.j r10 = r1.f7807c     // Catch:{ all -> 0x050f }
            m10634Q(r10)     // Catch:{ all -> 0x050f }
            android.database.sqlite.SQLiteDatabase r0 = r10.mo35005R()     // Catch:{ SQLiteException -> 0x0115, all -> 0x0113 }
            java.lang.String r11 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r11 = r0.rawQuery(r11, r9)     // Catch:{ SQLiteException -> 0x0115, all -> 0x0113 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0111 }
            if (r0 != 0) goto L_0x010c
        L_0x0108:
            r11.close()     // Catch:{ all -> 0x050f }
            goto L_0x0129
        L_0x010c:
            long r7 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0111 }
            goto L_0x0108
        L_0x0111:
            r0 = move-exception
            goto L_0x0117
        L_0x0113:
            r0 = move-exception
            goto L_0x012e
        L_0x0115:
            r0 = move-exception
            r11 = r9
        L_0x0117:
            com.google.android.gms.measurement.internal.p4 r10 = r10.f7899a     // Catch:{ all -> 0x012c }
            com.google.android.gms.measurement.internal.l3 r10 = r10.mo34920b()     // Catch:{ all -> 0x012c }
            com.google.android.gms.measurement.internal.j3 r10 = r10.mo35075r()     // Catch:{ all -> 0x012c }
            java.lang.String r12 = "Error querying raw events"
            r10.mo35038b(r12, r0)     // Catch:{ all -> 0x012c }
            if (r11 == 0) goto L_0x0129
            goto L_0x0108
        L_0x0129:
            r1.f7830z = r7     // Catch:{ all -> 0x050f }
            goto L_0x0134
        L_0x012c:
            r0 = move-exception
            r9 = r11
        L_0x012e:
            if (r9 == 0) goto L_0x0133
            r9.close()     // Catch:{ all -> 0x050f }
        L_0x0133:
            throw r0     // Catch:{ all -> 0x050f }
        L_0x0134:
            com.google.android.gms.measurement.internal.g r0 = r22.mo34912T()     // Catch:{ all -> 0x050f }
            com.google.android.gms.measurement.internal.z2<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C6084a3.f7582h     // Catch:{ all -> 0x050f }
            int r0 = r0.mo34884o(r6, r7)     // Catch:{ all -> 0x050f }
            com.google.android.gms.measurement.internal.g r7 = r22.mo34912T()     // Catch:{ all -> 0x050f }
            com.google.android.gms.measurement.internal.z2<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C6084a3.f7584i     // Catch:{ all -> 0x050f }
            int r7 = r7.mo34884o(r6, r8)     // Catch:{ all -> 0x050f }
            int r7 = java.lang.Math.max(r3, r7)     // Catch:{ all -> 0x050f }
            com.google.android.gms.measurement.internal.j r8 = r1.f7807c     // Catch:{ all -> 0x050f }
            m10634Q(r8)     // Catch:{ all -> 0x050f }
            r8.mo34778h()     // Catch:{ all -> 0x050f }
            r8.mo35406i()     // Catch:{ all -> 0x050f }
            if (r0 <= 0) goto L_0x015b
            r10 = r2
            goto L_0x015c
        L_0x015b:
            r10 = r3
        L_0x015c:
            p231t4.C9713p.m20266a(r10)     // Catch:{ all -> 0x050f }
            if (r7 <= 0) goto L_0x0163
            r10 = r2
            goto L_0x0164
        L_0x0163:
            r10 = r3
        L_0x0164:
            p231t4.C9713p.m20266a(r10)     // Catch:{ all -> 0x050f }
            p231t4.C9713p.m20271f(r6)     // Catch:{ all -> 0x050f }
            android.database.sqlite.SQLiteDatabase r11 = r8.mo35005R()     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            java.lang.String r12 = "rowid"
            java.lang.String r13 = "data"
            java.lang.String r14 = "retry_count"
            java.lang.String[] r13 = new java.lang.String[]{r12, r13, r14}     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            r15[r3] = r6     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            java.lang.String r12 = "queue"
            java.lang.String r14 = "app_id=?"
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x026f }
            if (r0 != 0) goto L_0x019f
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x026f }
            r11.close()     // Catch:{ all -> 0x050f }
            r20 = r4
            goto L_0x0297
        L_0x019f:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x026f }
            r12.<init>()     // Catch:{ SQLiteException -> 0x026f }
            r13 = r3
        L_0x01a5:
            long r14 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x026f }
            byte[] r0 = r11.getBlob(r2)     // Catch:{ IOException -> 0x0242 }
            com.google.android.gms.measurement.internal.g9 r2 = r8.f8374b     // Catch:{ IOException -> 0x0242 }
            com.google.android.gms.measurement.internal.i9 r2 = r2.f7811g     // Catch:{ IOException -> 0x0242 }
            m10634Q(r2)     // Catch:{ IOException -> 0x0242 }
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x022d }
            r9.<init>(r0)     // Catch:{ IOException -> 0x022d }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x022d }
            r0.<init>(r9)     // Catch:{ IOException -> 0x022d }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x022d }
            r3.<init>()     // Catch:{ IOException -> 0x022d }
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x022d }
            r20 = r4
        L_0x01c9:
            int r4 = r0.read(r10)     // Catch:{ IOException -> 0x022b }
            if (r4 > 0) goto L_0x0226
            r0.close()     // Catch:{ IOException -> 0x022b }
            r9.close()     // Catch:{ IOException -> 0x022b }
            byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x022b }
            boolean r2 = r12.isEmpty()     // Catch:{ SQLiteException -> 0x026d }
            if (r2 != 0) goto L_0x01e5
            int r2 = r0.length     // Catch:{ SQLiteException -> 0x026d }
            int r2 = r2 + r13
            if (r2 <= r7) goto L_0x01e5
            goto L_0x0268
        L_0x01e5:
            com.google.android.gms.internal.measurement.t4 r2 = com.google.android.gms.internal.measurement.C5983u4.m10013J1()     // Catch:{ IOException -> 0x0211 }
            com.google.android.gms.internal.measurement.x9 r2 = com.google.android.gms.measurement.internal.C6179i9.m10729D(r2, r0)     // Catch:{ IOException -> 0x0211 }
            com.google.android.gms.internal.measurement.t4 r2 = (com.google.android.gms.internal.measurement.C5967t4) r2     // Catch:{ IOException -> 0x0211 }
            r3 = 2
            boolean r4 = r11.isNull(r3)     // Catch:{ SQLiteException -> 0x026d }
            if (r4 != 0) goto L_0x01fd
            int r4 = r11.getInt(r3)     // Catch:{ SQLiteException -> 0x026d }
            r2.mo34405a0(r4)     // Catch:{ SQLiteException -> 0x026d }
        L_0x01fd:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x026d }
            int r13 = r13 + r0
            com.google.android.gms.internal.measurement.v8 r0 = r2.mo34354l()     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.internal.measurement.u4 r0 = (com.google.android.gms.internal.measurement.C5983u4) r0     // Catch:{ SQLiteException -> 0x026d }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x026d }
            android.util.Pair r0 = android.util.Pair.create(r0, r2)     // Catch:{ SQLiteException -> 0x026d }
            r12.add(r0)     // Catch:{ SQLiteException -> 0x026d }
            goto L_0x0258
        L_0x0211:
            r0 = move-exception
            com.google.android.gms.measurement.internal.p4 r2 = r8.f7899a     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ SQLiteException -> 0x026d }
            java.lang.String r3 = "Failed to merge queued bundle. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r6)     // Catch:{ SQLiteException -> 0x026d }
            r2.mo35039c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x026d }
            goto L_0x0258
        L_0x0226:
            r5 = 0
            r3.write(r10, r5, r4)     // Catch:{ IOException -> 0x022b }
            goto L_0x01c9
        L_0x022b:
            r0 = move-exception
            goto L_0x0230
        L_0x022d:
            r0 = move-exception
            r20 = r4
        L_0x0230:
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a     // Catch:{ IOException -> 0x0240 }
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()     // Catch:{ IOException -> 0x0240 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ IOException -> 0x0240 }
            java.lang.String r3 = "Failed to ungzip content"
            r2.mo35038b(r3, r0)     // Catch:{ IOException -> 0x0240 }
            throw r0     // Catch:{ IOException -> 0x0240 }
        L_0x0240:
            r0 = move-exception
            goto L_0x0245
        L_0x0242:
            r0 = move-exception
            r20 = r4
        L_0x0245:
            com.google.android.gms.measurement.internal.p4 r2 = r8.f7899a     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ SQLiteException -> 0x026d }
            java.lang.String r3 = "Failed to unzip queued bundle. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r6)     // Catch:{ SQLiteException -> 0x026d }
            r2.mo35039c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x026d }
        L_0x0258:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x026d }
            if (r0 == 0) goto L_0x0268
            if (r13 <= r7) goto L_0x0261
            goto L_0x0268
        L_0x0261:
            r4 = r20
            r2 = 1
            r3 = 0
            r9 = 0
            goto L_0x01a5
        L_0x0268:
            r11.close()     // Catch:{ all -> 0x050c }
            r0 = r12
            goto L_0x0297
        L_0x026d:
            r0 = move-exception
            goto L_0x027b
        L_0x026f:
            r0 = move-exception
            r20 = r4
            goto L_0x027b
        L_0x0273:
            r0 = move-exception
            r9 = 0
            goto L_0x0483
        L_0x0277:
            r0 = move-exception
            r20 = r4
            r11 = 0
        L_0x027b:
            com.google.android.gms.measurement.internal.p4 r2 = r8.f7899a     // Catch:{ all -> 0x0481 }
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()     // Catch:{ all -> 0x0481 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ all -> 0x0481 }
            java.lang.String r3 = "Error querying bundles. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r6)     // Catch:{ all -> 0x0481 }
            r2.mo35039c(r3, r4, r0)     // Catch:{ all -> 0x0481 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0481 }
            if (r11 == 0) goto L_0x0297
            r11.close()     // Catch:{ all -> 0x050c }
        L_0x0297:
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x050c }
            if (r2 != 0) goto L_0x04ff
            q5.a r2 = r1.mo34913U(r6)     // Catch:{ all -> 0x050c }
            boolean r2 = r2.mo43553j()     // Catch:{ all -> 0x050c }
            if (r2 == 0) goto L_0x0300
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x050c }
        L_0x02ab:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x050c }
            if (r3 == 0) goto L_0x02ca
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x050c }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x050c }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x050c }
            com.google.android.gms.internal.measurement.u4 r3 = (com.google.android.gms.internal.measurement.C5983u4) r3     // Catch:{ all -> 0x050c }
            java.lang.String r4 = r3.mo34488J()     // Catch:{ all -> 0x050c }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x050c }
            if (r4 != 0) goto L_0x02ab
            java.lang.String r2 = r3.mo34488J()     // Catch:{ all -> 0x050c }
            goto L_0x02cb
        L_0x02ca:
            r2 = 0
        L_0x02cb:
            if (r2 == 0) goto L_0x0300
            r3 = 0
        L_0x02ce:
            int r4 = r0.size()     // Catch:{ all -> 0x050c }
            if (r3 >= r4) goto L_0x0300
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x050c }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x050c }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x050c }
            com.google.android.gms.internal.measurement.u4 r4 = (com.google.android.gms.internal.measurement.C5983u4) r4     // Catch:{ all -> 0x050c }
            java.lang.String r5 = r4.mo34488J()     // Catch:{ all -> 0x050c }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x050c }
            if (r5 == 0) goto L_0x02e9
            goto L_0x02fd
        L_0x02e9:
            java.lang.String r4 = r4.mo34488J()     // Catch:{ all -> 0x050c }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x050c }
            if (r4 != 0) goto L_0x02fd
            r4 = 0
            java.util.List r0 = r0.subList(r4, r3)     // Catch:{ all -> 0x02f9 }
            goto L_0x0300
        L_0x02f9:
            r0 = move-exception
            r2 = r4
            goto L_0x0511
        L_0x02fd:
            int r3 = r3 + 1
            goto L_0x02ce
        L_0x0300:
            com.google.android.gms.internal.measurement.r4 r2 = com.google.android.gms.internal.measurement.C5951s4.m9862w()     // Catch:{ all -> 0x050c }
            int r3 = r0.size()     // Catch:{ all -> 0x050c }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x050c }
            int r5 = r0.size()     // Catch:{ all -> 0x050c }
            r4.<init>(r5)     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.g r5 = r22.mo34912T()     // Catch:{ all -> 0x050c }
            boolean r5 = r5.mo34874C(r6)     // Catch:{ all -> 0x050c }
            if (r5 == 0) goto L_0x0327
            q5.a r5 = r1.mo34913U(r6)     // Catch:{ all -> 0x050c }
            boolean r5 = r5.mo43553j()     // Catch:{ all -> 0x050c }
            if (r5 == 0) goto L_0x0327
            r5 = 1
            goto L_0x0328
        L_0x0327:
            r5 = 0
        L_0x0328:
            q5.a r7 = r1.mo34913U(r6)     // Catch:{ all -> 0x050c }
            boolean r7 = r7.mo43553j()     // Catch:{ all -> 0x050c }
            q5.a r8 = r1.mo34913U(r6)     // Catch:{ all -> 0x050c }
            boolean r8 = r8.mo43554k()     // Catch:{ all -> 0x050c }
            r9 = 0
        L_0x0339:
            if (r9 >= r3) goto L_0x03b3
            java.lang.Object r10 = r0.get(r9)     // Catch:{ all -> 0x050c }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x050c }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x050c }
            com.google.android.gms.internal.measurement.u4 r10 = (com.google.android.gms.internal.measurement.C5983u4) r10     // Catch:{ all -> 0x050c }
            com.google.android.gms.internal.measurement.s8 r10 = r10.mo34557q()     // Catch:{ all -> 0x050c }
            com.google.android.gms.internal.measurement.t4 r10 = (com.google.android.gms.internal.measurement.C5967t4) r10     // Catch:{ all -> 0x050c }
            java.lang.Object r11 = r0.get(r9)     // Catch:{ all -> 0x050c }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ all -> 0x050c }
            java.lang.Object r11 = r11.second     // Catch:{ all -> 0x050c }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x050c }
            r4.add(r11)     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.g r11 = r22.mo34912T()     // Catch:{ all -> 0x050c }
            r11.mo34886q()     // Catch:{ all -> 0x050c }
            r11 = 46000(0xb3b0, double:2.2727E-319)
            r10.mo34410f0(r11)     // Catch:{ all -> 0x050c }
            r11 = r20
            r10.mo34409e0(r11)     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.p4 r13 = r1.f7816l     // Catch:{ all -> 0x050c }
            r13.mo34924d()     // Catch:{ all -> 0x050c }
            r13 = 0
            r10.mo34406b0(r13)     // Catch:{ all -> 0x03af }
            if (r5 != 0) goto L_0x0378
            r10.mo34374B0()     // Catch:{ all -> 0x050c }
        L_0x0378:
            if (r7 != 0) goto L_0x0380
            r10.mo34385H0()     // Catch:{ all -> 0x050c }
            r10.mo34380E0()     // Catch:{ all -> 0x050c }
        L_0x0380:
            if (r8 != 0) goto L_0x0385
            r10.mo34439z0()     // Catch:{ all -> 0x050c }
        L_0x0385:
            com.google.android.gms.measurement.internal.g r13 = r22.mo34912T()     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.C6084a3.f7565X     // Catch:{ all -> 0x050c }
            boolean r13 = r13.mo34873B(r6, r14)     // Catch:{ all -> 0x050c }
            if (r13 == 0) goto L_0x03a7
            com.google.android.gms.internal.measurement.v8 r13 = r10.mo34354l()     // Catch:{ all -> 0x050c }
            com.google.android.gms.internal.measurement.u4 r13 = (com.google.android.gms.internal.measurement.C5983u4) r13     // Catch:{ all -> 0x050c }
            byte[] r13 = r13.mo34044j()     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.i9 r14 = r1.f7811g     // Catch:{ all -> 0x050c }
            m10634Q(r14)     // Catch:{ all -> 0x050c }
            long r13 = r14.mo34997y(r13)     // Catch:{ all -> 0x050c }
            r10.mo34434x(r13)     // Catch:{ all -> 0x050c }
        L_0x03a7:
            r2.mo34313r(r10)     // Catch:{ all -> 0x050c }
            int r9 = r9 + 1
            r20 = r11
            goto L_0x0339
        L_0x03af:
            r0 = move-exception
            r2 = r13
            goto L_0x0511
        L_0x03b3:
            r11 = r20
            com.google.android.gms.measurement.internal.l3 r0 = r22.mo34920b()     // Catch:{ all -> 0x050c }
            java.lang.String r0 = r0.mo35072C()     // Catch:{ all -> 0x050c }
            r5 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x050c }
            if (r0 == 0) goto L_0x03d4
            com.google.android.gms.measurement.internal.i9 r0 = r1.f7811g     // Catch:{ all -> 0x050c }
            m10634Q(r0)     // Catch:{ all -> 0x050c }
            com.google.android.gms.internal.measurement.v8 r5 = r2.mo34354l()     // Catch:{ all -> 0x050c }
            com.google.android.gms.internal.measurement.s4 r5 = (com.google.android.gms.internal.measurement.C5951s4) r5     // Catch:{ all -> 0x050c }
            java.lang.String r0 = r0.mo34988E(r5)     // Catch:{ all -> 0x050c }
            goto L_0x03d5
        L_0x03d4:
            r0 = 0
        L_0x03d5:
            com.google.android.gms.measurement.internal.i9 r5 = r1.f7811g     // Catch:{ all -> 0x050c }
            m10634Q(r5)     // Catch:{ all -> 0x050c }
            com.google.android.gms.internal.measurement.v8 r5 = r2.mo34354l()     // Catch:{ all -> 0x050c }
            com.google.android.gms.internal.measurement.s4 r5 = (com.google.android.gms.internal.measurement.C5951s4) r5     // Catch:{ all -> 0x050c }
            byte[] r14 = r5.mo34044j()     // Catch:{ all -> 0x050c }
            r22.mo34912T()     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.z2<java.lang.String> r5 = com.google.android.gms.measurement.internal.C6084a3.f7602r     // Catch:{ all -> 0x050c }
            r9 = 0
            java.lang.Object r5 = r5.mo35421a(r9)     // Catch:{ all -> 0x050c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x050c }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x046e }
            r13.<init>(r5)     // Catch:{ MalformedURLException -> 0x046e }
            boolean r7 = r4.isEmpty()     // Catch:{ MalformedURLException -> 0x046e }
            r8 = 1
            r7 = r7 ^ r8
            p231t4.C9713p.m20266a(r7)     // Catch:{ MalformedURLException -> 0x046e }
            java.util.List<java.lang.Long> r7 = r1.f7828x     // Catch:{ MalformedURLException -> 0x046e }
            if (r7 == 0) goto L_0x0410
            com.google.android.gms.measurement.internal.l3 r4 = r22.mo34920b()     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.j3 r4 = r4.mo35075r()     // Catch:{ MalformedURLException -> 0x046e }
            java.lang.String r7 = "Set uploading progress before finishing the previous upload"
            r4.mo35037a(r7)     // Catch:{ MalformedURLException -> 0x046e }
            goto L_0x0417
        L_0x0410:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x046e }
            r7.<init>(r4)     // Catch:{ MalformedURLException -> 0x046e }
            r1.f7828x = r7     // Catch:{ MalformedURLException -> 0x046e }
        L_0x0417:
            com.google.android.gms.measurement.internal.e8 r4 = r1.f7813i     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.v3 r4 = r4.f7755j     // Catch:{ MalformedURLException -> 0x046e }
            r4.mo35385b(r11)     // Catch:{ MalformedURLException -> 0x046e }
            java.lang.String r4 = "?"
            if (r3 <= 0) goto L_0x042b
            r3 = 0
            com.google.android.gms.internal.measurement.u4 r2 = r2.mo34314s(r3)     // Catch:{  }
            java.lang.String r4 = r2.mo34495N1()     // Catch:{ MalformedURLException -> 0x046e }
        L_0x042b:
            com.google.android.gms.measurement.internal.l3 r2 = r22.mo34920b()     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35079v()     // Catch:{ MalformedURLException -> 0x046e }
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            int r7 = r14.length     // Catch:{ MalformedURLException -> 0x046e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ MalformedURLException -> 0x046e }
            r2.mo35040d(r3, r4, r7, r0)     // Catch:{ MalformedURLException -> 0x046e }
            r2 = 1
            r1.f7824t = r2     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.q3 r11 = r1.f7806b     // Catch:{ MalformedURLException -> 0x046e }
            m10634Q(r11)     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.a9 r0 = new com.google.android.gms.measurement.internal.a9     // Catch:{ MalformedURLException -> 0x046e }
            r0.<init>(r1, r6)     // Catch:{ MalformedURLException -> 0x046e }
            r11.mo34778h()     // Catch:{ MalformedURLException -> 0x046e }
            r11.mo35406i()     // Catch:{ MalformedURLException -> 0x046e }
            p231t4.C9713p.m20275j(r13)     // Catch:{ MalformedURLException -> 0x046e }
            p231t4.C9713p.m20275j(r14)     // Catch:{ MalformedURLException -> 0x046e }
            p231t4.C9713p.m20275j(r0)     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.p4 r2 = r11.f7899a     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.n4 r2 = r2.mo34919a()     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.p3 r3 = new com.google.android.gms.measurement.internal.p3     // Catch:{ MalformedURLException -> 0x046e }
            r15 = 0
            r10 = r3
            r12 = r6
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x046e }
            r2.mo35109y(r3)     // Catch:{ MalformedURLException -> 0x046e }
            goto L_0x04ff
        L_0x046e:
            com.google.android.gms.measurement.internal.l3 r0 = r22.mo34920b()     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35075r()     // Catch:{ all -> 0x050c }
            java.lang.String r2 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r6)     // Catch:{ all -> 0x050c }
            r0.mo35039c(r2, r3, r5)     // Catch:{ all -> 0x050c }
            goto L_0x04ff
        L_0x0481:
            r0 = move-exception
            r9 = r11
        L_0x0483:
            if (r9 == 0) goto L_0x0488
            r9.close()     // Catch:{ all -> 0x050c }
        L_0x0488:
            throw r0     // Catch:{ all -> 0x050c }
        L_0x0489:
            r11 = r4
            r1.f7830z = r7     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c     // Catch:{ all -> 0x050c }
            m10634Q(r2)     // Catch:{ all -> 0x050c }
            r22.mo34912T()     // Catch:{ all -> 0x050c }
            long r3 = com.google.android.gms.measurement.internal.C6147g.m10588I()     // Catch:{ all -> 0x050c }
            long r4 = r11 - r3
            r2.mo34778h()     // Catch:{ all -> 0x050c }
            r2.mo35406i()     // Catch:{ all -> 0x050c }
            android.database.sqlite.SQLiteDatabase r0 = r2.mo35005R()     // Catch:{ SQLiteException -> 0x04d7, all -> 0x04d5 }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x04d7, all -> 0x04d5 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x04d7, all -> 0x04d5 }
            r5 = 0
            r3[r5] = r4     // Catch:{ SQLiteException -> 0x04d7, all -> 0x04d5 }
            java.lang.String r4 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            android.database.Cursor r3 = r0.rawQuery(r4, r3)     // Catch:{ SQLiteException -> 0x04d7, all -> 0x04d5 }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x04d3 }
            if (r0 != 0) goto L_0x04cd
            com.google.android.gms.measurement.internal.p4 r0 = r2.f7899a     // Catch:{ SQLiteException -> 0x04d3 }
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()     // Catch:{ SQLiteException -> 0x04d3 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35079v()     // Catch:{ SQLiteException -> 0x04d3 }
            java.lang.String r4 = "No expired configs for apps with pending events"
            r0.mo35037a(r4)     // Catch:{ SQLiteException -> 0x04d3 }
        L_0x04c9:
            r3.close()     // Catch:{ all -> 0x050c }
            goto L_0x04eb
        L_0x04cd:
            r4 = 0
            java.lang.String r9 = r3.getString(r4)     // Catch:{ SQLiteException -> 0x04d3 }
            goto L_0x04c9
        L_0x04d3:
            r0 = move-exception
            goto L_0x04d9
        L_0x04d5:
            r0 = move-exception
            goto L_0x0506
        L_0x04d7:
            r0 = move-exception
            r3 = r9
        L_0x04d9:
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a     // Catch:{ all -> 0x0504 }
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()     // Catch:{ all -> 0x0504 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ all -> 0x0504 }
            java.lang.String r4 = "Error selecting expired configs"
            r2.mo35038b(r4, r0)     // Catch:{ all -> 0x0504 }
            if (r3 == 0) goto L_0x04eb
            goto L_0x04c9
        L_0x04eb:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x050c }
            if (r0 != 0) goto L_0x04ff
            com.google.android.gms.measurement.internal.j r0 = r1.f7807c     // Catch:{ all -> 0x050c }
            m10634Q(r0)     // Catch:{ all -> 0x050c }
            com.google.android.gms.measurement.internal.u4 r0 = r0.mo35007T(r9)     // Catch:{ all -> 0x050c }
            if (r0 == 0) goto L_0x04ff
            r1.mo34931h(r0)     // Catch:{ all -> 0x050c }
        L_0x04ff:
            r2 = 0
            r1.f7825u = r2
            goto L_0x0030
        L_0x0504:
            r0 = move-exception
            r9 = r3
        L_0x0506:
            if (r9 == 0) goto L_0x050b
            r9.close()     // Catch:{ all -> 0x050c }
        L_0x050b:
            throw r0     // Catch:{ all -> 0x050c }
        L_0x050c:
            r0 = move-exception
            r2 = 0
            goto L_0x0511
        L_0x050f:
            r0 = move-exception
            r2 = r3
        L_0x0511:
            r1.f7825u = r2
            r22.m10626I()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6157g9.mo34906A():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0798, code lost:
        if (r14.size() == 0) goto L_0x079a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x09a2, code lost:
        r13 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02f1 A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x033b A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x033e A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x039e A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0532 A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0571 A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x05ea A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0637 A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0644 A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0651 A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x065f A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0670 A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x06a3 A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x06dc A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x06fb A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0716 A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x079d A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x07bc A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0829 A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0836 A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x084f A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x08e6 A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0906 A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0998 A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0a44 A[Catch:{ SQLiteException -> 0x0a5f }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0a5a  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x09a4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x017c A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0192 A[SYNTHETIC, Splitter:B:51:0x0192] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x020d A[Catch:{ NumberFormatException -> 0x0782, all -> 0x0adb }] */
    @androidx.annotation.WorkerThread
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34907B(com.google.android.gms.measurement.internal.C6290t r35, com.google.android.gms.measurement.internal.C6289s9 r36) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            r3 = r36
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            p231t4.C9713p.m20275j(r36)
            java.lang.String r8 = r3.f8207b
            p231t4.C9713p.m20271f(r8)
            long r8 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.n4 r10 = r34.mo34919a()
            r10.mo34778h()
            r34.mo34929g()
            java.lang.String r10 = r3.f8207b
            com.google.android.gms.measurement.internal.i9 r11 = r1.f7811g
            m10634Q(r11)
            boolean r11 = com.google.android.gms.measurement.internal.C6179i9.m10735n(r35, r36)
            if (r11 != 0) goto L_0x0032
            return
        L_0x0032:
            boolean r11 = r3.f8214i
            if (r11 == 0) goto L_0x0ae6
            com.google.android.gms.measurement.internal.j4 r11 = r1.f7805a
            m10634Q(r11)
            java.lang.String r12 = r2.f8229b
            boolean r11 = r11.mo35050x(r10, r12)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r11 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.l3 r3 = r34.mo34920b()
            com.google.android.gms.measurement.internal.j3 r3 = r3.mo35080w()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r10)
            com.google.android.gms.measurement.internal.p4 r5 = r1.f7816l
            com.google.android.gms.measurement.internal.g3 r5 = r5.mo35182D()
            java.lang.String r6 = r2.f8229b
            java.lang.String r5 = r5.mo34899d(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.mo35039c(r6, r4, r5)
            com.google.android.gms.measurement.internal.j4 r3 = r1.f7805a
            m10634Q(r3)
            boolean r3 = r3.mo35048v(r10)
            if (r3 != 0) goto L_0x0097
            com.google.android.gms.measurement.internal.j4 r3 = r1.f7805a
            m10634Q(r3)
            boolean r3 = r3.mo35051y(r10)
            if (r3 == 0) goto L_0x007a
            goto L_0x0097
        L_0x007a:
            java.lang.String r3 = r2.f8229b
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00de
            com.google.android.gms.measurement.internal.n9 r11 = r34.mo34930g0()
            com.google.android.gms.measurement.internal.m9 r12 = r1.f7804B
            r14 = 11
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.f8229b
            r17 = 0
            r13 = r10
            r16 = r2
            r11.mo35115A(r12, r13, r14, r15, r16, r17)
            return
        L_0x0097:
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c
            m10634Q(r2)
            com.google.android.gms.measurement.internal.u4 r2 = r2.mo35007T(r10)
            if (r2 == 0) goto L_0x00de
            long r3 = r2.mo35336W()
            long r5 = r2.mo35327N()
            long r3 = java.lang.Math.max(r3, r5)
            y4.e r5 = r34.mo34922c()
            long r5 = r5.mo33547a()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r34.mo34912T()
            com.google.android.gms.measurement.internal.z2<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C6084a3.f7537A
            java.lang.Object r5 = r5.mo35421a(r14)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00de
            com.google.android.gms.measurement.internal.l3 r3 = r34.mo34920b()
            com.google.android.gms.measurement.internal.j3 r3 = r3.mo35074q()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.mo35037a(r4)
            r1.mo34931h(r2)
        L_0x00de:
            return
        L_0x00df:
            com.google.android.gms.measurement.internal.m3 r2 = com.google.android.gms.measurement.internal.C6217m3.m10886b(r35)
            com.google.android.gms.measurement.internal.n9 r11 = r34.mo34930g0()
            com.google.android.gms.measurement.internal.g r12 = r34.mo34912T()
            int r12 = r12.mo34883n(r10)
            r11.mo35159z(r2, r12)
            com.google.android.gms.measurement.internal.t r2 = r2.mo35092a()
            com.google.android.gms.measurement.internal.l3 r11 = r34.mo34920b()
            java.lang.String r11 = r11.mo35072C()
            r13 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r13)
            if (r11 == 0) goto L_0x011c
            com.google.android.gms.measurement.internal.l3 r11 = r34.mo34920b()
            com.google.android.gms.measurement.internal.j3 r11 = r11.mo35079v()
            com.google.android.gms.measurement.internal.p4 r12 = r1.f7816l
            com.google.android.gms.measurement.internal.g3 r12 = r12.mo35182D()
            java.lang.String r12 = r12.mo34898c(r2)
            java.lang.String r13 = "Logging event"
            r11.mo35038b(r13, r12)
        L_0x011c:
            com.google.android.gms.measurement.internal.j r11 = r1.f7807c
            m10634Q(r11)
            r11.mo35019g0()
            r1.mo34910R(r3)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.internal.measurement.C5910pb.m9760b()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.g r11 = r34.mo34912T()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C6084a3.f7615x0     // Catch:{ all -> 0x0adb }
            boolean r11 = r11.mo34873B(r14, r12)     // Catch:{ all -> 0x0adb }
            if (r11 != 0) goto L_0x014e
            com.google.android.gms.measurement.internal.g r11 = r34.mo34912T()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C6084a3.f7617y0     // Catch:{ all -> 0x0adb }
            boolean r11 = r11.mo34873B(r14, r12)     // Catch:{ all -> 0x0adb }
            if (r11 == 0) goto L_0x014e
            com.google.android.gms.measurement.internal.j r11 = r1.f7807c     // Catch:{ all -> 0x0adb }
            m10634Q(r11)     // Catch:{ all -> 0x0adb }
            java.lang.String r12 = r3.f8207b     // Catch:{ all -> 0x0adb }
            java.lang.String r13 = "_lair"
            r11.mo35024n(r12, r13)     // Catch:{ all -> 0x0adb }
        L_0x014e:
            java.lang.String r11 = "ecommerce_purchase"
            java.lang.String r12 = r2.f8229b     // Catch:{ all -> 0x0adb }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0adb }
            java.lang.String r12 = "refund"
            r28 = r8
            if (r11 != 0) goto L_0x0171
            java.lang.String r9 = "purchase"
            java.lang.String r11 = r2.f8229b     // Catch:{ all -> 0x0adb }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x0adb }
            if (r9 != 0) goto L_0x0171
            java.lang.String r9 = r2.f8229b     // Catch:{ all -> 0x0adb }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0adb }
            if (r9 == 0) goto L_0x016f
            goto L_0x0171
        L_0x016f:
            r9 = 0
            goto L_0x0172
        L_0x0171:
            r9 = 1
        L_0x0172:
            java.lang.String r11 = "_iap"
            java.lang.String r13 = r2.f8229b     // Catch:{ all -> 0x0adb }
            boolean r11 = r11.equals(r13)     // Catch:{ all -> 0x0adb }
            if (r11 != 0) goto L_0x0186
            if (r9 == 0) goto L_0x0180
            r9 = 1
            goto L_0x0186
        L_0x0180:
            r33 = r4
            r8 = r15
        L_0x0183:
            r4 = 2
            goto L_0x0328
        L_0x0186:
            com.google.android.gms.measurement.internal.r r11 = r2.f8230c     // Catch:{ all -> 0x0adb }
            java.lang.String r13 = "currency"
            java.lang.String r11 = r11.mo35274K(r13)     // Catch:{ all -> 0x0adb }
            java.lang.String r13 = "value"
            if (r9 == 0) goto L_0x01fb
            com.google.android.gms.measurement.internal.r r9 = r2.f8230c     // Catch:{ all -> 0x0adb }
            java.lang.Double r9 = r9.mo35271H(r13)     // Catch:{ all -> 0x0adb }
            double r17 = r9.doubleValue()     // Catch:{ all -> 0x0adb }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r17 = r17 * r19
            r21 = 0
            int r9 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r9 != 0) goto L_0x01b9
            com.google.android.gms.measurement.internal.r r9 = r2.f8230c     // Catch:{ all -> 0x0adb }
            java.lang.Long r9 = r9.mo35272I(r13)     // Catch:{ all -> 0x0adb }
            r21 = r15
            long r14 = r9.longValue()     // Catch:{ all -> 0x0adb }
            double r13 = (double) r14     // Catch:{ all -> 0x0adb }
            double r17 = r13 * r19
            goto L_0x01bb
        L_0x01b9:
            r21 = r15
        L_0x01bb:
            r13 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 > 0) goto L_0x01d5
            r13 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 < 0) goto L_0x01d5
            long r13 = java.lang.Math.round(r17)     // Catch:{ all -> 0x0adb }
            java.lang.String r9 = r2.f8229b     // Catch:{ all -> 0x0adb }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0adb }
            if (r9 == 0) goto L_0x0207
            long r13 = -r13
            goto L_0x0207
        L_0x01d5:
            com.google.android.gms.measurement.internal.l3 r2 = r34.mo34920b()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35080w()     // Catch:{ all -> 0x0adb }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r10)     // Catch:{ all -> 0x0adb }
            java.lang.Double r5 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x0adb }
            r2.mo35039c(r3, r4, r5)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c     // Catch:{ all -> 0x0adb }
            m10634Q(r2)     // Catch:{ all -> 0x0adb }
            r2.mo35026p()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c
            m10634Q(r2)
            r2.mo35021i0()
            return
        L_0x01fb:
            r21 = r15
            com.google.android.gms.measurement.internal.r r9 = r2.f8230c     // Catch:{ all -> 0x0adb }
            java.lang.Long r9 = r9.mo35272I(r13)     // Catch:{ all -> 0x0adb }
            long r13 = r9.longValue()     // Catch:{ all -> 0x0adb }
        L_0x0207:
            boolean r9 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0adb }
            if (r9 != 0) goto L_0x0322
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x0adb }
            java.lang.String r9 = r11.toUpperCase(r9)     // Catch:{ all -> 0x0adb }
            java.lang.String r11 = "[A-Z]{3}"
            boolean r11 = r9.matches(r11)     // Catch:{ all -> 0x0adb }
            if (r11 == 0) goto L_0x0322
            java.lang.String r11 = "_ltv_"
            int r12 = r9.length()     // Catch:{ all -> 0x0adb }
            if (r12 == 0) goto L_0x0228
            java.lang.String r9 = r11.concat(r9)     // Catch:{ all -> 0x0adb }
            goto L_0x022d
        L_0x0228:
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x0adb }
            r9.<init>(r11)     // Catch:{ all -> 0x0adb }
        L_0x022d:
            com.google.android.gms.measurement.internal.j r11 = r1.f7807c     // Catch:{ all -> 0x0adb }
            m10634Q(r11)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.l9 r11 = r11.mo35012Z(r10, r9)     // Catch:{ all -> 0x0adb }
            if (r11 == 0) goto L_0x026d
            java.lang.Object r11 = r11.f7964e     // Catch:{ all -> 0x0adb }
            boolean r12 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0adb }
            if (r12 != 0) goto L_0x023f
            goto L_0x026d
        L_0x023f:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0adb }
            long r11 = r11.longValue()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.l9 r18 = new com.google.android.gms.measurement.internal.l9     // Catch:{ all -> 0x0adb }
            java.lang.String r15 = r2.f8231d     // Catch:{ all -> 0x0adb }
            y4.e r17 = r34.mo34922c()     // Catch:{ all -> 0x0adb }
            long r19 = r17.mo33547a()     // Catch:{ all -> 0x0adb }
            long r11 = r11 + r13
            java.lang.Long r17 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0adb }
            r11 = r18
            r12 = r10
            r14 = 0
            r13 = r15
            r8 = r14
            r15 = 0
            r14 = r9
            r9 = r21
            r15 = r19
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0adb }
            r33 = r4
            r8 = r9
            r9 = r18
            r4 = 2
            goto L_0x02e6
        L_0x026d:
            r15 = r21
            r8 = 0
            com.google.android.gms.measurement.internal.j r11 = r1.f7807c     // Catch:{ all -> 0x0adb }
            m10634Q(r11)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.g r12 = r34.mo34912T()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.z2<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C6084a3.f7547F     // Catch:{ all -> 0x0adb }
            int r8 = r12.mo34884o(r10, r8)     // Catch:{ all -> 0x0adb }
            int r8 = r8 + -1
            p231t4.C9713p.m20271f(r10)     // Catch:{ all -> 0x0adb }
            r11.mo34778h()     // Catch:{ all -> 0x0adb }
            r11.mo35406i()     // Catch:{ all -> 0x0adb }
            android.database.sqlite.SQLiteDatabase r12 = r11.mo35005R()     // Catch:{ SQLiteException -> 0x02b0 }
            r21 = r15
            r15 = 3
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x02ac }
            r16 = 0
            r15[r16] = r10     // Catch:{ SQLiteException -> 0x02ac }
            r16 = 1
            r15[r16] = r10     // Catch:{ SQLiteException -> 0x02ac }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x02ac }
            r33 = r4
            r4 = 2
            r15[r4] = r8     // Catch:{ SQLiteException -> 0x02aa }
            java.lang.String r8 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r12.execSQL(r8, r15)     // Catch:{ SQLiteException -> 0x02aa }
            goto L_0x02ca
        L_0x02aa:
            r0 = move-exception
            goto L_0x02b6
        L_0x02ac:
            r0 = move-exception
            r33 = r4
            goto L_0x02b5
        L_0x02b0:
            r0 = move-exception
            r33 = r4
            r21 = r15
        L_0x02b5:
            r4 = 2
        L_0x02b6:
            r8 = r0
            com.google.android.gms.measurement.internal.p4 r11 = r11.f7899a     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.l3 r11 = r11.mo34920b()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j3 r11 = r11.mo35075r()     // Catch:{ all -> 0x0adb }
            java.lang.String r12 = "Error pruning currencies. appId"
            java.lang.Object r15 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r10)     // Catch:{ all -> 0x0adb }
            r11.mo35039c(r12, r15, r8)     // Catch:{ all -> 0x0adb }
        L_0x02ca:
            com.google.android.gms.measurement.internal.l9 r18 = new com.google.android.gms.measurement.internal.l9     // Catch:{ all -> 0x0adb }
            java.lang.String r8 = r2.f8231d     // Catch:{ all -> 0x0adb }
            y4.e r11 = r34.mo34922c()     // Catch:{ all -> 0x0adb }
            long r15 = r11.mo33547a()     // Catch:{ all -> 0x0adb }
            java.lang.Long r17 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0adb }
            r11 = r18
            r12 = r10
            r13 = r8
            r14 = r9
            r8 = r21
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0adb }
            r9 = r18
        L_0x02e6:
            com.google.android.gms.measurement.internal.j r11 = r1.f7807c     // Catch:{ all -> 0x0adb }
            m10634Q(r11)     // Catch:{ all -> 0x0adb }
            boolean r11 = r11.mo35036z(r9)     // Catch:{ all -> 0x0adb }
            if (r11 != 0) goto L_0x0328
            com.google.android.gms.measurement.internal.l3 r11 = r34.mo34920b()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j3 r11 = r11.mo35075r()     // Catch:{ all -> 0x0adb }
            java.lang.String r12 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r10)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.p4 r14 = r1.f7816l     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.g3 r14 = r14.mo35182D()     // Catch:{ all -> 0x0adb }
            java.lang.String r15 = r9.f7962c     // Catch:{ all -> 0x0adb }
            java.lang.String r14 = r14.mo34901f(r15)     // Catch:{ all -> 0x0adb }
            java.lang.Object r9 = r9.f7964e     // Catch:{ all -> 0x0adb }
            r11.mo35040d(r12, r13, r14, r9)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.n9 r11 = r34.mo34930g0()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.m9 r12 = r1.f7804B     // Catch:{ all -> 0x0adb }
            r14 = 9
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo35115A(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0adb }
            goto L_0x0328
        L_0x0322:
            r33 = r4
            r8 = r21
            goto L_0x0183
        L_0x0328:
            java.lang.String r9 = r2.f8229b     // Catch:{ all -> 0x0adb }
            boolean r9 = com.google.android.gms.measurement.internal.C6234n9.m10922W(r9)     // Catch:{ all -> 0x0adb }
            java.lang.String r11 = r2.f8229b     // Catch:{ all -> 0x0adb }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0adb }
            r34.mo34930g0()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.r r11 = r2.f8230c     // Catch:{ all -> 0x0adb }
            if (r11 != 0) goto L_0x033e
            r16 = 0
            goto L_0x035e
        L_0x033e:
            com.google.android.gms.measurement.internal.q r12 = new com.google.android.gms.measurement.internal.q     // Catch:{ all -> 0x0adb }
            r12.<init>(r11)     // Catch:{ all -> 0x0adb }
            r16 = 0
        L_0x0345:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0adb }
            if (r13 == 0) goto L_0x035e
            java.lang.String r13 = r12.next()     // Catch:{ all -> 0x0adb }
            java.lang.Object r13 = r11.mo35273J(r13)     // Catch:{ all -> 0x0adb }
            boolean r14 = r13 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0adb }
            if (r14 == 0) goto L_0x0345
            android.os.Parcelable[] r13 = (android.os.Parcelable[]) r13     // Catch:{ all -> 0x0adb }
            int r13 = r13.length     // Catch:{ all -> 0x0adb }
            long r13 = (long) r13     // Catch:{ all -> 0x0adb }
            long r16 = r16 + r13
            goto L_0x0345
        L_0x035e:
            r22 = 1
            long r15 = r16 + r22
            com.google.android.gms.measurement.internal.j r11 = r1.f7807c     // Catch:{ all -> 0x0adb }
            m10634Q(r11)     // Catch:{ all -> 0x0adb }
            long r12 = r34.mo34909F()     // Catch:{ all -> 0x0adb }
            r17 = 1
            r20 = 0
            r21 = 0
            r30 = r5
            r4 = 0
            r14 = r10
            r18 = r9
            r19 = r20
            r20 = r8
            com.google.android.gms.measurement.internal.h r11 = r11.mo35010W(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0adb }
            long r12 = r11.f7832b     // Catch:{ all -> 0x0adb }
            r34.mo34912T()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.z2<java.lang.Integer> r14 = com.google.android.gms.measurement.internal.C6084a3.f7590l     // Catch:{ all -> 0x0adb }
            r15 = 0
            java.lang.Object r14 = r14.mo35421a(r15)     // Catch:{ all -> 0x0adb }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0adb }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0adb }
            r31 = r6
            r16 = r7
            long r6 = (long) r14     // Catch:{ all -> 0x0adb }
            long r12 = r12 - r6
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            r17 = 1000(0x3e8, double:4.94E-321)
            if (r6 <= 0) goto L_0x03cc
            long r12 = r12 % r17
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x03bb
            com.google.android.gms.measurement.internal.l3 r2 = r34.mo34920b()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ all -> 0x0adb }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r10)     // Catch:{ all -> 0x0adb }
            long r5 = r11.f7832b     // Catch:{ all -> 0x0adb }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0adb }
            r2.mo35039c(r3, r4, r5)     // Catch:{ all -> 0x0adb }
        L_0x03bb:
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c     // Catch:{ all -> 0x0adb }
            m10634Q(r2)     // Catch:{ all -> 0x0adb }
            r2.mo35026p()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c
            m10634Q(r2)
            r2.mo35021i0()
            return
        L_0x03cc:
            if (r9 == 0) goto L_0x0427
            long r6 = r11.f7831a     // Catch:{ all -> 0x0adb }
            r34.mo34912T()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.z2<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.C6084a3.f7594n     // Catch:{ all -> 0x0adb }
            java.lang.Object r12 = r12.mo35421a(r15)     // Catch:{ all -> 0x0adb }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x0adb }
            int r12 = r12.intValue()     // Catch:{ all -> 0x0adb }
            long r12 = (long) r12     // Catch:{ all -> 0x0adb }
            long r6 = r6 - r12
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x0427
            long r6 = r6 % r17
            int r3 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r3 != 0) goto L_0x0402
            com.google.android.gms.measurement.internal.l3 r3 = r34.mo34920b()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j3 r3 = r3.mo35075r()     // Catch:{ all -> 0x0adb }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r10)     // Catch:{ all -> 0x0adb }
            long r6 = r11.f7831a     // Catch:{ all -> 0x0adb }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0adb }
            r3.mo35039c(r4, r5, r6)     // Catch:{ all -> 0x0adb }
        L_0x0402:
            com.google.android.gms.measurement.internal.n9 r11 = r34.mo34930g0()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.m9 r12 = r1.f7804B     // Catch:{ all -> 0x0adb }
            r14 = 16
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.f8229b     // Catch:{ all -> 0x0adb }
            r17 = 0
            r13 = r10
            r16 = r2
            r11.mo35115A(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c     // Catch:{ all -> 0x0adb }
            m10634Q(r2)     // Catch:{ all -> 0x0adb }
            r2.mo35026p()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c
            m10634Q(r2)
            r2.mo35021i0()
            return
        L_0x0427:
            r6 = 1000000(0xf4240, float:1.401298E-39)
            if (r8 == 0) goto L_0x0475
            long r7 = r11.f7834d     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.g r12 = r34.mo34912T()     // Catch:{ all -> 0x0adb }
            java.lang.String r13 = r3.f8207b     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.z2<java.lang.Integer> r14 = com.google.android.gms.measurement.internal.C6084a3.f7592m     // Catch:{ all -> 0x0adb }
            int r12 = r12.mo34884o(r13, r14)     // Catch:{ all -> 0x0adb }
            int r12 = java.lang.Math.min(r6, r12)     // Catch:{ all -> 0x0adb }
            r13 = 0
            int r12 = java.lang.Math.max(r13, r12)     // Catch:{ all -> 0x0adb }
            long r12 = (long) r12     // Catch:{ all -> 0x0adb }
            long r7 = r7 - r12
            int r12 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x0475
            int r2 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x0464
            com.google.android.gms.measurement.internal.l3 r2 = r34.mo34920b()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ all -> 0x0adb }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r10)     // Catch:{ all -> 0x0adb }
            long r5 = r11.f7834d     // Catch:{ all -> 0x0adb }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0adb }
            r2.mo35039c(r3, r4, r5)     // Catch:{ all -> 0x0adb }
        L_0x0464:
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c     // Catch:{ all -> 0x0adb }
            m10634Q(r2)     // Catch:{ all -> 0x0adb }
            r2.mo35026p()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c
            m10634Q(r2)
            r2.mo35021i0()
            return
        L_0x0475:
            com.google.android.gms.measurement.internal.r r7 = r2.f8230c     // Catch:{ all -> 0x0adb }
            android.os.Bundle r7 = r7.mo35270G()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.n9 r8 = r34.mo34930g0()     // Catch:{ all -> 0x0adb }
            java.lang.String r11 = "_o"
            java.lang.String r12 = r2.f8231d     // Catch:{ all -> 0x0adb }
            r8.mo35116B(r7, r11, r12)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.n9 r8 = r34.mo34930g0()     // Catch:{ all -> 0x0adb }
            boolean r8 = r8.mo35133S(r10)     // Catch:{ all -> 0x0adb }
            java.lang.String r14 = "_r"
            if (r8 == 0) goto L_0x04a6
            com.google.android.gms.measurement.internal.n9 r8 = r34.mo34930g0()     // Catch:{ all -> 0x0adb }
            java.lang.Long r11 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0adb }
            java.lang.String r12 = "_dbg"
            r8.mo35116B(r7, r12, r11)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.n9 r8 = r34.mo34930g0()     // Catch:{ all -> 0x0adb }
            r8.mo35116B(r7, r14, r11)     // Catch:{ all -> 0x0adb }
        L_0x04a6:
            java.lang.String r8 = "_s"
            java.lang.String r11 = r2.f8229b     // Catch:{ all -> 0x0adb }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0adb }
            if (r8 == 0) goto L_0x04ce
            com.google.android.gms.measurement.internal.j r8 = r1.f7807c     // Catch:{ all -> 0x0adb }
            m10634Q(r8)     // Catch:{ all -> 0x0adb }
            java.lang.String r11 = r3.f8207b     // Catch:{ all -> 0x0adb }
            r12 = r16
            com.google.android.gms.measurement.internal.l9 r8 = r8.mo35012Z(r11, r12)     // Catch:{ all -> 0x0adb }
            if (r8 == 0) goto L_0x04ce
            java.lang.Object r11 = r8.f7964e     // Catch:{ all -> 0x0adb }
            boolean r11 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0adb }
            if (r11 == 0) goto L_0x04ce
            com.google.android.gms.measurement.internal.n9 r11 = r34.mo34930g0()     // Catch:{ all -> 0x0adb }
            java.lang.Object r8 = r8.f7964e     // Catch:{ all -> 0x0adb }
            r11.mo35116B(r7, r12, r8)     // Catch:{ all -> 0x0adb }
        L_0x04ce:
            com.google.android.gms.measurement.internal.j r8 = r1.f7807c     // Catch:{ all -> 0x0adb }
            m10634Q(r8)     // Catch:{ all -> 0x0adb }
            p231t4.C9713p.m20271f(r10)     // Catch:{ all -> 0x0adb }
            r8.mo34778h()     // Catch:{ all -> 0x0adb }
            r8.mo35406i()     // Catch:{ all -> 0x0adb }
            android.database.sqlite.SQLiteDatabase r11 = r8.mo35005R()     // Catch:{ SQLiteException -> 0x0512 }
            com.google.android.gms.measurement.internal.p4 r12 = r8.f7899a     // Catch:{ SQLiteException -> 0x0512 }
            com.google.android.gms.measurement.internal.g r12 = r12.mo35211z()     // Catch:{ SQLiteException -> 0x0512 }
            com.google.android.gms.measurement.internal.z2<java.lang.Integer> r13 = com.google.android.gms.measurement.internal.C6084a3.f7600q     // Catch:{ SQLiteException -> 0x0512 }
            int r12 = r12.mo34884o(r10, r13)     // Catch:{ SQLiteException -> 0x0512 }
            int r6 = java.lang.Math.min(r6, r12)     // Catch:{ SQLiteException -> 0x0512 }
            r13 = 0
            int r6 = java.lang.Math.max(r13, r6)     // Catch:{ SQLiteException -> 0x050e }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x050e }
            r12 = 2
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x050e }
            r12[r13] = r10     // Catch:{ SQLiteException -> 0x050e }
            r16 = 1
            r12[r16] = r6     // Catch:{ SQLiteException -> 0x050e }
            java.lang.String r6 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            r4 = r31
            int r5 = r11.delete(r4, r6, r12)     // Catch:{ SQLiteException -> 0x050c }
            long r5 = (long) r5
            goto L_0x052c
        L_0x050c:
            r0 = move-exception
            goto L_0x0516
        L_0x050e:
            r0 = move-exception
            r4 = r31
            goto L_0x0516
        L_0x0512:
            r0 = move-exception
            r4 = r31
            r13 = 0
        L_0x0516:
            r5 = r0
            com.google.android.gms.measurement.internal.p4 r6 = r8.f7899a     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.l3 r6 = r6.mo34920b()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j3 r6 = r6.mo35075r()     // Catch:{ all -> 0x0adb }
            java.lang.String r8 = "Error deleting over the limit events. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r10)     // Catch:{ all -> 0x0adb }
            r6.mo35039c(r8, r11, r5)     // Catch:{ all -> 0x0adb }
            r5 = 0
        L_0x052c:
            r11 = 0
            int r8 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r8 <= 0) goto L_0x0547
            com.google.android.gms.measurement.internal.l3 r8 = r34.mo34920b()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j3 r8 = r8.mo35080w()     // Catch:{ all -> 0x0adb }
            java.lang.String r11 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r10)     // Catch:{ all -> 0x0adb }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0adb }
            r8.mo35039c(r11, r12, r5)     // Catch:{ all -> 0x0adb }
        L_0x0547:
            com.google.android.gms.measurement.internal.o r5 = new com.google.android.gms.measurement.internal.o     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.p4 r12 = r1.f7816l     // Catch:{ all -> 0x0adb }
            java.lang.String r6 = r2.f8231d     // Catch:{ all -> 0x0adb }
            java.lang.String r8 = r2.f8229b     // Catch:{ all -> 0x0adb }
            long r2 = r2.f8232e     // Catch:{ all -> 0x0adb }
            r18 = 0
            r11 = r5
            r31 = r13
            r13 = r6
            r6 = r14
            r14 = r10
            r32 = r4
            r4 = r15
            r15 = r8
            r16 = r2
            r20 = r7
            r11.<init>((com.google.android.gms.measurement.internal.C6251p4) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (long) r16, (long) r18, (android.os.Bundle) r20)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c     // Catch:{ all -> 0x0adb }
            m10634Q(r2)     // Catch:{ all -> 0x0adb }
            java.lang.String r3 = r5.f8037b     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.p r2 = r2.mo35011X(r10, r3)     // Catch:{ all -> 0x0adb }
            if (r2 != 0) goto L_0x05ea
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c     // Catch:{ all -> 0x0adb }
            m10634Q(r2)     // Catch:{ all -> 0x0adb }
            long r2 = r2.mo35004Q(r10)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.g r7 = r34.mo34912T()     // Catch:{ all -> 0x0adb }
            int r7 = r7.mo34881l(r10)     // Catch:{ all -> 0x0adb }
            long r7 = (long) r7     // Catch:{ all -> 0x0adb }
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x05cc
            if (r9 == 0) goto L_0x05cc
            com.google.android.gms.measurement.internal.l3 r2 = r34.mo34920b()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ all -> 0x0adb }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r10)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.p4 r6 = r1.f7816l     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.g3 r6 = r6.mo35182D()     // Catch:{ all -> 0x0adb }
            java.lang.String r5 = r5.f8037b     // Catch:{ all -> 0x0adb }
            java.lang.String r5 = r6.mo34899d(r5)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.g r6 = r34.mo34912T()     // Catch:{ all -> 0x0adb }
            int r6 = r6.mo34881l(r10)     // Catch:{ all -> 0x0adb }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0adb }
            r2.mo35040d(r3, r4, r5, r6)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.n9 r11 = r34.mo34930g0()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.m9 r12 = r1.f7804B     // Catch:{ all -> 0x0adb }
            r14 = 8
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo35115A(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c
            m10634Q(r2)
            r2.mo35021i0()
            return
        L_0x05cc:
            com.google.android.gms.measurement.internal.p r2 = new com.google.android.gms.measurement.internal.p     // Catch:{ all -> 0x0adb }
            java.lang.String r13 = r5.f8037b     // Catch:{ all -> 0x0adb }
            long r7 = r5.f8039d     // Catch:{ all -> 0x0adb }
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r11 = r2
            r12 = r10
            r20 = r7
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0adb }
            goto L_0x05f8
        L_0x05ea:
            com.google.android.gms.measurement.internal.p4 r3 = r1.f7816l     // Catch:{ all -> 0x0adb }
            long r7 = r2.f8071f     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.o r5 = r5.mo35160a(r3, r7)     // Catch:{ all -> 0x0adb }
            long r7 = r5.f8039d     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.p r2 = r2.mo35177c(r7)     // Catch:{ all -> 0x0adb }
        L_0x05f8:
            com.google.android.gms.measurement.internal.j r3 = r1.f7807c     // Catch:{ all -> 0x0adb }
            m10634Q(r3)     // Catch:{ all -> 0x0adb }
            r3.mo35028r(r2)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.n4 r2 = r34.mo34919a()     // Catch:{ all -> 0x0adb }
            r2.mo34778h()     // Catch:{ all -> 0x0adb }
            r34.mo34929g()     // Catch:{ all -> 0x0adb }
            p231t4.C9713p.m20275j(r5)     // Catch:{ all -> 0x0adb }
            p231t4.C9713p.m20275j(r36)     // Catch:{ all -> 0x0adb }
            java.lang.String r2 = r5.f8036a     // Catch:{ all -> 0x0adb }
            p231t4.C9713p.m20271f(r2)     // Catch:{ all -> 0x0adb }
            java.lang.String r2 = r5.f8036a     // Catch:{ all -> 0x0adb }
            r3 = r36
            java.lang.String r7 = r3.f8207b     // Catch:{ all -> 0x0adb }
            boolean r2 = r2.equals(r7)     // Catch:{ all -> 0x0adb }
            p231t4.C9713p.m20266a(r2)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.internal.measurement.t4 r2 = com.google.android.gms.internal.measurement.C5983u4.m10013J1()     // Catch:{ all -> 0x0adb }
            r7 = 1
            r2.mo34403Y(r7)     // Catch:{ all -> 0x0adb }
            java.lang.String r8 = "android"
            r2.mo34398S(r8)     // Catch:{ all -> 0x0adb }
            java.lang.String r8 = r3.f8207b     // Catch:{ all -> 0x0adb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0adb }
            if (r8 != 0) goto L_0x063c
            java.lang.String r8 = r3.f8207b     // Catch:{ all -> 0x0adb }
            r2.mo34422r(r8)     // Catch:{ all -> 0x0adb }
        L_0x063c:
            java.lang.String r8 = r3.f8210e     // Catch:{ all -> 0x0adb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0adb }
            if (r8 != 0) goto L_0x0649
            java.lang.String r8 = r3.f8210e     // Catch:{ all -> 0x0adb }
            r2.mo34426t(r8)     // Catch:{ all -> 0x0adb }
        L_0x0649:
            java.lang.String r8 = r3.f8209d     // Catch:{ all -> 0x0adb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0adb }
            if (r8 != 0) goto L_0x0656
            java.lang.String r8 = r3.f8209d     // Catch:{ all -> 0x0adb }
            r2.mo34428u(r8)     // Catch:{ all -> 0x0adb }
        L_0x0656:
            long r8 = r3.f8216k     // Catch:{ all -> 0x0adb }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 == 0) goto L_0x0663
            int r8 = (int) r8     // Catch:{ all -> 0x0adb }
            r2.mo34430v(r8)     // Catch:{ all -> 0x0adb }
        L_0x0663:
            long r8 = r3.f8211f     // Catch:{ all -> 0x0adb }
            r2.mo34392L(r8)     // Catch:{ all -> 0x0adb }
            java.lang.String r8 = r3.f8208c     // Catch:{ all -> 0x0adb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0adb }
            if (r8 != 0) goto L_0x0675
            java.lang.String r8 = r3.f8208c     // Catch:{ all -> 0x0adb }
            r2.mo34390K(r8)     // Catch:{ all -> 0x0adb }
        L_0x0675:
            java.lang.String r8 = r3.f8207b     // Catch:{ all -> 0x0adb }
            java.lang.Object r8 = p231t4.C9713p.m20275j(r8)     // Catch:{ all -> 0x0adb }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0adb }
            q5.a r8 = r1.mo34913U(r8)     // Catch:{ all -> 0x0adb }
            java.lang.String r9 = r3.f8228w     // Catch:{ all -> 0x0adb }
            q5.a r9 = p201q5.C9254a.m18988b(r9)     // Catch:{ all -> 0x0adb }
            q5.a r8 = r8.mo43546c(r9)     // Catch:{ all -> 0x0adb }
            java.lang.String r8 = r8.mo43552i()     // Catch:{ all -> 0x0adb }
            r2.mo34438z(r8)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.internal.measurement.C5831kd.m9523b()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.g r8 = r34.mo34912T()     // Catch:{ all -> 0x0adb }
            java.lang.String r9 = r3.f8207b     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.C6084a3.f7577e0     // Catch:{ all -> 0x0adb }
            boolean r8 = r8.mo34873B(r9, r10)     // Catch:{ all -> 0x0adb }
            if (r8 == 0) goto L_0x06dc
            java.lang.String r8 = r2.mo34416l0()     // Catch:{ all -> 0x0adb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0adb }
            if (r8 == 0) goto L_0x06ba
            java.lang.String r8 = r3.f8227v     // Catch:{ all -> 0x0adb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0adb }
            if (r8 != 0) goto L_0x06ba
            java.lang.String r8 = r3.f8227v     // Catch:{ all -> 0x0adb }
            r2.mo34388J(r8)     // Catch:{ all -> 0x0adb }
        L_0x06ba:
            java.lang.String r8 = r2.mo34416l0()     // Catch:{ all -> 0x0adb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0adb }
            if (r8 == 0) goto L_0x06f3
            java.lang.String r8 = r2.mo34415k0()     // Catch:{ all -> 0x0adb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0adb }
            if (r8 == 0) goto L_0x06f3
            java.lang.String r8 = r3.f8223r     // Catch:{ all -> 0x0adb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0adb }
            if (r8 != 0) goto L_0x06f3
            java.lang.String r8 = r3.f8223r     // Catch:{ all -> 0x0adb }
            r2.mo34393L0(r8)     // Catch:{ all -> 0x0adb }
            goto L_0x06f3
        L_0x06dc:
            java.lang.String r8 = r2.mo34416l0()     // Catch:{ all -> 0x0adb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0adb }
            if (r8 == 0) goto L_0x06f3
            java.lang.String r8 = r3.f8223r     // Catch:{ all -> 0x0adb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0adb }
            if (r8 != 0) goto L_0x06f3
            java.lang.String r8 = r3.f8223r     // Catch:{ all -> 0x0adb }
            r2.mo34393L0(r8)     // Catch:{ all -> 0x0adb }
        L_0x06f3:
            long r8 = r3.f8212g     // Catch:{ all -> 0x0adb }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x06fe
            r2.mo34373B(r8)     // Catch:{ all -> 0x0adb }
        L_0x06fe:
            long r8 = r3.f8225t     // Catch:{ all -> 0x0adb }
            r2.mo34379E(r8)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.i9 r8 = r1.f7811g     // Catch:{ all -> 0x0adb }
            m10634Q(r8)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.g9 r9 = r8.f8374b     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.p4 r9 = r9.f7816l     // Catch:{ all -> 0x0adb }
            android.content.Context r9 = r9.mo34927f()     // Catch:{ all -> 0x0adb }
            java.util.Map r9 = com.google.android.gms.measurement.internal.C6084a3.m10456c(r9)     // Catch:{ all -> 0x0adb }
            if (r9 == 0) goto L_0x079a
            int r10 = r9.size()     // Catch:{ all -> 0x0adb }
            if (r10 != 0) goto L_0x071e
            goto L_0x079a
        L_0x071e:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0adb }
            r14.<init>()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.z2<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.C6084a3.f7558Q     // Catch:{ all -> 0x0adb }
            java.lang.Object r10 = r10.mo35421a(r4)     // Catch:{ all -> 0x0adb }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0adb }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0adb }
            java.util.Set r9 = r9.entrySet()     // Catch:{ all -> 0x0adb }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0adb }
        L_0x0737:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0adb }
            if (r11 == 0) goto L_0x0794
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0adb }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x0adb }
            java.lang.Object r12 = r11.getKey()     // Catch:{ all -> 0x0adb }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0adb }
            java.lang.String r13 = "measurement.id."
            boolean r12 = r12.startsWith(r13)     // Catch:{ all -> 0x0adb }
            if (r12 == 0) goto L_0x0737
            java.lang.Object r11 = r11.getValue()     // Catch:{ NumberFormatException -> 0x0782 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x0782 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x0782 }
            if (r11 == 0) goto L_0x0737
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ NumberFormatException -> 0x0782 }
            r14.add(r11)     // Catch:{ NumberFormatException -> 0x0782 }
            int r11 = r14.size()     // Catch:{ NumberFormatException -> 0x0782 }
            if (r11 < r10) goto L_0x0737
            com.google.android.gms.measurement.internal.p4 r11 = r8.f7899a     // Catch:{ NumberFormatException -> 0x0782 }
            com.google.android.gms.measurement.internal.l3 r11 = r11.mo34920b()     // Catch:{ NumberFormatException -> 0x0782 }
            com.google.android.gms.measurement.internal.j3 r11 = r11.mo35080w()     // Catch:{ NumberFormatException -> 0x0782 }
            java.lang.String r12 = "Too many experiment IDs. Number of IDs"
            int r13 = r14.size()     // Catch:{ NumberFormatException -> 0x0782 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NumberFormatException -> 0x0782 }
            r11.mo35038b(r12, r13)     // Catch:{ NumberFormatException -> 0x0782 }
            goto L_0x0794
        L_0x0782:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.measurement.internal.p4 r12 = r8.f7899a     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.l3 r12 = r12.mo34920b()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j3 r12 = r12.mo35080w()     // Catch:{ all -> 0x0adb }
            java.lang.String r13 = "Experiment ID NumberFormatException"
            r12.mo35038b(r13, r11)     // Catch:{ all -> 0x0adb }
            goto L_0x0737
        L_0x0794:
            int r8 = r14.size()     // Catch:{ all -> 0x0adb }
            if (r8 != 0) goto L_0x079b
        L_0x079a:
            r14 = r4
        L_0x079b:
            if (r14 == 0) goto L_0x07a0
            r2.mo34429u0(r14)     // Catch:{ all -> 0x0adb }
        L_0x07a0:
            java.lang.String r8 = r3.f8207b     // Catch:{ all -> 0x0adb }
            java.lang.Object r8 = p231t4.C9713p.m20275j(r8)     // Catch:{ all -> 0x0adb }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0adb }
            q5.a r8 = r1.mo34913U(r8)     // Catch:{ all -> 0x0adb }
            java.lang.String r9 = r3.f8228w     // Catch:{ all -> 0x0adb }
            q5.a r9 = p201q5.C9254a.m18988b(r9)     // Catch:{ all -> 0x0adb }
            q5.a r8 = r8.mo43546c(r9)     // Catch:{ all -> 0x0adb }
            boolean r9 = r8.mo43553j()     // Catch:{ all -> 0x0adb }
            if (r9 == 0) goto L_0x07e6
            com.google.android.gms.measurement.internal.e8 r9 = r1.f7813i     // Catch:{ all -> 0x0adb }
            java.lang.String r10 = r3.f8207b     // Catch:{ all -> 0x0adb }
            android.util.Pair r9 = r9.mo34855n(r10, r8)     // Catch:{ all -> 0x0adb }
            java.lang.Object r10 = r9.first     // Catch:{ all -> 0x0adb }
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ all -> 0x0adb }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0adb }
            if (r10 != 0) goto L_0x07e6
            boolean r10 = r3.f8221p     // Catch:{ all -> 0x0adb }
            if (r10 == 0) goto L_0x07e6
            java.lang.Object r10 = r9.first     // Catch:{ all -> 0x0adb }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0adb }
            r2.mo34404Z(r10)     // Catch:{ all -> 0x0adb }
            java.lang.Object r9 = r9.second     // Catch:{ all -> 0x0adb }
            if (r9 == 0) goto L_0x07e6
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0adb }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0adb }
            r2.mo34396N(r9)     // Catch:{ all -> 0x0adb }
        L_0x07e6:
            com.google.android.gms.measurement.internal.p4 r9 = r1.f7816l     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.n r9 = r9.mo35179A()     // Catch:{ all -> 0x0adb }
            r9.mo35062k()     // Catch:{ all -> 0x0adb }
            java.lang.String r9 = android.os.Build.MODEL     // Catch:{ all -> 0x0adb }
            r2.mo34375C(r9)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.p4 r9 = r1.f7816l     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.n r9 = r9.mo35179A()     // Catch:{ all -> 0x0adb }
            r9.mo35062k()     // Catch:{ all -> 0x0adb }
            java.lang.String r9 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0adb }
            r2.mo34397P(r9)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.p4 r9 = r1.f7816l     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.n r9 = r9.mo35179A()     // Catch:{ all -> 0x0adb }
            long r9 = r9.mo35100p()     // Catch:{ all -> 0x0adb }
            int r9 = (int) r9     // Catch:{ all -> 0x0adb }
            r2.mo34408d0(r9)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.p4 r9 = r1.f7816l     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.n r9 = r9.mo35179A()     // Catch:{ all -> 0x0adb }
            java.lang.String r9 = r9.mo35101q()     // Catch:{ all -> 0x0adb }
            r2.mo34412h0(r9)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.g r9 = r34.mo34912T()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.C6084a3.f7597o0     // Catch:{ all -> 0x0adb }
            boolean r9 = r9.mo34873B(r4, r10)     // Catch:{ all -> 0x0adb }
            if (r9 != 0) goto L_0x082e
            long r11 = r3.f8218m     // Catch:{ all -> 0x0adb }
            r2.mo34395M0(r11)     // Catch:{ all -> 0x0adb }
        L_0x082e:
            com.google.android.gms.measurement.internal.p4 r9 = r1.f7816l     // Catch:{ all -> 0x0adb }
            boolean r9 = r9.mo35204o()     // Catch:{ all -> 0x0adb }
            if (r9 == 0) goto L_0x0842
            r2.mo34414j0()     // Catch:{ all -> 0x0adb }
            boolean r9 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0adb }
            if (r9 != 0) goto L_0x0842
            r2.mo34377D(r4)     // Catch:{ all -> 0x0adb }
        L_0x0842:
            com.google.android.gms.measurement.internal.j r9 = r1.f7807c     // Catch:{ all -> 0x0adb }
            m10634Q(r9)     // Catch:{ all -> 0x0adb }
            java.lang.String r11 = r3.f8207b     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.u4 r9 = r9.mo35007T(r11)     // Catch:{ all -> 0x0adb }
            if (r9 != 0) goto L_0x08bf
            com.google.android.gms.measurement.internal.u4 r9 = new com.google.android.gms.measurement.internal.u4     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.p4 r11 = r1.f7816l     // Catch:{ all -> 0x0adb }
            java.lang.String r12 = r3.f8207b     // Catch:{ all -> 0x0adb }
            r9.<init>(r11, r12)     // Catch:{ all -> 0x0adb }
            java.lang.String r11 = r1.mo34932h0(r8)     // Catch:{ all -> 0x0adb }
            r9.mo35356i(r11)     // Catch:{ all -> 0x0adb }
            java.lang.String r11 = r3.f8217l     // Catch:{ all -> 0x0adb }
            r9.mo35373w(r11)     // Catch:{ all -> 0x0adb }
            java.lang.String r11 = r3.f8208c     // Catch:{ all -> 0x0adb }
            r9.mo35375y(r11)     // Catch:{ all -> 0x0adb }
            boolean r11 = r8.mo43553j()     // Catch:{ all -> 0x0adb }
            if (r11 == 0) goto L_0x087a
            com.google.android.gms.measurement.internal.e8 r11 = r1.f7813i     // Catch:{ all -> 0x0adb }
            java.lang.String r12 = r3.f8207b     // Catch:{ all -> 0x0adb }
            java.lang.String r11 = r11.mo34856o(r12)     // Catch:{ all -> 0x0adb }
            r9.mo35321H(r11)     // Catch:{ all -> 0x0adb }
        L_0x087a:
            r11 = 0
            r9.mo35317D(r11)     // Catch:{ all -> 0x0adb }
            r9.mo35318E(r11)     // Catch:{ all -> 0x0adb }
            r9.mo35316C(r11)     // Catch:{ all -> 0x0adb }
            java.lang.String r11 = r3.f8209d     // Catch:{ all -> 0x0adb }
            r9.mo35360k(r11)     // Catch:{ all -> 0x0adb }
            long r11 = r3.f8216k     // Catch:{ all -> 0x0adb }
            r9.mo35362l(r11)     // Catch:{ all -> 0x0adb }
            java.lang.String r11 = r3.f8210e     // Catch:{ all -> 0x0adb }
            r9.mo35358j(r11)     // Catch:{ all -> 0x0adb }
            long r11 = r3.f8211f     // Catch:{ all -> 0x0adb }
            r9.mo35376z(r11)     // Catch:{ all -> 0x0adb }
            long r11 = r3.f8212g     // Catch:{ all -> 0x0adb }
            r9.mo35370t(r11)     // Catch:{ all -> 0x0adb }
            boolean r11 = r3.f8214i     // Catch:{ all -> 0x0adb }
            r9.mo35319F(r11)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.g r11 = r34.mo34912T()     // Catch:{ all -> 0x0adb }
            boolean r10 = r11.mo34873B(r4, r10)     // Catch:{ all -> 0x0adb }
            if (r10 != 0) goto L_0x08b2
            long r10 = r3.f8218m     // Catch:{ all -> 0x0adb }
            r9.mo35354h(r10)     // Catch:{ all -> 0x0adb }
        L_0x08b2:
            long r10 = r3.f8225t     // Catch:{ all -> 0x0adb }
            r9.mo35371u(r10)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j r10 = r1.f7807c     // Catch:{ all -> 0x0adb }
            m10634Q(r10)     // Catch:{ all -> 0x0adb }
            r10.mo35027q(r9)     // Catch:{ all -> 0x0adb }
        L_0x08bf:
            boolean r8 = r8.mo43554k()     // Catch:{ all -> 0x0adb }
            if (r8 == 0) goto L_0x08dc
            java.lang.String r8 = r9.mo35351f0()     // Catch:{ all -> 0x0adb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0adb }
            if (r8 != 0) goto L_0x08dc
            java.lang.String r8 = r9.mo35351f0()     // Catch:{ all -> 0x0adb }
            java.lang.Object r8 = p231t4.C9713p.m20275j(r8)     // Catch:{ all -> 0x0adb }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0adb }
            r2.mo34424s(r8)     // Catch:{ all -> 0x0adb }
        L_0x08dc:
            java.lang.String r8 = r9.mo35357i0()     // Catch:{ all -> 0x0adb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0adb }
            if (r8 != 0) goto L_0x08f3
            java.lang.String r8 = r9.mo35357i0()     // Catch:{ all -> 0x0adb }
            java.lang.Object r8 = p231t4.C9713p.m20275j(r8)     // Catch:{ all -> 0x0adb }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0adb }
            r2.mo34386I(r8)     // Catch:{ all -> 0x0adb }
        L_0x08f3:
            com.google.android.gms.measurement.internal.j r8 = r1.f7807c     // Catch:{ all -> 0x0adb }
            m10634Q(r8)     // Catch:{ all -> 0x0adb }
            java.lang.String r3 = r3.f8207b     // Catch:{ all -> 0x0adb }
            java.util.List r3 = r8.mo35017e0(r3)     // Catch:{ all -> 0x0adb }
            r13 = r31
        L_0x0900:
            int r8 = r3.size()     // Catch:{ all -> 0x0adb }
            if (r13 >= r8) goto L_0x0936
            com.google.android.gms.internal.measurement.d5 r8 = com.google.android.gms.internal.measurement.C5721e5.m9094z()     // Catch:{ all -> 0x0adb }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.l9 r9 = (com.google.android.gms.measurement.internal.C6212l9) r9     // Catch:{ all -> 0x0adb }
            java.lang.String r9 = r9.f7962c     // Catch:{ all -> 0x0adb }
            r8.mo33830w(r9)     // Catch:{ all -> 0x0adb }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.l9 r9 = (com.google.android.gms.measurement.internal.C6212l9) r9     // Catch:{ all -> 0x0adb }
            long r9 = r9.f7963d     // Catch:{ all -> 0x0adb }
            r8.mo33831x(r9)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.i9 r9 = r1.f7811g     // Catch:{ all -> 0x0adb }
            m10634Q(r9)     // Catch:{ all -> 0x0adb }
            java.lang.Object r10 = r3.get(r13)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.l9 r10 = (com.google.android.gms.measurement.internal.C6212l9) r10     // Catch:{ all -> 0x0adb }
            java.lang.Object r10 = r10.f7964e     // Catch:{ all -> 0x0adb }
            r9.mo34994M(r8, r10)     // Catch:{ all -> 0x0adb }
            r2.mo34435x0(r8)     // Catch:{ all -> 0x0adb }
            int r13 = r13 + 1
            goto L_0x0900
        L_0x0936:
            com.google.android.gms.measurement.internal.j r3 = r1.f7807c     // Catch:{ IOException -> 0x0a91 }
            m10634Q(r3)     // Catch:{ IOException -> 0x0a91 }
            com.google.android.gms.internal.measurement.v8 r8 = r2.mo34354l()     // Catch:{ IOException -> 0x0a91 }
            com.google.android.gms.internal.measurement.u4 r8 = (com.google.android.gms.internal.measurement.C5983u4) r8     // Catch:{ IOException -> 0x0a91 }
            r3.mo34778h()     // Catch:{ IOException -> 0x0a91 }
            r3.mo35406i()     // Catch:{ IOException -> 0x0a91 }
            p231t4.C9713p.m20275j(r8)     // Catch:{ IOException -> 0x0a91 }
            java.lang.String r9 = r8.mo34495N1()     // Catch:{ IOException -> 0x0a91 }
            p231t4.C9713p.m20271f(r9)     // Catch:{ IOException -> 0x0a91 }
            byte[] r9 = r8.mo34044j()     // Catch:{ IOException -> 0x0a91 }
            com.google.android.gms.measurement.internal.g9 r10 = r3.f8374b     // Catch:{ IOException -> 0x0a91 }
            com.google.android.gms.measurement.internal.i9 r10 = r10.f7811g     // Catch:{ IOException -> 0x0a91 }
            m10634Q(r10)     // Catch:{ IOException -> 0x0a91 }
            long r10 = r10.mo34997y(r9)     // Catch:{ IOException -> 0x0a91 }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ IOException -> 0x0a91 }
            r12.<init>()     // Catch:{ IOException -> 0x0a91 }
            java.lang.String r13 = r8.mo34495N1()     // Catch:{ IOException -> 0x0a91 }
            r14 = r30
            r12.put(r14, r13)     // Catch:{ IOException -> 0x0a91 }
            java.lang.Long r13 = java.lang.Long.valueOf(r10)     // Catch:{ IOException -> 0x0a91 }
            r15 = r33
            r12.put(r15, r13)     // Catch:{ IOException -> 0x0a91 }
            java.lang.String r13 = "metadata"
            r12.put(r13, r9)     // Catch:{ IOException -> 0x0a91 }
            android.database.sqlite.SQLiteDatabase r9 = r3.mo35005R()     // Catch:{ SQLiteException -> 0x0a77 }
            java.lang.String r13 = "raw_events_metadata"
            r7 = 4
            r9.insertWithOnConflict(r13, r4, r12, r7)     // Catch:{ SQLiteException -> 0x0a77 }
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c     // Catch:{ all -> 0x0adb }
            m10634Q(r2)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.r r3 = r5.f8041f     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.q r7 = new com.google.android.gms.measurement.internal.q     // Catch:{ all -> 0x0adb }
            r7.<init>(r3)     // Catch:{ all -> 0x0adb }
        L_0x0992:
            boolean r3 = r7.hasNext()     // Catch:{ all -> 0x0adb }
            if (r3 == 0) goto L_0x09a4
            java.lang.String r3 = r7.next()     // Catch:{ all -> 0x0adb }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0adb }
            if (r3 == 0) goto L_0x0992
        L_0x09a2:
            r13 = 1
            goto L_0x09e6
        L_0x09a4:
            com.google.android.gms.measurement.internal.j4 r3 = r1.f7805a     // Catch:{ all -> 0x0adb }
            m10634Q(r3)     // Catch:{ all -> 0x0adb }
            java.lang.String r6 = r5.f8036a     // Catch:{ all -> 0x0adb }
            java.lang.String r7 = r5.f8037b     // Catch:{ all -> 0x0adb }
            boolean r3 = r3.mo35049w(r6, r7)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j r6 = r1.f7807c     // Catch:{ all -> 0x0adb }
            m10634Q(r6)     // Catch:{ all -> 0x0adb }
            long r17 = r34.mo34909F()     // Catch:{ all -> 0x0adb }
            java.lang.String r7 = r5.f8036a     // Catch:{ all -> 0x0adb }
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r16 = r6
            r19 = r7
            com.google.android.gms.measurement.internal.h r6 = r16.mo35009V(r17, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0adb }
            if (r3 == 0) goto L_0x09e4
            long r6 = r6.f7835e     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.g r3 = r34.mo34912T()     // Catch:{ all -> 0x0adb }
            java.lang.String r8 = r5.f8036a     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.z2<java.lang.Integer> r9 = com.google.android.gms.measurement.internal.C6084a3.f7598p     // Catch:{ all -> 0x0adb }
            int r3 = r3.mo34884o(r8, r9)     // Catch:{ all -> 0x0adb }
            long r8 = (long) r3     // Catch:{ all -> 0x0adb }
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x09e4
            goto L_0x09a2
        L_0x09e4:
            r13 = r31
        L_0x09e6:
            r2.mo34778h()     // Catch:{ all -> 0x0adb }
            r2.mo35406i()     // Catch:{ all -> 0x0adb }
            p231t4.C9713p.m20275j(r5)     // Catch:{ all -> 0x0adb }
            java.lang.String r3 = r5.f8036a     // Catch:{ all -> 0x0adb }
            p231t4.C9713p.m20271f(r3)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.g9 r3 = r2.f8374b     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.i9 r3 = r3.f7811g     // Catch:{ all -> 0x0adb }
            m10634Q(r3)     // Catch:{ all -> 0x0adb }
            com.google.android.gms.internal.measurement.k4 r3 = r3.mo34987C(r5)     // Catch:{ all -> 0x0adb }
            byte[] r3 = r3.mo34044j()     // Catch:{ all -> 0x0adb }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0adb }
            r6.<init>()     // Catch:{ all -> 0x0adb }
            java.lang.String r7 = r5.f8036a     // Catch:{ all -> 0x0adb }
            r6.put(r14, r7)     // Catch:{ all -> 0x0adb }
            java.lang.String r7 = "name"
            java.lang.String r8 = r5.f8037b     // Catch:{ all -> 0x0adb }
            r6.put(r7, r8)     // Catch:{ all -> 0x0adb }
            java.lang.String r7 = "timestamp"
            long r8 = r5.f8039d     // Catch:{ all -> 0x0adb }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0adb }
            r6.put(r7, r8)     // Catch:{ all -> 0x0adb }
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0adb }
            r6.put(r15, r7)     // Catch:{ all -> 0x0adb }
            java.lang.String r7 = "data"
            r6.put(r7, r3)     // Catch:{ all -> 0x0adb }
            java.lang.String r3 = "realtime"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0adb }
            r6.put(r3, r7)     // Catch:{ all -> 0x0adb }
            android.database.sqlite.SQLiteDatabase r3 = r2.mo35005R()     // Catch:{ SQLiteException -> 0x0a5f }
            r7 = r32
            long r3 = r3.insert(r7, r4, r6)     // Catch:{ SQLiteException -> 0x0a5f }
            r6 = -1
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0a5a
            com.google.android.gms.measurement.internal.p4 r3 = r2.f7899a     // Catch:{ SQLiteException -> 0x0a5f }
            com.google.android.gms.measurement.internal.l3 r3 = r3.mo34920b()     // Catch:{ SQLiteException -> 0x0a5f }
            com.google.android.gms.measurement.internal.j3 r3 = r3.mo35075r()     // Catch:{ SQLiteException -> 0x0a5f }
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            java.lang.String r6 = r5.f8036a     // Catch:{ SQLiteException -> 0x0a5f }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r6)     // Catch:{ SQLiteException -> 0x0a5f }
            r3.mo35038b(r4, r6)     // Catch:{ SQLiteException -> 0x0a5f }
            goto L_0x0aa8
        L_0x0a5a:
            r3 = 0
            r1.f7819o = r3     // Catch:{ all -> 0x0adb }
            goto L_0x0aa8
        L_0x0a5f:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35075r()     // Catch:{ all -> 0x0adb }
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r5 = r5.f8036a     // Catch:{ all -> 0x0adb }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r5)     // Catch:{ all -> 0x0adb }
            r2.mo35039c(r4, r5, r3)     // Catch:{ all -> 0x0adb }
            goto L_0x0aa8
        L_0x0a77:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.p4 r3 = r3.f7899a     // Catch:{ IOException -> 0x0a91 }
            com.google.android.gms.measurement.internal.l3 r3 = r3.mo34920b()     // Catch:{ IOException -> 0x0a91 }
            com.google.android.gms.measurement.internal.j3 r3 = r3.mo35075r()     // Catch:{ IOException -> 0x0a91 }
            java.lang.String r5 = "Error storing raw event metadata. appId"
            java.lang.String r6 = r8.mo34495N1()     // Catch:{ IOException -> 0x0a91 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r6)     // Catch:{ IOException -> 0x0a91 }
            r3.mo35039c(r5, r6, r4)     // Catch:{ IOException -> 0x0a91 }
            throw r4     // Catch:{ IOException -> 0x0a91 }
        L_0x0a91:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.l3 r4 = r34.mo34920b()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j3 r4 = r4.mo35075r()     // Catch:{ all -> 0x0adb }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.mo34414j0()     // Catch:{ all -> 0x0adb }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r2)     // Catch:{ all -> 0x0adb }
            r4.mo35039c(r5, r2, r3)     // Catch:{ all -> 0x0adb }
        L_0x0aa8:
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c     // Catch:{ all -> 0x0adb }
            m10634Q(r2)     // Catch:{ all -> 0x0adb }
            r2.mo35026p()     // Catch:{ all -> 0x0adb }
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c
            m10634Q(r2)
            r2.mo35021i0()
            r34.m10629L()
            com.google.android.gms.measurement.internal.l3 r2 = r34.mo34920b()
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35079v()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r28
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.mo35038b(r4, r3)
            return
        L_0x0adb:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.j r3 = r1.f7807c
            m10634Q(r3)
            r3.mo35021i0()
            throw r2
        L_0x0ae6:
            r1.mo34910R(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6157g9.mo34907B(com.google.android.gms.measurement.internal.t, com.google.android.gms.measurement.internal.s9):void");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: C */
    public final boolean mo34908C() {
        mo34919a().mo34778h();
        FileLock fileLock = this.f7826v;
        if (fileLock == null || !fileLock.isValid()) {
            this.f7807c.f7899a.mo35211z();
            try {
                FileChannel channel = new RandomAccessFile(new File(this.f7816l.mo34927f().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.f7827w = channel;
                FileLock tryLock = channel.tryLock();
                this.f7826v = tryLock;
                if (tryLock != null) {
                    mo34920b().mo35079v().mo35037a("Storage concurrent access okay");
                    return true;
                }
                mo34920b().mo35075r().mo35037a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                mo34920b().mo35075r().mo35038b("Failed to acquire storage lock", e);
                return false;
            } catch (IOException e2) {
                mo34920b().mo35075r().mo35038b("Failed to access storage lock file", e2);
                return false;
            } catch (OverlappingFileLockException e3) {
                mo34920b().mo35080w().mo35038b("Storage lock already acquired", e3);
                return false;
            }
        } else {
            mo34920b().mo35079v().mo35037a("Storage concurrent access okay");
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final long mo34909F() {
        long a = mo34922c().mo33547a();
        C6134e8 e8Var = this.f7813i;
        e8Var.mo35406i();
        e8Var.mo34778h();
        long a2 = e8Var.f7756k.mo35384a();
        if (a2 == 0) {
            a2 = ((long) e8Var.f7899a.mo35191N().mo35151t().nextInt(86400000)) + 1;
            e8Var.f7756k.mo35385b(a2);
        }
        return ((((a + a2) / 1000) / 60) / 60) / 24;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: R */
    public final C6306u4 mo34910R(C6289s9 s9Var) {
        String str;
        mo34919a().mo34778h();
        mo34929g();
        C9713p.m20275j(s9Var);
        C9713p.m20271f(s9Var.f8207b);
        C6180j jVar = this.f7807c;
        m10634Q(jVar);
        C6306u4 T = jVar.mo35007T(s9Var.f8207b);
        C9254a c = mo34913U(s9Var.f8207b).mo43546c(C9254a.m18988b(s9Var.f8228w));
        if (c.mo43553j()) {
            str = this.f7813i.mo34856o(s9Var.f8207b);
        } else {
            str = "";
        }
        if (T == null) {
            T = new C6306u4(this.f7816l, s9Var.f8207b);
            if (c.mo43554k()) {
                T.mo35356i(mo34932h0(c));
            }
            if (c.mo43553j()) {
                T.mo35321H(str);
            }
        } else if (c.mo43553j() && str != null && !str.equals(T.mo35342b())) {
            T.mo35321H(str);
            C5910pb.m9760b();
            C6147g T2 = mo34912T();
            C6359z2<Boolean> z2Var = C6084a3.f7615x0;
            if (!T2.mo34873B((String) null, z2Var) || !mo34912T().mo34873B((String) null, C6084a3.f7540B0)) {
                T.mo35356i(mo34932h0(c));
            } else if (!"00000000-0000-0000-0000-000000000000".equals(this.f7813i.mo34855n(s9Var.f8207b, c).first)) {
                T.mo35356i(mo34932h0(c));
            }
            C5910pb.m9760b();
            if (mo34912T().mo34873B((String) null, z2Var) && !"00000000-0000-0000-0000-000000000000".equals(this.f7813i.mo34855n(s9Var.f8207b, c).first)) {
                C6180j jVar2 = this.f7807c;
                m10634Q(jVar2);
                if (jVar2.mo35012Z(s9Var.f8207b, "_id") != null) {
                    C6180j jVar3 = this.f7807c;
                    m10634Q(jVar3);
                    if (jVar3.mo35012Z(s9Var.f8207b, "_lair") == null) {
                        C6212l9 l9Var = new C6212l9(s9Var.f8207b, "auto", "_lair", mo34922c().mo33547a(), 1L);
                        C6180j jVar4 = this.f7807c;
                        m10634Q(jVar4);
                        jVar4.mo35036z(l9Var);
                    }
                }
            }
        } else if (TextUtils.isEmpty(T.mo35351f0()) && c.mo43554k()) {
            T.mo35356i(mo34932h0(c));
        }
        T.mo35375y(s9Var.f8208c);
        T.mo35350f(s9Var.f8223r);
        C5831kd.m9523b();
        if (mo34912T().mo34873B(T.mo35349e0(), C6084a3.f7577e0)) {
            T.mo35374x(s9Var.f8227v);
        }
        if (!TextUtils.isEmpty(s9Var.f8217l)) {
            T.mo35373w(s9Var.f8217l);
        }
        long j = s9Var.f8211f;
        if (j != 0) {
            T.mo35376z(j);
        }
        if (!TextUtils.isEmpty(s9Var.f8209d)) {
            T.mo35360k(s9Var.f8209d);
        }
        T.mo35362l(s9Var.f8216k);
        String str2 = s9Var.f8210e;
        if (str2 != null) {
            T.mo35358j(str2);
        }
        T.mo35370t(s9Var.f8212g);
        T.mo35319F(s9Var.f8214i);
        if (!TextUtils.isEmpty(s9Var.f8213h)) {
            T.mo35315B(s9Var.f8213h);
        }
        if (!mo34912T().mo34873B((String) null, C6084a3.f7597o0)) {
            T.mo35354h(s9Var.f8218m);
        }
        T.mo35352g(s9Var.f8221p);
        T.mo35320G(s9Var.f8224s);
        T.mo35371u(s9Var.f8225t);
        if (T.mo35325L()) {
            C6180j jVar5 = this.f7807c;
            m10634Q(jVar5);
            jVar5.mo35027q(T);
        }
        return T;
    }

    /* renamed from: S */
    public final C6091aa mo34911S() {
        C6091aa aaVar = this.f7810f;
        m10634Q(aaVar);
        return aaVar;
    }

    /* renamed from: T */
    public final C6147g mo34912T() {
        return ((C6251p4) C9713p.m20275j(this.f7816l)).mo35211z();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: U */
    public final C9254a mo34913U(String str) {
        String str2;
        mo34919a().mo34778h();
        mo34929g();
        C9254a aVar = this.f7803A.get(str);
        if (aVar != null) {
            return aVar;
        }
        C6180j jVar = this.f7807c;
        m10634Q(jVar);
        C9713p.m20275j(str);
        jVar.mo34778h();
        jVar.mo35406i();
        Cursor cursor = null;
        try {
            Cursor rawQuery = jVar.mo35005R().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(0);
                rawQuery.close();
            } else {
                rawQuery.close();
                str2 = "G1";
            }
            C9254a b = C9254a.m18988b(str2);
            mo34951y(str, b);
            return b;
        } catch (SQLiteException e) {
            jVar.f7899a.mo34920b().mo35075r().mo35039c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: V */
    public final C6180j mo34914V() {
        C6180j jVar = this.f7807c;
        m10634Q(jVar);
        return jVar;
    }

    /* renamed from: W */
    public final C6151g3 mo34915W() {
        return this.f7816l.mo35182D();
    }

    /* renamed from: X */
    public final C6261q3 mo34916X() {
        C6261q3 q3Var = this.f7806b;
        m10634Q(q3Var);
        return q3Var;
    }

    /* renamed from: Y */
    public final C6283s3 mo34917Y() {
        C6283s3 s3Var = this.f7808d;
        if (s3Var != null) {
            return s3Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: Z */
    public final C6185j4 mo34918Z() {
        C6185j4 j4Var = this.f7805a;
        m10634Q(j4Var);
        return j4Var;
    }

    /* renamed from: a */
    public final C6229n4 mo34919a() {
        return ((C6251p4) C9713p.m20275j(this.f7816l)).mo34919a();
    }

    /* renamed from: b */
    public final C6206l3 mo34920b() {
        return ((C6251p4) C9713p.m20275j(this.f7816l)).mo34920b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final C6251p4 mo34921b0() {
        return this.f7816l;
    }

    /* renamed from: c */
    public final C10671e mo34922c() {
        return ((C6251p4) C9713p.m20275j(this.f7816l)).mo34922c();
    }

    /* renamed from: c0 */
    public final C6308u6 mo34923c0() {
        C6308u6 u6Var = this.f7812h;
        m10634Q(u6Var);
        return u6Var;
    }

    /* renamed from: d */
    public final C6092b mo34924d() {
        throw null;
    }

    /* renamed from: d0 */
    public final C6134e8 mo34925d0() {
        return this.f7813i;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: e */
    public final void mo34926e() {
        mo34919a().mo34778h();
        mo34929g();
        if (!this.f7818n) {
            this.f7818n = true;
            if (mo34908C()) {
                FileChannel fileChannel = this.f7827w;
                mo34919a().mo34778h();
                int i = 0;
                if (fileChannel == null || !fileChannel.isOpen()) {
                    mo34920b().mo35075r().mo35037a("Bad channel to read from");
                } else {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0);
                        int read = fileChannel.read(allocate);
                        if (read == 4) {
                            allocate.flip();
                            i = allocate.getInt();
                        } else if (read != -1) {
                            mo34920b().mo35080w().mo35038b("Unexpected data length. Bytes read", Integer.valueOf(read));
                        }
                    } catch (IOException e) {
                        mo34920b().mo35075r().mo35038b("Failed to read from channel", e);
                    }
                }
                int p = this.f7816l.mo35180B().mo34807p();
                mo34919a().mo34778h();
                if (i > p) {
                    mo34920b().mo35075r().mo35039c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(p));
                } else if (i < p) {
                    FileChannel fileChannel2 = this.f7827w;
                    mo34919a().mo34778h();
                    if (fileChannel2 == null || !fileChannel2.isOpen()) {
                        mo34920b().mo35075r().mo35037a("Bad channel to read from");
                    } else {
                        ByteBuffer allocate2 = ByteBuffer.allocate(4);
                        allocate2.putInt(p);
                        allocate2.flip();
                        try {
                            fileChannel2.truncate(0);
                            boolean B = mo34912T().mo34873B((String) null, C6084a3.f7593m0);
                            fileChannel2.write(allocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                mo34920b().mo35075r().mo35038b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            mo34920b().mo35079v().mo35039c("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(p));
                            return;
                        } catch (IOException e2) {
                            mo34920b().mo35075r().mo35038b("Failed to write to channel", e2);
                        }
                    }
                    mo34920b().mo35075r().mo35039c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(p));
                }
            }
        }
    }

    /* renamed from: f */
    public final Context mo34927f() {
        return this.f7816l.mo34927f();
    }

    /* renamed from: f0 */
    public final C6179i9 mo34928f0() {
        C6179i9 i9Var = this.f7811g;
        m10634Q(i9Var);
        return i9Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo34929g() {
        if (!this.f7817m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: g0 */
    public final C6234n9 mo34930g0() {
        return ((C6251p4) C9713p.m20275j(this.f7816l)).mo35191N();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: h */
    public final void mo34931h(C6306u4 u4Var) {
        String str;
        mo34919a().mo34778h();
        C5831kd.m9523b();
        C6147g T = mo34912T();
        String e0 = u4Var.mo35349e0();
        C6359z2<Boolean> z2Var = C6084a3.f7577e0;
        if (T.mo34873B(e0, z2Var)) {
            if (TextUtils.isEmpty(u4Var.mo35361k0()) && TextUtils.isEmpty(u4Var.mo35359j0()) && TextUtils.isEmpty(u4Var.mo35345c0())) {
                mo34939m((String) C9713p.m20275j(u4Var.mo35349e0()), ComposerKt.providerMapsKey, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
                return;
            }
        } else if (TextUtils.isEmpty(u4Var.mo35361k0()) && TextUtils.isEmpty(u4Var.mo35345c0())) {
            mo34939m((String) C9713p.m20275j(u4Var.mo35349e0()), ComposerKt.providerMapsKey, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
            return;
        }
        C6354y8 y8Var = this.f7814j;
        Uri.Builder builder = new Uri.Builder();
        String k0 = u4Var.mo35361k0();
        if (TextUtils.isEmpty(k0)) {
            C5831kd.m9523b();
            if (y8Var.f7899a.mo35211z().mo34873B(u4Var.mo35349e0(), z2Var)) {
                k0 = u4Var.mo35359j0();
                if (TextUtils.isEmpty(k0)) {
                    k0 = u4Var.mo35345c0();
                }
            } else {
                k0 = u4Var.mo35345c0();
            }
        }
        ArrayMap arrayMap = null;
        Uri.Builder encodedAuthority = builder.scheme(C6084a3.f7578f.mo35421a(null)).encodedAuthority(C6084a3.f7580g.mo35421a(null));
        String valueOf = String.valueOf(k0);
        if (valueOf.length() != 0) {
            str = "config/app/".concat(valueOf);
        } else {
            str = new String("config/app/");
        }
        Uri.Builder appendQueryParameter = encodedAuthority.path(str).appendQueryParameter("app_instance_id", u4Var.mo35351f0()).appendQueryParameter("platform", SystemMediaRouteProvider.PACKAGE_NAME);
        y8Var.f7899a.mo35211z().mo34886q();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(46000));
        C5713de.m9057b();
        if (y8Var.f7899a.mo35211z().mo34873B(u4Var.mo35349e0(), C6084a3.f7611v0)) {
            builder.appendQueryParameter("runtime_version", "0");
        }
        String uri = builder.build().toString();
        try {
            String str2 = (String) C9713p.m20275j(u4Var.mo35349e0());
            URL url = new URL(uri);
            mo34920b().mo35079v().mo35038b("Fetching remote configuration", str2);
            C6185j4 j4Var = this.f7805a;
            m10634Q(j4Var);
            C6046y3 o = j4Var.mo35042o(str2);
            C6185j4 j4Var2 = this.f7805a;
            m10634Q(j4Var2);
            String p = j4Var2.mo35043p(str2);
            if (o != null && !TextUtils.isEmpty(p)) {
                arrayMap = new ArrayMap();
                arrayMap.put("If-Modified-Since", p);
            }
            this.f7823s = true;
            C6261q3 q3Var = this.f7806b;
            m10634Q(q3Var);
            C6102b9 b9Var = new C6102b9(this);
            q3Var.mo34778h();
            q3Var.mo35406i();
            C9713p.m20275j(url);
            C9713p.m20275j(b9Var);
            q3Var.f7899a.mo34919a().mo35109y(new C6250p3(q3Var, str2, url, (byte[]) null, arrayMap, b9Var));
        } catch (MalformedURLException unused) {
            mo34920b().mo35075r().mo35039c("Failed to parse config URL. Not fetching. appId", C6206l3.m10862z(u4Var.mo35349e0()), uri);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: h0 */
    public final String mo34932h0(C9254a aVar) {
        if (!aVar.mo43554k()) {
            return null;
        }
        byte[] bArr = new byte[16];
        mo34930g0().mo35151t().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: i */
    public final void mo34933i(C6290t tVar, C6289s9 s9Var) {
        C6290t tVar2;
        List<C6103c> list;
        List<C6103c> list2;
        List<C6103c> list3;
        C6289s9 s9Var2 = s9Var;
        C9713p.m20275j(s9Var);
        C9713p.m20271f(s9Var2.f8207b);
        mo34919a().mo34778h();
        mo34929g();
        String str = s9Var2.f8207b;
        C6290t tVar3 = tVar;
        long j = tVar3.f8232e;
        C5865me.m9646b();
        if (mo34912T().mo34873B((String) null, C6084a3.f7542C0)) {
            C6217m3 b = C6217m3.m10886b(tVar);
            mo34919a().mo34778h();
            C6234n9.m10936x((C6319v6) null, b.f7975d, false);
            tVar3 = b.mo35092a();
        }
        m10634Q(this.f7811g);
        if (C6179i9.m10735n(tVar3, s9Var2)) {
            if (!s9Var2.f8214i) {
                mo34910R(s9Var2);
                return;
            }
            List<String> list4 = s9Var2.f8226u;
            if (list4 == null) {
                tVar2 = tVar3;
            } else if (list4.contains(tVar3.f8229b)) {
                Bundle G = tVar3.f8230c.mo35270G();
                G.putLong("ga_safelisted", 1);
                tVar2 = new C6290t(tVar3.f8229b, new C6268r(G), tVar3.f8231d, tVar3.f8232e);
            } else {
                mo34920b().mo35074q().mo35040d("Dropping non-safelisted event. appId, event name, origin", str, tVar3.f8229b, tVar3.f8231d);
                return;
            }
            C6180j jVar = this.f7807c;
            m10634Q(jVar);
            jVar.mo35019g0();
            try {
                C6180j jVar2 = this.f7807c;
                m10634Q(jVar2);
                C9713p.m20271f(str);
                jVar2.mo34778h();
                jVar2.mo35406i();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i < 0) {
                    jVar2.f7899a.mo34920b().mo35080w().mo35039c("Invalid time querying timed out conditional properties", C6206l3.m10862z(str), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = jVar2.mo35016d0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (C6103c next : list) {
                    if (next != null) {
                        mo34920b().mo35079v().mo35040d("User property timed out", next.f7652b, this.f7816l.mo35182D().mo34901f(next.f7654d.f7907c), next.f7654d.mo35057A());
                        C6290t tVar4 = next.f7658h;
                        if (tVar4 != null) {
                            mo34907B(new C6290t(tVar4, j), s9Var2);
                        }
                        C6180j jVar3 = this.f7807c;
                        m10634Q(jVar3);
                        jVar3.mo35000K(str, next.f7654d.f7907c);
                    }
                }
                C6180j jVar4 = this.f7807c;
                m10634Q(jVar4);
                C9713p.m20271f(str);
                jVar4.mo34778h();
                jVar4.mo35406i();
                if (i < 0) {
                    jVar4.f7899a.mo34920b().mo35080w().mo35039c("Invalid time querying expired conditional properties", C6206l3.m10862z(str), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = jVar4.mo35016d0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                ArrayList<C6290t> arrayList = new ArrayList<>(list2.size());
                for (C6103c next2 : list2) {
                    if (next2 != null) {
                        mo34920b().mo35079v().mo35040d("User property expired", next2.f7652b, this.f7816l.mo35182D().mo34901f(next2.f7654d.f7907c), next2.f7654d.mo35057A());
                        C6180j jVar5 = this.f7807c;
                        m10634Q(jVar5);
                        jVar5.mo35024n(str, next2.f7654d.f7907c);
                        C6290t tVar5 = next2.f7662l;
                        if (tVar5 != null) {
                            arrayList.add(tVar5);
                        }
                        C6180j jVar6 = this.f7807c;
                        m10634Q(jVar6);
                        jVar6.mo35000K(str, next2.f7654d.f7907c);
                    }
                }
                for (C6290t tVar6 : arrayList) {
                    mo34907B(new C6290t(tVar6, j), s9Var2);
                }
                C6180j jVar7 = this.f7807c;
                m10634Q(jVar7);
                String str2 = tVar2.f8229b;
                C9713p.m20271f(str);
                C9713p.m20271f(str2);
                jVar7.mo34778h();
                jVar7.mo35406i();
                if (i < 0) {
                    jVar7.f7899a.mo34920b().mo35080w().mo35040d("Invalid time querying triggered conditional properties", C6206l3.m10862z(str), jVar7.f7899a.mo35182D().mo34899d(str2), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = jVar7.mo35016d0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                ArrayList<C6290t> arrayList2 = new ArrayList<>(list3.size());
                for (C6103c next3 : list3) {
                    if (next3 != null) {
                        C6190j9 j9Var = next3.f7654d;
                        C6212l9 l9Var = new C6212l9((String) C9713p.m20275j(next3.f7652b), next3.f7653c, j9Var.f7907c, j, C9713p.m20275j(j9Var.mo35057A()));
                        C6180j jVar8 = this.f7807c;
                        m10634Q(jVar8);
                        if (jVar8.mo35036z(l9Var)) {
                            mo34920b().mo35079v().mo35040d("User property triggered", next3.f7652b, this.f7816l.mo35182D().mo34901f(l9Var.f7962c), l9Var.f7964e);
                        } else {
                            mo34920b().mo35075r().mo35040d("Too many active user properties, ignoring", C6206l3.m10862z(next3.f7652b), this.f7816l.mo35182D().mo34901f(l9Var.f7962c), l9Var.f7964e);
                        }
                        C6290t tVar7 = next3.f7660j;
                        if (tVar7 != null) {
                            arrayList2.add(tVar7);
                        }
                        next3.f7654d = new C6190j9(l9Var);
                        next3.f7656f = true;
                        C6180j jVar9 = this.f7807c;
                        m10634Q(jVar9);
                        jVar9.mo35035y(next3);
                    }
                }
                mo34907B(tVar2, s9Var2);
                for (C6290t tVar8 : arrayList2) {
                    mo34907B(new C6290t(tVar8, j), s9Var2);
                }
                C6180j jVar10 = this.f7807c;
                m10634Q(jVar10);
                jVar10.mo35026p();
            } finally {
                C6180j jVar11 = this.f7807c;
                m10634Q(jVar11);
                jVar11.mo35021i0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final String mo34934i0(C6289s9 s9Var) {
        try {
            return (String) mo34919a().mo35107s(new C6113c9(this, s9Var)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            mo34920b().mo35075r().mo35039c("Failed to get app instance id. appId", C6206l3.m10862z(s9Var.f8207b), e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: j */
    public final void mo34935j(C6290t tVar, String str) {
        String str2;
        C6290t tVar2 = tVar;
        String str3 = str;
        C6180j jVar = this.f7807c;
        m10634Q(jVar);
        C6306u4 T = jVar.mo35007T(str3);
        if (T == null || TextUtils.isEmpty(T.mo35355h0())) {
            mo34920b().mo35074q().mo35038b("No app data available; dropping event", str3);
            return;
        }
        Boolean H = m10625H(T);
        if (H == null) {
            if (!"_ui".equals(tVar2.f8229b)) {
                mo34920b().mo35080w().mo35038b("Could not find package. appId", C6206l3.m10862z(str));
            }
        } else if (!H.booleanValue()) {
            mo34920b().mo35075r().mo35038b("App version does not match; dropping event. appId", C6206l3.m10862z(str));
            return;
        }
        String k0 = T.mo35361k0();
        String h0 = T.mo35355h0();
        long M = T.mo35326M();
        String g0 = T.mo35353g0();
        long X = T.mo35337X();
        long U = T.mo35334U();
        boolean K = T.mo35324K();
        String i0 = T.mo35357i0();
        long A = T.mo35314A();
        boolean J = T.mo35323J();
        String c0 = T.mo35345c0();
        Boolean b0 = T.mo35343b0();
        long V = T.mo35335V();
        List<String> c = T.mo35344c();
        C5831kd.m9523b();
        if (mo34912T().mo34873B(T.mo35349e0(), C6084a3.f7577e0)) {
            str2 = T.mo35359j0();
        } else {
            str2 = null;
        }
        C6289s9 s9Var = r2;
        C6289s9 s9Var2 = new C6289s9(str, k0, h0, M, g0, X, U, (String) null, K, false, i0, A, 0, 0, J, false, c0, b0, V, c, str2, mo34913U(str3).mo43552i());
        mo34936k(tVar, s9Var);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: k */
    public final void mo34936k(C6290t tVar, C6289s9 s9Var) {
        C9713p.m20271f(s9Var.f8207b);
        C6217m3 b = C6217m3.m10886b(tVar);
        C6234n9 g0 = mo34930g0();
        Bundle bundle = b.f7975d;
        C6180j jVar = this.f7807c;
        m10634Q(jVar);
        g0.mo35158y(bundle, jVar.mo35006S(s9Var.f8207b));
        mo34930g0().mo35159z(b, mo34912T().mo34883n(s9Var.f8207b));
        C6290t a = b.mo35092a();
        if ("_cmp".equals(a.f8229b) && "referrer API v2".equals(a.f8230c.mo35274K("_cis"))) {
            String K = a.f8230c.mo35274K("gclid");
            if (!TextUtils.isEmpty(K)) {
                mo34952z(new C6190j9("_lgclid", a.f8232e, K, "auto"), s9Var);
            }
        }
        mo34933i(a, s9Var);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: k0 */
    public final void mo34937k0(Runnable runnable) {
        mo34919a().mo34778h();
        if (this.f7820p == null) {
            this.f7820p = new ArrayList();
        }
        this.f7820p.add(runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo34938l() {
        this.f7822r++;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[Catch:{ all -> 0x016b, all -> 0x0175 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c A[Catch:{ all -> 0x016b, all -> 0x0175 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0126 A[Catch:{ all -> 0x016b, all -> 0x0175 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0134 A[Catch:{ all -> 0x016b, all -> 0x0175 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0156 A[Catch:{ all -> 0x016b, all -> 0x0175 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015a A[Catch:{ all -> 0x016b, all -> 0x0175 }] */
    @androidx.annotation.WorkerThread
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34939m(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            com.google.android.gms.measurement.internal.n4 r0 = r6.mo34919a()
            r0.mo34778h()
            r6.mo34929g()
            p231t4.C9713p.m20271f(r7)
            r0 = 0
            if (r10 != 0) goto L_0x0012
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0175 }
        L_0x0012:
            com.google.android.gms.measurement.internal.l3 r1 = r6.mo34920b()     // Catch:{ all -> 0x0175 }
            com.google.android.gms.measurement.internal.j3 r1 = r1.mo35079v()     // Catch:{ all -> 0x0175 }
            int r2 = r10.length     // Catch:{ all -> 0x0175 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0175 }
            java.lang.String r3 = "onConfigFetched. Response size"
            r1.mo35038b(r3, r2)     // Catch:{ all -> 0x0175 }
            com.google.android.gms.measurement.internal.j r1 = r6.f7807c     // Catch:{ all -> 0x0175 }
            m10634Q(r1)     // Catch:{ all -> 0x0175 }
            r1.mo35019g0()     // Catch:{ all -> 0x0175 }
            com.google.android.gms.measurement.internal.j r1 = r6.f7807c     // Catch:{ all -> 0x016b }
            m10634Q(r1)     // Catch:{ all -> 0x016b }
            com.google.android.gms.measurement.internal.u4 r1 = r1.mo35007T(r7)     // Catch:{ all -> 0x016b }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r8 == r3) goto L_0x0042
            r3 = 204(0xcc, float:2.86E-43)
            if (r8 == r3) goto L_0x0042
            if (r8 != r4) goto L_0x0046
            r8 = r4
        L_0x0042:
            if (r9 != 0) goto L_0x0046
            r3 = 1
            goto L_0x0047
        L_0x0046:
            r3 = r0
        L_0x0047:
            if (r1 != 0) goto L_0x005c
            com.google.android.gms.measurement.internal.l3 r8 = r6.mo34920b()     // Catch:{ all -> 0x016b }
            com.google.android.gms.measurement.internal.j3 r8 = r8.mo35080w()     // Catch:{ all -> 0x016b }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r7)     // Catch:{ all -> 0x016b }
            r8.mo35038b(r9, r7)     // Catch:{ all -> 0x016b }
            goto L_0x015d
        L_0x005c:
            r5 = 404(0x194, float:5.66E-43)
            if (r3 != 0) goto L_0x00ba
            if (r8 != r5) goto L_0x0063
            goto L_0x00ba
        L_0x0063:
            y4.e r10 = r6.mo34922c()     // Catch:{ all -> 0x016b }
            long r10 = r10.mo33547a()     // Catch:{ all -> 0x016b }
            r1.mo35372v(r10)     // Catch:{ all -> 0x016b }
            com.google.android.gms.measurement.internal.j r10 = r6.f7807c     // Catch:{ all -> 0x016b }
            m10634Q(r10)     // Catch:{ all -> 0x016b }
            r10.mo35027q(r1)     // Catch:{ all -> 0x016b }
            com.google.android.gms.measurement.internal.l3 r10 = r6.mo34920b()     // Catch:{ all -> 0x016b }
            com.google.android.gms.measurement.internal.j3 r10 = r10.mo35079v()     // Catch:{ all -> 0x016b }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x016b }
            r10.mo35039c(r11, r1, r9)     // Catch:{ all -> 0x016b }
            com.google.android.gms.measurement.internal.j4 r9 = r6.f7805a     // Catch:{ all -> 0x016b }
            m10634Q(r9)     // Catch:{ all -> 0x016b }
            r9.mo35044r(r7)     // Catch:{ all -> 0x016b }
            com.google.android.gms.measurement.internal.e8 r7 = r6.f7813i     // Catch:{ all -> 0x016b }
            com.google.android.gms.measurement.internal.v3 r7 = r7.f7755j     // Catch:{ all -> 0x016b }
            y4.e r9 = r6.mo34922c()     // Catch:{ all -> 0x016b }
            long r9 = r9.mo33547a()     // Catch:{ all -> 0x016b }
            r7.mo35385b(r9)     // Catch:{ all -> 0x016b }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00a6
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00b5
        L_0x00a6:
            com.google.android.gms.measurement.internal.e8 r7 = r6.f7813i     // Catch:{ all -> 0x016b }
            com.google.android.gms.measurement.internal.v3 r7 = r7.f7753h     // Catch:{ all -> 0x016b }
            y4.e r8 = r6.mo34922c()     // Catch:{ all -> 0x016b }
            long r8 = r8.mo33547a()     // Catch:{ all -> 0x016b }
            r7.mo35385b(r8)     // Catch:{ all -> 0x016b }
        L_0x00b5:
            r6.m10629L()     // Catch:{ all -> 0x016b }
            goto L_0x015d
        L_0x00ba:
            r9 = 0
            if (r11 == 0) goto L_0x00c6
            java.lang.String r3 = "Last-Modified"
            java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x016b }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x016b }
            goto L_0x00c7
        L_0x00c6:
            r11 = r9
        L_0x00c7:
            if (r11 == 0) goto L_0x00d6
            int r3 = r11.size()     // Catch:{ all -> 0x016b }
            if (r3 <= 0) goto L_0x00d6
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x016b }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x016b }
            goto L_0x00d7
        L_0x00d6:
            r11 = r9
        L_0x00d7:
            if (r8 == r5) goto L_0x00f5
            if (r8 != r4) goto L_0x00dc
            goto L_0x00f5
        L_0x00dc:
            com.google.android.gms.measurement.internal.j4 r9 = r6.f7805a     // Catch:{ all -> 0x016b }
            m10634Q(r9)     // Catch:{ all -> 0x016b }
            boolean r9 = r9.mo35052z(r7, r10, r11)     // Catch:{ all -> 0x016b }
            if (r9 != 0) goto L_0x0111
            com.google.android.gms.measurement.internal.j r7 = r6.f7807c     // Catch:{ all -> 0x0175 }
            m10634Q(r7)     // Catch:{ all -> 0x0175 }
        L_0x00ec:
            r7.mo35021i0()     // Catch:{ all -> 0x0175 }
            r6.f7823s = r0
            r6.m10626I()
            return
        L_0x00f5:
            com.google.android.gms.measurement.internal.j4 r10 = r6.f7805a     // Catch:{ all -> 0x016b }
            m10634Q(r10)     // Catch:{ all -> 0x016b }
            com.google.android.gms.internal.measurement.y3 r10 = r10.mo35042o(r7)     // Catch:{ all -> 0x016b }
            if (r10 != 0) goto L_0x0111
            com.google.android.gms.measurement.internal.j4 r10 = r6.f7805a     // Catch:{ all -> 0x016b }
            m10634Q(r10)     // Catch:{ all -> 0x016b }
            boolean r9 = r10.mo35052z(r7, r9, r9)     // Catch:{ all -> 0x016b }
            if (r9 != 0) goto L_0x0111
            com.google.android.gms.measurement.internal.j r7 = r6.f7807c     // Catch:{ all -> 0x0175 }
            m10634Q(r7)     // Catch:{ all -> 0x0175 }
            goto L_0x00ec
        L_0x0111:
            y4.e r9 = r6.mo34922c()     // Catch:{ all -> 0x016b }
            long r9 = r9.mo33547a()     // Catch:{ all -> 0x016b }
            r1.mo35363m(r9)     // Catch:{ all -> 0x016b }
            com.google.android.gms.measurement.internal.j r9 = r6.f7807c     // Catch:{ all -> 0x016b }
            m10634Q(r9)     // Catch:{ all -> 0x016b }
            r9.mo35027q(r1)     // Catch:{ all -> 0x016b }
            if (r8 != r5) goto L_0x0134
            com.google.android.gms.measurement.internal.l3 r8 = r6.mo34920b()     // Catch:{ all -> 0x016b }
            com.google.android.gms.measurement.internal.j3 r8 = r8.mo35081x()     // Catch:{ all -> 0x016b }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.mo35038b(r9, r7)     // Catch:{ all -> 0x016b }
            goto L_0x0145
        L_0x0134:
            com.google.android.gms.measurement.internal.l3 r7 = r6.mo34920b()     // Catch:{ all -> 0x016b }
            com.google.android.gms.measurement.internal.j3 r7 = r7.mo35079v()     // Catch:{ all -> 0x016b }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x016b }
            r7.mo35039c(r9, r8, r2)     // Catch:{ all -> 0x016b }
        L_0x0145:
            com.google.android.gms.measurement.internal.q3 r7 = r6.f7806b     // Catch:{ all -> 0x016b }
            m10634Q(r7)     // Catch:{ all -> 0x016b }
            boolean r7 = r7.mo35219m()     // Catch:{ all -> 0x016b }
            if (r7 == 0) goto L_0x015a
            boolean r7 = r6.m10632O()     // Catch:{ all -> 0x016b }
            if (r7 == 0) goto L_0x015a
            r6.mo34906A()     // Catch:{ all -> 0x016b }
            goto L_0x015d
        L_0x015a:
            r6.m10629L()     // Catch:{ all -> 0x016b }
        L_0x015d:
            com.google.android.gms.measurement.internal.j r7 = r6.f7807c     // Catch:{ all -> 0x016b }
            m10634Q(r7)     // Catch:{ all -> 0x016b }
            r7.mo35026p()     // Catch:{ all -> 0x016b }
            com.google.android.gms.measurement.internal.j r7 = r6.f7807c     // Catch:{ all -> 0x0175 }
            m10634Q(r7)     // Catch:{ all -> 0x0175 }
            goto L_0x00ec
        L_0x016b:
            r7 = move-exception
            com.google.android.gms.measurement.internal.j r8 = r6.f7807c     // Catch:{ all -> 0x0175 }
            m10634Q(r8)     // Catch:{ all -> 0x0175 }
            r8.mo35021i0()     // Catch:{ all -> 0x0175 }
            throw r7     // Catch:{ all -> 0x0175 }
        L_0x0175:
            r7 = move-exception
            r6.f7823s = r0
            r6.m10626I()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6157g9.mo34939m(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo34940n(boolean z) {
        m10629L();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: o */
    public final void mo34941o(int i, Throwable th, byte[] bArr, String str) {
        C6180j jVar;
        mo34919a().mo34778h();
        mo34929g();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f7824t = false;
                m10626I();
                throw th2;
            }
        }
        List<Long> list = (List) C9713p.m20275j(this.f7828x);
        this.f7828x = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            mo34920b().mo35079v().mo35039c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f7813i.f7755j.mo35385b(mo34922c().mo33547a());
            if (i == 503 || i == 429) {
                this.f7813i.f7753h.mo35385b(mo34922c().mo33547a());
            }
            C6180j jVar2 = this.f7807c;
            m10634Q(jVar2);
            jVar2.mo35022j0(list);
            m10629L();
            this.f7824t = false;
            m10626I();
        }
        if (th == null) {
            try {
                this.f7813i.f7754i.mo35385b(mo34922c().mo33547a());
                this.f7813i.f7755j.mo35385b(0);
                m10629L();
                mo34920b().mo35079v().mo35039c("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                C6180j jVar3 = this.f7807c;
                m10634Q(jVar3);
                jVar3.mo35019g0();
                try {
                    for (Long l : list) {
                        try {
                            jVar = this.f7807c;
                            m10634Q(jVar);
                            long longValue = l.longValue();
                            jVar.mo34778h();
                            jVar.mo35406i();
                            if (jVar.mo35005R().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            jVar.f7899a.mo34920b().mo35075r().mo35038b("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            List<Long> list2 = this.f7829y;
                            if (list2 == null || !list2.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    C6180j jVar4 = this.f7807c;
                    m10634Q(jVar4);
                    jVar4.mo35026p();
                    C6180j jVar5 = this.f7807c;
                    m10634Q(jVar5);
                    jVar5.mo35021i0();
                    this.f7829y = null;
                    C6261q3 q3Var = this.f7806b;
                    m10634Q(q3Var);
                    if (!q3Var.mo35219m() || !m10632O()) {
                        this.f7830z = -1;
                        m10629L();
                    } else {
                        mo34906A();
                    }
                    this.f7819o = 0;
                } catch (Throwable th3) {
                    C6180j jVar6 = this.f7807c;
                    m10634Q(jVar6);
                    jVar6.mo35021i0();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                mo34920b().mo35075r().mo35038b("Database error while trying to delete uploaded bundles", e3);
                this.f7819o = mo34922c().mo33548b();
                mo34920b().mo35079v().mo35038b("Disable upload, time", Long.valueOf(this.f7819o));
            }
            this.f7824t = false;
            m10626I();
        }
        mo34920b().mo35079v().mo35039c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
        this.f7813i.f7755j.mo35385b(mo34922c().mo33547a());
        this.f7813i.f7753h.mo35385b(mo34922c().mo33547a());
        C6180j jVar22 = this.f7807c;
        m10634Q(jVar22);
        jVar22.mo35022j0(list);
        m10629L();
        this.f7824t = false;
        m10626I();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03cf A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059d }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03fb A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059d }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0412 A[SYNTHETIC, Splitter:B:129:0x0412] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04ba A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059d }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04d8 A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059d }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x056f A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059d }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b8 A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059d }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01e3 A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059d }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x021b A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059d }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x023a A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059d }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0241 A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059d }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0250 A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059d }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0260 A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059d }] */
    @androidx.annotation.WorkerThread
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34942p(com.google.android.gms.measurement.internal.C6289s9 r25) {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "_pfo"
            java.lang.String r7 = "_uwa"
            java.lang.String r0 = "app_id=?"
            com.google.android.gms.measurement.internal.n4 r8 = r24.mo34919a()
            r8.mo34778h()
            r24.mo34929g()
            p231t4.C9713p.m20275j(r25)
            java.lang.String r8 = r2.f8207b
            p231t4.C9713p.m20271f(r8)
            boolean r8 = r24.m10630M(r25)
            if (r8 == 0) goto L_0x05a7
            com.google.android.gms.measurement.internal.j r8 = r1.f7807c
            m10634Q(r8)
            java.lang.String r9 = r2.f8207b
            com.google.android.gms.measurement.internal.u4 r8 = r8.mo35007T(r9)
            r9 = 0
            if (r8 == 0) goto L_0x005e
            java.lang.String r11 = r8.mo35361k0()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x005e
            java.lang.String r11 = r2.f8208c
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x005e
            r8.mo35363m(r9)
            com.google.android.gms.measurement.internal.j r11 = r1.f7807c
            m10634Q(r11)
            r11.mo35027q(r8)
            com.google.android.gms.measurement.internal.j4 r8 = r1.f7805a
            m10634Q(r8)
            java.lang.String r11 = r2.f8207b
            r8.mo35045s(r11)
        L_0x005e:
            boolean r8 = r2.f8214i
            if (r8 != 0) goto L_0x0066
            r24.mo34910R(r25)
            return
        L_0x0066:
            long r11 = r2.f8219n
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0074
            y4.e r8 = r24.mo34922c()
            long r11 = r8.mo33547a()
        L_0x0074:
            com.google.android.gms.measurement.internal.p4 r8 = r1.f7816l
            com.google.android.gms.measurement.internal.n r8 = r8.mo35179A()
            r8.mo35102r()
            int r8 = r2.f8220o
            r15 = 1
            if (r8 == 0) goto L_0x009c
            if (r8 == r15) goto L_0x009c
            com.google.android.gms.measurement.internal.l3 r13 = r24.mo34920b()
            com.google.android.gms.measurement.internal.j3 r13 = r13.mo35080w()
            java.lang.String r14 = r2.f8207b
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r14)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "Incorrect app type, assuming installed app. appId, appType"
            r13.mo35039c(r9, r14, r8)
            r8 = 0
        L_0x009c:
            com.google.android.gms.measurement.internal.j r9 = r1.f7807c
            m10634Q(r9)
            r9.mo35019g0()
            com.google.android.gms.measurement.internal.j r9 = r1.f7807c     // Catch:{ all -> 0x059d }
            m10634Q(r9)     // Catch:{ all -> 0x059d }
            java.lang.String r10 = r2.f8207b     // Catch:{ all -> 0x059d }
            java.lang.String r13 = "_npa"
            com.google.android.gms.measurement.internal.l9 r9 = r9.mo35012Z(r10, r13)     // Catch:{ all -> 0x059d }
            if (r9 == 0) goto L_0x00c4
            java.lang.String r10 = "auto"
            java.lang.String r13 = r9.f7961b     // Catch:{ all -> 0x059d }
            boolean r10 = r10.equals(r13)     // Catch:{ all -> 0x059d }
            if (r10 == 0) goto L_0x00be
            goto L_0x00c4
        L_0x00be:
            r21 = r3
            r22 = r4
            r4 = r15
            goto L_0x0118
        L_0x00c4:
            java.lang.Boolean r10 = r2.f8224s     // Catch:{ all -> 0x059d }
            if (r10 == 0) goto L_0x0101
            com.google.android.gms.measurement.internal.j9 r14 = new com.google.android.gms.measurement.internal.j9     // Catch:{ all -> 0x059d }
            java.lang.String r19 = "_npa"
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x059d }
            if (r15 == r10) goto L_0x00d5
            r20 = 0
            goto L_0x00d7
        L_0x00d5:
            r20 = 1
        L_0x00d7:
            java.lang.Long r10 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x059d }
            java.lang.String r20 = "auto"
            r21 = r3
            r22 = r4
            r3 = 1
            r13 = r14
            r3 = r14
            r4 = 0
            r14 = r19
            r4 = r15
            r15 = r11
            r17 = r10
            r18 = r20
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x059d }
            if (r9 == 0) goto L_0x00fd
            java.lang.Object r9 = r9.f7964e     // Catch:{ all -> 0x059d }
            java.lang.Long r10 = r3.f7909e     // Catch:{ all -> 0x059d }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x059d }
            if (r9 != 0) goto L_0x0118
        L_0x00fd:
            r1.mo34952z(r3, r2)     // Catch:{ all -> 0x059d }
            goto L_0x0118
        L_0x0101:
            r21 = r3
            r22 = r4
            r4 = r15
            if (r9 == 0) goto L_0x0118
            com.google.android.gms.measurement.internal.j9 r3 = new com.google.android.gms.measurement.internal.j9     // Catch:{ all -> 0x059d }
            java.lang.String r14 = "_npa"
            r17 = 0
            java.lang.String r18 = "auto"
            r13 = r3
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x059d }
            r1.mo34946t(r3, r2)     // Catch:{ all -> 0x059d }
        L_0x0118:
            com.google.android.gms.measurement.internal.j r3 = r1.f7807c     // Catch:{ all -> 0x059d }
            m10634Q(r3)     // Catch:{ all -> 0x059d }
            java.lang.String r9 = r2.f8207b     // Catch:{ all -> 0x059d }
            java.lang.Object r9 = p231t4.C9713p.m20275j(r9)     // Catch:{ all -> 0x059d }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.u4 r3 = r3.mo35007T(r9)     // Catch:{ all -> 0x059d }
            if (r3 == 0) goto L_0x01e1
            com.google.android.gms.measurement.internal.n9 r10 = r24.mo34930g0()     // Catch:{ all -> 0x059d }
            java.lang.String r13 = r2.f8208c     // Catch:{ all -> 0x059d }
            java.lang.String r14 = r3.mo35361k0()     // Catch:{ all -> 0x059d }
            java.lang.String r15 = r2.f8223r     // Catch:{ all -> 0x059d }
            java.lang.String r9 = r3.mo35345c0()     // Catch:{ all -> 0x059d }
            boolean r9 = r10.mo35136b0(r13, r14, r15, r9)     // Catch:{ all -> 0x059d }
            if (r9 == 0) goto L_0x01e1
            com.google.android.gms.measurement.internal.l3 r9 = r24.mo34920b()     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.j3 r9 = r9.mo35080w()     // Catch:{ all -> 0x059d }
            java.lang.String r10 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r13 = r3.mo35349e0()     // Catch:{ all -> 0x059d }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r13)     // Catch:{ all -> 0x059d }
            r9.mo35038b(r10, r13)     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.j r9 = r1.f7807c     // Catch:{ all -> 0x059d }
            m10634Q(r9)     // Catch:{ all -> 0x059d }
            java.lang.String r3 = r3.mo35349e0()     // Catch:{ all -> 0x059d }
            r9.mo35406i()     // Catch:{ all -> 0x059d }
            r9.mo34778h()     // Catch:{ all -> 0x059d }
            p231t4.C9713p.m20271f(r3)     // Catch:{ all -> 0x059d }
            android.database.sqlite.SQLiteDatabase r10 = r9.mo35005R()     // Catch:{ SQLiteException -> 0x01cc }
            java.lang.String[] r13 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x01cc }
            r14 = 0
            r13[r14] = r3     // Catch:{ SQLiteException -> 0x01cc }
            java.lang.String r14 = "events"
            int r14 = r10.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            java.lang.String r15 = "user_attributes"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "apps"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "consent_settings"
            int r0 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r0
            if (r14 <= 0) goto L_0x01e0
            com.google.android.gms.measurement.internal.p4 r0 = r9.f7899a     // Catch:{ SQLiteException -> 0x01cc }
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()     // Catch:{ SQLiteException -> 0x01cc }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35079v()     // Catch:{ SQLiteException -> 0x01cc }
            java.lang.String r10 = "Deleted application data. app, records"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x01cc }
            r0.mo35039c(r10, r3, r13)     // Catch:{ SQLiteException -> 0x01cc }
            goto L_0x01e0
        L_0x01cc:
            r0 = move-exception
            com.google.android.gms.measurement.internal.p4 r9 = r9.f7899a     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.l3 r9 = r9.mo34920b()     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.j3 r9 = r9.mo35075r()     // Catch:{ all -> 0x059d }
            java.lang.String r10 = "Error deleting application data. appId, error"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r3)     // Catch:{ all -> 0x059d }
            r9.mo35039c(r10, r3, r0)     // Catch:{ all -> 0x059d }
        L_0x01e0:
            r3 = 0
        L_0x01e1:
            if (r3 == 0) goto L_0x023a
            long r9 = r3.mo35326M()     // Catch:{ all -> 0x059d }
            r13 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x01fc
            long r9 = r3.mo35326M()     // Catch:{ all -> 0x059d }
            r23 = r5
            long r4 = r2.f8216k     // Catch:{ all -> 0x059d }
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01fe
            r15 = 1
            goto L_0x01ff
        L_0x01fc:
            r23 = r5
        L_0x01fe:
            r15 = 0
        L_0x01ff:
            java.lang.String r0 = r3.mo35355h0()     // Catch:{ all -> 0x059d }
            long r3 = r3.mo35326M()     // Catch:{ all -> 0x059d }
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x0217
            if (r0 == 0) goto L_0x0217
            java.lang.String r3 = r2.f8209d     // Catch:{ all -> 0x059d }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x059d }
            if (r3 != 0) goto L_0x0217
            r3 = 1
            goto L_0x0218
        L_0x0217:
            r3 = 0
        L_0x0218:
            r3 = r3 | r15
            if (r3 == 0) goto L_0x023c
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x059d }
            r3.<init>()     // Catch:{ all -> 0x059d }
            java.lang.String r4 = "_pv"
            r3.putString(r4, r0)     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.t r0 = new com.google.android.gms.measurement.internal.t     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.r r15 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x059d }
            r15.<init>(r3)     // Catch:{ all -> 0x059d }
            java.lang.String r14 = "_au"
            java.lang.String r16 = "auto"
            r13 = r0
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x059d }
            r1.mo34933i(r0, r2)     // Catch:{ all -> 0x059d }
            goto L_0x023c
        L_0x023a:
            r23 = r5
        L_0x023c:
            r24.mo34910R(r25)     // Catch:{ all -> 0x059d }
            if (r8 != 0) goto L_0x0250
            com.google.android.gms.measurement.internal.j r0 = r1.f7807c     // Catch:{ all -> 0x059d }
            m10634Q(r0)     // Catch:{ all -> 0x059d }
            java.lang.String r3 = r2.f8207b     // Catch:{ all -> 0x059d }
            java.lang.String r4 = "_f"
            com.google.android.gms.measurement.internal.p r0 = r0.mo35011X(r3, r4)     // Catch:{ all -> 0x059d }
            r15 = 0
            goto L_0x025e
        L_0x0250:
            com.google.android.gms.measurement.internal.j r0 = r1.f7807c     // Catch:{ all -> 0x059d }
            m10634Q(r0)     // Catch:{ all -> 0x059d }
            java.lang.String r3 = r2.f8207b     // Catch:{ all -> 0x059d }
            java.lang.String r4 = "_v"
            com.google.android.gms.measurement.internal.p r0 = r0.mo35011X(r3, r4)     // Catch:{ all -> 0x059d }
            r15 = 1
        L_0x025e:
            if (r0 != 0) goto L_0x056f
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r11 / r3
            r13 = 1
            long r8 = r8 + r13
            long r8 = r8 * r3
            java.lang.String r3 = "_dac"
            java.lang.String r4 = "_r"
            java.lang.String r5 = "_c"
            java.lang.String r10 = "_et"
            if (r15 != 0) goto L_0x04f2
            com.google.android.gms.measurement.internal.j9 r0 = new com.google.android.gms.measurement.internal.j9     // Catch:{ all -> 0x059d }
            java.lang.String r14 = "_fot"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x059d }
            java.lang.String r18 = "auto"
            r13 = r0
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x059d }
            r1.mo34952z(r0, r2)     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.n4 r0 = r24.mo34919a()     // Catch:{ all -> 0x059d }
            r0.mo34778h()     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.c4 r0 = r1.f7815k     // Catch:{ all -> 0x059d }
            java.lang.Object r0 = p231t4.C9713p.m20275j(r0)     // Catch:{ all -> 0x059d }
            r8 = r0
            com.google.android.gms.measurement.internal.c4 r8 = (com.google.android.gms.measurement.internal.C6108c4) r8     // Catch:{ all -> 0x059d }
            java.lang.String r0 = r2.f8207b     // Catch:{ all -> 0x059d }
            if (r0 == 0) goto L_0x038e
            boolean r9 = r0.isEmpty()     // Catch:{ all -> 0x059d }
            if (r9 == 0) goto L_0x02a1
            goto L_0x038e
        L_0x02a1:
            com.google.android.gms.measurement.internal.p4 r9 = r8.f7668a     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.n4 r9 = r9.mo34919a()     // Catch:{ all -> 0x059d }
            r9.mo34778h()     // Catch:{ all -> 0x059d }
            boolean r9 = r8.mo34779a()     // Catch:{ all -> 0x059d }
            if (r9 != 0) goto L_0x02c1
            com.google.android.gms.measurement.internal.p4 r0 = r8.f7668a     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35078u()     // Catch:{ all -> 0x059d }
            java.lang.String r8 = "Install Referrer Reporter is not available"
            r0.mo35037a(r8)     // Catch:{ all -> 0x059d }
            goto L_0x039d
        L_0x02c1:
            com.google.android.gms.measurement.internal.b4 r9 = new com.google.android.gms.measurement.internal.b4     // Catch:{ all -> 0x059d }
            r9.<init>(r8, r0)     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.p4 r0 = r8.f7668a     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.n4 r0 = r0.mo34919a()     // Catch:{ all -> 0x059d }
            r0.mo34778h()     // Catch:{ all -> 0x059d }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x059d }
            java.lang.String r13 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r13)     // Catch:{ all -> 0x059d }
            android.content.ComponentName r13 = new android.content.ComponentName     // Catch:{ all -> 0x059d }
            java.lang.String r14 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r15 = r23
            r13.<init>(r15, r14)     // Catch:{ all -> 0x059d }
            r0.setComponent(r13)     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.p4 r13 = r8.f7668a     // Catch:{ all -> 0x059d }
            android.content.Context r13 = r13.mo34927f()     // Catch:{ all -> 0x059d }
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch:{ all -> 0x059d }
            if (r13 != 0) goto L_0x02ff
            com.google.android.gms.measurement.internal.p4 r0 = r8.f7668a     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35082y()     // Catch:{ all -> 0x059d }
            java.lang.String r8 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.mo35037a(r8)     // Catch:{ all -> 0x059d }
            goto L_0x039d
        L_0x02ff:
            r14 = 0
            java.util.List r13 = r13.queryIntentServices(r0, r14)     // Catch:{ all -> 0x059d }
            if (r13 == 0) goto L_0x037e
            boolean r16 = r13.isEmpty()     // Catch:{ all -> 0x059d }
            if (r16 != 0) goto L_0x037e
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x059d }
            android.content.pm.ResolveInfo r13 = (android.content.pm.ResolveInfo) r13     // Catch:{ all -> 0x059d }
            android.content.pm.ServiceInfo r13 = r13.serviceInfo     // Catch:{ all -> 0x059d }
            if (r13 == 0) goto L_0x039d
            java.lang.String r14 = r13.packageName     // Catch:{ all -> 0x059d }
            java.lang.String r13 = r13.name     // Catch:{ all -> 0x059d }
            if (r13 == 0) goto L_0x036e
            boolean r13 = r15.equals(r14)     // Catch:{ all -> 0x059d }
            if (r13 == 0) goto L_0x036e
            boolean r13 = r8.mo34779a()     // Catch:{ all -> 0x059d }
            if (r13 == 0) goto L_0x036e
            android.content.Intent r13 = new android.content.Intent     // Catch:{ all -> 0x059d }
            r13.<init>(r0)     // Catch:{ all -> 0x059d }
            x4.b r0 = p275x4.C10393b.m21775b()     // Catch:{ RuntimeException -> 0x0359 }
            com.google.android.gms.measurement.internal.p4 r14 = r8.f7668a     // Catch:{ RuntimeException -> 0x0359 }
            android.content.Context r14 = r14.mo34927f()     // Catch:{ RuntimeException -> 0x0359 }
            r15 = 1
            boolean r0 = r0.mo45087a(r14, r13, r9, r15)     // Catch:{ RuntimeException -> 0x0359 }
            com.google.android.gms.measurement.internal.p4 r9 = r8.f7668a     // Catch:{ RuntimeException -> 0x0359 }
            com.google.android.gms.measurement.internal.l3 r9 = r9.mo34920b()     // Catch:{ RuntimeException -> 0x0359 }
            com.google.android.gms.measurement.internal.j3 r9 = r9.mo35079v()     // Catch:{ RuntimeException -> 0x0359 }
            java.lang.String r13 = "Install Referrer Service is"
            java.lang.String r14 = "available"
            java.lang.String r15 = "not available"
            r16 = r14
            r14 = 1
            if (r14 == r0) goto L_0x0353
            r14 = r15
            goto L_0x0355
        L_0x0353:
            r14 = r16
        L_0x0355:
            r9.mo35038b(r13, r14)     // Catch:{ RuntimeException -> 0x0359 }
            goto L_0x039d
        L_0x0359:
            r0 = move-exception
            com.google.android.gms.measurement.internal.p4 r8 = r8.f7668a     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.l3 r8 = r8.mo34920b()     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.j3 r8 = r8.mo35075r()     // Catch:{ all -> 0x059d }
            java.lang.String r9 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x059d }
            r8.mo35038b(r9, r0)     // Catch:{ all -> 0x059d }
            goto L_0x039d
        L_0x036e:
            com.google.android.gms.measurement.internal.p4 r0 = r8.f7668a     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35080w()     // Catch:{ all -> 0x059d }
            java.lang.String r8 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.mo35037a(r8)     // Catch:{ all -> 0x059d }
            goto L_0x039d
        L_0x037e:
            com.google.android.gms.measurement.internal.p4 r0 = r8.f7668a     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35078u()     // Catch:{ all -> 0x059d }
            java.lang.String r8 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.mo35037a(r8)     // Catch:{ all -> 0x059d }
            goto L_0x039d
        L_0x038e:
            com.google.android.gms.measurement.internal.p4 r0 = r8.f7668a     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35082y()     // Catch:{ all -> 0x059d }
            java.lang.String r8 = "Install Referrer Reporter was called with invalid app package name"
            r0.mo35037a(r8)     // Catch:{ all -> 0x059d }
        L_0x039d:
            com.google.android.gms.measurement.internal.n4 r0 = r24.mo34919a()     // Catch:{ all -> 0x059d }
            r0.mo34778h()     // Catch:{ all -> 0x059d }
            r24.mo34929g()     // Catch:{ all -> 0x059d }
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ all -> 0x059d }
            r8.<init>()     // Catch:{ all -> 0x059d }
            r13 = 1
            r8.putLong(r5, r13)     // Catch:{ all -> 0x059d }
            r8.putLong(r4, r13)     // Catch:{ all -> 0x059d }
            r4 = 0
            r8.putLong(r7, r4)     // Catch:{ all -> 0x059d }
            r8.putLong(r6, r4)     // Catch:{ all -> 0x059d }
            r9 = r22
            r8.putLong(r9, r4)     // Catch:{ all -> 0x059d }
            r15 = r21
            r8.putLong(r15, r4)     // Catch:{ all -> 0x059d }
            r4 = 1
            r8.putLong(r10, r4)     // Catch:{ all -> 0x059d }
            boolean r0 = r2.f8222q     // Catch:{ all -> 0x059d }
            if (r0 == 0) goto L_0x03d2
            r8.putLong(r3, r4)     // Catch:{ all -> 0x059d }
        L_0x03d2:
            java.lang.String r0 = r2.f8207b     // Catch:{ all -> 0x059d }
            java.lang.Object r0 = p231t4.C9713p.m20275j(r0)     // Catch:{ all -> 0x059d }
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.j r0 = r1.f7807c     // Catch:{ all -> 0x059d }
            m10634Q(r0)     // Catch:{ all -> 0x059d }
            p231t4.C9713p.m20271f(r3)     // Catch:{ all -> 0x059d }
            r0.mo34778h()     // Catch:{ all -> 0x059d }
            r0.mo35406i()     // Catch:{ all -> 0x059d }
            java.lang.String r4 = "first_open_count"
            long r4 = r0.mo35001N(r3, r4)     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.p4 r0 = r1.f7816l     // Catch:{ all -> 0x059d }
            android.content.Context r0 = r0.mo34927f()     // Catch:{ all -> 0x059d }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x059d }
            if (r0 != 0) goto L_0x0412
            com.google.android.gms.measurement.internal.l3 r0 = r24.mo34920b()     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35075r()     // Catch:{ all -> 0x059d }
            java.lang.String r7 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r3)     // Catch:{ all -> 0x059d }
            r0.mo35038b(r7, r3)     // Catch:{ all -> 0x059d }
            r22 = r10
        L_0x040e:
            r9 = 0
            goto L_0x04d4
        L_0x0412:
            com.google.android.gms.measurement.internal.p4 r0 = r1.f7816l     // Catch:{ NameNotFoundException -> 0x0424 }
            android.content.Context r0 = r0.mo34927f()     // Catch:{ NameNotFoundException -> 0x0424 }
            a5.d r0 = p023a5.C2207e.m1805a(r0)     // Catch:{ NameNotFoundException -> 0x0424 }
            r13 = 0
            android.content.pm.PackageInfo r0 = r0.mo23530e(r3, r13)     // Catch:{ NameNotFoundException -> 0x0424 }
            r21 = r15
            goto L_0x0439
        L_0x0424:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l3 r13 = r24.mo34920b()     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.j3 r13 = r13.mo35075r()     // Catch:{ all -> 0x059d }
            java.lang.String r14 = "Package info is null, first open report might be inaccurate. appId"
            r21 = r15
            java.lang.Object r15 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r3)     // Catch:{ all -> 0x059d }
            r13.mo35039c(r14, r15, r0)     // Catch:{ all -> 0x059d }
            r0 = 0
        L_0x0439:
            if (r0 == 0) goto L_0x048e
            long r13 = r0.firstInstallTime     // Catch:{ all -> 0x059d }
            r15 = 0
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x048e
            r23 = r9
            r22 = r10
            long r9 = r0.lastUpdateTime     // Catch:{ all -> 0x059d }
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x046f
            com.google.android.gms.measurement.internal.g r0 = r24.mo34912T()     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C6084a3.f7585i0     // Catch:{ all -> 0x059d }
            r10 = 0
            boolean r0 = r0.mo34873B(r10, r9)     // Catch:{ all -> 0x059d }
            if (r0 == 0) goto L_0x0469
            r13 = 0
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0467
            r13 = 1
            r8.putLong(r7, r13)     // Catch:{ all -> 0x059d }
            r4 = 0
        L_0x0467:
            r15 = 0
            goto L_0x0471
        L_0x0469:
            r13 = 1
            r8.putLong(r7, r13)     // Catch:{ all -> 0x059d }
            goto L_0x0467
        L_0x046f:
            r10 = 0
            r15 = 1
        L_0x0471:
            com.google.android.gms.measurement.internal.j9 r0 = new com.google.android.gms.measurement.internal.j9     // Catch:{ all -> 0x059d }
            java.lang.String r14 = "_fi"
            r7 = 1
            if (r7 == r15) goto L_0x047b
            r15 = 0
            goto L_0x047d
        L_0x047b:
            r15 = 1
        L_0x047d:
            java.lang.Long r17 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x059d }
            java.lang.String r18 = "auto"
            r13 = r0
            r7 = r21
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x059d }
            r1.mo34952z(r0, r2)     // Catch:{ all -> 0x059d }
            goto L_0x0495
        L_0x048e:
            r23 = r9
            r22 = r10
            r7 = r21
            r10 = 0
        L_0x0495:
            com.google.android.gms.measurement.internal.p4 r0 = r1.f7816l     // Catch:{ NameNotFoundException -> 0x04a5 }
            android.content.Context r0 = r0.mo34927f()     // Catch:{ NameNotFoundException -> 0x04a5 }
            a5.d r0 = p023a5.C2207e.m1805a(r0)     // Catch:{ NameNotFoundException -> 0x04a5 }
            r9 = 0
            android.content.pm.ApplicationInfo r9 = r0.mo23528c(r3, r9)     // Catch:{ NameNotFoundException -> 0x04a5 }
            goto L_0x04b8
        L_0x04a5:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l3 r9 = r24.mo34920b()     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.j3 r9 = r9.mo35075r()     // Catch:{ all -> 0x059d }
            java.lang.String r13 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r3)     // Catch:{ all -> 0x059d }
            r9.mo35039c(r13, r3, r0)     // Catch:{ all -> 0x059d }
            r9 = r10
        L_0x04b8:
            if (r9 == 0) goto L_0x040e
            int r0 = r9.flags     // Catch:{ all -> 0x059d }
            r3 = 1
            r0 = r0 & r3
            if (r0 == 0) goto L_0x04c7
            r3 = r23
            r13 = 1
            r8.putLong(r3, r13)     // Catch:{ all -> 0x059d }
        L_0x04c7:
            int r0 = r9.flags     // Catch:{ all -> 0x059d }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x040e
            r9 = 1
            r8.putLong(r7, r9)     // Catch:{ all -> 0x059d }
            goto L_0x040e
        L_0x04d4:
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x04db
            r8.putLong(r6, r4)     // Catch:{ all -> 0x059d }
        L_0x04db:
            com.google.android.gms.measurement.internal.t r0 = new com.google.android.gms.measurement.internal.t     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.r r15 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x059d }
            r15.<init>(r8)     // Catch:{ all -> 0x059d }
            java.lang.String r14 = "_f"
            java.lang.String r16 = "auto"
            r13 = r0
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x059d }
            r1.mo34936k(r0, r2)     // Catch:{ all -> 0x059d }
            r4 = r22
            goto L_0x053d
        L_0x04f2:
            r22 = r10
            com.google.android.gms.measurement.internal.j9 r0 = new com.google.android.gms.measurement.internal.j9     // Catch:{ all -> 0x059d }
            java.lang.String r14 = "_fvt"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x059d }
            java.lang.String r18 = "auto"
            r13 = r0
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x059d }
            r1.mo34952z(r0, r2)     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.n4 r0 = r24.mo34919a()     // Catch:{ all -> 0x059d }
            r0.mo34778h()     // Catch:{ all -> 0x059d }
            r24.mo34929g()     // Catch:{ all -> 0x059d }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x059d }
            r0.<init>()     // Catch:{ all -> 0x059d }
            r6 = 1
            r0.putLong(r5, r6)     // Catch:{ all -> 0x059d }
            r0.putLong(r4, r6)     // Catch:{ all -> 0x059d }
            r4 = r22
            r0.putLong(r4, r6)     // Catch:{ all -> 0x059d }
            boolean r5 = r2.f8222q     // Catch:{ all -> 0x059d }
            if (r5 == 0) goto L_0x0529
            r0.putLong(r3, r6)     // Catch:{ all -> 0x059d }
        L_0x0529:
            com.google.android.gms.measurement.internal.t r3 = new com.google.android.gms.measurement.internal.t     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.r r15 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x059d }
            r15.<init>(r0)     // Catch:{ all -> 0x059d }
            java.lang.String r14 = "_v"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x059d }
            r1.mo34936k(r3, r2)     // Catch:{ all -> 0x059d }
        L_0x053d:
            com.google.android.gms.measurement.internal.g r0 = r24.mo34912T()     // Catch:{ all -> 0x059d }
            java.lang.String r3 = r2.f8207b     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C6084a3.f7563V     // Catch:{ all -> 0x059d }
            boolean r0 = r0.mo34873B(r3, r5)     // Catch:{ all -> 0x059d }
            if (r0 != 0) goto L_0x058c
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x059d }
            r0.<init>()     // Catch:{ all -> 0x059d }
            r5 = 1
            r0.putLong(r4, r5)     // Catch:{ all -> 0x059d }
            java.lang.String r3 = "_fr"
            r0.putLong(r3, r5)     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.t r3 = new com.google.android.gms.measurement.internal.t     // Catch:{ all -> 0x059d }
            java.lang.String r14 = "_e"
            com.google.android.gms.measurement.internal.r r15 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x059d }
            r15.<init>(r0)     // Catch:{ all -> 0x059d }
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x059d }
            r1.mo34936k(r3, r2)     // Catch:{ all -> 0x059d }
            goto L_0x058c
        L_0x056f:
            boolean r0 = r2.f8215j     // Catch:{ all -> 0x059d }
            if (r0 == 0) goto L_0x058c
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x059d }
            r0.<init>()     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.t r3 = new com.google.android.gms.measurement.internal.t     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.r r15 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x059d }
            r15.<init>(r0)     // Catch:{ all -> 0x059d }
            java.lang.String r14 = "_cd"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x059d }
            r1.mo34936k(r3, r2)     // Catch:{ all -> 0x059d }
        L_0x058c:
            com.google.android.gms.measurement.internal.j r0 = r1.f7807c     // Catch:{ all -> 0x059d }
            m10634Q(r0)     // Catch:{ all -> 0x059d }
            r0.mo35026p()     // Catch:{ all -> 0x059d }
            com.google.android.gms.measurement.internal.j r0 = r1.f7807c
            m10634Q(r0)
            r0.mo35021i0()
            return
        L_0x059d:
            r0 = move-exception
            com.google.android.gms.measurement.internal.j r2 = r1.f7807c
            m10634Q(r2)
            r2.mo35021i0()
            throw r0
        L_0x05a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6157g9.mo34942p(com.google.android.gms.measurement.internal.s9):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo34943q() {
        this.f7821q++;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: r */
    public final void mo34944r(C6103c cVar) {
        C6289s9 G = m10624G((String) C9713p.m20275j(cVar.f7652b));
        if (G != null) {
            mo34945s(cVar, G);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: s */
    public final void mo34945s(C6103c cVar, C6289s9 s9Var) {
        Bundle bundle;
        C9713p.m20275j(cVar);
        C9713p.m20271f(cVar.f7652b);
        C9713p.m20275j(cVar.f7654d);
        C9713p.m20271f(cVar.f7654d.f7907c);
        mo34919a().mo34778h();
        mo34929g();
        if (m10630M(s9Var)) {
            if (s9Var.f8214i) {
                C6180j jVar = this.f7807c;
                m10634Q(jVar);
                jVar.mo35019g0();
                try {
                    mo34910R(s9Var);
                    String str = (String) C9713p.m20275j(cVar.f7652b);
                    C6180j jVar2 = this.f7807c;
                    m10634Q(jVar2);
                    C6103c U = jVar2.mo35008U(str, cVar.f7654d.f7907c);
                    if (U != null) {
                        mo34920b().mo35074q().mo35039c("Removing conditional user property", cVar.f7652b, this.f7816l.mo35182D().mo34901f(cVar.f7654d.f7907c));
                        C6180j jVar3 = this.f7807c;
                        m10634Q(jVar3);
                        jVar3.mo35000K(str, cVar.f7654d.f7907c);
                        if (U.f7656f) {
                            C6180j jVar4 = this.f7807c;
                            m10634Q(jVar4);
                            jVar4.mo35024n(str, cVar.f7654d.f7907c);
                        }
                        C6290t tVar = cVar.f7662l;
                        if (tVar != null) {
                            C6268r rVar = tVar.f8230c;
                            if (rVar != null) {
                                bundle = rVar.mo35270G();
                            } else {
                                bundle = null;
                            }
                            mo34907B((C6290t) C9713p.m20275j(mo34930g0().mo35157w0(str, ((C6290t) C9713p.m20275j(cVar.f7662l)).f8229b, bundle, U.f7653c, cVar.f7662l.f8232e, true, true)), s9Var);
                        }
                    } else {
                        mo34920b().mo35080w().mo35039c("Conditional user property doesn't exist", C6206l3.m10862z(cVar.f7652b), this.f7816l.mo35182D().mo34901f(cVar.f7654d.f7907c));
                    }
                    C6180j jVar5 = this.f7807c;
                    m10634Q(jVar5);
                    jVar5.mo35026p();
                } finally {
                    C6180j jVar6 = this.f7807c;
                    m10634Q(jVar6);
                    jVar6.mo35021i0();
                }
            } else {
                mo34910R(s9Var);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: t */
    public final void mo34946t(C6190j9 j9Var, C6289s9 s9Var) {
        long j;
        mo34919a().mo34778h();
        mo34929g();
        if (m10630M(s9Var)) {
            if (!s9Var.f8214i) {
                mo34910R(s9Var);
            } else if (!"_npa".equals(j9Var.f7907c) || s9Var.f8224s == null) {
                mo34920b().mo35074q().mo35038b("Removing user property", this.f7816l.mo35182D().mo34901f(j9Var.f7907c));
                C6180j jVar = this.f7807c;
                m10634Q(jVar);
                jVar.mo35019g0();
                try {
                    mo34910R(s9Var);
                    C5910pb.m9760b();
                    if (this.f7816l.mo35211z().mo34873B((String) null, C6084a3.f7615x0) && this.f7816l.mo35211z().mo34873B((String) null, C6084a3.f7619z0) && "_id".equals(j9Var.f7907c)) {
                        C6180j jVar2 = this.f7807c;
                        m10634Q(jVar2);
                        jVar2.mo35024n((String) C9713p.m20275j(s9Var.f8207b), "_lair");
                    }
                    C6180j jVar3 = this.f7807c;
                    m10634Q(jVar3);
                    jVar3.mo35024n((String) C9713p.m20275j(s9Var.f8207b), j9Var.f7907c);
                    C6180j jVar4 = this.f7807c;
                    m10634Q(jVar4);
                    jVar4.mo35026p();
                    mo34920b().mo35074q().mo35038b("User property removed", this.f7816l.mo35182D().mo34901f(j9Var.f7907c));
                } finally {
                    C6180j jVar5 = this.f7807c;
                    m10634Q(jVar5);
                    jVar5.mo35021i0();
                }
            } else {
                mo34920b().mo35074q().mo35037a("Falling back to manifest metadata value for ad personalization");
                long a = mo34922c().mo33547a();
                if (true != s9Var.f8224s.booleanValue()) {
                    j = 0;
                } else {
                    j = 1;
                }
                mo34952z(new C6190j9("_npa", a, Long.valueOf(j), "auto"), s9Var);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: u */
    public final void mo34947u(C6289s9 s9Var) {
        if (this.f7828x != null) {
            ArrayList arrayList = new ArrayList();
            this.f7829y = arrayList;
            arrayList.addAll(this.f7828x);
        }
        C6180j jVar = this.f7807c;
        m10634Q(jVar);
        String str = (String) C9713p.m20275j(s9Var.f8207b);
        C9713p.m20271f(str);
        jVar.mo34778h();
        jVar.mo35406i();
        try {
            SQLiteDatabase R = jVar.mo35005R();
            String[] strArr = {str};
            int delete = R.delete("apps", "app_id=?", strArr) + R.delete("events", "app_id=?", strArr) + R.delete("user_attributes", "app_id=?", strArr) + R.delete("conditional_properties", "app_id=?", strArr) + R.delete("raw_events", "app_id=?", strArr) + R.delete("raw_events_metadata", "app_id=?", strArr) + R.delete("queue", "app_id=?", strArr) + R.delete("audience_filter_values", "app_id=?", strArr) + R.delete("main_event_params", "app_id=?", strArr) + R.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                jVar.f7899a.mo34920b().mo35079v().mo35039c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            jVar.f7899a.mo34920b().mo35075r().mo35039c("Error resetting analytics data. appId, error", C6206l3.m10862z(str), e);
        }
        if (s9Var.f8214i) {
            mo34942p(s9Var);
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: v */
    public final void mo34948v() {
        mo34919a().mo34778h();
        C6180j jVar = this.f7807c;
        m10634Q(jVar);
        jVar.mo35023m();
        if (this.f7813i.f7754i.mo35384a() == 0) {
            this.f7813i.f7754i.mo35385b(mo34922c().mo33547a());
        }
        m10629L();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: w */
    public final void mo34949w(C6103c cVar) {
        C6289s9 G = m10624G((String) C9713p.m20275j(cVar.f7652b));
        if (G != null) {
            mo34950x(cVar, G);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: x */
    public final void mo34950x(C6103c cVar, C6289s9 s9Var) {
        C6290t tVar;
        C9713p.m20275j(cVar);
        C9713p.m20271f(cVar.f7652b);
        C9713p.m20275j(cVar.f7653c);
        C9713p.m20275j(cVar.f7654d);
        C9713p.m20271f(cVar.f7654d.f7907c);
        mo34919a().mo34778h();
        mo34929g();
        if (m10630M(s9Var)) {
            if (!s9Var.f8214i) {
                mo34910R(s9Var);
                return;
            }
            C6103c cVar2 = new C6103c(cVar);
            boolean z = false;
            cVar2.f7656f = false;
            C6180j jVar = this.f7807c;
            m10634Q(jVar);
            jVar.mo35019g0();
            try {
                C6180j jVar2 = this.f7807c;
                m10634Q(jVar2);
                C6103c U = jVar2.mo35008U((String) C9713p.m20275j(cVar2.f7652b), cVar2.f7654d.f7907c);
                if (U != null && !U.f7653c.equals(cVar2.f7653c)) {
                    mo34920b().mo35080w().mo35040d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f7816l.mo35182D().mo34901f(cVar2.f7654d.f7907c), cVar2.f7653c, U.f7653c);
                }
                if (U != null && U.f7656f) {
                    cVar2.f7653c = U.f7653c;
                    cVar2.f7655e = U.f7655e;
                    cVar2.f7659i = U.f7659i;
                    cVar2.f7657g = U.f7657g;
                    cVar2.f7660j = U.f7660j;
                    cVar2.f7656f = true;
                    C6190j9 j9Var = cVar2.f7654d;
                    cVar2.f7654d = new C6190j9(j9Var.f7907c, U.f7654d.f7908d, j9Var.mo35057A(), U.f7654d.f7911g);
                } else if (TextUtils.isEmpty(cVar2.f7657g)) {
                    C6190j9 j9Var2 = cVar2.f7654d;
                    cVar2.f7654d = new C6190j9(j9Var2.f7907c, cVar2.f7655e, j9Var2.mo35057A(), cVar2.f7654d.f7911g);
                    cVar2.f7656f = true;
                    z = true;
                }
                if (cVar2.f7656f) {
                    C6190j9 j9Var3 = cVar2.f7654d;
                    C6212l9 l9Var = new C6212l9((String) C9713p.m20275j(cVar2.f7652b), cVar2.f7653c, j9Var3.f7907c, j9Var3.f7908d, C9713p.m20275j(j9Var3.mo35057A()));
                    C6180j jVar3 = this.f7807c;
                    m10634Q(jVar3);
                    if (jVar3.mo35036z(l9Var)) {
                        mo34920b().mo35074q().mo35040d("User property updated immediately", cVar2.f7652b, this.f7816l.mo35182D().mo34901f(l9Var.f7962c), l9Var.f7964e);
                    } else {
                        mo34920b().mo35075r().mo35040d("(2)Too many active user properties, ignoring", C6206l3.m10862z(cVar2.f7652b), this.f7816l.mo35182D().mo34901f(l9Var.f7962c), l9Var.f7964e);
                    }
                    if (z && (tVar = cVar2.f7660j) != null) {
                        mo34907B(new C6290t(tVar, cVar2.f7655e), s9Var);
                    }
                }
                C6180j jVar4 = this.f7807c;
                m10634Q(jVar4);
                if (jVar4.mo35035y(cVar2)) {
                    mo34920b().mo35074q().mo35040d("Conditional property added", cVar2.f7652b, this.f7816l.mo35182D().mo34901f(cVar2.f7654d.f7907c), cVar2.f7654d.mo35057A());
                } else {
                    mo34920b().mo35075r().mo35040d("Too many conditional properties, ignoring", C6206l3.m10862z(cVar2.f7652b), this.f7816l.mo35182D().mo34901f(cVar2.f7654d.f7907c), cVar2.f7654d.mo35057A());
                }
                C6180j jVar5 = this.f7807c;
                m10634Q(jVar5);
                jVar5.mo35026p();
            } finally {
                C6180j jVar6 = this.f7807c;
                m10634Q(jVar6);
                jVar6.mo35021i0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: y */
    public final void mo34951y(String str, C9254a aVar) {
        mo34919a().mo34778h();
        mo34929g();
        this.f7803A.put(str, aVar);
        C6180j jVar = this.f7807c;
        m10634Q(jVar);
        C9713p.m20275j(str);
        C9713p.m20275j(aVar);
        jVar.mo34778h();
        jVar.mo35406i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", aVar.mo43552i());
        try {
            if (jVar.mo35005R().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                jVar.f7899a.mo34920b().mo35075r().mo35038b("Failed to insert/update consent setting (got -1). appId", C6206l3.m10862z(str));
            }
        } catch (SQLiteException e) {
            jVar.f7899a.mo34920b().mo35075r().mo35039c("Error storing consent setting. appId, error", C6206l3.m10862z(str), e);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: z */
    public final void mo34952z(C6190j9 j9Var, C6289s9 s9Var) {
        long j;
        int i;
        mo34919a().mo34778h();
        mo34929g();
        if (m10630M(s9Var)) {
            if (!s9Var.f8214i) {
                mo34910R(s9Var);
                return;
            }
            int n0 = mo34930g0().mo35142n0(j9Var.f7907c);
            int i2 = 0;
            if (n0 != 0) {
                C6234n9 g0 = mo34930g0();
                String str = j9Var.f7907c;
                mo34912T();
                String q = g0.mo35147q(str, 24, true);
                String str2 = j9Var.f7907c;
                if (str2 != null) {
                    i = str2.length();
                } else {
                    i = 0;
                }
                mo34930g0().mo35115A(this.f7804B, s9Var.f8207b, n0, "_ev", q, i);
                return;
            }
            int j0 = mo34930g0().mo35138j0(j9Var.f7907c, j9Var.mo35057A());
            if (j0 != 0) {
                C6234n9 g02 = mo34930g0();
                String str3 = j9Var.f7907c;
                mo34912T();
                String q2 = g02.mo35147q(str3, 24, true);
                Object A = j9Var.mo35057A();
                if (A != null && ((A instanceof String) || (A instanceof CharSequence))) {
                    i2 = A.toString().length();
                }
                mo34930g0().mo35115A(this.f7804B, s9Var.f8207b, j0, "_ev", q2, i2);
                return;
            }
            Object p = mo34930g0().mo35145p(j9Var.f7907c, j9Var.mo35057A());
            if (p != null) {
                if ("_sid".equals(j9Var.f7907c)) {
                    long j2 = j9Var.f7908d;
                    String str4 = j9Var.f7911g;
                    String str5 = (String) C9713p.m20275j(s9Var.f8207b);
                    C6180j jVar = this.f7807c;
                    m10634Q(jVar);
                    C6212l9 Z = jVar.mo35012Z(str5, "_sno");
                    if (Z != null) {
                        Object obj = Z.f7964e;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            mo34952z(new C6190j9("_sno", j2, Long.valueOf(j + 1), str4), s9Var);
                        }
                    }
                    if (Z != null) {
                        mo34920b().mo35080w().mo35038b("Retrieved last session number from database does not contain a valid (long) value", Z.f7964e);
                    }
                    C6180j jVar2 = this.f7807c;
                    m10634Q(jVar2);
                    C6246p X = jVar2.mo35011X(str5, "_s");
                    if (X != null) {
                        j = X.f8068c;
                        mo34920b().mo35079v().mo35038b("Backfill the session number. Last used session number", Long.valueOf(j));
                    } else {
                        j = 0;
                    }
                    mo34952z(new C6190j9("_sno", j2, Long.valueOf(j + 1), str4), s9Var);
                }
                C6212l9 l9Var = new C6212l9((String) C9713p.m20275j(s9Var.f8207b), (String) C9713p.m20275j(j9Var.f7911g), j9Var.f7907c, j9Var.f7908d, p);
                mo34920b().mo35079v().mo35039c("Setting user property", this.f7816l.mo35182D().mo34901f(l9Var.f7962c), p);
                C6180j jVar3 = this.f7807c;
                m10634Q(jVar3);
                jVar3.mo35019g0();
                try {
                    C5910pb.m9760b();
                    if (this.f7816l.mo35211z().mo34873B((String) null, C6084a3.f7615x0) && "_id".equals(l9Var.f7962c)) {
                        C6180j jVar4 = this.f7807c;
                        m10634Q(jVar4);
                        jVar4.mo35024n(s9Var.f8207b, "_lair");
                    }
                    mo34910R(s9Var);
                    C6180j jVar5 = this.f7807c;
                    m10634Q(jVar5);
                    boolean z = jVar5.mo35036z(l9Var);
                    C6180j jVar6 = this.f7807c;
                    m10634Q(jVar6);
                    jVar6.mo35026p();
                    if (!z) {
                        mo34920b().mo35075r().mo35039c("Too many unique user properties are set. Ignoring user property", this.f7816l.mo35182D().mo34901f(l9Var.f7962c), l9Var.f7964e);
                        mo34930g0().mo35115A(this.f7804B, s9Var.f8207b, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    C6180j jVar7 = this.f7807c;
                    m10634Q(jVar7);
                    jVar7.mo35021i0();
                }
            }
        }
    }
}
