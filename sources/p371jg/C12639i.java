package p371jg;

import java.util.ArrayList;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C13121c;
import okio.C13133f;
import okio.C13158p0;

@SourceDebugExtension({"SMAP\n-Path.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -Path.kt\nokio/internal/_PathKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,403:1\n56#1,22:404\n206#1:430\n206#1:431\n1549#2:426\n1620#2,3:427\n*S KotlinDebug\n*F\n+ 1 -Path.kt\nokio/internal/_PathKt\n*L\n50#1:404,22\n196#1:430\n201#1:431\n50#1:426\n50#1:427,3\n*E\n"})
/* renamed from: jg.i */
/* compiled from: -Path.kt */
public final class C12639i {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C13133f f20306a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C13133f f20307b;

    /* renamed from: c */
    private static final C13133f f20308c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C13133f f20309d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C13133f f20310e;

    static {
        C13133f.C13134a aVar = C13133f.f20903e;
        f20306a = aVar.mo52622d("/");
        f20307b = aVar.mo52622d("\\");
        f20308c = aVar.mo52622d("/\\");
        f20309d = aVar.mo52622d(".");
        f20310e = aVar.mo52622d("..");
    }

    /* renamed from: j */
    public static final C13158p0 m28088j(C13158p0 p0Var, C13158p0 p0Var2, boolean z) {
        C12775o.m28639i(p0Var, "<this>");
        C12775o.m28639i(p0Var2, "child");
        if (p0Var2.isAbsolute() || p0Var2.mo52695l() != null) {
            return p0Var2;
        }
        C13133f m = m28091m(p0Var);
        if (m == null && (m = m28091m(p0Var2)) == null) {
            m = m28097s(C13158p0.f20948d);
        }
        C13121c cVar = new C13121c();
        cVar.mo52517b0(p0Var.mo52681b());
        if (cVar.size() > 0) {
            cVar.mo52517b0(m);
        }
        cVar.mo52517b0(p0Var2.mo52681b());
        return m28095q(cVar, z);
    }

    /* renamed from: k */
    public static final C13158p0 m28089k(String str, boolean z) {
        C12775o.m28639i(str, "<this>");
        return m28095q(new C13121c().mo52486F(str), z);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final int m28090l(C13158p0 p0Var) {
        int t = C13133f.m29654t(p0Var.mo52681b(), f20306a, 0, 2, (Object) null);
        if (t != -1) {
            return t;
        }
        return C13133f.m29654t(p0Var.mo52681b(), f20307b, 0, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final C13133f m28091m(C13158p0 p0Var) {
        C13133f b = p0Var.mo52681b();
        C13133f fVar = f20306a;
        if (C13133f.m29653o(b, fVar, 0, 2, (Object) null) != -1) {
            return fVar;
        }
        C13133f b2 = p0Var.mo52681b();
        C13133f fVar2 = f20307b;
        if (C13133f.m29653o(b2, fVar2, 0, 2, (Object) null) != -1) {
            return fVar2;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final boolean m28092n(C13158p0 p0Var) {
        if (!p0Var.mo52681b().mo52602f(f20310e) || (p0Var.mo52681b().mo52590H() != 2 && !p0Var.mo52681b().mo52618w(p0Var.mo52681b().mo52590H() - 3, f20306a, 0, 1) && !p0Var.mo52681b().mo52618w(p0Var.mo52681b().mo52590H() - 3, f20307b, 0, 1))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final int m28093o(C13158p0 p0Var) {
        boolean z;
        if (p0Var.mo52681b().mo52590H() == 0) {
            return -1;
        }
        boolean z2 = false;
        if (p0Var.mo52681b().mo52603g(0) == 47) {
            return 1;
        }
        if (p0Var.mo52681b().mo52603g(0) == 92) {
            if (p0Var.mo52681b().mo52590H() <= 2 || p0Var.mo52681b().mo52603g(1) != 92) {
                return 1;
            }
            int m = p0Var.mo52681b().mo52610m(f20307b, 2);
            if (m == -1) {
                return p0Var.mo52681b().mo52590H();
            }
            return m;
        } else if (p0Var.mo52681b().mo52590H() <= 2 || p0Var.mo52681b().mo52603g(1) != 58 || p0Var.mo52681b().mo52603g(2) != 92) {
            return -1;
        } else {
            char g = (char) p0Var.mo52681b().mo52603g(0);
            if ('a' > g || g >= '{') {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return 3;
            }
            if ('A' <= g && g < '[') {
                z2 = true;
            }
            if (!z2) {
                return -1;
            }
            return 3;
        }
    }

    /* renamed from: p */
    private static final boolean m28094p(C13121c cVar, C13133f fVar) {
        boolean z;
        boolean z2;
        if (!C12775o.m28634d(fVar, f20307b) || cVar.size() < 2 || cVar.mo52530j0(1) != 58) {
            return false;
        }
        char j0 = (char) cVar.mo52530j0(0);
        if ('a' > j0 || j0 >= '{') {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if ('A' > j0 || j0 >= '[') {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    public static final C13158p0 m28095q(C13121c cVar, boolean z) {
        C13133f fVar;
        boolean z2;
        boolean z3;
        C13133f fVar2;
        C13121c cVar2 = cVar;
        C12775o.m28639i(cVar2, "<this>");
        C13121c cVar3 = new C13121c();
        C13133f fVar3 = null;
        int i = 0;
        while (true) {
            if (!cVar2.mo52489H(0, f20306a)) {
                fVar = f20307b;
                if (!cVar2.mo52489H(0, fVar)) {
                    break;
                }
            }
            byte readByte = cVar.readByte();
            if (fVar3 == null) {
                fVar3 = m28096r(readByte);
            }
            i++;
        }
        if (i < 2 || !C12775o.m28634d(fVar3, fVar)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            C12775o.m28636f(fVar3);
            cVar3.mo52517b0(fVar3);
            cVar3.mo52517b0(fVar3);
        } else if (i > 0) {
            C12775o.m28636f(fVar3);
            cVar3.mo52517b0(fVar3);
        } else {
            long u0 = cVar2.mo52555u0(f20308c);
            if (fVar3 == null) {
                if (u0 == -1) {
                    fVar3 = m28097s(C13158p0.f20948d);
                } else {
                    fVar3 = m28096r(cVar2.mo52530j0(u0));
                }
            }
            if (m28094p(cVar2, fVar3)) {
                if (u0 == 2) {
                    cVar3.write(cVar2, 3);
                } else {
                    cVar3.write(cVar2, 2);
                }
            }
        }
        if (cVar3.size() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        ArrayList arrayList = new ArrayList();
        while (!cVar.mo52552t()) {
            long u02 = cVar2.mo52555u0(f20308c);
            if (u02 == -1) {
                fVar2 = cVar.mo52498M();
            } else {
                fVar2 = cVar2.mo52534o(u02);
                cVar.readByte();
            }
            C13133f fVar4 = f20310e;
            if (C12775o.m28634d(fVar2, fVar4)) {
                if (!z3 || !arrayList.isEmpty()) {
                    if (!z || (!z3 && (arrayList.isEmpty() || C12775o.m28634d(C12686e0.m28231j0(arrayList), fVar4)))) {
                        arrayList.add(fVar2);
                    } else if (!z2 || arrayList.size() != 1) {
                        Object unused = C12669b0.m28191O(arrayList);
                    }
                }
            } else if (!C12775o.m28634d(fVar2, f20309d) && !C12775o.m28634d(fVar2, C13133f.f20904f)) {
                arrayList.add(fVar2);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                cVar3.mo52517b0(fVar3);
            }
            cVar3.mo52517b0((C13133f) arrayList.get(i2));
        }
        if (cVar3.size() == 0) {
            cVar3.mo52517b0(f20309d);
        }
        return new C13158p0(cVar3.mo52498M());
    }

    /* renamed from: r */
    private static final C13133f m28096r(byte b) {
        if (b == 47) {
            return f20306a;
        }
        if (b == 92) {
            return f20307b;
        }
        throw new IllegalArgumentException("not a directory separator: " + b);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final C13133f m28097s(String str) {
        if (C12775o.m28634d(str, "/")) {
            return f20306a;
        }
        if (C12775o.m28634d(str, "\\")) {
            return f20307b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
