package p320cg;

import kotlin.coroutines.jvm.internal.C12738e;
import p355hf.C12074d;
import p355hf.C12079g;

/* renamed from: cg.s */
/* compiled from: ChannelFlow.kt */
final class C11089s<T> implements C12074d<T>, C12738e {

    /* renamed from: b */
    private final C12074d<T> f17216b;

    /* renamed from: c */
    private final C12079g f17217c;

    public C11089s(C12074d<? super T> dVar, C12079g gVar) {
        this.f17216b = dVar;
        this.f17217c = gVar;
    }

    public C12738e getCallerFrame() {
        C12074d<T> dVar = this.f17216b;
        if (dVar instanceof C12738e) {
            return (C12738e) dVar;
        }
        return null;
    }

    public C12079g getContext() {
        return this.f17217c;
    }

    public void resumeWith(Object obj) {
        this.f17216b.resumeWith(obj);
    }
}
