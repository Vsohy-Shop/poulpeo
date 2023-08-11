package androidx.compose.runtime;

import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import p404of.C13074a;

/* compiled from: Trace.kt */
public final class TraceKt {
    public static final <T> T trace(String str, C13074a<? extends T> aVar) {
        C12775o.m28639i(str, "sectionName");
        C12775o.m28639i(aVar, "block");
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection(str);
        try {
            T invoke = aVar.invoke();
            C12773m.m28629b(1);
            trace.endSection(beginSection);
            C12773m.m28628a(1);
            return invoke;
        } catch (Throwable th) {
            C12773m.m28629b(1);
            Trace.INSTANCE.endSection(beginSection);
            C12773m.m28628a(1);
            throw th;
        }
    }
}
