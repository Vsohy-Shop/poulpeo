package kotlin.jvm.internal;

import p442uf.C13591c;
import p442uf.C13592d;
import p442uf.C13593e;
import p442uf.C13594f;
import p442uf.C13595g;
import p442uf.C13596h;
import p442uf.C13597i;
import p442uf.C13599j;

/* renamed from: kotlin.jvm.internal.i0 */
/* compiled from: ReflectionFactory */
public class C12766i0 {
    /* renamed from: b */
    public C13591c mo50659b(Class cls) {
        return new C12758f(cls);
    }

    /* renamed from: c */
    public C13592d mo50660c(Class cls, String str) {
        return new C12785x(cls, str);
    }

    /* renamed from: i */
    public String mo50666i(C12767j jVar) {
        String obj = jVar.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    /* renamed from: j */
    public String mo50667j(C12777p pVar) {
        return mo50666i(pVar);
    }

    /* renamed from: a */
    public C13593e mo50658a(C12769k kVar) {
        return kVar;
    }

    /* renamed from: d */
    public C13594f mo50661d(C12778q qVar) {
        return qVar;
    }

    /* renamed from: e */
    public C13595g mo50662e(C12780s sVar) {
        return sVar;
    }

    /* renamed from: f */
    public C13596h mo50663f(C12782u uVar) {
        return uVar;
    }

    /* renamed from: g */
    public C13597i mo50664g(C12786y yVar) {
        return yVar;
    }

    /* renamed from: h */
    public C13599j mo50665h(C12748a0 a0Var) {
        return a0Var;
    }
}
