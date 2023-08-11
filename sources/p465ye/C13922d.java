package p465ye;

import p386lg.C12860b;
import p403oe.C13070g;

/* renamed from: ye.d */
/* compiled from: EmptySubscription */
public enum C13922d implements C13070g<Object> {
    INSTANCE;

    /* renamed from: a */
    public static void m32170a(C12860b<?> bVar) {
        bVar.mo49220e(INSTANCE);
        bVar.mo50772b();
    }

    /* renamed from: b */
    public static void m32171b(Throwable th, C12860b<?> bVar) {
        bVar.mo49220e(INSTANCE);
        bVar.onError(th);
    }

    /* renamed from: g */
    public int mo50862g(int i) {
        return i & 2;
    }

    /* renamed from: h */
    public void mo50776h(long j) {
        C13925g.m32188g(j);
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public Object poll() {
        return null;
    }

    public String toString() {
        return "EmptySubscription";
    }

    public void cancel() {
    }

    public void clear() {
    }
}
