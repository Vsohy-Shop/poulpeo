package p205r;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p215s.C9410e;
import p248v.C9909c;
import p466yf.C13971h0;

/* renamed from: r.b */
/* compiled from: DefaultRequestOptions.kt */
public final class C9333b {

    /* renamed from: a */
    private final C13971h0 f13758a;

    /* renamed from: b */
    private final C13971h0 f13759b;

    /* renamed from: c */
    private final C13971h0 f13760c;

    /* renamed from: d */
    private final C13971h0 f13761d;

    /* renamed from: e */
    private final C9909c.C9910a f13762e;

    /* renamed from: f */
    private final C9410e f13763f;

    /* renamed from: g */
    private final Bitmap.Config f13764g;

    /* renamed from: h */
    private final boolean f13765h;

    /* renamed from: i */
    private final boolean f13766i;

    /* renamed from: j */
    private final Drawable f13767j;

    /* renamed from: k */
    private final Drawable f13768k;

    /* renamed from: l */
    private final Drawable f13769l;

    /* renamed from: m */
    private final C9332a f13770m;

    /* renamed from: n */
    private final C9332a f13771n;

    /* renamed from: o */
    private final C9332a f13772o;

    public C9333b() {
        this((C13971h0) null, (C13971h0) null, (C13971h0) null, (C13971h0) null, (C9909c.C9910a) null, (C9410e) null, (Bitmap.Config) null, false, false, (Drawable) null, (Drawable) null, (Drawable) null, (C9332a) null, (C9332a) null, (C9332a) null, 32767, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final boolean mo43649a() {
        return this.f13765h;
    }

    /* renamed from: b */
    public final boolean mo43650b() {
        return this.f13766i;
    }

    /* renamed from: c */
    public final Bitmap.Config mo43651c() {
        return this.f13764g;
    }

    /* renamed from: d */
    public final C13971h0 mo43652d() {
        return this.f13760c;
    }

    /* renamed from: e */
    public final C9332a mo43653e() {
        return this.f13771n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9333b) {
            C9333b bVar = (C9333b) obj;
            if (!C12775o.m28634d(this.f13758a, bVar.f13758a) || !C12775o.m28634d(this.f13759b, bVar.f13759b) || !C12775o.m28634d(this.f13760c, bVar.f13760c) || !C12775o.m28634d(this.f13761d, bVar.f13761d) || !C12775o.m28634d(this.f13762e, bVar.f13762e) || this.f13763f != bVar.f13763f || this.f13764g != bVar.f13764g || this.f13765h != bVar.f13765h || this.f13766i != bVar.f13766i || !C12775o.m28634d(this.f13767j, bVar.f13767j) || !C12775o.m28634d(this.f13768k, bVar.f13768k) || !C12775o.m28634d(this.f13769l, bVar.f13769l) || this.f13770m != bVar.f13770m || this.f13771n != bVar.f13771n || this.f13772o != bVar.f13772o) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final Drawable mo43655f() {
        return this.f13768k;
    }

    /* renamed from: g */
    public final Drawable mo43656g() {
        return this.f13769l;
    }

    /* renamed from: h */
    public final C13971h0 mo43657h() {
        return this.f13759b;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = ((((((((((((((((this.f13758a.hashCode() * 31) + this.f13759b.hashCode()) * 31) + this.f13760c.hashCode()) * 31) + this.f13761d.hashCode()) * 31) + this.f13762e.hashCode()) * 31) + this.f13763f.hashCode()) * 31) + this.f13764g.hashCode()) * 31) + Boolean.hashCode(this.f13765h)) * 31) + Boolean.hashCode(this.f13766i)) * 31;
        Drawable drawable = this.f13767j;
        int i3 = 0;
        if (drawable != null) {
            i = drawable.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        Drawable drawable2 = this.f13768k;
        if (drawable2 != null) {
            i2 = drawable2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Drawable drawable3 = this.f13769l;
        if (drawable3 != null) {
            i3 = drawable3.hashCode();
        }
        return ((((((i5 + i3) * 31) + this.f13770m.hashCode()) * 31) + this.f13771n.hashCode()) * 31) + this.f13772o.hashCode();
    }

    /* renamed from: i */
    public final C13971h0 mo43659i() {
        return this.f13758a;
    }

    /* renamed from: j */
    public final C9332a mo43660j() {
        return this.f13770m;
    }

    /* renamed from: k */
    public final C9332a mo43661k() {
        return this.f13772o;
    }

    /* renamed from: l */
    public final Drawable mo43662l() {
        return this.f13767j;
    }

    /* renamed from: m */
    public final C9410e mo43663m() {
        return this.f13763f;
    }

    /* renamed from: n */
    public final C13971h0 mo43664n() {
        return this.f13761d;
    }

    /* renamed from: o */
    public final C9909c.C9910a mo43665o() {
        return this.f13762e;
    }

    public C9333b(C13971h0 h0Var, C13971h0 h0Var2, C13971h0 h0Var3, C13971h0 h0Var4, C9909c.C9910a aVar, C9410e eVar, Bitmap.Config config, boolean z, boolean z2, Drawable drawable, Drawable drawable2, Drawable drawable3, C9332a aVar2, C9332a aVar3, C9332a aVar4) {
        this.f13758a = h0Var;
        this.f13759b = h0Var2;
        this.f13760c = h0Var3;
        this.f13761d = h0Var4;
        this.f13762e = aVar;
        this.f13763f = eVar;
        this.f13764g = config;
        this.f13765h = z;
        this.f13766i = z2;
        this.f13767j = drawable;
        this.f13768k = drawable2;
        this.f13769l = drawable3;
        this.f13770m = aVar2;
        this.f13771n = aVar3;
        this.f13772o = aVar4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C9333b(p466yf.C13971h0 r16, p466yf.C13971h0 r17, p466yf.C13971h0 r18, p466yf.C13971h0 r19, p248v.C9909c.C9910a r20, p215s.C9410e r21, android.graphics.Bitmap.Config r22, boolean r23, boolean r24, android.graphics.drawable.Drawable r25, android.graphics.drawable.Drawable r26, android.graphics.drawable.Drawable r27, p205r.C9332a r28, p205r.C9332a r29, p205r.C9332a r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r15 = this;
            r0 = r31
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000f
            yf.j2 r1 = p466yf.C13933b1.m32212c()
            yf.j2 r1 = r1.mo49059t0()
            goto L_0x0011
        L_0x000f:
            r1 = r16
        L_0x0011:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x001a
            yf.h0 r2 = p466yf.C13933b1.m32211b()
            goto L_0x001c
        L_0x001a:
            r2 = r17
        L_0x001c:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0025
            yf.h0 r3 = p466yf.C13933b1.m32211b()
            goto L_0x0027
        L_0x0025:
            r3 = r18
        L_0x0027:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0030
            yf.h0 r4 = p466yf.C13933b1.m32211b()
            goto L_0x0032
        L_0x0030:
            r4 = r19
        L_0x0032:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0039
            v.c$a r5 = p248v.C9909c.C9910a.f14836b
            goto L_0x003b
        L_0x0039:
            r5 = r20
        L_0x003b:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0042
            s.e r6 = p215s.C9410e.AUTOMATIC
            goto L_0x0044
        L_0x0042:
            r6 = r21
        L_0x0044:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x004d
            android.graphics.Bitmap$Config r7 = p259w.C10070i.m21146f()
            goto L_0x004f
        L_0x004d:
            r7 = r22
        L_0x004f:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0055
            r8 = 1
            goto L_0x0057
        L_0x0055:
            r8 = r23
        L_0x0057:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x005d
            r9 = 0
            goto L_0x005f
        L_0x005d:
            r9 = r24
        L_0x005f:
            r10 = r0 & 512(0x200, float:7.175E-43)
            r11 = 0
            if (r10 == 0) goto L_0x0066
            r10 = r11
            goto L_0x0068
        L_0x0066:
            r10 = r25
        L_0x0068:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x006e
            r12 = r11
            goto L_0x0070
        L_0x006e:
            r12 = r26
        L_0x0070:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r11 = r27
        L_0x0077:
            r13 = r0 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x007e
            r.a r13 = p205r.C9332a.ENABLED
            goto L_0x0080
        L_0x007e:
            r13 = r28
        L_0x0080:
            r14 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x0087
            r.a r14 = p205r.C9332a.ENABLED
            goto L_0x0089
        L_0x0087:
            r14 = r29
        L_0x0089:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0090
            r.a r0 = p205r.C9332a.ENABLED
            goto L_0x0092
        L_0x0090:
            r0 = r30
        L_0x0092:
            r16 = r15
            r17 = r1
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r12
            r28 = r11
            r29 = r13
            r30 = r14
            r31 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p205r.C9333b.<init>(yf.h0, yf.h0, yf.h0, yf.h0, v.c$a, s.e, android.graphics.Bitmap$Config, boolean, boolean, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, r.a, r.a, r.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
