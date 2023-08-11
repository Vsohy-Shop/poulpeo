package kotlin.coroutines.jvm.internal;

import p355hf.C12074d;
import p355hf.C12079g;

/* renamed from: kotlin.coroutines.jvm.internal.c */
/* compiled from: ContinuationImpl.kt */
public final class C12736c implements C12074d<Object> {

    /* renamed from: b */
    public static final C12736c f20393b = new C12736c();

    private C12736c() {
    }

    public C12079g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
