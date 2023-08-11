package p391me;

import p341fe.C11946c;
import p341fe.C11955l;
import p341fe.C11961q;
import p341fe.C11966t;
import p403oe.C13068e;

/* renamed from: me.c */
/* compiled from: EmptyDisposable */
public enum C12937c implements C13068e<Object> {
    INSTANCE,
    NEVER;

    /* renamed from: a */
    public static void m29228a(C11946c cVar) {
        cVar.mo49189c(INSTANCE);
        cVar.mo49188b();
    }

    /* renamed from: b */
    public static void m29229b(C11955l<?> lVar) {
        lVar.mo49247c(INSTANCE);
        lVar.mo49246b();
    }

    /* renamed from: c */
    public static void m29230c(C11961q<?> qVar) {
        qVar.mo46140c(INSTANCE);
        qVar.mo46139b();
    }

    /* renamed from: d */
    public static void m29231d(Throwable th, C11946c cVar) {
        cVar.mo49189c(INSTANCE);
        cVar.onError(th);
    }

    /* renamed from: e */
    public static void m29232e(Throwable th, C11955l<?> lVar) {
        lVar.mo49247c(INSTANCE);
        lVar.onError(th);
    }

    /* renamed from: f */
    public static void m29233f(Throwable th, C11961q<?> qVar) {
        qVar.mo46140c(INSTANCE);
        qVar.onError(th);
    }

    /* renamed from: h */
    public static void m29234h(Throwable th, C11966t<?> tVar) {
        tVar.mo49278c(INSTANCE);
        tVar.onError(th);
    }

    /* renamed from: g */
    public int mo50862g(int i) {
        return i & 2;
    }

    public boolean isDisposed() {
        if (this == INSTANCE) {
            return true;
        }
        return false;
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

    public void clear() {
    }

    public void dispose() {
    }
}
