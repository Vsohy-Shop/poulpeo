package p337eg;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p331dg.C11833j;
import p336ef.C11907m;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nCancellable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n1#1,68:1\n49#1,6:69\n49#1,6:75\n49#1,6:81\n*S KotlinDebug\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n17#1:69,6\n29#1:75,6\n38#1:81,6\n*E\n"})
/* renamed from: eg.a */
/* compiled from: Cancellable.kt */
public final class C11924a {
    /* renamed from: a */
    private static final void m25725a(C12074d<?> dVar, Throwable th) {
        C11907m.C11908a aVar = C11907m.f18600b;
        dVar.resumeWith(C11907m.m25696a(C11910n.m25700a(th)));
        throw th;
    }

    /* renamed from: b */
    public static final void m25726b(C12074d<? super C11921v> dVar, C12074d<?> dVar2) {
        try {
            C12074d b = C12147c.m26491b(dVar);
            C11907m.C11908a aVar = C11907m.f18600b;
            C11833j.m25483c(b, C11907m.m25696a(C11921v.f18618a), (Function1) null, 2, (Object) null);
        } catch (Throwable th) {
            m25725a(dVar2, th);
        }
    }

    /* renamed from: c */
    public static final <R, T> void m25727c(C13088o<? super R, ? super C12074d<? super T>, ? extends Object> oVar, R r, C12074d<? super T> dVar, Function1<? super Throwable, C11921v> function1) {
        try {
            C12074d b = C12147c.m26491b(C12147c.m26490a(oVar, r, dVar));
            C11907m.C11908a aVar = C11907m.f18600b;
            C11833j.m25482b(b, C11907m.m25696a(C11921v.f18618a), function1);
        } catch (Throwable th) {
            m25725a(dVar, th);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m25728d(C13088o oVar, Object obj, C12074d dVar, Function1 function1, int i, Object obj2) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        m25727c(oVar, obj, dVar, function1);
    }
}
