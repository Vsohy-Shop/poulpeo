package p347ge;

import java.util.concurrent.Callable;
import p341fe.C11962r;
import p369je.C12620a;
import p384le.C12854e;

/* renamed from: ge.a */
/* compiled from: RxAndroidPlugins */
public final class C12017a {

    /* renamed from: a */
    private static volatile C12854e<Callable<C11962r>, C11962r> f18782a;

    /* renamed from: b */
    private static volatile C12854e<C11962r, C11962r> f18783b;

    /* renamed from: a */
    static <T, R> R m26094a(C12854e<T, R> eVar, T t) {
        try {
            return eVar.apply(t);
        } catch (Throwable th) {
            throw C12620a.m28006a(th);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [le.e, le.e<java.util.concurrent.Callable<fe.r>, fe.r>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p341fe.C11962r m26095b(p384le.C12854e<java.util.concurrent.Callable<p341fe.C11962r>, p341fe.C11962r> r0, java.util.concurrent.Callable<p341fe.C11962r> r1) {
        /*
            java.lang.Object r0 = m26094a(r0, r1)
            fe.r r0 = (p341fe.C11962r) r0
            if (r0 == 0) goto L_0x0009
            return r0
        L_0x0009:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Scheduler Callable returned null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p347ge.C12017a.m26095b(le.e, java.util.concurrent.Callable):fe.r");
    }

    /* renamed from: c */
    static C11962r m26096c(Callable<C11962r> callable) {
        try {
            C11962r call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw C12620a.m28006a(th);
        }
    }

    /* renamed from: d */
    public static C11962r m26097d(Callable<C11962r> callable) {
        if (callable != null) {
            C12854e<Callable<C11962r>, C11962r> eVar = f18782a;
            if (eVar == null) {
                return m26096c(callable);
            }
            return m26095b(eVar, callable);
        }
        throw new NullPointerException("scheduler == null");
    }

    /* renamed from: e */
    public static C11962r m26098e(C11962r rVar) {
        if (rVar != null) {
            C12854e eVar = f18783b;
            if (eVar == null) {
                return rVar;
            }
            return (C11962r) m26094a(eVar, rVar);
        }
        throw new NullPointerException("scheduler == null");
    }
}
