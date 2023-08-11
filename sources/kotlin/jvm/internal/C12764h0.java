package kotlin.jvm.internal;

import p442uf.C13591c;
import p442uf.C13592d;
import p442uf.C13593e;
import p442uf.C13594f;
import p442uf.C13595g;
import p442uf.C13596h;
import p442uf.C13597i;
import p442uf.C13599j;

/* renamed from: kotlin.jvm.internal.h0 */
/* compiled from: Reflection */
public class C12764h0 {

    /* renamed from: a */
    private static final C12766i0 f20420a;

    /* renamed from: b */
    private static final C13591c[] f20421b = new C13591c[0];

    static {
        C12766i0 i0Var = null;
        try {
            i0Var = (C12766i0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (i0Var == null) {
            i0Var = new C12766i0();
        }
        f20420a = i0Var;
    }

    /* renamed from: a */
    public static C13593e m28585a(C12769k kVar) {
        return f20420a.mo50658a(kVar);
    }

    /* renamed from: b */
    public static C13591c m28586b(Class cls) {
        return f20420a.mo50659b(cls);
    }

    /* renamed from: c */
    public static C13592d m28587c(Class cls) {
        return f20420a.mo50660c(cls, "");
    }

    /* renamed from: d */
    public static C13594f m28588d(C12778q qVar) {
        return f20420a.mo50661d(qVar);
    }

    /* renamed from: e */
    public static C13595g m28589e(C12780s sVar) {
        return f20420a.mo50662e(sVar);
    }

    /* renamed from: f */
    public static C13596h m28590f(C12782u uVar) {
        return f20420a.mo50663f(uVar);
    }

    /* renamed from: g */
    public static C13597i m28591g(C12786y yVar) {
        return f20420a.mo50664g(yVar);
    }

    /* renamed from: h */
    public static C13599j m28592h(C12748a0 a0Var) {
        return f20420a.mo50665h(a0Var);
    }

    /* renamed from: i */
    public static String m28593i(C12767j jVar) {
        return f20420a.mo50666i(jVar);
    }

    /* renamed from: j */
    public static String m28594j(C12777p pVar) {
        return f20420a.mo50667j(pVar);
    }
}
