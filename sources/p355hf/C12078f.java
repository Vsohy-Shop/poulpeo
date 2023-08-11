package p355hf;

import kotlin.jvm.internal.C12775o;
import p336ef.C11907m;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: hf.f */
/* compiled from: Continuation.kt */
public final class C12078f {
    /* renamed from: a */
    public static final <R, T> C12074d<C11921v> m26258a(C13088o<? super R, ? super C12074d<? super T>, ? extends Object> oVar, R r, C12074d<? super T> dVar) {
        C12775o.m28639i(oVar, "<this>");
        C12775o.m28639i(dVar, "completion");
        return new C12086i(C12147c.m26491b(C12147c.m26490a(oVar, r, dVar)), C12150d.m26492c());
    }

    /* renamed from: b */
    public static final <R, T> void m26259b(C13088o<? super R, ? super C12074d<? super T>, ? extends Object> oVar, R r, C12074d<? super T> dVar) {
        C12775o.m28639i(oVar, "<this>");
        C12775o.m28639i(dVar, "completion");
        C12074d b = C12147c.m26491b(C12147c.m26490a(oVar, r, dVar));
        C11907m.C11908a aVar = C11907m.f18600b;
        b.resumeWith(C11907m.m25696a(C11921v.f18618a));
    }
}
