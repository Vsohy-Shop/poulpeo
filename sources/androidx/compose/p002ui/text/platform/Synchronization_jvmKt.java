package androidx.compose.p002ui.text.platform;

import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.text.platform.Synchronization_jvmKt */
/* compiled from: Synchronization.jvm.kt */
public final class Synchronization_jvmKt {
    public static final SynchronizedObject createSynchronizedObject() {
        return new SynchronizedObject();
    }

    /* renamed from: synchronized  reason: not valid java name */
    public static final <R> R m38218synchronized(SynchronizedObject synchronizedObject, C13074a<? extends R> aVar) {
        R invoke;
        C12775o.m28639i(synchronizedObject, "lock");
        C12775o.m28639i(aVar, "block");
        synchronized (synchronizedObject) {
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
