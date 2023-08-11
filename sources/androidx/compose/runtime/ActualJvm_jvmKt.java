package androidx.compose.runtime;

import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

/* compiled from: ActualJvm.jvm.kt */
public final class ActualJvm_jvmKt {
    public static final void ensureMutable(Object obj) {
        C12775o.m28639i(obj, "it");
    }

    public static final int identityHashCode(Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void invokeComposable(Composer composer, C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        C12775o.m28639i(composer, "composer");
        C12775o.m28639i(oVar, "composable");
        ((C13088o) C12772l0.m28614f(oVar, 2)).invoke(composer, 1);
    }

    public static final <T> T invokeComposableForResult(Composer composer, C13088o<? super Composer, ? super Integer, ? extends T> oVar) {
        C12775o.m28639i(composer, "composer");
        C12775o.m28639i(oVar, "composable");
        return ((C13088o) C12772l0.m28614f(oVar, 2)).invoke(composer, 1);
    }

    /* renamed from: synchronized  reason: not valid java name */
    public static final <R> R m35266synchronized(Object obj, C13074a<? extends R> aVar) {
        R invoke;
        C12775o.m28639i(obj, "lock");
        C12775o.m28639i(aVar, "block");
        synchronized (obj) {
            try {
                invoke = aVar.invoke();
                C12773m.m28629b(1);
            } catch (Throwable th) {
                C12773m.m28629b(1);
                C12773m.m28628a(1);
                throw th;
            }
        }
        C12773m.m28628a(1);
        return invoke;
    }
}
