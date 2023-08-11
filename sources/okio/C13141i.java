package okio;

import com.facebook.applinks.AppLinkData;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p442uf.C13591c;

/* renamed from: okio.i */
/* compiled from: FileMetadata.kt */
public final class C13141i {

    /* renamed from: a */
    private final boolean f20918a;

    /* renamed from: b */
    private final boolean f20919b;

    /* renamed from: c */
    private final C13158p0 f20920c;

    /* renamed from: d */
    private final Long f20921d;

    /* renamed from: e */
    private final Long f20922e;

    /* renamed from: f */
    private final Long f20923f;

    /* renamed from: g */
    private final Long f20924g;

    /* renamed from: h */
    private final Map<C13591c<?>, Object> f20925h;

    public C13141i(boolean z, boolean z2, C13158p0 p0Var, Long l, Long l2, Long l3, Long l4, Map<C13591c<?>, ? extends Object> map) {
        C12775o.m28639i(map, AppLinkData.ARGUMENTS_EXTRAS_KEY);
        this.f20918a = z;
        this.f20919b = z2;
        this.f20920c = p0Var;
        this.f20921d = l;
        this.f20922e = l2;
        this.f20923f = l3;
        this.f20924g = l4;
        this.f20925h = C12716r0.m28427r(map);
    }

    /* renamed from: b */
    public static /* synthetic */ C13141i m29709b(C13141i iVar, boolean z, boolean z2, C13158p0 p0Var, Long l, Long l2, Long l3, Long l4, Map map, int i, Object obj) {
        boolean z3;
        boolean z4;
        C13158p0 p0Var2;
        Long l5;
        Long l6;
        Long l7;
        Long l8;
        Map map2;
        C13141i iVar2 = iVar;
        int i2 = i;
        if ((i2 & 1) != 0) {
            z3 = iVar2.f20918a;
        } else {
            z3 = z;
        }
        if ((i2 & 2) != 0) {
            z4 = iVar2.f20919b;
        } else {
            z4 = z2;
        }
        if ((i2 & 4) != 0) {
            p0Var2 = iVar2.f20920c;
        } else {
            p0Var2 = p0Var;
        }
        if ((i2 & 8) != 0) {
            l5 = iVar2.f20921d;
        } else {
            l5 = l;
        }
        if ((i2 & 16) != 0) {
            l6 = iVar2.f20922e;
        } else {
            l6 = l2;
        }
        if ((i2 & 32) != 0) {
            l7 = iVar2.f20923f;
        } else {
            l7 = l3;
        }
        if ((i2 & 64) != 0) {
            l8 = iVar2.f20924g;
        } else {
            l8 = l4;
        }
        if ((i2 & 128) != 0) {
            map2 = iVar2.f20925h;
        } else {
            map2 = map;
        }
        return iVar.mo52635a(z3, z4, p0Var2, l5, l6, l7, l8, map2);
    }

    /* renamed from: a */
    public final C13141i mo52635a(boolean z, boolean z2, C13158p0 p0Var, Long l, Long l2, Long l3, Long l4, Map<C13591c<?>, ? extends Object> map) {
        Map<C13591c<?>, ? extends Object> map2 = map;
        C12775o.m28639i(map2, AppLinkData.ARGUMENTS_EXTRAS_KEY);
        return new C13141i(z, z2, p0Var, l, l2, l3, l4, map2);
    }

    /* renamed from: c */
    public final Long mo52636c() {
        return this.f20923f;
    }

    /* renamed from: d */
    public final Long mo52637d() {
        return this.f20921d;
    }

    /* renamed from: e */
    public final C13158p0 mo52638e() {
        return this.f20920c;
    }

    /* renamed from: f */
    public final boolean mo52639f() {
        return this.f20919b;
    }

    /* renamed from: g */
    public final boolean mo52640g() {
        return this.f20918a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f20918a) {
            arrayList.add("isRegularFile");
        }
        if (this.f20919b) {
            arrayList.add("isDirectory");
        }
        if (this.f20921d != null) {
            arrayList.add("byteCount=" + this.f20921d);
        }
        if (this.f20922e != null) {
            arrayList.add("createdAt=" + this.f20922e);
        }
        if (this.f20923f != null) {
            arrayList.add("lastModifiedAt=" + this.f20923f);
        }
        if (this.f20924g != null) {
            arrayList.add("lastAccessedAt=" + this.f20924g);
        }
        if (!this.f20925h.isEmpty()) {
            arrayList.add("extras=" + this.f20925h);
        }
        return C12686e0.m28229h0(arrayList, ", ", "FileMetadata(", ")", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C13141i(boolean r10, boolean r11, okio.C13158p0 r12, java.lang.Long r13, java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, java.util.Map r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r2 = r11
        L_0x0010:
            r3 = r0 & 4
            r4 = 0
            if (r3 == 0) goto L_0x0017
            r3 = r4
            goto L_0x0018
        L_0x0017:
            r3 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r4
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r4
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r4
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r4 = r16
        L_0x0034:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003d
            java.util.Map r0 = kotlin.collections.C12716r0.m28416g()
            goto L_0x003f
        L_0x003d:
            r0 = r17
        L_0x003f:
            r10 = r9
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r4
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C13141i.<init>(boolean, boolean, okio.p0, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
